public class SwitchButton {

    private State state = State.INACTIVE;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

}
