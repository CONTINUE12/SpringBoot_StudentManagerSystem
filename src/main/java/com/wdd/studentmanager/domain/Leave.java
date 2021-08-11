package com.wdd.studentmanager.domain;

import lombok.Data;

/**
 * @Classname Leave
 * @Description 请假表实体类
 * @Date 2019/7/2 13:57
 * @Created by WDD
 */
@Data
public class Leave {
    public static int LEAVE_STATUS_WAIT = 0;//等待审核
    public static int LEAVE_STATUS_AGREE = 1;//同意
    public static int LEAVE_STATUS_DISAGREE = -1;//不同意
    private int id;
    private int studentId;
    private String info;//请假理由
    private int status = LEAVE_STATUS_WAIT;//请假条状态
    private String remark;//批复内容

}
