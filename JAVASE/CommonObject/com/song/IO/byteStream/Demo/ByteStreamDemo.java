package com.song.IO.byteStream.Demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo {
	public static void main(String[] args) throws IOException {
		demo_Read();
	}

	public static void demo_Read() throws IOException {
		//1.����һ������������
		FileInputStream fi=new FileInputStream("byte.txt");
		//System.out.println(fi.available());//��Ҫ����ʹ�ù�������  �����ڴ����
		//��ȡ���ݵ����ַ�ʽ
		//1.
		byte[] buf=new byte[fi.available()];
		fi.read(buf);
		System.out.println(new String(buf));
		//2.����ʹ�����ַ���
//		byte[] buf=new byte[1024];
//		int len=0;
//		while((len=fi.read(buf))!=-1)
//			System.out.println(new String(buf,0,len));
		//3.
//		int ch=0;
//		while((ch=fi.read())!=-1){
//			System.out.print((char)ch);
//		}
//		fi.close();
	}

	public static void demo_write() throws IOException {
		//1.����һ��������������ڲ����ļ�
		FileOutputStream fp=new FileOutputStream("byte.txt");
		
		///2.д���ݣ�ֱ��д��Ŀ�ĵ�
		fp.write("cdhjjcodl".getBytes());
		
		//fp.flush()
		fp.close();
	}
}
