package mum.edu.cs.cs425.eregister.models;

import java.time.LocalDate;

import javax.persistence.Entity;

@Entity
public class Student {
    
private Long studentID;
private Integer studentNumber;
private String firstName;
private String lastName;
private String middleName;
private Double cgpa;
private LocalDate enrollmentDate;
private Boolean isInternational;



    /**
     * @return Long return the studentID
     */
    public Long getStudentID() {
        return studentID;
    }

    /**
     * @param studentID the studentID to set
     */
    public void setStudentID(Long studentID) {
        this.studentID = studentID;
    }

    /**
     * @return Integer return the studentNumber
     */
    public Integer getStudentNumber() {
        return studentNumber;
    }

    /**
     * @param studentNumber the studentNumber to set
     */
    public void setStudentNumber(Integer studentNumber) {
        this.studentNumber = studentNumber;
    }

    /**
     * @return String return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return String return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return String return the middleName
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * @param middleName the middleName to set
     */
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * @return Double return the cgpa
     */
    public Double getCgpa() {
        return cgpa;
    }

    /**
     * @param cgpa the cgpa to set
     */
    public void setCgpa(Double cgpa) {
        this.cgpa = cgpa;
    }

    /**
     * @return LocalDate return the enrollmentDate
     */
    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    /**
     * @param enrollmentDate the enrollmentDate to set
     */
    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    /**
     * @return Boolean return the isInternational
     */
    public Boolean isIsInternational() {
        return isInternational;
    }

    /**
     * @param isInternational the isInternational to set
     */
    public void setIsInternational(Boolean isInternational) {
        this.isInternational = isInternational;
    }

}