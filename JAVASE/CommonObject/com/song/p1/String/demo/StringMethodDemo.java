package com.song.p1.String.demo;

public class StringMethodDemo {
	public static void main(String[] args){
		/*按照面向对象的思想对字符串进行功能分类
		 * "abcd"
		 * 
		 * 1.获取：
		 * 	1.1获取字符串中字符的个数(长度); 
		 * 		int length();
		 * 	1.2根据位置获取字符
		 * 		char charAt (int index);
		 * 	1.3根据字符获取在字符串中的第一次出现的位置  ***
		 * 		int indexOf (int ch);
		 * 		int indexOf(int ch,int fromIndex):从指定位置查找ch第一次出现的位置
		 * 		int indexOf(String str);
		 * 		int indexOf(String str,int fromIndex);
		 * 
		 * 		int lastIndexOf (int ch);
		 * 		int lastIndexOf(int ch,int fromIndex):从指定位置查找ch第一次出现的位置
		 * 		int lastIndexOf(String str);
		 * 		int lastIndexOf(String str,int fromIndex);
		 * 	1.4获取字符串中一部分字符串 ，也叫子串
		 * 		String subString(int beginIndex,int endIndex);
		 * 		String subString(int beginIndex);
		 *
		 * 2.转换
		 * 	2.1将字符串变成字符串数组(字符串的切割)
		 * 		String[] split(String regex);传入正则表达式
		 * 	2.2将字符串转换成字符数组
		 * 		char[] toCharArray ();
		 * 	2.3将字符串转换成字节数组
		 * 		byte[] getBytes();
		 *	2.4将字符串中的字母转成大小写
		 *		String toUpperCase();大写
		 *		String toLowerCase();小写
		 *	2.5将字符串中的指定字符进行替换
		 *		String replace(char oldCh,char endCh);
		 *		String replace(String s1,String s2);
		 *|	2.6将字符串两端的空格去掉
		 *		trim()
		 *3.判断
		 *	3.1两个字符串内容是否相同
		 *		Boolean equals (Object obj);
		 *		Boolean equalsIngnoreCase(String s);忽略大小写进行内容比较
		 *	3.2字符串当中是否包含某一个字符串？
		 *		Boolean contains(String str);
		 *	3.3字符串是否以指定字符串开头，是否以指定字符串结尾
		 *		Boolean startsWidth(String str);
		 *		Boolean endsWidth(String str);
		 *4.比较
		 *	4.1比较两个字符串
		 *		int compareTo(String str);如果两字符相等  返回0 如果参数字符大于该字符串 返回  <0的数 否则返回 >0的数
		 */
		
		StringMethodDemo_4();
	}

	private static void StringMethodDemo_4() {
		System.out.println("a".compareTo("b"));//-1
		System.out.println("a".compareTo("A"));//32
		System.out.println("ab".compareTo("ac"));//32
	}

	public static void StringMethodDemo_3() {
		String s="abc";
//		System.out.println(s.equals("ABC".toLowerCase()));
//		System.out.println(s.equalsIgnoreCase("ABC"));
		
//		System.out.println(s.contains("bc"));
		s="ArrayDemo.java";
		System.out.println(s.startsWith("Arrasy"));
		System.out.println(s.endsWith("java"));
		System.out.println(s.contains("Demo"));
	}

	public static void StringMethodDemo_2() {
		String s="张三.李四.王五";
		String[] arr=s.split(",");
//		for(int i=0;i<arr.length;i++){
//			System.out.println(arr[i]);
//		}
//		char[] chs=s.toCharArray();
//		for(int i=0;i<chs.length;i++){
//			System.out.println(chs[i]);
//		}
		s="ab你";
		byte[] bytes=s.getBytes();
		for(int i=0;i<bytes.length;i++){
			System.out.println(bytes[i]);
		}
		
		String s1="java";
		String s2=s1.replace("ja","va");
		//replace方法  如果旧字符在原字符串中不存在  直接返回 this 在这里也就是s1
		System.out.println(s2);//true  
		
		s1=" -  abc  - ";
		System.out.println(s1.trim());
	}

	public static void StringMethodDemo_1() {
		String s="abcdae";
		
		System.out.println("length:"+s.length());//6
		System.out.println("char:"+s.charAt(2));//c
		System.out.println("index:"+s.indexOf('a'));//0
		System.out.println("lastIndex:"+s.lastIndexOf('a'));//4
		
		System.out.println("subString:2-4 "+s.substring(2,4));//cd
	}
}
