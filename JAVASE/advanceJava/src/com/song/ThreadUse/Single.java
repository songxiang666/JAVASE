package com.song.ThreadUse;
//���߳��µĵ���ģʽ

//����ʽ
public class Single {
	private static final Single s=new Single();
	private Single(){};
	
	public static Single getInstance(){
		return s;
	}
}


//����ʽ
//����ʽ�����̰߳�ȫ����
class  Single1{
	private static Single1 f=null;
	private Single1(){}
	public static Single1 getInstance(){
	
		//�ǳ���Ҫ  ������
		if(f==null){//������� Ч��
			synchronized(Single1.class){
				if(f==null)
					//-->0  -->1
					f=new Single1();
			}
		}
		return f;
		
	}
}