package com.example.entity;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/**
* Created by Mybatis Generator 2019/10/20
*/
@Table(name = "student")
@Data
public class StudentEntity implements Serializable {
    /**
     * 学生id
     */
    @Id
    @Column(name = "student_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String studentId;

    /**
     * 班级id
     */
    @Column(name = "class_id")
    private String classId;

    /**
     * 学生性别简码
     */
    @Column(name = "student_sex")
    private String studentSex;

    /**
     * 学生名字
     */
    @Column(name = "student_name")
    private String studentName;

    private static final long serialVersionUID = 1L;
}