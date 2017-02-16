package decorator;

public class Fish extends Change {
    
    public Fish(TheGreatestSage sage) {
        super(sage);
    }

    @Override
    public void move() {
    	super.move();
        // ДњТы
        System.out.println("Fish Move");
    }
}
