package mum.edu.cs.cs425.eregister.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import mum.edu.cs.cs425.eregister.models.Student;
import mum.edu.cs.cs425.eregister.service.IstudentService;

@Controller
public class StudentController {

    private IstudentService service;
    private Student tempStudent = null;

    @Autowired
    public StudentController(IstudentService service){
        this.service = service;
    }
    

    @GetMapping(value = {"/eregister/student/list"})
    public ModelAndView diplayStudent(){
        ModelAndView sModel = new ModelAndView();
        sModel.addObject("students", service.getListOfStudents());
        sModel.setViewName("student/list");
        return sModel;
    }

    @GetMapping(value = {"/eregister/student/new"})
    public String createStudentForm(Model model){
        model.addAttribute("student", new Student());
        return "student/new";
    }

    @PostMapping(value={"/eregister/student/new"})
    public String createStudent(@Valid @ModelAttribute("student") Student student, BindingResult bindingResult, Model model ){
        if(bindingResult.hasErrors()){
            model.addAttribute("error", bindingResult.getAllErrors());
        }
        student = service.createNewStudent(student);
        return "redirect:/eregister/student/list";
    }

    @GetMapping(value = {"/eregister/student/edit/{studentID}"})
    public String editStudent(@PathVariable Integer studentID, Model model){
       Student student = service.getByStudentId(studentID);
       tempStudent = student;

       if(student != null){
           model.addAttribute("student", student);
           return "student/edit";
       }
        return "student/list";

    }

    @PostMapping(value={"/eregister/student/edit"})
    public String updateStudent(@Valid @ModelAttribute("student") Student student, BindingResult bindingResult, Model model){

        if(bindingResult.hasErrors()){
            model.addAttribute("error", bindingResult.getAllErrors());
            return "student/edit";
        }

        if(tempStudent !=null){
            service.deleteByStudentId(tempStudent.getStudentID());
        }

        student = service.createNewStudent(student);
        return "redirect:/eregister/student/list";
    }


    @GetMapping(value = {"/eregister/student/delete/{studentID}"})
    public  String deleteStudent(@PathVariable Integer studentID, Model model){
        service.deleteByStudentId(studentID);
        return "redirect:/eregister/student/list";
    }

}