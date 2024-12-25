/**
 * Конкретна команда для стирання.
 * Цей клас зберігає посилання на об'єкт Receiver і реалізує логіку стирання.
 */
class EraserCommand implements Command {
    private final Receiver receiver;

    /**
     * Конструктор ініціалізує команду з посиланням на Receiver.
     * @param receiver об'єкт, який буде виконувати команду
     */
    public EraserCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    /**
     * Викликає метод Receiver для стирання за заданими координатами.
     * @param x координата X
     * @param y координата Y
     */
    @Override
    public void execute(int x, int y) {
        receiver.erase(x, y);
    }
}

