package com.song.p2.String.test;
/*
 * 1，给定一个字符串数组。按照字典顺序进行从小到大的排序。
 * {"nba","abc","cba","zz","qq","haha"}
 * 
 * 思路：
 * 1.对数组排序  可以用冒泡 选择
 * 2.for嵌套和比较 换位
 * 3.字符串比较用compareTo方法
 */
public class StringTest_1 {
	public static void main(String[] args){
		String[] arr={"nba","abc","cba","zz","qq","haha"};
		
		printString(arr);
		
		sortString(arr);
		
		printString(arr);
	}

	public static void sortString(String[] arr) {
		for(int i=0;i<arr.length-1;i++){
			for(int j= i + 1;j<arr.length;j++){
				if(arr[i].compareTo(arr[j])>0){//字符串比较用compareTo方法！！！！！！
					swap(arr,i,j);
				}
			}
		}
		
	}

	private static void swap(String[] arr,int i,int j) {
		String temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

	public static void printString(String[] arr) {
		for(int i=0;i<arr.length;i++){
			if(i!=arr.length-1){
				System.out.print(arr[i]+", ");
			}else{
				System.out.print(arr[i]);
				System.out.println();
			}
		}
		
	}
}
