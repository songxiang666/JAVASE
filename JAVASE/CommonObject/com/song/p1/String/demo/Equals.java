package com.song.p1.String.demo;

public class Equals {
	public static void main(String[] args){
		Integer itr=new Integer("123");
		Long lon=new Long("123");
		System.out.println(itr.equals(lon));//false
		//��Integer���и�д��equals����  ���жϸö����ǲ���Integer���ʵ�� ����� �ٱȽ���ֵ
		
		Person p1=new Person("����");
		Person p2=new Person("����");
		System.out.println(p1.equals(p2));//false  
		//������Person���в�δ��д Object�е�equals ����  �����õ���Object�е�equals ��Ƚϵ��ǵ�ֵַ
	}
}
class Person{
	private String name;
	public Person(String name){
		this.name=name;
	}
}