package com.example.entity;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/**
* Created by Mybatis Generator 2019/10/20
*/
@Table(name = "teacher")
@Data
public class TeacherEntity implements Serializable {
    /**
     * 老师id
     */
    @Id
    @Column(name = "teacher_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String teacherId;

    /**
     * 班级id
     */
    @Column(name = "class_id")
    private String classId;

    /**
     * 老师性别简码
     */
    @Column(name = "teacher_sex")
    private String teacherSex;

    /**
     * 老师名字
     */
    @Column(name = "teacher_name")
    private String teacherName;

    private static final long serialVersionUID = 1L;
}