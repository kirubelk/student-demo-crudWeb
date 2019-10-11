package mum.edu.cs.cs425.eregister.service.implemention;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mum.edu.cs.cs425.eregister.models.Student;
import mum.edu.cs.cs425.eregister.repository.IstudentRepository;
import mum.edu.cs.cs425.eregister.service.IstudentService;

@Service
public class StudentService implements IstudentService {

    @Autowired
    private IstudentRepository repo;

   @Autowired
    public StudentService(IstudentRepository repo){
        this.repo = repo;
    }


    @Override
    public List<Student> getListOfStudents() {
        return (List<Student>) repo.findAll();
    }

    @Override
    public Student createNewStudent(Student stu) {
        return repo.save(stu);
    }


    @Override
    public void deleteByStudentId(Integer id) {
        repo.deleteById(id);
    }

    // @Override
    // public Optional<Student> findByStudentID(Long id) {
    //     return repo.findStudentById(id);
    // }

    @Override
    public Student getByStudentId(Integer id) {
        return repo.findById(id).orElse(null);
    }

    
}