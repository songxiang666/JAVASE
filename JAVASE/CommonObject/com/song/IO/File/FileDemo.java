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
		//获得此电脑上的根目录
		File[] files=File.listRoots();
		for(File fil:files){
			System.out.println(fil);
		}
	}

	public static void renameDemo() {
		File file=new File("IO流.txt");
		File file1=new File("IO流流.txt");
		System.out.println(file.renameTo(file1));
	}

	public static void isDemo() throws IOException {
		File file=new File("cb.txt");
		//file.createNewFile();//创建一个cb.txt文件
		file.mkdir();//创建一个cb.txt的文件夹
		System.out.println(file.isFile());//判断是否是文件
		System.out.println(file.isDirectory());//判断是否是目录
	}

	public static void CreateDeleteDemo() throws IOException {
		File dir =new File("abc");
		//boolean b=dir.mkdir();
		//System.out.println(b);
		boolean b=dir.delete();
		//文件的创建与删除
		//File file=new File("file.txt");
		/*和输出流不一样，如果文件不存在，则创建，如果文件存在，则不创建
		 * */
		//Boolean b=file.createNewFile();
		//System.out.println(b);
		//boolean b=file.delete();
		//System.out.println(b);
	}

	public static void MethodDemo() {
		File file=new File("IO流.txt");
		
		String name=file.getName();
		
		String absPath=file.getAbsolutePath();
		
		String path=file.getPath();
		
		long len=file.length();
		
		long time=file.lastModified();//最后一次修改时间  单位毫秒
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
