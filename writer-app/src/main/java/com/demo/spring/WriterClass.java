package com.demo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WriterClass {
	
	@Autowired
	private Writer writer;
//	public String getMessage() {
//		return message;
//	}
//	public void setMessage(String message) {
//		this.message = message;
//	}
	public void print(String message) {
		writer.write(message);
	}
//	public Writer getWrite() {
//		return write;
//	}
//	public void setWriter(Writer writer) {
//		this.writer = writer;
//	}
}
