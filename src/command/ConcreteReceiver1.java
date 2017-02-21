package command;
/**
 * 具体Receive类
 * @author lei.s
 *
 */
public class ConcreteReceiver1 extends Receiver {
	//每个接收者都必须处理一定的业务逻辑
	@Override
	public void dosomething() {
		// TODO Auto-generated method stub
		System.out.println("ConcreteReceiver1 的 dosomething方法");
	}

}
