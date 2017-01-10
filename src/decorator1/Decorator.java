package decorator1;

public class Decorator extends Component {
	private Component component;
	
	public Decorator(Component component){
		this.component = component;
	}
	
	@Override
	public void report() {
		// TODO Auto-generated method stub
		System.out.println("decorator report");
		this.component.report();
	}

}
