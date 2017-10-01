package com.song.IO.File;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		//CreateDeleteDemo();
		//isDemo();
		//renameDemo();
		listRootsDemo();
	}

	public static void listRootsDemo() {
		File file=new File("d:\\");
		System.out.println("freeSpace:"+file.getFreeSpace());
		System.out.println("totalSpace:"+file.getTotalSpace());
		System.out.println("getUsableSpace:"+file.getUsableSpace());
		//��ô˵����ϵĸ�Ŀ¼
		File[] files=File.listRoots();
		for(File fil:files){
			System.out.println(fil);
		}
	}

	public static void renameDemo() {
		File file=new File("IO��.txt");
		File file1=new File("IO����.txt");
		System.out.println(file.renameTo(file1));
	}

	public static void isDemo() throws IOException {
		File file=new File("cb.txt");
		//file.createNewFile();//����һ��cb.txt�ļ�
		file.mkdir();//����һ��cb.txt���ļ���
		System.out.println(file.isFile());//�ж��Ƿ����ļ�
		System.out.println(file.isDirectory());//�ж��Ƿ���Ŀ¼
	}

	public static void CreateDeleteDemo() throws IOException {
		File dir =new File("abc");
		//boolean b=dir.mkdir();
		//System.out.println(b);
		boolean b=dir.delete();
		//�ļ��Ĵ�����ɾ��
		//File file=new File("file.txt");
		/*���������һ��������ļ������ڣ��򴴽�������ļ����ڣ��򲻴���
		 * */
		//Boolean b=file.createNewFile();
		//System.out.println(b);
		//boolean b=file.delete();
		//System.out.println(b);
	}

	public static void MethodDemo() {
		File file=new File("IO��.txt");
		
		String name=file.getName();
		
		String absPath=file.getAbsolutePath();
		
		String path=file.getPath();
		
		long len=file.length();
		
		long time=file.lastModified();//���һ���޸�ʱ��  ��λ����
		Date date=new Date(time);
		DateFormat df=DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
		String str_time=df.format(date);
		System.out.println("name:"+name);
		System.out.println("asPath:"+absPath);
		System.out.println("path:"+path);
		System.out.println("len:"+len);
		System.out.println("time:"+str_time);
	}

	public static void constructorDemo() {
		File f1=new File("c:\\a.txt");
		
		File f2=new File("c:\\","a.txt");
		
		File f=new File("c:\\");
		
		File f3=new File(f,"a.txt");
		
		File f4=new File("c:"+File.separator+"abc"+File.separator+"a.txt");
		System.out.println(f4);
	}
}
