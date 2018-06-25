package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Applicant {
    @Override
    public String toString() {
        return "Applicant{" +
                "Name='" + Name + '\'' +
                ", email='" + email + '\'' +
                ", education='" + education + '\'' +
                ", skillSet='" + skillSet + '\'' +
                ", id=" + id +
                '}';
    }

    public Applicant(@NotNull @Size(min = 1) String name, @NotNull @Size(min = 1) String email, @NotNull @Size(min = 1) String education, @NotNull @Size(min = 1) String skillSet) {
        Name = name;
        this.email = email;
        this.education = education;
        this.skillSet = skillSet;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @NotNull
    @Size(min=1)
    private String Name;
    @NotNull
    @Size(min=1)
    private String email;
    @NotNull
    @Size(min=1)
    private String education;
    @NotNull
    @Size(min=1)
    private String skillSet;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotNull
    @Size(min=1)

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Applicant() {
    }

    public String getEmail() {
        return email;

    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getSkillSet() {
        return skillSet;
    }

    public void setSkillSet(String skillSet) {
        this.skillSet = skillSet;
    }




}
