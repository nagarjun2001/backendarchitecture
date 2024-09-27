package com.structure.constants;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;


public class MessageConstants {

	public static final Logger LOGGER = (Logger) LoggerFactory.getLogger(MessageConstants.class);
	
	public static final String ADD_STUDENT_SUCCESS = "Add Student Success";
	public static final String ADD_STUDENT_FAILURE = "Add Student Failure";
}
