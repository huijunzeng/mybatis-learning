package com.example.service;

import com.example.mapper.StudentEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: ZJH
 * @Date: 2019/10/15 14:44
 */

@Service
public class StudentService {

    @Autowired
    private StudentEntityMapper mapper;
}
