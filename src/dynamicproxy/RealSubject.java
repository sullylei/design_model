package dynamicproxy;
/**
 * ��ʵ��ɫ��ʵ����Subject��request()����
 * @author lei.s
 *
 */
public class RealSubject implements Subject {

	@Override
	public void request() {
		// TODO Auto-generated method stub
		System.out.println("From real Subject");
	}

}
