import java.util.ArrayList;

public interface GameController {

    void selectComponent(Component selectedComponent);

    void placeComponent(int positionX , int positionY);

    void drawWire(int positionX , int positionY);

    void deleteComponents(int componentKey);

    void clickSwitchButton(int switchButtonKey);

    ArrayList<Boolean> getCompletedLevels();

    ArrayList<State>getOutput(BCD7Segments display);

    void resetComponentsState();

}
