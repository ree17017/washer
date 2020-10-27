public class Washer {

    public static void main(String[] args){
         Washer washer = new Washer(true, true);

         washer.spin();

         Washer washer1 = new Washer();

         washer1.spin();
    }

    private boolean spinDirection;
    private boolean spinning;

    public Washer(boolean spinDirection, boolean spinning) {
        this.spinDirection = spinDirection;
        this.spinning = spinning;

    }
    public Washer() {
        spinDirection = false;
        spinning = false;

    }

    void displayRight(){
       System.out.println("#");
       System.out.println("##");
       System.out.println("####");
       System.out.println("##");
       System.out.println("#");
    }

    void displayLeft(){
        System.out.println("  #");
        System.out.println(" ##");
        System.out.println("###");
        System.out.println(" ##");
        System.out.println("  #");
    }

    void spin(){
        if(!isSpinning()) return;

        for(int i = 0; i < 10; i++) {
            if (isSpinDirection()) {
                displayRight();
                setSpinDirection(false);
            } else {
                displayLeft();
                setSpinDirection(true);
            }
        }
        done();
    }

    public void done(){
        System.out.println("Buzz");
    }

    public boolean isSpinDirection() {
        return spinDirection;
    }

    public void setSpinDirection(boolean spinDirection) {
        this.spinDirection = spinDirection;
    }

    public boolean isSpinning() {
        return spinning;
    }

    public void setSpinning(boolean spinning) {
        this.spinning = spinning;
    }
}
