package com.song.p3.StringBuffer.demo;

public class StringBufferDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * StringBuffer:�����ַ���������
		 * 	���ڴ洢���ݵ�����
		 * �ص㣺
		 * 1.����ʱ�ɱ��
		 * 2.���Դ洢��ͬ���͵�����
		 * 3.����Ҫת���ַ�����ʹ��
		 * 4.���Զ��ַ��������޸�
		 * 
		 * һ����������Ӧ�þ߱��Ĺ���
		 * 1.���
		 * 		StringBuffer append(data) ����������������� Ҳ�᷵�ص�ǰ��������this
		 * 		StringBuffer insert(fontData,Data)
		 * 2.ɾ��
		 * 		StringBuffer delete(int startIndex,int endIndex) //ɾ��һ���ַ��� ����ͷ������β
		 * 		StringBuffer deleteCharAt(int index)ɾ��ָ��λ�õ�Ԫ��
		 * 
		 * 3.����
		 * 		char charAt(index);
		 * 		int IndexOf(String);
		 * 		int LastIndexOf(String);
		 * 4.�޸�
		 * 		StringBuffer replace(start,end,string)
		 * 		void setCharAt(index,char)
		 * ��ţ�Ƶĺ��� 
		 * 		StringBuffer setLength(length);
		 * */
		//bufferMethodDemo();  //append��insert��ʾ
		//bufferMethodDemo_1(); //delete����ʾ
		bufferMethodDemo_2(); //setLength����ʾ
	}

	private static void bufferMethodDemo_2() {
		StringBuffer sb=new StringBuffer("abcd");
		sb.setLength(2);
		System.out.println("sb="+sb);//ֱ�����ó���
		
	}

	public static void bufferMethodDemo_1() {
		StringBuffer sb=new StringBuffer("abcd");
//		sb.delete(0,2);
//		System.out.println(sb);
		
		//��ջ�����
		sb.delete(0, sb.length());
		System.out.println(sb);
	}

	public static void bufferMethodDemo() {
		//��������������
		StringBuffer sb=new StringBuffer();
		
	//	StringBuffer s1=sb.append(4);
		
//		System.out.println(sb);
//		System.out.println(s1);
//		System.out.println(sb==s1);
		sb.append(4).append(false).append(666);
		sb.insert(3,"haha");
		System.out.println(sb);
	}

}
