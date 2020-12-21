package com.macro.mall;

import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test2 {

	public static void main(String[] args) {
		ThreadPoolExecutor pool = new ThreadPoolExecutor(1, 1, 60000, TimeUnit.SECONDS, 
				new LinkedBlockingDeque<Runnable>(2), Executors.defaultThreadFactory(), 
				new ThreadPoolExecutor.AbortPolicy());
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("当前线程"+Thread.currentThread().getName());
				int i = 1/0;
				System.out.println("当前线程222"+Thread.currentThread().getName());
			}
		};
		pool.execute(runnable);
	}

}
