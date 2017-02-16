package dynamicproxy1;

import java.lang.reflect.InvocationHandler;

public class SubjectDynamicProxy<T> extends DynamicProxy<T> {
	public static <T> T newProxyInstance(Subject subject){
		//���ClassLoader
		ClassLoader loader = subject.getClass().getClassLoader();
		//��ȡ�ӿ�����
		Class[] classArr = subject.getClass().getInterfaces();
		
		InvocationHandler handler = new MyInvocationHandler(subject);
		return newProxyInstance(loader, classArr, handler);
	}
 }
