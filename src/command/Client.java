package command;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��������������Invoker
		Invoker invoker = new Invoker();
		//���������
		Receiver receiver = new ConcreteReceiver1();
		//����һ�����͸������ߵ�����
		Command command = new ConcreteCommand1(receiver);
		//�������������ִ��		
		invoker.setCommand(command);
		invoker.action();
	}
}
