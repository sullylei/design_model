package decorator;

public class Decorator implements Component {
	private Component component;
	
	public Decorator(Component component){
		component = this.component;
	}
	@Override
	public void sampleOperation() {
		// TODO Auto-generated method stub
		component.sampleOperation();
	}

}
