package com.example.controller;

import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: ZJH
 * @Date: 2019/10/15 15:10
 */

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;
}
