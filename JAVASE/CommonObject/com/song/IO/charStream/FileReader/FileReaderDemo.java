package com.song.IO.charStream.FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//Ҫ�󣺴�һ���ض����ļ��ж�ȡ����
//��ʽһ��һ�ζ�һ���ַ�
public class FileReaderDemo {
	public static void main(String[] args) throws IOException{
		/*1.������ȡ�ַ����ݵ�������
		 * 
		 * �ڴ�����ȡ������ʱ  ������ȷ����ȡ����ļ� �Ҹ��ļ��������
		 * Ŀ��������һ����ȡ������һ�������ļ�
		 * 
		 * */
		FileReader fr=new FileReader("demo.txt");
		int ch=0;
		while((ch=fr.read())!=-1){
			System.out.println((char)ch);
		}
		fr.close();
	}
}
