package com.song.IO.transStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class TransStreamTest {
	public static void main(String[] args) throws Exception {
		demo_3();
	}
	/**
	 * 需求：将一个文件复制到另一个文件中
	 * @throws Exception 
	 * 
	 * */
	public static void demo_3() throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("demo3.txt")));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("demo4.txt")));
		String line=null;
		while((line=br.readLine())!=null){
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
	}
	/**
	 * 需求：将一个文本文件内容显示到控制台上来
	 * @throws FileNotFoundException 
	 * */
	public static void demo_2() throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("demo3.txt")));
		
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String line=null;
		while((line=br.readLine())!=null){
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
	}

	/**
	 * //需求：将键盘录入的数据写到一个文件中
	 * @throws FileNotFoundException
	 * @throws IOException
	 * 
	 */
	public static void demo_1() throws FileNotFoundException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("demo3.txt")));
		String line=null;
		while((line=br.readLine())!=null){
			if(line.equals("over"))
				break;
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
	}
}
