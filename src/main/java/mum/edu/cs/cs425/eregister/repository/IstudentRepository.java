package mum.edu.cs.cs425.eregister.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mum.edu.cs.cs425.eregister.models.Student;

@Repository
public interface IstudentRepository extends CrudRepository<Student,Long> {
    
}