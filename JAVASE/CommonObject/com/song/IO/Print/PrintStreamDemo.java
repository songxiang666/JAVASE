package com.song.IO.Print;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamDemo {
	public static void main(String[] args) throws FileNotFoundException {
		/*
		 * PrintStream:
		 * 	1.�ṩ�˴�ӡ�������ԶԶ�����������ֵ���д�ӡ�����������ݵı�����ʽ
		 * 	2.������IOException
		 * 
		 * 	���캯���������������͵�ֵ��
		 * 	1.�ַ���·��
		 * 	2.File����
		 * 	3.�ֽ������
		 * 
		 * */
		PrintStream out=new PrintStream("print.txt");
		out.write(97);//ֻд���8λ��
		out.print(97);//��97�ȱ���ַ�����ԭ�� �����ݴ�ӡ��Ŀ�ĵ�
		out.close();
	}               
}
