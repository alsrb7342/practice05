package com.javaex.ex03;

public class SongApp {

	public static void main(String[] args){
		
		Song s1 = new Song();
		
		s1.setTitle("������");
		s1.setArtist("������");
		s1.setAlbum("Real");
		s1.setComposer("�̹μ�");
		s1.setYear("2010");
		s1.setTrack(3);
		
		s1.draw();
		
		Song s2 = new Song("������", "������" , "Real", "�̹μ�", "2010");
		
		s2.draw();
		
		Song s3 = new Song("������", "������" , "Real", "�̹μ�", "2010", 3);
		
		s3.draw();
		//
		
		
	}

}


