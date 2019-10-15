package com.example.entity;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/**
* Created by Mybatis Generator 2019/10/15
*/
@Data
public class Student implements Serializable {
    /**
     * 学生id
     */
    @Id
    @Column(name = "s_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String sId;

    /**
     * 班级id
     */
    @Column(name = "c_id")
    private String cId;

    /**
     * 学生性别
     */
    @Column(name = "s_sex")
    private String sSex;

    /**
     * 学生名字
     */
    @Column(name = "s_name")
    private String sName;

    private static final long serialVersionUID = 1L;
}