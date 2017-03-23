package state1;

public class Context {
	public final static State STATE1 = new ConcreteState1();
	public final static State STATE2 = new ConcreteState2();
	//µ±Ç°×´Ì¬
	private State currentState;
	public State getCurrentState() {
		return currentState;
	}
	public void setCurrentState(State currentState) {
		this.currentState = currentState;
		//ÇÐ»»×´Ì¬
		this.currentState.setContext(this);
	}
	
	public void handle1(){
		this.currentState.handle1();
	}
	
	public void handle2(){
		this.currentState.handle2();
	}
}
