import java.util.ArrayList;

public class Buffer extends Component{


    private final int length = 1 , height = 1;
    public ArrayList<State> input , output;

    public Buffer(ArrayList<State> input, ArrayList<State> output, State selected, int positionX, int positionY) {
        super(input, output, selected, positionX, positionY);
    }

    public void process(){

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
