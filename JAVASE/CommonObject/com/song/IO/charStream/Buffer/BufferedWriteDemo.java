package com.song.IO.charStream.Buffer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriteDemo {
	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("demo.txt");
		
		//����һ��BUffer������
		BufferedWriter buf=new BufferedWriter(fw);
		//������д������������
		buf.write("songxiang ai da mi ");
		buf.newLine();//����  ��ȡ����ǰϵͳ�Ļ��з�
		buf.write("666");
		//ˢ�»�����
		buf.flush();
		//�رջ�����
		buf.close();
	}
}