package com.song.Collection;
//可变参数
public class ParamerDemo {
	public static void main(String[] args){
		int sum=add(1,2,3,4,5,6,7,7);
		System.out.println(sum);
	}
	/*
	 * 注意：可变参数类型，必须定义在参数列表的结尾
	 * 	例如:
	 * 		public void 函数名(int num,int... arr)
	 * */
	public static int add(int... arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		return sum;
	}
}
