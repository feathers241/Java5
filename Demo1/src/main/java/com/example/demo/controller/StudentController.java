package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Student;
@Controller
@RequestMapping("/student")
public class StudentController {

    List<Student> students = new ArrayList<>();

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("students", students);
        return "student/form";
    }

    @PostMapping("/add")
    public String add(Student student) {
        students.add(student);
        return "redirect:/student/";
    }
}

