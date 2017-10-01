package com.song.IO.charStream.Buffer;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
/*
 * LineNumberReader  继承于 BufferReader类  和BufferReader一样 也是一个修饰类 增强被修饰类的功能
 * 
 * 作用：可以获得每一行的行数
 * 
 * */


public class LineNumberBufferDemo {
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("IO流.txt");
		LineNumberReader lnr=new LineNumberReader(fr);
		String s=null;
		while((s=lnr.readLine())!=null){
			System.out.println(lnr.getLineNumber()+"::"+s);
		}
	}
}
