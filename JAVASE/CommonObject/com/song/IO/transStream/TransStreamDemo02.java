package com.song.IO.transStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

//将字节流转换成字符流
//InputStreamReader  将字节转成字符 
public class TransStreamDemo02 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		String line=null;
		while((line=br.readLine())!=null){
			if("over".equals(line))
				break;
			bw.write(line.toUpperCase());
			bw.newLine();
			bw.flush();
		}
	}
}
