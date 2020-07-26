import java.util.ArrayList;

public abstract class Component {

    private int positionX,positionY;
    private State selected;


    public Component(ArrayList<State> input , ArrayList<State> output , State selected , int positionX , int positionY){

        this.selected = selected;
        this.positionX = positionX;
        this.positionY = positionY;

    }

    public abstract void process();
    public abstract ArrayList<State> getInput();
    public abstract ArrayList<State> getOutput();
    public abstract void setInput(ArrayList<State> input);
    public abstract void setOutput(ArrayList<State> output);


    public void setSelected(State selected) {
        this.selected = selected;
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

    public State getSelected() {
        return selected;
    }
}
