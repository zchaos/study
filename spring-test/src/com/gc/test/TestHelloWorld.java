package com.gc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.gc.action.HelloWorld;

public class TestHelloWorld {
	public static void main(String[] args) {
		//		HelloWorld helloWorld = new HelloWorld();
		//		helloWorld.setMsg("HelloWorld");
		//		System.out.println(helloWorld.getMsg());

		ApplicationContext actx = new FileSystemXmlApplicationContext("classpath:config.xml");
		HelloWorld helloWorld = (HelloWorld) actx.getBean("HelloWorld");
		System.out.println(helloWorld.getMsg());
	}
}
