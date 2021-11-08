package com.company.aspect;

public aspect World {
	pointcut greeting(): execution(* com.company.Main.sayHello());

	after() returning(): greeting() {
		System.out.println("world.");
	}

}