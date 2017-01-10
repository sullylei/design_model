package dynamicproxy;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * �ͻ��ˣ����ɴ���ʵ������������request()����
 * @author lei.s
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject rs=new RealSubject();//����ָ����������
		InvocationHandler ds=new DynamicSubject(rs);
		Class<?> cls=rs.getClass();
		
		//������һ�������ɴ���
		
		Subject subject=(Subject) Proxy.newProxyInstance(
				cls.getClassLoader(),cls.getInterfaces(), ds);
		
		//�������ͨ�����н��֤��subject��Proxy��һ��ʵ�������ʵ��ʵ����Subject�ӿ�
		System.out.println(subject instanceof Proxy);
		
		//������Կ���subject��Class����$Proxy0,���$Proxy0��̳���Proxy��ʵ����Subject�ӿ�
		System.out.println("subject��Class���ǣ�"+subject.getClass().toString());
		
		System.out.print("subject�е������У�");
		
		Field[] field=subject.getClass().getDeclaredFields();
		for(Field f:field){
			System.out.print(f.getName()+", ");
		}
		
		System.out.print("\n"+"subject�еķ����У�");
		
		Method[] method=subject.getClass().getDeclaredMethods();
		
		for(Method m:method){
			System.out.print(m.getName()+", ");
		}
		
		System.out.println("\n"+"subject�ĸ����ǣ�"+subject.getClass().getSuperclass());
		
		System.out.print("\n"+"subjectʵ�ֵĽӿ��ǣ�");
		
		Class<?>[] interfaces=subject.getClass().getInterfaces();
		
		for(Class<?> i:interfaces){
			System.out.print(i.getName()+", ");
		}

		System.out.println("\n\n"+"���н��Ϊ��");
		subject.request();
	}

}
