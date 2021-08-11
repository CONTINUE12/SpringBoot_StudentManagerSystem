package com.wdd.studentmanager.domain;

import lombok.Data;

/**
 * @Classname score
 * @Description 成绩实体表
 * @Date 2019/7/3 10:22
 * @Created by WDD
 */
@Data
public class Score {
    private Integer id;
    private Integer studentId;
    private Integer courseId;
    private double score;
    private String remark;

    //关联表
    private String courseName;
    private String studentName;
}
