import java.util.ArrayList;
import java.util.HashMap;

public class Game implements GameController {

    private DataBase dataBase = new DataBase();
    private Component selectedComponent;
    HashMap<Integer,Component> components = new HashMap<Integer, Component>();
    HashMap<Integer,Wire> wires = new HashMap<Integer, Wire>();
    HashMap<Integer,SwitchButton> switchButtons = new HashMap<Integer, SwitchButton>();
    private static int key = 0;
    private BCD7Segments BCD7Segments;

    public Game(int numberOfSwitchButtons) {

        for (int i = 1 ; i < numberOfSwitchButtons ; i++) {

            switchButtons.put(getNewKey(), new SwitchButton());

        }

        BCD7Segments = new BCD7Segments();

    }

    public void selectComponent(Component selectedComponent) {

        selectedComponent.setSelected(State.ACTIVE);
        this.selectedComponent = selectedComponent;

    }

    public void placeComponent(int positionX , int positionY) {

        selectedComponent.setPositionX(positionX);
        selectedComponent.setPositionY(positionY);
        selectedComponent.setSelected(State.INACTIVE);
        resetInputComponent(selectedComponent);
        components.put(getNewKey(),selectedComponent);

    }

    public void drawWire(int positionX , int positionY) {

        wires.put(getNewKey(),new Wire(State.BROKEN,positionX,positionY));

    }

    public void deleteComponents(int componentKey) {

        if(components.containsKey(componentKey)) {

            components.remove(componentKey);

        }

        if(wires.containsKey(componentKey)) {

            wires.remove(componentKey);

        }

    }

    public void clickSwitchButton(int switchButtonKey) {

        if(switchButtons.containsKey(switchButtonKey)){

            if(switchButtons.get(switchButtonKey).getState() == State.ACTIVE)
                switchButtons.get(switchButtonKey).setState(State.INACTIVE);
            else
                switchButtons.get(switchButtonKey).setState(State.ACTIVE);

        }

    }

    public ArrayList<Boolean> getCompletedLevels() {

        return dataBase.getCompletedLevels();

    }

    public ArrayList<State> getOutput(BCD7Segments display) {

        return BCD7Segments.getInput();

    }

    public void resetComponentsState() {

        for (Integer key : components.keySet()) {

            resetInputComponent(components.get(key));
            components.get(key).process();

        }

    }

    private static int getNewKey(){
        return ++key;
    }

    private void resetInputComponent(Component selectedComponent) {

        for (Integer key : components.keySet()) {

           if(components.get(key).getPositionX() == selectedComponent.getPinPositionX(0) &&
                    selectedComponent.getPositionY() == components.get(key).getPinPositionY(0)){



           }

        }

    }
}
