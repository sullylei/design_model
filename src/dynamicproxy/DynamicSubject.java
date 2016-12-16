package dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicSubject implements InvocationHandler {
	//这是动态代理的好处，被封装的对象是Object类型，接受任意类型的对象
	private Object object = null;
	
	public DynamicSubject(){}
	
	public DynamicSubject(Object object){
		this.object = object;
	}
	@Override
	//这个方法不是我们显示的去调用 
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("before calling" + method);
		method.invoke(this.object, args);
		System.out.println("after calling" + method);
		return null;
	}

}
