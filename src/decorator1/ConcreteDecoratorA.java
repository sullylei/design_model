package decorator1;

public class ConcreteDecoratorA extends Decorator {

	public ConcreteDecoratorA(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	//�����Լ������η���
	private void method1(){
		System.out.println("method1 ����");
	}
	
	@Override
	public void operate(){
		//���ҵ�����
		this.method1();
		super.operate();
	}
}
