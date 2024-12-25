/**
 * Конкретна команда для малювання пензлем.
 * Цей клас зберігає посилання на об'єкт Receiver і реалізує логіку малювання пензлем.
 */
class BrushCommand implements Command {
    private final Receiver receiver;

    /**
     * Конструктор ініціалізує команду з посиланням на Receiver.
     * @param receiver об'єкт, який буде виконувати команду
     */
    public BrushCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    /**
     * Викликає метод Receiver для малювання пензлем за заданими координатами.
     * @param x координата X
     * @param y координата Y
     */
    @Override
    public void execute(int x, int y) {
        receiver.drawWithBrush(x, y);
    }
}