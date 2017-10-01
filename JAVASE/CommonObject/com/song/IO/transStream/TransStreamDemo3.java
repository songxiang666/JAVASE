package com.song.IO.transStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TransStreamDemo3 {
	public static void main(String[] args) throws IOException {
		ReadTxt_1();
	}

	public static void ReadTxt_1() throws IOException {
//		FileReader fr=new FileReader("gbk.txt");
//		
//		char[] buf=new char[10];
//		int len=fr.read(buf);
//		String str=new String(buf,0,len);
//		System.out.println(str);
		
		
		InputStreamReader isr=new InputStreamReader(new FileInputStream("UTF.txt"),"UTF-8");
		char[] buf=new char[10];
		int len=isr.read(buf);
		String str=new String(buf,0,len);
		System.out.println(str);
	}

	public static void WriteTxt_1() throws IOException{
		OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("UTF.txt"),"UTF-8");//6¸ö×Ö½Ú
		osw.write("ÄãºÃ");
		osw.flush();
		osw.close();
	}
}
