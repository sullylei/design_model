package decorator1;

public class ConcreteDecoratorA extends Decorator {

	public ConcreteDecoratorA(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void report(){
		//添加业务代码
		super.report();
	}
}
