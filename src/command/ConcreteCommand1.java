package command;

public class ConcreteCommand1 extends Command {
	private Receiver receiver;
	
	public ConcreteCommand1(Receiver _receiver){
		this.receiver = _receiver;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.receiver.dosomething();
	}

}
