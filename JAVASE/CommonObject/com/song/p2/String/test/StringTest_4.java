package com.song.p2.String.test;
//ģ��һ��trim����һ�µķ�����
/*
 *1.������������
 * һ��������Ϊ��ͷ��ʼ�ж��ַ����ո�ĽǱ�
 * һ��������Ϊ��β��ʼ�ж��ַ����ո�ĽǱ�
 *2.�жϵ����ǿո�Ϊֹ��ȡͷβ֮����ַ�������
 * 
 * */
public class StringTest_4 {
	public static void main(String[] args){
		String s="   ab c   ";
		System.out.println("-"+s+"-");
		s=toTrim(s);
		System.out.println("-"+s+"-");
		
	}
	/**
	 * һ����trim()�������ƹ��ܵķ���  ȥ���ַ������˵Ŀո�
	 * @param s
	 * @return
	 */
	public static String toTrim(String s) {
		int start=0,end=s.length()-1;
		
		while(start<end&&s.charAt(start)==' '){
			start++;
		}
		while(start<end&&s.charAt(end)==' '){
			end--;
		}
		return s.substring(start,end+1);
	}
}
