package com.song.IO.charStream.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class IOExceptionDemo {
	public static void main(String[] args){
		FileWriter fw=null;
		try {
			fw = new FileWriter("k:\\demo.txt");
			//如果这样写   抛出两个异常
			/*
			 * 1.java.io.FileNotFoundException 文件找不到
			 * 2.java.lang.NullPointerException 空指针异常
			 * 
			 * 处理方法：
			 * 在进行fw.close()时  先判断  fw是否为空   
			 * */
			fw.write("宋湘你很美！");
			fw.flush();
		} catch (IOException e) {
			System.out.println(e.toString());
		}finally{
			try {
				if(fw!=null)
					fw.close();
			} catch (IOException e) {
				throw new RuntimeException("关闭失败！");
			}
		}
		
	}
}
