package com.song.bean;
//自定义泛型类
public class Tool <Q>{
	private Q q;

	public Q getQ() {
		return q;
	}

	public void setQ(Q q) {
		this.q = q;
	}
	/**
	 * 将泛型绑定到函数上
	 * */
	public <W> void show(W str){
		System.out.println(str);
	}
	public  void print(Q str){
		System.out.println(str);
	}
	
	/**
	 * 当方法静态时  不能访问类上定义的泛型。如果静态方法使用泛型，只能将泛型定义在方法上
	 * 泛型 放在 返回值前面
	 * @param obj
	 * */
	public static <Y> void method(Y obj){
		System.out.println("method:"+obj);
	}
}
