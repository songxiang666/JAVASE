package com.song.IO.charStream.Buffer;

import java.io.FileReader;
import java.io.IOException;

public class MyBufferExcr {
	private FileReader fr;
	private char[] buf=new char[1024];
	private int pos=0;//一个指针  用于指出当前取出的字符
	private int len=0;//记录每次从源取出的数据个数
	public  MyBufferExcr(FileReader fr){
		this.fr=fr;
	}
	public int Myread() throws IOException{
		int ch=-1;
		if(len==0){
			fr.read(buf);
			pos=0;
		}
		if(len==-1)
			return -1;
		ch=buf[pos++];
		len--;
		return ch;
	}
	public String MyReadLine() throws IOException{
		StringBuilder sb=new StringBuilder();
		int ch;
		while((ch=Myread())!=-1){
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
	public void close() throws IOException{
		if(fr!=null)
			fr.close();
	}
}
