package com.song.IO.Properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

//���󣺶��幦�� ��ȡһ��Ӧ�ó������еĴ������������5�Σ�����ʹ�õĴ����Ѿ������ޣ�ֹͣ���г���
public class PropertiesTest_2 {
	public static void main(String[] args) throws IOException {
		getAppCount();
	}

	public static void getAppCount() throws IOException {
		//�������ļ���װ��file����
		File confile=new File("count.properties");
		
		if(!confile.exists())
			confile.createNewFile();
		
		FileInputStream fis=new FileInputStream(confile);
		
		Properties p=new Properties();
		p.load(fis);
		
		
		//�Ӽ����л�ȡ�� ֵ ����
		String value=p.getProperty("time");
		//���������
		int count=0;
		if(value!=null){
			count=Integer.parseInt(value);
			if(count>=2)
				throw new RuntimeException("ʹ�ô����Ѵ����ޣ��빺�����������");
		}
		
		count++;
		
		p.setProperty("time",count+"");
		
		FileWriter fw=new FileWriter(confile);
		
		p.store(fw,"count");
		
		fis.close();
		fw.close();
	}

}
