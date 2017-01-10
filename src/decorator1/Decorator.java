package decorator1;

public abstract class Decorator extends Component {
	private Component component = null;
	
	public Decorator(Component _component){
		this.component = _component;
	}
	//委托给被装饰者执行
	@Override
	public void operate() {
		// TODO Auto-generated method stub
		this.component.operate();
	}

}
