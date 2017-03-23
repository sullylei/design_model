package state1;

public class ConcreteState1 extends State {

	@Override
	public void handle1() {
		// TODO Auto-generated method stub
		//本状态下必须处理的逻辑
//		System.out.println("ConcreteState1的handle1");
	}

	@Override
	public void handle2() {
		// TODO Auto-generated method stub
		super.context.setCurrentState(Context.STATE2);
		super.context.handle2();
	}

}
