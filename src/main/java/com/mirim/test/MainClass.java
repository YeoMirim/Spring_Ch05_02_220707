package com.mirim.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
	
		Pencil pencil = ctx.getBean("pencil", Pencil.class);	// pencil이 4B지만 부모인 Pencil을 implements(상속)하고 있으므로 받을 수 있음
		
		pencil.use();
		
		ctx.close(); 	// 닫아야지만 bean 객체들이 메모리에서 사라짐
	}

}
