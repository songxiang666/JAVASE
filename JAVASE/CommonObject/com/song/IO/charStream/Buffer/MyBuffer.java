package com.song.IO.charStream.Buffer;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class MyBuffer extends Reader{
	//1.定义一个文件读取流
	Reader f=null;
	
	//2.定义一个数组作为缓冲区
	private char[] buf =new char[1024];
	
	//3.定义一个指针用于操作这个数组中的元素。当操作到最后一个元素后，指针回到数组起始处
	private int pos=0;
	
	//4.定义一个计数器用于每次读取到记录缓冲区的数据的个数。  当该数为0时  继续从源中读取数据到缓冲区
	private int len=0;
	
	public MyBuffer(Reader f){
		this.f=f;
	}
	
	public int myread() throws IOException{
		//1.从源中获取一批数据  到缓冲区中  只有计数器为0s时 才需要从源中获取数据
		if(len==0){
			len=f.read(buf);//向源读取一段数据暂存到数组 并返回当前所取数据的个数
			pos=0;//每读取一次  pos置为0 意味着从头开始对数组进行取数据
		}
		if(len==-1)//当源中数据读取完毕后   直接返回-1
			return -1;
		char ch=0;
		ch=buf[pos++];//从数组中读取一个数据   同时将pos加1
		len--;//将len减1 
		return ch;//返回此数据
	}
	public String myReadline() throws IOException{
		StringBuilder sb=new StringBuilder();
		int ch=0;
		while((ch=myread())!=-1){
			if(ch=='\r')
				continue;
			if(ch=='\n')
				return sb.toString();
			sb.append((char)ch);
		}
		if(sb.length()!=0)
			return sb.toString();
		return null;
	}
	public void myClose() throws IOException{
		if(f!=null)
			f.close();
	}

	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int read(char[] cbuf, int off, int len) throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}
}
