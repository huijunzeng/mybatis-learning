package com.example.service;

import com.example.mapper.ClassEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: ZJH
 * @Date: 2019/10/15 14:43
 */

@Service
public class ClassSerice {

    @Autowired
    private ClassEntityMapper mapper;
}
