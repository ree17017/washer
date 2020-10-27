public class Washer {

    public static void main(String[] args){
         Washer washer = new Washer(true, true);
         washer.spin();


        System.out.println(washer.spinDirection);
    }

    private boolean spinDirection;
    private boolean spinning;

    public Washer(boolean spinDirection, boolean spinning) {
        this.spinDirection = spinDirection;
        this.spinning = spinning;
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
                spinDirection = false;
            } else {
                displayLeft();
                setSpinDirection(true);
                spinDirection = true;
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

    private boolean isSpinning() {
        return spinning;
    }

    private void setSpinning(boolean spinning) {
        this.spinning = spinning;
    }
}
