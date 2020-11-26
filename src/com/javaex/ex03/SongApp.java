package com.javaex.ex03;

public class SongApp {

	public static void main(String[] args){
		
		Song s1 = new Song();
		
		s1.setTitle("좋은날");
		s1.setArtist("아이유");
		s1.setAlbum("Real");
		s1.setComposer("이민수");
		s1.setYear("2010");
		s1.setTrack(3);
		
		s1.draw();
		
		Song s2 = new Song("좋은날", "아이유" , "Real", "이민수", "2010");
		
		s2.draw();
		
		Song s3 = new Song("좋은날", "아이유" , "Real", "이민수", "2010", 3);
		
		s3.draw();
		//
		
		
	}

}


