package com.epam;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class LogDemo {
	
	private static final Logger LOGGER = LogManager.getLogger(LogDemo.class);
	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		for(int i=1;i<=10;i++) {
			students.add(new Student(i,"names"+i));
		}
		students.forEach(LOGGER::debug);
	}

}
