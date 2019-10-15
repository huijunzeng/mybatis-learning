package com.example.entity;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/**
* Created by Mybatis Generator 2019/10/15
*/
@Data
public class Class implements Serializable {
    /**
     * 班级id
     */
    @Id
    @Column(name = "c_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String cId;

    /**
     * 班级名称
     */
    @Column(name = "c_name")
    private String cName;

    /**
     * 老师id
     */
    @Column(name = "t_id")
    private String tId;

    private static final long serialVersionUID = 1L;
}