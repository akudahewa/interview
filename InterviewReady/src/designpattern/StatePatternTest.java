package designpattern;

public class StatePatternTest {
	private String state;
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getState() {
		return this.state;
	}
	public void changeAction() {
		if(state.equalsIgnoreCase("ON")) {
			System.out.println("TV is on");
		}else if(state.equalsIgnoreCase("off")){
			System.out.println("TV is off");
			
		}
	}
	public static void main(String args[]) {
		StatePatternTest statePattern = new StatePatternTest();
		statePattern.setState("ON");
		statePattern.changeAction();
		statePattern.setState("OFF");
		statePattern.changeAction();
		
	}

}
