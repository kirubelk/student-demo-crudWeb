package mum.edu.cs.cs425.eregister.service.implemention;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mum.edu.cs.cs425.eregister.models.Student;
import mum.edu.cs.cs425.eregister.repository.IstudentRepository;
import mum.edu.cs.cs425.eregister.service.IstudentService;

@Service
public class StudentService implements IstudentService {

    
    private IstudentRepository repo;

    @Autowired
    public StudentService(IstudentRepository repo){
        this.repo = repo;
    }

    @Override
    public List<Student> getListOfStudents() {
        // TODO Auto-generated method stub
        return null;
    }

    
}