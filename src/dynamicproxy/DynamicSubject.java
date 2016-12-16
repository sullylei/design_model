package dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicSubject implements InvocationHandler {
	//���Ƕ�̬����ĺô�������װ�Ķ�����Object���ͣ������������͵Ķ���
	private Object object = null;
	
	public DynamicSubject(){}
	
	public DynamicSubject(Object object){
		this.object = object;
	}
	@Override
	//�����������������ʾ��ȥ���� 
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("before calling" + method);
		method.invoke(this.object, args);
		System.out.println("after calling" + method);
		return null;
	}

}
