package chainofresponsibility.abstractexample;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteHandler handler1 = new ConcreteHandler();
		ConcreteHandler handler2 = new ConcreteHandler();
		handler1.setSuccessor(handler2);
		handler1.handleRequest();
	}

}
