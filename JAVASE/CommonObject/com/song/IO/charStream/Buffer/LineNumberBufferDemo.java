package com.song.IO.charStream.Buffer;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
/*
 * LineNumberReader  �̳��� BufferReader��  ��BufferReaderһ�� Ҳ��һ�������� ��ǿ��������Ĺ���
 * 
 * ���ã����Ի��ÿһ�е�����
 * 
 * */


public class LineNumberBufferDemo {
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("IO��.txt");
		LineNumberReader lnr=new LineNumberReader(fr);
		String s=null;
		while((s=lnr.readLine())!=null){
			System.out.println(lnr.getLineNumber()+"::"+s);
		}
	}
}
