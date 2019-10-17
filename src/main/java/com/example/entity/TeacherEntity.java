package com.example.entity;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Table(name = "teacher")
@Data
public class TeacherEntity implements Serializable {
    /**
     * 老师id
     */
    @Id
    @Column(name = "teacher_id")
    @GeneratedValue(generator = "JDBC")
    private String teacherId;

    /**
     * 老师性别
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