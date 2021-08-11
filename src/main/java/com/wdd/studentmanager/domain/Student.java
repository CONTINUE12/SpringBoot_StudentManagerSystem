package com.wdd.studentmanager.domain;

import lombok.Data;

@Data
public class Student {
	private int id;
	private String sn;//学号
	private String username;
	private String password;
	private int clazzId;
	private String sex = "男";
	private String mobile;
	private String qq;
	private String photo;//头像

}
