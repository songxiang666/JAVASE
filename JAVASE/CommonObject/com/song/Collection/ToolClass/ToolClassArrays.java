package com.song.Collection.ToolClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToolClassArrays {
	public static void main(String[] args){
		/*
		 * Arrays�еķ������Ǿ�̬��
		 * */
		//int[] arr={12,3,76,43,5};
		//System.out.println(Arrays.toString(arr));

		/*
		 * �ص㣺List asList(����)������ת�ɼ���
		 * �ô�������ʹ�ü��ϵķ������������е�Ԫ��
		 * ע�⣺����ĳ���ʱ�̶��ģ����Զ��ڼ��ϵ���ɾ�ǲ����Եģ�����ᷢ���쳣UnsupportedOperationException
		 * 
		 * */
		//List<String> list=Arrays.asList("s","f","id","nckd");
//		boolean b=list.contains("f");
//		System.out.println(b);
//		list.add("hiahia");
		//System.out.println(list);//UnsupportedOperationException

		//ע��:
		/*��������е�Ԫ���Ƕ�����ôת�ɼ���ʱ��ֱ�ӽ������е�Ԫ����Ϊ�����е�Ԫ�ؽ��м��ϴ洢
		 * ��������е�Ԫ���ǻ����������ͣ���ô�Ὣ��������Ϊ�����е�Ԫ�ؽ��м��ϴ洢
		 * (Ҳ����˵��������Ϊһ��������뼯���У����������о�ֻ��һ��Ԫ�أ���ӡ������Ҳ�������ñ����д洢�ĵ�ֵַ)
		  ע������ķ���*/
		//List<int[]> list1=Arrays.asList(arr);
		//System.out.println(list1);
		
		
		/*�ص㣺List.toArrays()  ������ת��������
		 * 	��Ҫ����һ��ָ�����͵�����
		 * ���ȸ���ζ����أ��������С�ڼ��ϵ�size����ô�÷����ᴴ��һ��ͬ���Ͳ��ͼ�����ͬsize������
		 * 			������ȴ��ڼ��ϵ�size����ô�÷����ͻ�ʹ��ָ�������飬�洢�����е�Ԫ�أ�����λ��Ĭ��Ϊnull;
		 * ���Խ��鳤��Ϊ ���ϵ�size
		 * 
		 * */
		List<String> list=new ArrayList<String>();
		list.add("nj");
		list.add("liu");
		list.add("iu");
		list.add("ss");
		list.add("dd");
		
		String[] arr=list.toArray(new String[list.size()]);
		System.out.println(Arrays.toString(arr));
	}
	//toString �ľ���ʵ��
	public static String myToString(int[] a){
		int iMax = a.length - 1;
		
		if (iMax == -1)   return "[]";
		
		StringBuilder b = new StringBuilder();
		
	    b.append('[');
	    
	    for (int i = 0; ; i++) {
	    	
	        b.append(a[i]);
	        
	        if (i == iMax)  return b.append(']').toString();
	        
	        b.append(", ");
	     }
	 }
}
