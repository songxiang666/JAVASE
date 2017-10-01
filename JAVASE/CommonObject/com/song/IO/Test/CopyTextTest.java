package com.song.IO.Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//��c�̵�һ���ı��ļ����Ƶ�d��
/*
 * ˼·��
 * 	1.��Ҫ��ȡԴ
 *  2.��������Դ����д�뵽Ŀ�ĵ�
 *  3.��Ȼ�ǲ����ı����ݣ�ʹ���ַ���
 * */
public class CopyTextTest {
	private static final int BUFFER_SIZE = 1024;

	public static void main(String[] args){
		FileReader fr=null;
		FileWriter fw=null;
		try {
			fr=new FileReader("c:\\MyDrivers\\test.txt");
			fw=new FileWriter("E:\\test.txt",true);
			int len=0;
			char[] chr=new char[BUFFER_SIZE];
			while((len=fr.read(chr))!=-1){
				fw.write(chr, 0, len);
				fw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(fr!=null)
					fr.close();
				if(fw!=null)
					fw.close();
			} catch (IOException e2) {
				System.out.println("����ʧ�ܣ�");
			}
		}
	}
}
