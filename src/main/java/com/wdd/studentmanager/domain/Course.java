package com.wdd.studentmanager.domain;

import lombok.Data;

/**
 * @Classname Course
 * @Description None
 * @Date 2019/6/29 20:06
 * @Created by WDD
 */
@Data
public class Course {
    private int id;
    private String name;
    private int teacherId;
    private String courseDate;
    private int selectedNum = 0;//已选人数
    private int maxNum = 50;//课程最大选课人数
    private String info;

}
