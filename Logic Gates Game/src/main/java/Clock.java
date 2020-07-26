public class Clock extends SwitchButton implements Runnable {

    private int frequency;
    private boolean power;

    public Clock(int frequency) {
        this.power = true;
        this.frequency = frequency;
    }

    public int getFrequency() {
        return frequency;
    }

    public void run() {
        while(power) {
            if (this.getState() == State.ACTIVE){

                System.out.println(getState());
                this.setState(State.INACTIVE);

            }
            else {

                System.out.println(getState());
                this.setState(State.ACTIVE);

            }

            try {
                Thread.sleep(this.getFrequency());
            } catch (InterruptedException e) {
                System.out.println("Problems with Clock class. thread Clock interrupted");
            }

        }

    }

    public boolean getPower() {
        return this.power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

}
