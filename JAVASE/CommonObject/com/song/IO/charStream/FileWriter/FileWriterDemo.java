package com.song.IO.charStream.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	private static final String LINE_SEPARATOR = System.getProperty("line.separator");

	public static void main(String[] args) throws IOException{
		//����һ���������ļ���д���ַ����ݵ��ַ����������
		//������캯���м���true,����ʵ�ֶ��ļ�����д
		FileWriter fw=new FileWriter("demo.txt",true);
		//����writer�����е�writer���� д������  �洢�ڻ�����
		fw.write("��������Զ������ģ�xbs"+LINE_SEPARATOR+"hb");
		//����ˢ�£�������������ֱ��д��Ŀ�ĵ���
		fw.flush();
		fw.write("666");
		//�ر��ļ���   �ر���Դ  �ڹر���Դǰ�����flush  ˢ������
		fw.close();
		System.out.println(LINE_SEPARATOR);
	}
}
