package com.song.p2.String.test;
//һ���Ӵ��������г��ֵĴ���
/*
 * ˼·��
 * 1.Ҫ�ҵ��Ӵ��Ƿ���ڣ�������ڻ�ȡ����ֵ�λ�ã���indexof()
 * 2.����һ�������� +1 
 * 3.����������   ��һ�ο�ʼ���ҵ�λ��  �ϴγ��ֵ�λ��+Ҫ�����ַ����ĳ��� 
 * 4.�������� ���ϴγ��ֵ�λ��+Ҫ�����ַ����ĳ���=�����ĳ���ʱ  �˳�ѭ��
 * */
public class StringTest_2 {
	public static void main(String[] args){
		String s="nasvbuhnabducjnahxudinna";
		String key="na";
		
		int count=getKeyStringCOunt(s,key);
		System.out.println(count);
		//getKeyStringCount(s,key);
	}
	/**
	 * ��ȡ���ַ����������г��ִ��� ����indexOf()���� �� subString()������˷����и�ȱ�� ��ɳ��������ַ�������
	 * @param s
	 * @param key
	 * @return
	 */
	public static int getKeyStringCount(String s, String key) {
		//���������
		int count=0;
		
		//������ҵ�λ��
		int index=0;
		
		while((index=s.indexOf(key))!=-1){
			
			s=s.substring(index+key.length());
			
			count++;
		}
		
		return count;
	}
	/**
	 * ��ȡ���ַ����������г��ִ��� ����indexOf()����
	 * @param s
	 * @param key
	 * @return count
	 */
	public static int getKeyStringCOunt(String s, String key) {
		//1.���������
		int count=0;
		
		//2.�����¼λ��
		int index=0;
		
		while((index=s.indexOf(key,index))!=-1){//Ҫ֪�� ��indexOf(key,findIndex) �е�findIndex>�����ĳ���ʱ ֱ�ӷ���-1
			
				index=index+key.length();
				count++;
		}
		return count;
	}
}
