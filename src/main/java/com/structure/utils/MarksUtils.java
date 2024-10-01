package com.structure.utils;

import org.springframework.stereotype.Component;

@Component
public class MarksUtils {

	public Long totalMark(Long long1,Long long2, Long long3 ) {
		Long total = long1+long2+long3;
		return total;
		
	}
}
