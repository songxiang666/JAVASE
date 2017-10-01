package com.song.p5.Integer;

import java.util.Arrays;

/*思路：
 * 1.切割字符串 获得数字型字符串
 * 2.将字符串转换成int型
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
		//将字符串变成字符串数组
		String[] arr=stringToArray(number);
		//将字符串数组变成Int数组
		int[] num_arr=toIntArray(arr);
		//对Int数组排序
		mysorArray(num_arr);
		//将排序后的Int数组变成字符串
		
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
