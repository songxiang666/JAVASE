package com.song.OtherAPI;

import java.io.IOException;

public class RunTimeDemo {
	public static void main(String[] args){
		/*
		 * Runtime:û�й��췽��������಻���Դ�������
		 * ��һ����ȡΨһ����ľ�̬����   getRuntime()
		 * ʹ���˵���ģʽ 
		 * */
		Runtime rt=Runtime.getRuntime();
		//execute:ִ��  xxx.exe
		try {
			rt.exec("notepad.exe");
//			rt.exec("QQ.exe");����ִ��ʧ�� ԭ��QQ.exeû����classpath·����
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
