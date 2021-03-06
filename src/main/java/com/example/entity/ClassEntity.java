package com.example.entity;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/**
* Created by Mybatis Generator 2019/10/20
*/
@Table(name = "class")
@Data
public class ClassEntity implements Serializable {
    /**
     * 班级id
     */
    @Id
    @Column(name = "class_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String classId;

    /**
     * 班级名称
     */
    @Column(name = "class_name")
    private String className;

    private static final long serialVersionUID = 1L;
}