package com.song.p1.String.demo;

public class StringMethodDemo {
	public static void main(String[] args){
		/*������������˼����ַ������й��ܷ���
		 * "abcd"
		 * 
		 * 1.��ȡ��
		 * 	1.1��ȡ�ַ������ַ��ĸ���(����); 
		 * 		int length();
		 * 	1.2����λ�û�ȡ�ַ�
		 * 		char charAt (int index);
		 * 	1.3�����ַ���ȡ���ַ����еĵ�һ�γ��ֵ�λ��  ***
		 * 		int indexOf (int ch);
		 * 		int indexOf(int ch,int fromIndex):��ָ��λ�ò���ch��һ�γ��ֵ�λ��
		 * 		int indexOf(String str);
		 * 		int indexOf(String str,int fromIndex);
		 * 
		 * 		int lastIndexOf (int ch);
		 * 		int lastIndexOf(int ch,int fromIndex):��ָ��λ�ò���ch��һ�γ��ֵ�λ��
		 * 		int lastIndexOf(String str);
		 * 		int lastIndexOf(String str,int fromIndex);
		 * 	1.4��ȡ�ַ�����һ�����ַ��� ��Ҳ���Ӵ�
		 * 		String subString(int beginIndex,int endIndex);
		 * 		String subString(int beginIndex);
		 *
		 * 2.ת��
		 * 	2.1���ַ�������ַ�������(�ַ������и�)
		 * 		String[] split(String regex);����������ʽ
		 * 	2.2���ַ���ת�����ַ�����
		 * 		char[] toCharArray ();
		 * 	2.3���ַ���ת�����ֽ�����
		 * 		byte[] getBytes();
		 *	2.4���ַ����е���ĸת�ɴ�Сд
		 *		String toUpperCase();��д
		 *		String toLowerCase();Сд
		 *	2.5���ַ����е�ָ���ַ������滻
		 *		String replace(char oldCh,char endCh);
		 *		String replace(String s1,String s2);
		 *|	2.6���ַ������˵Ŀո�ȥ��
		 *		trim()
		 *3.�ж�
		 *	3.1�����ַ��������Ƿ���ͬ
		 *		Boolean equals (Object obj);
		 *		Boolean equalsIngnoreCase(String s);���Դ�Сд�������ݱȽ�
		 *	3.2�ַ��������Ƿ����ĳһ���ַ�����
		 *		Boolean contains(String str);
		 *	3.3�ַ����Ƿ���ָ���ַ�����ͷ���Ƿ���ָ���ַ�����β
		 *		Boolean startsWidth(String str);
		 *		Boolean endsWidth(String str);
		 *4.�Ƚ�
		 *	4.1�Ƚ������ַ���
		 *		int compareTo(String str);������ַ����  ����0 ��������ַ����ڸ��ַ��� ����  <0���� ���򷵻� >0����
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
		String s="����.����.����";
		String[] arr=s.split(",");
//		for(int i=0;i<arr.length;i++){
//			System.out.println(arr[i]);
//		}
//		char[] chs=s.toCharArray();
//		for(int i=0;i<chs.length;i++){
//			System.out.println(chs[i]);
//		}
		s="ab��";
		byte[] bytes=s.getBytes();
		for(int i=0;i<bytes.length;i++){
			System.out.println(bytes[i]);
		}
		
		String s1="java";
		String s2=s1.replace("ja","va");
		//replace����  ������ַ���ԭ�ַ����в�����  ֱ�ӷ��� this ������Ҳ����s1
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
