package com.macro.mall;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(() -> {
			System.out.println("当前线程"+Thread.currentThread().getName());
			int i = 1/0;
		}, "zzz");
		t.start();
		

	}

}
