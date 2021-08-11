package com.wdd.studentmanager.domain;

import lombok.Data;

/**
 * @Classname Attendance
 * @Description 考勤实体类
 * @Date 2019/7/1 11:52
 * @Created by WDD
 */
@Data
public class Attendance {
    private Integer id;
    private Integer courseId;
    private Integer studentId;
    private String type;
    private String date;

}
