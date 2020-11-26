package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {
		
		Member m1 = new Member("jws", "정우성", 50000);
		
		m1.draw();
		
		m1.setId("yjs");
		m1.setName("유재석");
		m1.setPoint(30000);
		
		m1.draw();
		
		m1.setId("lhr");
		m1.setName("이효리");
		m1.setPoint(20000);
		
		m1.draw();

		
	}

}
