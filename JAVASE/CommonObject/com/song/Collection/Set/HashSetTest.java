package com.song.Collection.Set;

import java.util.HashSet;
import java.util.Iterator;

import com.song.bean.Person;

/*
 * ��hashset�����д洢Person���� ���������������ͬ ��Ϊ��ͬ����
 * 
 * */
public class HashSetTest {
	public static void main(String[] args){
		HashSet hs=new HashSet();
		
		//hashSet�������ݽṹ�ǹ�ϣ�� �洢Ԫ�ص�ʱ��ʹ��Ԫ�ص�hashCode������ȷ��λ��
		//���λ����ͬ ��ͨ��Ԫ�ص�equals������ȷ���Ƿ���ͬ
//		hs.add(new Person("lili2",19));
		hs.add(new Person("lili5",13));
		hs.add(new Person("lili5",13));
		hs.add(new Person("lili8",15));
//		hs.add(new Person("lili8",15));
		
		Iterator it=hs.iterator();
		while(it.hasNext()){
			Person p=(Person)it.next();
			System.out.println(p.getName()+" -"+p.getNum());
		}
	}
}
