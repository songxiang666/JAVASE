package com.song.p1.String.demo;

public class StringConstuctorDemo {
	public static void main(String[] args){
		StringConstructorDemo2();
	}

	public static void StringConstructorDemo2() {
		char[] arr={'w','a','p','q','x'};
							// ��ʼ�±�  ȡֵ����
		String s=new String(arr,1,3);
		System.out.println("s="+s);//s=apq

	}

	public static void StringConstructorDemo() {
		String s=new String();//��Ч��String s="" ����Ч�� String s=null;
		
		byte[] arr={65,66,67,68};
		
		String s1=new String(arr);
		System.out.println("s1="+s1);
	}
}
