package decorator1;

public class ConcreteDecoratorA extends Decorator {

	public ConcreteDecoratorA(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	//定义自己的修饰方法
	private void method1(){
		System.out.println("method1 修饰");
	}
	
	@Override
	public void operate(){
		//添加业务代码
		this.method1();
		super.operate();
	}
}
