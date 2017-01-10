package decorator1;

public abstract class Decorator extends Component {
	private Component component = null;
	
	public Decorator(Component _component){
		this.component = _component;
	}
	//ί�и���װ����ִ��
	@Override
	public void operate() {
		// TODO Auto-generated method stub
		this.component.operate();
	}

}
