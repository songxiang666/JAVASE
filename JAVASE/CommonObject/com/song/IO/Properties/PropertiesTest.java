package com.song.IO.Properties;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
//���� properties��  �޸�Ӳ���ļ��еļ�ֵ������
public class PropertiesTest {
	public static void main(String[] args) throws IOException {
		test_fileWriterAndFileReader();
	}

	public static void test_fileWriterAndFileReader() throws IOException {
		FileReader fr=new FileReader("info.txt");
		FileWriter fw=new FileWriter("info.txt");//��ʱfileWriter������into.txt�ı��Ḳ��֮ǰ���ı�
	}

	public static void test() throws IOException {
		//���Ƚ��н�׳���ж�
		File file=new File("info.txt");
		if(!file.exists())//�ж��ļ��Ƿ� ����  ������  �򴴽�һ���µ��ļ�
			//file.createNewFile();
			System.out.println(file.length());
		FileReader fr=new FileReader(file);
//		
		Properties p=new Properties();
//		
		p.load(fr);
//		
		p.put("kimi", "6667");
//		
		p.list(System.out);

		FileWriter fw=new FileWriter(file);//ע�� FileWriter ��ֱ�Ӵ���һ���µ�info�ļ�
		p.store(fw, "exchange");
		fr.close();
		fw.close();
	}
}
