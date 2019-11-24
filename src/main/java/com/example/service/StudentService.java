package com.example.service;

import com.example.entity.StudentEntity;
import com.example.mapper.StudentEntityMapper;
import com.example.param.StudentSaveListParam;
import com.example.param.StudentSaveParam;
import com.example.utils.BeanConverter;
import com.example.utils.IdGenerate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.example.exception.ThrowingWrapper.throwingConsumerWrapper;

/**
 * @Author: ZJH
 * @Date: 2019/10/15 14:58
 */

@Service
public class StudentService {

    @Autowired
    private StudentEntityMapper entityMapper;

    @Transactional(rollbackFor = Exception.class)
    public void insert(StudentSaveParam studentSaveParam) throws Exception {
        StudentEntity studentEntity = BeanConverter.copy(studentSaveParam, StudentEntity.class);
        studentEntity.setStudentId(String.valueOf(IdGenerate.getInstance().nextId()));
        entityMapper.insertSelective(studentEntity);
    }

    @Transactional(rollbackFor = Exception.class)
    public void insertBatch(StudentSaveListParam studentSaveListParam) {
        List<StudentSaveParam> studentList = studentSaveListParam.getStudentList();
        if (studentList != null && !studentList.isEmpty()) {
            List<StudentEntity> saveList = BeanConverter.copy(studentList, StudentEntity.class);
            saveList.stream().forEach(throwingConsumerWrapper(studentEntity -> studentEntity.setStudentId(String.valueOf(IdGenerate.getInstance().nextId())), Exception.class));
            entityMapper.insertBatch(saveList);
        }
    }
}
