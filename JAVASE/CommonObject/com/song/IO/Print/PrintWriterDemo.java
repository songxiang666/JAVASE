package com.song.IO.Print;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class PrintWriterDemo {
	public static void main(String[] args) throws IOException {
		
		/*
		 * PrintWriter:�ַ���ӡ��
		 * ���캯��������
		 * 	1.�ַ���·��
		 * 	2.File����
		 * 	3.�ֽ������
		 * 	4.�ַ������
		 * */
		BufferedReader bufr=new BufferedReader(new InputStreamReader(System.in));
		
		PrintWriter pw=new PrintWriter(new FileOutputStream("out.txt"),true);
		
		String line=null;
		while((line=bufr.readLine())!=null){
			if("over".equals(line))
				break;
			pw.println(line.toUpperCase());
			//pw.flush();
		}
		pw.close();
		bufr.close();
	}
}
