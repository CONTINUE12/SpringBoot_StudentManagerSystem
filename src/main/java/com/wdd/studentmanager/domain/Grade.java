package com.wdd.studentmanager.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Grade {
	private Long id;
	private String name;
	private String remark;//��ע
	
}
