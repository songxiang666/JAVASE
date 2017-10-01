package com.song.IO.charStream.Buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTextByBufferTest {
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("demo.txt");
		BufferedReader br=new BufferedReader(fr);
		
		FileWriter fw=new FileWriter("demo1.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		//单个读写
//		int ch=0;
//		while((ch=br.read())!=-1){
//			bw.write(ch);
//			bw.flush();
//		}
		//一行读写  
		String s=null;
		while((s=br.readLine())!=null){
			bw.write(s);
			bw.newLine();
			bw.flush();
		}
	}
}
