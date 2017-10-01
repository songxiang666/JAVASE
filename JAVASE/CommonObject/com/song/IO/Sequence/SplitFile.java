package com.song.IO.Sequence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class SplitFile {
	private static final int SIZE = 1024*1024;

	public static void main(String[] args) throws IOException {
		File file=new File("e:\\christmas.mp3");
		splitFile(file);
	}
	public static void splitFile_2(File file) throws IOException {
		//�ö�ȡ������Դ�ļ�
		FileInputStream fis=new FileInputStream(file);
		
		//����һ��1M�Ļ�����
		byte[] buf=new byte[SIZE];
		
		//����Ŀ��
		FileOutputStream fos=null;
		
		int len=0;
		int quen=1;
		
		File dir=new File("e:\\partFiles");
		if(!dir.exists())
			dir.mkdir();
		
		while((len=fis.read(buf))!=-1){  //���ļ������ָ��Ŀ¼��
			fos=new FileOutputStream(new File(dir,(quen++)+".part"));
			fos.write(buf,0,len);
		}
		
		fos.close();
		fis.close();
		
	}
	public static void splitFile(File file) throws IOException{
		Properties p=new Properties();
		
		
		//�ö�ȡ������Դ�ļ�
		FileInputStream fis=new FileInputStream(file);
		
		//����һ��1M�Ļ�����
		byte[] buf=new byte[SIZE];
		
		//����Ŀ��
		FileOutputStream fos=null;
		
		int len=0;
		int quen=1;
		
		File dir=new File("e:\\partFiles");
		if(!dir.exists())
			dir.mkdir();
		
		while((len=fis.read(buf))!=-1){  //���ļ������ָ��Ŀ¼��
			fos=new FileOutputStream(new File(dir,(quen++)+".part"));
			fos.write(buf,0,len);
		}
		
		//�����и�������ļ���Ϣ���浽prop������
		p.setProperty("partcount",quen+"");
		p.setProperty("filename",file.getName());
		
		fos=new FileOutputStream(new File(dir,quen+".properties"));
		
		//��prop�����е����ݴ洢���ļ���
		p.store(fos, "save files info");
		
		fos.close();
		fis.close();
	}
	
}
