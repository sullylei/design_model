package decorator1;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Component component = new ConcreteComponent();
		//第一次修饰
		component = new ConcreteDecoratorA(component);
		//第二次修饰
		component = new ConcreteDecoratorB(component);
		//修饰后运行
		component.operate();
	}

}
