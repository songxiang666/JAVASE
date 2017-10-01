package com.song.IO.Properties;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args) throws IOException {
		demo_2();
	}
	/**
	 * �Լ�ʵ��load����������
	 * */
	public static void My_load() throws IOException {
		Properties p=new Properties();
		BufferedReader br=new BufferedReader(new FileReader("info.txt"));
		String line=null;
		while((line=br.readLine())!=null){
			if(!line.startsWith("#")){
				String[] arr=line.split("[=:]");//������ʽ
				p.put(arr[0], arr[1]);
			}
		}
		p.list(System.out);
		br.close();
	}

	public static void demo_3() throws IOException {
		Properties p=new Properties();
		//�����е�����������һ���ļ���
		//ע�⣺����Ҫ��֤���ļ��е�����ʱ��ֵ��
		//��Ҫʹ�õ���ȡ����
		FileInputStream  fis=new FileInputStream("info.txt");
		//ʹ��load����  �����ļ����е�����
		p.load(fis);
		//
		p.list(System.out);//��ӡ�������еļ�ֵ��
	}

	public static void demo_2() throws IOException {
		Properties pt=new Properties();
		pt.put("kimi","666");
		pt.put("kimi2","6661");
		pt.put("kimi3","6662");
		pt.put("kimi4","6663");
		//��Ҫ����Щ�����е��ַ�����ֵ��Ϣ�־û��洢���ļ���  ������Ҫ���������
		FileOutputStream fos=new FileOutputStream("info.txt");
		pt.store(fos, "name+age");//��pt�еļ�ֵ��Ϣ�洢��info.txt��
	}

	public static void demo_1() {
		Properties pt=new Properties();
		pt.put("kimi","666");
		pt.put("kimi2","6661");
		pt.put("kimi3","6662");
		pt.put("kimi4","6663");
		
		pt.list(System.out);//���ڵ��ԵĹ���  ��ӡ������ֵ
	}
}
