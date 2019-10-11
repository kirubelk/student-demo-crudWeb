package mum.edu.cs.cs425.eregister.service;

import java.util.List;
import java.util.Optional;

import mum.edu.cs.cs425.eregister.models.Student;

public interface IstudentService {
    List<Student> getListOfStudents();
    Student createNewStudent(Student stu);
    Student getByStudentId(Integer id);
    void deleteByStudentId(Integer id);
    //Optional<Student> findByStudentID(Long id);
}