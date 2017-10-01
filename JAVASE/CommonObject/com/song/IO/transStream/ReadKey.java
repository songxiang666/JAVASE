package com.song.IO.transStream;

import java.io.IOException;
import java.io.InputStream;

public class ReadKey {
	public static void main(String[] args) throws IOException {
		readKey_2();
	}

	public static void readKey_2() throws IOException {
		InputStream in=System.in;
		StringBuffer sb=new StringBuffer();
		int ch=0;
		
		while((ch=in.read())!=-1){
			if(ch=='\r')
				continue;
			if(ch=='\n'){
				String temp=sb.toString();
				if("over".equals(temp))
					break;//�Զ���������
				System.out.println(temp.toUpperCase());
				sb.delete(0, sb.length());
			}
			else{sb.append((char)ch);}
		}
	}

	public static void readKey() throws IOException {
		InputStream in=System.in;
		
		int ch=in.read();
		System.out.println(ch);
		int ch1=in.read();
		System.out.println(ch1);
		int ch2=in.read();
		System.out.println(ch2);
		//д��һ���ַ��س���  �����
		/*
		 * 97
		   13
		   10
		 * */
		//ע��  system.in  ����ر�  ����  ��Ҳ���ܶ�ȡ
	}
}
