package com.song.Collection;
//�ɱ����
public class ParamerDemo {
	public static void main(String[] args){
		int sum=add(1,2,3,4,5,6,7,7);
		System.out.println(sum);
	}
	/*
	 * ע�⣺�ɱ�������ͣ����붨���ڲ����б�Ľ�β
	 * 	����:
	 * 		public void ������(int num,int... arr)
	 * */
	public static int add(int... arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		return sum;
	}
}
