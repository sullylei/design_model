package chainofresponsibility.abstractexample;

public class ConcreteHandler extends Handler {

	@Override
	public void handleRequest() {
		// TODO Auto-generated method stub
		if(getSuccessor()!=null){
			System.out.println("放过请求，交给子类处理");
			getSuccessor().handleRequest();
		}else{
			System.out.println("处理请求");
		}
	}

}
