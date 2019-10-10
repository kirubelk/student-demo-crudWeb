package mum.edu.cs.cs425.eregister.controllers.student;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentClass {
    
    @GetMapping(value = {"/student/list"})
    public ModelAndView diplayStudent(){
        ModelAndView sModel = new ModelAndView();
        return sModel;
    }
}