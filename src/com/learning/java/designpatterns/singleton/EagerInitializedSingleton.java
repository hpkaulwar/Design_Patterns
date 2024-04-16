package com.learning.java.designpatterns.singleton;

public class EagerInitializedSingleton{

/*
 * In Eager Initialization the instance of the singleton class is created at the time of 
 * class loading 
 * The drawback to eager initialization is that the method is created even though the client
 * application might not be using it.
 * Here is the implementation of the static initialization singleton class
 * 
 */
	private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
	
//	private constructor to avoid client applications using the constructor
	
	private EagerInitializedSingleton() {};
	
	public static EagerInitializedSingleton getInstance() {
		return instance;
	}
	
/*
 *  If your singleton class is not using lot of resources, this is the approach to use.
 *  But in most of the scenarios, singleton classes are created for resources such
 *  as File System, Database connections, etc.
 */

}

