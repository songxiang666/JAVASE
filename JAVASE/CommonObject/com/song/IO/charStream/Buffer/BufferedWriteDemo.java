package com.song.IO.charStream.Buffer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriteDemo {
	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("demo.txt");
		
		//创建一个BUffer缓冲区
		BufferedWriter buf=new BufferedWriter(fw);
		//将数据写到缓冲区当中
		buf.write("songxiang ai da mi ");
		buf.newLine();//换行  获取到当前系统的换行符
		buf.write("666");
		//刷新缓冲区
		buf.flush();
		//关闭缓冲区
		buf.close();
	}
}