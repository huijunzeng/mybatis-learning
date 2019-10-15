package com.example.entity;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/**
* Created by Mybatis Generator 2019/10/15
*/
@Data
public class Teacher implements Serializable {
    /**
     * id
     */
    @Id
    @Column(name = "t_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String tId;

    /**
     * 老师性别
     */
    @Column(name = "t_sex")
    private String tSex;

    /**
     * 老师名字
     */
    @Column(name = "t_name")
    private String tName;

    private static final long serialVersionUID = 1L;
}