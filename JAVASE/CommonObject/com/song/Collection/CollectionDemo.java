package com.song.Collection;
import java.util.ArrayList;
import java.util.Collection;


public class CollectionDemo {
	public static void main(String[] args){
		Collection coll=new ArrayList();
		show(coll);//[abc, efg, hij]
	}
	public static void show(Collection coll){//ctrl+shift+o �Զ������
		//���
		coll.add("abc");
		coll.add("efg");
		coll.add("hij");
		System.out.println(coll);
		//ɾ��
		coll.remove("efg"); //��ı伯�ϳ���
		System.out.println(coll);//[abc, hij]
		//��ռ���
		//coll.clear();
		
		System.out.println(coll.contains("efg"));//[]
	}
}
