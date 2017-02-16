package dynamicproxy1;

import java.lang.reflect.InvocationHandler;

public class SubjectDynamicProxy<T> extends DynamicProxy<T> {
	public static <T> T newProxyInstance(Subject subject){
		//获得ClassLoader
		ClassLoader loader = subject.getClass().getClassLoader();
		//获取接口数组
		Class[] classArr = subject.getClass().getInterfaces();
		
		InvocationHandler handler = new MyInvocationHandler(subject);
		return newProxyInstance(loader, classArr, handler);
	}
 }
