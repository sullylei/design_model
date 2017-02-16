package dynamicproxy1;

import java.lang.reflect.InvocationHandler;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject subject = new RealSubject();
		InvocationHandler handler = new MyInvocationHandler(subject);
		Subject proxySubject = SubjectDynamicProxy.newProxyInstance(subject.getClass().getClassLoader()
			, subject.getClass().getInterfaces(), handler);
		proxySubject.doSomething("Finish");
	}

}
