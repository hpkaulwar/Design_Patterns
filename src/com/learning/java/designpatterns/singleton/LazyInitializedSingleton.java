package com.learning.java.designpatterns.singleton;

public class LazyInitializedSingleton {
	
/*
 *  Lazy initialization method to implement the singleton pattern created the instance in the global
 *  access method. 
 */
	
	private static LazyInitializedSingleton instance;
	
	private LazyInitializedSingleton() {
		
	}
	
	public static LazyInitializedSingleton getInstance() {
		if(instance == null) {
			instance = new LazyInitializedSingleton();
		}
		return instance;
	}
}