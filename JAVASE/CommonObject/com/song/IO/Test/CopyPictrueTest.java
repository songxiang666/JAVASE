package com.song.IO.Test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyPictrueTest {
	public static void main(String[] args) throws IOException {
		
		demo_2();
	}

	public static void demo_2() throws IOException {
		FileOutputStream fos=new FileOutputStream("E:\\c.jpg");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
 		FileInputStream fis=new FileInputStream("E:\\a.jpg");
		BufferedInputStream bis=new BufferedInputStream(fis);
		
		int ch=0;
		while((ch=bis.read())!=-1){
			fos.write(ch);
		}
		bis.close();
		bos.close();
	}

	public static void demo_1() throws IOException {
		FileOutputStream fos=new FileOutputStream("E:\\b.jpg");
		FileInputStream fis=new FileInputStream("E:\\a.jpg");
		
		byte[] buf=new byte[1024];
		int len=0;
		while((len=fis.read(buf))!=-1){
			fos.write(buf,0,len);
		}
		fos.close();
		fis.close();
	}
}
