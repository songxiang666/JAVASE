package com.song.IO.charStream.Buffer;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class MyBuffer extends Reader{
	//1.����һ���ļ���ȡ��
	Reader f=null;
	
	//2.����һ��������Ϊ������
	private char[] buf =new char[1024];
	
	//3.����һ��ָ�����ڲ�����������е�Ԫ�ء������������һ��Ԫ�غ�ָ��ص�������ʼ��
	private int pos=0;
	
	//4.����һ������������ÿ�ζ�ȡ����¼�����������ݵĸ�����  ������Ϊ0ʱ  ������Դ�ж�ȡ���ݵ�������
	private int len=0;
	
	public MyBuffer(Reader f){
		this.f=f;
	}
	
	public int myread() throws IOException{
		//1.��Դ�л�ȡһ������  ����������  ֻ�м�����Ϊ0sʱ ����Ҫ��Դ�л�ȡ����
		if(len==0){
			len=f.read(buf);//��Դ��ȡһ�������ݴ浽���� �����ص�ǰ��ȡ���ݵĸ���
			pos=0;//ÿ��ȡһ��  pos��Ϊ0 ��ζ�Ŵ�ͷ��ʼ���������ȡ����
		}
		if(len==-1)//��Դ�����ݶ�ȡ��Ϻ�   ֱ�ӷ���-1
			return -1;
		char ch=0;
		ch=buf[pos++];//�������ж�ȡһ������   ͬʱ��pos��1
		len--;//��len��1 
		return ch;//���ش�����
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
