/**
 * Конкретна команда для малювання олівцем.
 * Цей клас зберігає посилання на об'єкт Receiver і реалізує логіку малювання олівцем.
 */
class PencilCommand implements Command {
    private final Receiver receiver;

    /**
     * Конструктор ініціалізує команду з посиланням на Receiver.
     * @param receiver об'єкт, який буде виконувати команду
     */
    public PencilCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    /**
     * Викликає метод Receiver для малювання олівцем за заданими координатами.
     * @param x координата X
     * @param y координата Y
     */
    @Override
    public void execute(int x, int y) {
        receiver.drawWithPencil(x, y);
    }
}