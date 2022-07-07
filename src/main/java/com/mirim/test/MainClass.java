package com.mirim.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
	
		Pencil pencil = ctx.getBean("pencil", Pencil.class);	// pencil�� 4B���� �θ��� Pencil�� implements(���)�ϰ� �����Ƿ� ���� �� ����
		
		pencil.use();
		
		ctx.close(); 	// �ݾƾ����� bean ��ü���� �޸𸮿��� �����
	}

}
