package com.song.p2.String.test;
/*
 * 1������һ���ַ������顣�����ֵ�˳����д�С���������
 * {"nba","abc","cba","zz","qq","haha"}
 * 
 * ˼·��
 * 1.����������  ������ð�� ѡ��
 * 2.forǶ�׺ͱȽ� ��λ
 * 3.�ַ����Ƚ���compareTo����
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
				if(arr[i].compareTo(arr[j])>0){//�ַ����Ƚ���compareTo����������������
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
