package decorator1;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Component component = new ConcreteComponent();
		//��һ������
		component = new ConcreteDecoratorA(component);
		//�ڶ�������
		component = new ConcreteDecoratorB(component);
		//���κ�����
		component.operate();
	}

}
