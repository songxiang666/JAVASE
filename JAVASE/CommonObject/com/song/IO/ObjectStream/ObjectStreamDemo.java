package com.song.IO.ObjectStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.song.bean.Person;

public class ObjectStreamDemo {
	public static void main(String[] args) throws IOException {
		writeObj();
	}

	public static void writeObj() throws IOException, IOException {
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("obj.object"));
		
		oos.writeObject(new Person("Сǿ",30));
		//ע�������Person��Ҫʵ�����б�ǽӿ� Serializable;  ��������ʹ�ö������л�
		
		oos.close();
	}
}
