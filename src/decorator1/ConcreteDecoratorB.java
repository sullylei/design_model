package decorator1;

public class ConcreteDecoratorB extends Decorator {

	public ConcreteDecoratorB(Component _component) {
		super(_component);
		// TODO Auto-generated constructor stub
	}
	//�����Լ������η���
	private void method2(){
		System.out.println("method2����");
	}
	public void operate(){
		super.operate();
		//�����Լ���ҵ���߼�
		this.method2();
	}
}

