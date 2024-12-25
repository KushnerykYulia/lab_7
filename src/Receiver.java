/**
 * Клас Receiver
 * Реалізує функціонал робочого простору, де відбувається малювання та стирання.
 */
class Receiver {
    /**
     * Симулює малювання олівцем за заданими координатами.
     * @param x координата X
     * @param y координата Y
     */
    public void drawWithPencil(int x, int y) {
        System.out.println("Малювання олівцем в точці (" + x + ", " + y + ")");
    }

    /**
     * Симулює малювання пензлем за заданими координатами.
     * @param x координата X
     * @param y координата Y
     */
    public void drawWithBrush(int x, int y) {
        System.out.println("Малювання пензлем в точці (" + x + ", " + y + ")");
    }

    /**
     * Симулює стирання за заданими координатами.
     * @param x координата X
     * @param y координата Y
     */
    public void erase(int x, int y) {
        System.out.println("Стирання в точці (" + x + ", " + y + ")");
    }
}