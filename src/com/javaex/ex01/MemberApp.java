package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {
		
		Member m1 = new Member("jws", "���켺", 50000);
		
		m1.draw();
		
		m1.setId("yjs");
		m1.setName("���缮");
		m1.setPoint(30000);
		
		m1.draw();
		
		m1.setId("lhr");
		m1.setName("��ȿ��");
		m1.setPoint(20000);
		
		m1.draw();

		
	}

}
