package state1;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context context = new Context();
		context.setCurrentState(new ConcreteState1());
		context.handle1();
		context.handle2();
	}
}
