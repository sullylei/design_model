package decorator1;

public class ConcreteDecoratorB extends Decorator {

	public ConcreteDecoratorB(Component _component) {
		super(_component);
		// TODO Auto-generated constructor stub
	}
	//定义自己的修饰方法
	private void method2(){
		System.out.println("method2修饰");
	}
	public void operate(){
		super.operate();
		//加上自己的业务逻辑
		this.method2();
	}
}

