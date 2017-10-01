package com.song.IO.Sequence;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
//�ϲ��ļ�����  �ϲ������ݷŴ�4.text��
public class SequenceDemo {
	public static void main(String[] args) throws IOException {
		//��λ�ȡö����
		method_3();
	}

	public static void method_3() throws IOException {
		//����Collections �ж���õĹ����෽��  Collection.enumeration
		ArrayList<FileInputStream> list=new ArrayList<FileInputStream>();
		
		for(int i=1;i<=3;i++){
			list.add(new FileInputStream(i+".txt"));
		}
		
		Enumeration<FileInputStream> e=Collections.enumeration(list);
		
		/*//����һ��������
		final Iterator<FileInputStream> it=list.iterator();
		
		//ע���ص�����  ����Enumeration  ʵ�������ڲ���
		Enumeration<FileInputStream> e=new Enumeration<FileInputStream>(){

			@Override
			public boolean hasMoreElements() {
				return it.hasNext();
			}

			@Override
			public FileInputStream nextElement() {
				return it.next();
			}
			
		};*/
		
		SequenceInputStream sis=new SequenceInputStream(e);
		
		FileOutputStream fos=new FileOutputStream("1234.txt");
		
		byte[] buf=new byte[1024];
		int len=0;
		while((len=sis.read(buf))!=-1){
			fos.write(buf,0,len);
			fos.flush();
		}
		fos.close();
		sis.close();
		
	}

	public static void method_2() throws IOException {
		
		//Vector��Ч��̫��  �����Ѿ�����̭  ����Ҫ��ȡ��ö��  ��ô�죿
		ArrayList<FileInputStream> list=new ArrayList<FileInputStream>();
		
		for(int i=1;i<=3;i++){
			list.add(new FileInputStream(i+".txt"));
		}
		
		//����һ��������
		final Iterator<FileInputStream> it=list.iterator();
		
		//ע���ص�����  ����Enumeration  ʵ�������ڲ���
		Enumeration<FileInputStream> e=new Enumeration<FileInputStream>(){

			@Override
			public boolean hasMoreElements() {
				return it.hasNext();
			}

			@Override
			public FileInputStream nextElement() {
				return it.next();
			}
			
		};
		
		SequenceInputStream sis=new SequenceInputStream(e);
		
		FileOutputStream fos=new FileOutputStream("1234.txt");
		
		byte[] buf=new byte[1024];
		int len=0;
		while((len=sis.read(buf))!=-1){
			fos.write(buf,0,len);
			fos.flush();
		}
		fos.close();
		sis.close();
		
	}

	/**
	 * @throws IOException
	 */
	public static void method_1() throws IOException {
		Vector<FileInputStream> v=new Vector<FileInputStream>();
		v.add(new FileInputStream("1.txt"));
		v.add(new FileInputStream("2.txt"));
		v.add(new FileInputStream("3.txt"));
		Enumeration<FileInputStream> e=v.elements();
		SequenceInputStream sis=new SequenceInputStream(e);
		FileOutputStream fos=new FileOutputStream("4.txt");
		
		byte[] buf=new byte[1024];
		int len=0;
		while((len=sis.read(buf))!=-1){
			fos.write(buf,0,len);
		}
		sis.close();
		fos.close();
	}
}
