package com.example.demo;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Job {

    @NotNull
    @Size(min=1)
    private String position;
    @NotNull
    @Size(min=1)
  //  @OneToOne
    //private Applicant applicant;


//    public Applicant getApplicant() {
//        return applicant;
//    }

    public Job(@NotNull @Size(min = 1) String position,  @NotNull @Size(min = 1) String company, @NotNull @Size(min = 1) String requirement, @NotNull @Size(min = 1) String desiredSkills) {
        this.position = position;
        //this.applicant = applicant;
        this.company = company;
        this.requirement = requirement;
        this.desiredSkills = desiredSkills;
    }

//    public void setApplicant(Applicant applicant) {
//        this.applicant = applicant;
//    }

    @NotNull

    @Size(min=1)
    private String company;



    public Job() {
    }

    @NotNull
    @Size(min=1)

    private String requirement;
    @NotNull
    @Size(min=1)
    private String desiredSkills;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    public String getDesiredSkills() {
        return desiredSkills;
    }

    public void setDesiredSkills(String desiredSkills) {
        this.desiredSkills = desiredSkills;
    }





    @Override
    public String toString() {
        return "Job{" +
                "position='" + position + '\'' +
                ", company='" + company + '\'' +
                ", requirement='" + requirement + '\'' +
                ", desiredSkills='" + desiredSkills + '\'' +
                ", id=" + id +
                '}';
    }


}
