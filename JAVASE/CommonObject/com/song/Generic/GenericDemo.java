package com.song.Generic;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo {
	public static void main(String[] args){
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("abc1");
		al.add("abc1");
		al.add("abc2");
		al.add("abc1");
		al.add("abc3");
		al.add("hahah");//�׳�java.lang.ClassCastException�쳣
			//�ڼ���������ӵķ���֮�� ��ִ���ڼ��׳����쳣  ����˱���ʱ�ڵ��쳣
		//�ɴ��Ƴ��˷��ͼ���
		Iterator<String> it=al.iterator();
		//�ڵ���������ӷ���   ����ǿ��ת��
		while(it.hasNext()){
			String s=it.next();
			System.out.println(s);
		}
	}
}
