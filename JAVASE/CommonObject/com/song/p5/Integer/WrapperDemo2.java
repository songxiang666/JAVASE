package com.song.p5.Integer;

public class WrapperDemo2 {
	public static void main(String[] args){
		Integer i=4;//i=new Integer(4)  �Զ�װ�䣬����д
		i=i+6;//i=new Integer(i.intValue()+6); i.intValue();  �Զ�����
		
		//�Զ�����װ�� ȱ��    ��Integer i=null �����Զ�װ��ʱ  ����ʱ����� i.intValue() �ᱨ��  ������Ҫ�����ֶ��ж�  
		
		int num=4;
		num=num+5;
		
		
		//-------------������--------------------
		Integer x= new Integer(127);
		Integer y=new Integer(127);
		
		System.out.println(x==y);//false
		System.out.println(x.equals(y));//true
		
		Integer a=127;
		Integer b=127;//jdk1.5�Ժ�   ����Զ�װ����һ���ֽ�  �����ݻᱻ���� ���� ���¿��ٿռ�
		System.out.println(a==b);//true
	}
}
