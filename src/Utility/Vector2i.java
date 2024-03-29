package Utility;

public class Vector2i {
    private int X, Y;

    public Vector2i() {};

    public Vector2i(int X, int Y) {
        this.X = X; this.Y = Y;
    }
    public void set(int X, int Y) {
        this.X = X; this.Y = Y;
    }

    public int getX() { return this.X; }
    public int getY() { return this.Y; }

    public void translateX(int value) { this.X += value; }
    public void translateY(int value) { this.Y += value; }
}
