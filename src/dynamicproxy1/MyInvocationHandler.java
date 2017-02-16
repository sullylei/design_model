package dynamicproxy1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
	//������Ķ���
	private Subject target = null;
	//ͨ�����캯������һ������
	public MyInvocationHandler(Subject _subject){
		this.target = _subject;
	}
	//������
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		//ִ�б�����ķ���
		return method.invoke(this.target, args);
	}

}
