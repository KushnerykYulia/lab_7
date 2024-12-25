/**
 * Головний клас програми (Client).
 * Ініціалізує команди, інструменти та симулює взаємодію з робочим простором.
 */
public class Main {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();

        Command pencilCommand = new PencilCommand(receiver);
        Command brushCommand = new BrushCommand(receiver);
        Command eraserCommand = new EraserCommand(receiver);

        Invoker invoker = new Invoker();

        invoker.setCommand(pencilCommand);
        invoker.onMouseClick(10, 20);

        invoker.setCommand(brushCommand);
        invoker.onMouseClick(30, 40);

        invoker.setCommand(eraserCommand);
        invoker.onMouseClick(50, 60);

        invoker.setCommand(null);
        invoker.onMouseClick(70, 80);
    }
}
