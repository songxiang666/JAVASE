package com.song.Collection.List;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class ListVector {
	public static void main(String[] args){
		Vector v=new Vector();
		
		v.addElement("abc1");
		v.addElement("abc2");
		v.addElement("abc3");
		v.addElement("abc4");
		
		Enumeration e=v.elements();
		while(e.hasMoreElements()){
			System.out.println("nextElement:"+e.nextElement());
		}
		
		Iterator it=v.iterator();
		while(it.hasNext()){
			System.out.println("next:"+it.next());
		}
	}
}
