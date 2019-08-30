package com.demo.spring;

public class PlaintextWriter implements Writer{
	public void write(String message) {
		System.out.println("within plain Text" + message);
	}
}
