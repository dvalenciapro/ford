package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		
		System.out.println(returnRoman("XCIX"));
		
	}
	
	
	public static int returnRoman(String romanNumber) {
		
		
		char[] romanNumberList = romanNumber.toCharArray();
		int digital = 0;
		
		
		for(int i = 0; i < romanNumberList.length; i++ ) {								
						
			if(romanNumberList.length > (i+1) && romanNumberList[i] == 'I' && romanNumberList[i+1] == 'X') {
				digital+=9;
				i++;
			}else
			if(romanNumberList.length > (i+1) && romanNumberList[i] == 'I' && romanNumberList[i+1] == 'V') {
				digital+=4;
				i++;
			}else
				if(romanNumberList.length > (i+1) && romanNumberList[i] == 'X' && romanNumberList[i+1] == 'L') {
					digital+=40;
					i++;
				}else
					if(romanNumberList.length > (i+1) && romanNumberList[i] == 'X' && romanNumberList[i+1] == 'C') {
						digital+=90;
						i++;
					}else
						if(romanNumberList[i] == 'I') {
							digital++;
						}else
							if(romanNumberList[i] == 'V') {
								digital+=5;
							}else
								if(romanNumberList[i] == 'X') {
									digital+=10;
								}else
									if(romanNumberList[i] == 'L') {
										digital+=50;
									}
										if(romanNumberList[i] == 'C') {
											digital+=100;
										}
			
		}
		return digital;
	} 
	
	

}
