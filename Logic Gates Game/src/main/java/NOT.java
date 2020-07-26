import java.util.ArrayList;

public class NOT extends Component{

    private final int length = 1 , height = 1;
    public ArrayList<State> input , output;

    public NOT(ArrayList<State> input, ArrayList<State> output, State selected, int positionX, int positionY) {
        super(input, output, selected, positionX, positionY);
    }

    public void process(){

        if(input.get(0) == State.INACTIVE)
            output.set(0,State.ACTIVE);
        else
            output.set(0,State.INACTIVE);

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
