package com.song.p5.Integer;

import java.util.Arrays;

/*˼·��
 * 1.�и��ַ��� ����������ַ���
 * 2.���ַ���ת����int��
 * 
 * */
public class WrapperTest {

	public static void main(String[] args){
		String number ="20 78 9 -7 36 29";
		
		System.out.println(number);
		number=sortStringNumber(number);
		System.out.println(number);
	}

	public static String sortStringNumber(String number) {
		//���ַ�������ַ�������
		String[] arr=stringToArray(number);
		//���ַ���������Int����
		int[] num_arr=toIntArray(arr);
		//��Int��������
		mysorArray(num_arr);
		//��������Int�������ַ���
		
		String temp=arrToString(num_arr);
		System.out.println(temp);
		return null;
	}

	public static String arrToString(int[] numArr) {
		StringBuilder sb=new StringBuilder();
		sb.append("[");
		for (int i = 0; i < numArr.length; i++) {
			if(i!=numArr.length-1){
				sb.append(numArr[i]+",");
			}else
				sb.append(numArr[i]+"]");
		}
		return null;
	}

	public static void mysorArray(int[] numArr) {
		Arrays.sort(numArr);
		
	}

	public static int[] toIntArray(String[] arr) {
		int[] x=new int[arr.length];
		for (int i = 0; i < x.length; i++) {
			x[i]=Integer.parseInt(arr[i]);
		}
		return x;
	}

	public static String[] stringToArray(String number) {
		String[] st=number.split(" ");
		return st;
	}
}
