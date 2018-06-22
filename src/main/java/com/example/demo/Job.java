package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Job {

    @NotNull
    @Size(min=4)
    private String position;



    @NotNull
    @Size(min=4)
    private String company;
    @NotNull
    @Size(min=4)
    private String requirement;
    @NotNull
    @Size(min=4)
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
