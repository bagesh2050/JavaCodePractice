package com.demo.designpattern.singleton;

public enum MySingleton {
	INSTANCE2;
	private int value;
	Test test1;

	private MySingleton() {

	}

	public void setValue(int value) {
		this.value = value;
		test1 = new Test();
		test1.x = value;
	}

	public int getValue() {
		return value;
	}

	public int getObjectValue() {
		return test1.x;
	}
	
	public Test getObject() {
		return test1;
	}
}
