package com.wdd.studentmanager.domain;

import lombok.Data;

/**
 * @Classname SelectedCourse
 * @Description 选课信息实体类
 * @Date 2019/6/30 10:30
 * @Created by WDD
 */
@Data
public class SelectedCourse {
    private Integer id;
    private Integer studentId;
    private Integer courseId;

}
