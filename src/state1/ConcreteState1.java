package state1;

public class ConcreteState1 extends State {

	@Override
	public void handle1() {
		// TODO Auto-generated method stub
		//��״̬�±��봦����߼�
//		System.out.println("ConcreteState1��handle1");
	}

	@Override
	public void handle2() {
		// TODO Auto-generated method stub
		super.context.setCurrentState(Context.STATE2);
		super.context.handle2();
	}

}
