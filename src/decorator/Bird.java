package decorator;

public class Bird extends Change {
    
    public Bird(TheGreatestSage sage) {
        super(sage);
    }

    @Override
    public void move() {
        super.move();
    	// ����
        System.out.println("Bird Move");
    }
}