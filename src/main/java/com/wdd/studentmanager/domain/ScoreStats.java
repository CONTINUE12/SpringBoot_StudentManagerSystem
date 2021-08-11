package com.wdd.studentmanager.domain;

import lombok.Data;

/**
 * @Classname ScoreStats
 * @Description 成绩统计
 * @Date 2019/7/4 13:30
 * @Created by WDD
 */
@Data
public class ScoreStats {
    private Double max_score;
    private Double avg_score;
    private Double min_score;
    private String courseName;//课程名称

}
