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
		
		oos.writeObject(new Person("小强",30));
		//注意这里的Person类要实现序列标记接口 Serializable;  这样才能使用对象序列化
		
		oos.close();
	}
}
