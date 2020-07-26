import java.util.ArrayList;

public class Wire {

    private int positionX,positionY;
    private State state;


    public Wire ( State state , int positionX , int positionY){

        this.state = state;
        this.positionX = positionX;
        this.positionY = positionY;

    }

    public ArrayList<State> process(ArrayList<State> input){

        return input;

    }

    public void setState(State state) {
        this.state = state;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public State getState() {
        return state;
    }


}
