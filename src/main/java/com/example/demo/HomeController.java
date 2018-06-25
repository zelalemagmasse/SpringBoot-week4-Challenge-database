package com.example.demo;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import javax.validation.Valid;
import java.util.ArrayList;

@Controller
public class HomeController {
   //@NotNull @Size(min = 1) String position, @NotNull @Size(min = 1) String company, @NotNull @Size(min = 1) String requirement, @NotNull @Size(min = 1) String desiredSkills

    @Autowired
    JobRepository jobRepository;

    @RequestMapping("/")
    public String homePage(Model model){
            return "intropage";
    }
    @GetMapping("/addjob")
    public String jobForm(Model model){
        model.addAttribute("jobb",new Job());
        return "jobform";
    }
    @PostMapping("/update")
    public String updateForm(@Valid Job job, BindingResult result){


        if (result.hasErrors()){
            return "jobform";
        }
        jobRepository.save(job);
        return "redirect:/showalljob";


    }
    @RequestMapping("/showalljob")
    public String listJobs(Model model){

        model.addAttribute("jobs", jobRepository.findAll());
        return "joblist";


    }
//    @RequestMapping("/showallapplicant")
//    public String listapplic(Model model){
//
//        model.addAttribute("jobs", jobRepository.findAll());
//        return "jlistofapplicant";
//
//
//    }
    @RequestMapping("/detail/{id}")
    public String showJob(@PathVariable("id") long id, Model model){

        model.addAttribute("jobs", jobRepository.findById(id).get());
        return "displaydetail";


    }
    @PostConstruct
    public void initalizeData()
    {
//        Applicant apt1=new Applicant("zelalem","zelalem.agmasse@gmail.com","Msc in Logistics","Java");
//        Applicant apt2=new Applicant("Ujwal","zelalem.agmasse@gmail.com","Msc in Logistics","Java");
//        Applicant apt3=new Applicant("Celine","zelalem.agmasse@gmail.com","Msc in Logistics","Java");
//        Applicant apt4=new Applicant("dulaka","zelalem.agmasse@gmail.com","Msc in Logistics","Java");
//        Applicant apt5=new Applicant("Fdeen","zelalem.agmasse@gmail.com","Msc in Logistics","Java");
//        Applicant apt6=new Applicant("Gabriel","zelalem.agmasse@gmail.com","Msc in Logistics","Java");
//        Applicant apt7=new Applicant("Ghislain","zelalem.agmasse@gmail.com","Msc in Logistics","Java");
//        Applicant apt8=new Applicant("Jnhotr","zelalem.agmasse@gmail.com","Msc in Logistics","Java");
//        Applicant apt9=new Applicant("Josemy","zelalem.agmasse@gmail.com","Msc in Logistics","Java");
//        Applicant apt10=new Applicant("Konstantin","zelalem.agmasse@gmail.com","Msc in Logistics","Java");
//        Applicant apt11=new Applicant("Langitheone","zelalem.agmasse@gmail.com","Msc in Logistics","Java");
//        Applicant apt12=new Applicant("Hyejeong","zelalem.agmasse@gmail.com","Msc in Logistics","Java");
//        Applicant apt13=new Applicant("romielisse","zelalem.agmasse@gmail.com","Msc in Logistics","Java");
//        // String position, Applicant applicant,  String company,  String requirement,  String desiredSkills
        Job jb1= new Job("Java developer","Zolshu Soft","Bsc in Computer Science or Mathematics and 5 years of experience","Java, Spring, Angularjs");
        Job jb2= new Job("softwear Engineer","Ujwal Soft","Bsc in Computer Science or Mathematics and 5 years of experience","Java, Spring, Angularjs");
        Job jb3= new Job("Dot NET ","Celineu Soft","Bsc in Computer Science or Mathematics and 5 years of experience","Java, Spring, Angularjs");
        Job jb4= new Job("Math Teacher","dulaka Soft","Bsc in Computer Science or Mathematics and 5 years of experience","Java, Spring, Angularjs");
        Job jb5= new Job("Computer Engineering","Fdeen Soft","Bsc in Computer Science or Mathematics and 5 years of experience","Java, Spring, Angularjs");
        Job jb6= new Job("Data specialist","Gabriel Soft","Bsc in Computer Science or Mathematics and 5 years of experience","Java, Spring, Angularjs");
        Job jb7= new Job("System Specialist","Ghislain Soft","Bsc in Computer Science or Mathematics and 5 years of experience","Java, Spring, Angularjs");
        Job jb8= new Job("System Developer","Jnhotr Soft","Bsc in Computer Science or Mathematics and 5 years of experience","Java, Spring, Angularjs");
        Job jb9= new Job("Big Data","Josemy Soft","Bsc in Computer Science or Mathematics and 5 years of experience","Java, Spring, Angularjs");
        Job jb10= new Job("software Engineer","Konstantin Soft","Bsc in Computer Science or Mathematics and 5 years of experience","Java, Spring, Angularjs");
        Job jb11= new Job("Social Worker","Langitheone Soft","Bsc in Computer Science or Mathematics and 5 years of experience","Java, Spring, Angularjs");
       // Job jb12= new Job("Accountant","Hyejeong Soft","Bsc in Computer Science or Mathematics and 5 years of experience","Java, Spring, Angularjs");
        //Job jb13= new Job("Economist","romielisse Soft","Bsc in Computer Science or Mathematics and 5 years of experience","Java, Spring, Angularjs");
//        jb1.setCompany("Zolshu Soft");
//        jb1.setDesiredSkills("Java, Spring, Angularjs");
//        jb1.setPosition("Senior Java Developer");
//        jb1.setRequirement("Bsc in Computer Science or Mathematics and 5 years of experience");

        jobRepository.save(jb1);
        jobRepository.save(jb2);
        jobRepository.save(jb3);
        jobRepository.save(jb4);
        jobRepository.save(jb5);
        jobRepository.save(jb6);
        jobRepository.save(jb7);
        jobRepository.save(jb8);
        jobRepository.save(jb9);
        jobRepository.save(jb10);
        jobRepository.save(jb11);
       // jobRepository.save(jb12);
       // jobRepository.save(jb13);
    }
///*
//    @GetMapping("/addcourse")
//    public String addCourse()
//    {
//        Course c = new Course();
//        c.setName("Course "+(courses.count()+1));
//        courses.save(c);
//        return "redirect:/showcourses";
//    }*/



}
