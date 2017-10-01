package com.song.IO.Properties;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
 * ���󣺻�ȡָ��Ŀ¼��ָ����չ�����ļ�(������Ŀ¼��) ����Щ�ļ���ָ����չ�����ļ��б�
 	˼·��1.���������ȱ���
 		2.Ҫ�ڱ��������н��й��� ���������������ݶ��洢��������
 		3.�������е����ݽ��б��� ��������·��д�뵽�ļ���
 */
public class PropertiesTest01 {
	public static void main(String[] args) throws IOException {
		File file=new File("D:\\Myeclipse\\CommonObject");
		
		ArrayList<File> list=new ArrayList<File>();
		
		getFiles(file,new FilterNameByJava(),list);
		
		File listFile=new File(file,"list.txt");
		
		writeToFile(list,listFile);
	}
	public static void writeToFile(List<File> list,File listFile) throws IOException{
		BufferedWriter bufw=null;
		try{
			bufw=new BufferedWriter(new FileWriter(listFile));
			
			for(File file:list){
				bufw.write(file.getAbsolutePath());
				bufw.newLine();
				bufw.flush();
			}
		}finally{
			if(bufw!=null)
				try {
					bufw.close();
				} catch (IOException e) {
					
					throw new RuntimeException("�ر�ʧ�ܣ�");
				}
		}
	}
	/**
	 * ��ָ��Ŀ¼�е����ݽ�����ȱ�����������ָ�������������й���
	 * @param dir
	 * @param fil
	 * @param list
	 */
	public static void getFiles(File dir,FilenameFilter fil,List<File> list){
		File[] arr=dir.listFiles();
		for(File file:arr){
			if(file.isDirectory())
				//���еݹ�
				getFiles(file,fil,list);
			else{
				//�Ա��������ļ����й������ı���  ���������Ĵ���list��
				if(fil.accept(dir, file.getName()))
					list.add(file);
			}
		}
	}
}
