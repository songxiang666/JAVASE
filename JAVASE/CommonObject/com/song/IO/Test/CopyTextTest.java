package com.song.IO.Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//将c盘的一个文本文件复制到d盘
/*
 * 思路：
 * 	1.需要读取源
 *  2.将读到的源数据写入到目的地
 *  3.既然是操作文本数据，使用字符流
 * */
public class CopyTextTest {
	private static final int BUFFER_SIZE = 1024;

	public static void main(String[] args){
		FileReader fr=null;
		FileWriter fw=null;
		try {
			fr=new FileReader("c:\\MyDrivers\\test.txt");
			fw=new FileWriter("E:\\test.txt",true);
			int len=0;
			char[] chr=new char[BUFFER_SIZE];
			while((len=fr.read(chr))!=-1){
				fw.write(chr, 0, len);
				fw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(fr!=null)
					fr.close();
				if(fw!=null)
					fw.close();
			} catch (IOException e2) {
				System.out.println("复制失败！");
			}
		}
	}
}
