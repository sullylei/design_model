package state1;

public class ConcreteState2 extends State {

	@Override
	public void handle1() {
		// TODO Auto-generated method stub
		//���õ�ǰ״̬Ϊstate1
		super.context.setCurrentState(Context.STATE1);;
		//���ɵ�state1״̬����Contextʵ��
		super.context.handle1();
	}

	@Override
	public void handle2() {
		// ��״̬���봦����߼�
//		System.out.println("ConcreteState2��handle2");
	}

}
