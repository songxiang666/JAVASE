package com.song.p2.String.test;
//�����ַ����������ͬ���Ӵ���
/*
 * 
 * 
 * */
public class StringTest_3 {
	public static void main(String[] args){
		String s1="songxiangnihengmei";
		String s2="xuenihengmeima";
		
		String s=getMaxSubString(s1,s2);
		System.out.println(s);
	}
	/**
	 * �������Ӵ�
	 * @param s1
	 * @param s2
	 * @return
	 */
	public static String getMaxSubString(String s1, String s2) {
		//�ж�˭�� ˭��
		String max = null,min = null;
		max=(s1.length()>s2.length())? s1:s2;
		min=max.equals(s1)? s2:s1;
		
		for(int i=0;i<min.length();i++){//���ѭ�����ڿ���s2Ҫ���̵ĳ���
						//�ڲ�ѭ�� ���� �´β����ַ�����x:��ʼ�±�  z:�Ӵ�����
			for(int x=0,z=min.length()-i;z!=min.length()+1;x++,z++){
				
				String s=min.substring(x,z);
				if(max.contains(s)){
					return s;
				}
			}
			
		}
		
		return null;
	}
}
