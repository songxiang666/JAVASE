package com.song.bean;
//�Զ��巺����
public class Tool <Q>{
	private Q q;

	public Q getQ() {
		return q;
	}

	public void setQ(Q q) {
		this.q = q;
	}
	/**
	 * �����Ͱ󶨵�������
	 * */
	public <W> void show(W str){
		System.out.println(str);
	}
	public  void print(Q str){
		System.out.println(str);
	}
	
	/**
	 * ��������̬ʱ  ���ܷ������϶���ķ��͡������̬����ʹ�÷��ͣ�ֻ�ܽ����Ͷ����ڷ�����
	 * ���� ���� ����ֵǰ��
	 * @param obj
	 * */
	public static <Y> void method(Y obj){
		System.out.println("method:"+obj);
	}
}
