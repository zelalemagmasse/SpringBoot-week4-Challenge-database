package com.example.demo;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;

@Controller
public class HomeController {

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
    @RequestMapping("/detail/{id}")
    public String showJob(@PathVariable("id") long id, Model model){

        model.addAttribute("jobs", jobRepository.findById(id).get());
        return "displaydetail";


    }
/*
    @GetMapping("/addcourse")
    public String addCourse()
    {
        Course c = new Course();
        c.setName("Course "+(courses.count()+1));
        courses.save(c);
        return "redirect:/showcourses";
    }*/



}
