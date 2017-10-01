package com.song.IO.Sequence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Properties;

public class MergeFile {
	public static void main(String[] args) throws IOException {
		File file=new File("E:\\partFiles");
		mergeFile_3(file);
	}
	public static void mergeFile_3(File dir) throws IOException{
		if(dir.exists()){
					
			Properties p=new Properties();
			
			//��ȡ�����ļ�
			File[] files=dir.listFiles(new SuffixFilter(".properties"));
			
			//�ж������ļ��Ƿ������Ψһ
			if(files.length!=1){
				throw new RuntimeException(dir+",��Ŀ¼��û��properties�ļ����߲�Ψһ��");
			}
			
			//���������ļ�  ��Propertiesʵ��������
			p.load(new FileInputStream(files[0]));
			
			//��ȡ�ļ���������
			String suffix=p.getProperty("filename").split("\\.")[1];
			
			//��ȡ�ļ�Դ����Ƭ����
			int count=Integer.parseInt(p.getProperty("partcount"))-1;
			
			//��ȡ���е�part��Ƭ
			File[] partFiles=dir.listFiles(new SuffixFilter(".part"));
			
			//��׳���ж�   �ж���Ƭ�ļ����� �Ƿ��������ļ���¼������һ��   ��һ�� �׳��쳣
			if(partFiles.length!=count){
				throw new RuntimeException("��Ƭ�ļ�������Ҫ�󣬸�������!Ӧ��"+count+"��");
			}
			
			//��������  
			ArrayList<FileInputStream> list=new ArrayList<FileInputStream>();
			for(int x=1;x<=partFiles.length;x++){
				//����������Ƭ�ļ�����������ŵ�������
				list.add(new FileInputStream(partFiles[x]));
			}
			//ͨ������  ��ȡ�����й�����Ƭ�ļ��������  ö��
			Enumeration<FileInputStream> e=Collections.enumeration(list);
			
			//�������ж���
			SequenceInputStream sis=new SequenceInputStream(e);
			
			//�������������
			FileOutputStream fos=new FileOutputStream(new File(dir,"co."+suffix));
			
			//�����Զ��建����
			byte[] buf=new byte[1024*1024];
			
			int len=0;
			
			while((len=sis.read(buf))!=-1){
				fos.write(buf,0,len);//�������ж����ȡ��������  д�������������
				fos.flush();//ˢ�»�����
			}
			sis.close();
			fos.close();
		}
		
	}
	public static void mergeFile_2(File dir) throws IOException {
		if(dir.exists()){
			
			Properties p=new Properties();
			
			File[] files=dir.listFiles();
			
			FilenameFilter ff=new FilenameFilter(){

				@Override
				public boolean accept(File dir, String name) {
					
					return name.endsWith(".properties");
				}
				
			};
			
			for(File file:files){
				if(ff.accept(dir,file.getName())){
					p.load(new FileInputStream(file));
					break;
				}
			}
			
			String fileName=p.getProperty("filename");
			
			String suffix=fileName.split("\\.")[1];
			
			int count=Integer.parseInt(p.getProperty("partcount"))-1;
			
			ArrayList<FileInputStream> list=new ArrayList<FileInputStream>();
			for(int x=1;x<=count;x++){
				list.add(new FileInputStream(new File(dir,x+".part")));
			}
			Enumeration<FileInputStream> e=Collections.enumeration(list);
			
			SequenceInputStream sis=new SequenceInputStream(e);
			
			
			
			FileOutputStream fos=new FileOutputStream(new File(dir,fileName));
			
			byte[] buf=new byte[1024*1024];
			
			int len=0;
			
			while((len=sis.read(buf))!=-1){
				fos.write(buf,0,len);
				fos.flush();
			}
			sis.close();
			fos.close();
		}
		
	}
	public static void mergeFile(File dir) throws IOException {
		if(dir.exists()){
			ArrayList<FileInputStream> list=new ArrayList<FileInputStream>();
			for(int x=1;x<=4;x++){
				list.add(new FileInputStream(new File(dir,x+".part")));
			}
			Enumeration<FileInputStream> e=Collections.enumeration(list);
			
			SequenceInputStream sis=new SequenceInputStream(e);
			
			FileOutputStream fos=new FileOutputStream(new File(dir,"co.mp3"));
			
			byte[] buf=new byte[1024*1024];
			
			int len=0;
			
			while((len=sis.read(buf))!=-1){
				fos.write(buf,0,len);
				fos.flush();
			}
			sis.close();
			fos.close();
		}
	}
}
