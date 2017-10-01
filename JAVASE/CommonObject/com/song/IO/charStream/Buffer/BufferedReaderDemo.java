package com.song.IO.charStream.Buffer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("demo.txt");
		BufferedReader bf=new BufferedReader(fr);
		
		String line=null;
		while((line=bf.readLine())!=null){
			System.out.println(line);
		}
		
	}
}
