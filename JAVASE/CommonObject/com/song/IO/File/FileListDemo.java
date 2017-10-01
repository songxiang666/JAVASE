package com.song.IO.File;

import java.io.File;

public class FileListDemo {
	public static void main(String[] args) {
		listDemo_4();
	}
	/**
	 * ����ָ���ĺ�׺  ���ɸѡ��Ԫ��
	 * */
	public static void listDemo_4() {
		File dir=new File("e:\\");
		String[] files=dir.list(new FilterByAll(".jpg"));
		for(String file:files)
			System.out.println(file);
		
	}
	/**
	 * �������e����û�����ص��ļ�
	 * */
	public static void listDemo_3() {
		File dir=new File("e:\\");
		File[] files=dir.listFiles(new FilterByHidden());
		for(File file:files)
			System.out.println(file.getName());
		
	}
	/**
	 * ɸѡ��e���º�׺Ϊ.jpg�ļ�
	 * */
	public static void listDemo_2() {
		File dir=new File("e:\\");
		String[] names=dir.list(new FilterNameByJava());
		for(String name:names){
			System.out.println("--");
			System.out.println(name);
		}
	}
	/**
	 * ��õ�ǰĿ¼�����е��ļ�
	 * */
	public static void listDemo() {
		File file=new File("e:\\a.jpg");
		
		//��ȡ��ǰĿ¼�µ��ļ��Լ��ļ��е����ƣ����������ļ�
		//�������Ŀ¼  ��namesΪ��     �������������ᷢ����ָ���쳣 ������ʵ�ϵͳĿ¼Ҳ�ᷢ����ָ���쳣
		String[] names=file.list();
		System.out.println(names);
		//for(String name:names)
		//	System.out.println(name);
	}
}
