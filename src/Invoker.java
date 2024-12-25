/**
 * Клас Invoker
 * Відповідає за вибір команди (інструменту) та виклик її виконання при взаємодії з користувачем.
 */
class Invoker {
    private Command currentCommand;

    /**
     * Встановлює активну команду.
     * @param command нова активна команда
     */
    public void setCommand(Command command) {
        this.currentCommand = command;
    }

    /**
     * Викликає активну команду при натисканні миші за заданими координатами.
     * @param x координата X
     * @param y координата Y
     */
    public void onMouseClick(int x, int y) {
        if (currentCommand != null) {
            currentCommand.execute(x, y);
        } else {
            System.out.println("Інструмент не обрано");
        }
    }
}
