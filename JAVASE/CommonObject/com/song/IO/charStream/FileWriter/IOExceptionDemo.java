package com.song.IO.charStream.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class IOExceptionDemo {
	public static void main(String[] args){
		FileWriter fw=null;
		try {
			fw = new FileWriter("k:\\demo.txt");
			//�������д   �׳������쳣
			/*
			 * 1.java.io.FileNotFoundException �ļ��Ҳ���
			 * 2.java.lang.NullPointerException ��ָ���쳣
			 * 
			 * ��������
			 * �ڽ���fw.close()ʱ  ���ж�  fw�Ƿ�Ϊ��   
			 * */
			fw.write("�����������");
			fw.flush();
		} catch (IOException e) {
			System.out.println(e.toString());
		}finally{
			try {
				if(fw!=null)
					fw.close();
			} catch (IOException e) {
				throw new RuntimeException("�ر�ʧ�ܣ�");
			}
		}
		
	}
}
