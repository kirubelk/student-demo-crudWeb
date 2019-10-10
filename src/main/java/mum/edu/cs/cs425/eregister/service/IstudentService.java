package mum.edu.cs.cs425.eregister.service;

import java.util.List;

import mum.edu.cs.cs425.eregister.models.Student;

public interface IstudentService {
    List<Student> getListOfStudents();
}