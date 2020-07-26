import java.util.ArrayList;

public class AND extends Component {

    private final int length = 1 , height = 1;
    private ArrayList<State> input , output;
    private ArrayList<Integer> PinPositionX , PinPositionY;

    public AND(ArrayList<State> input, ArrayList<State> output, State selected, int positionX, int positionY) {
        super(input, output, selected, positionX, positionY);
    }

    public void process(){

        if(this.input.get(0) == State.ACTIVE && this.input.get(1) == State.ACTIVE)
            this.output.set(0,State.ACTIVE);
        else
            this.output.set(0,State.INACTIVE);

    }

    public int getPinPositionX(){

        return getPositionX() - 1;

    }


    public ArrayList<Integer> getPinPositionY(){


        getPositionX() - 1;

    }

    public ArrayList<State> getInput() {
        return input;
    }

    public ArrayList<State> getOutput() {
        return output;
    }

    public void setInput(ArrayList<State> input) {
        this.input = input;
    }

    public void setOutput(ArrayList<State> output) {
        this.output = output;
    }
}

