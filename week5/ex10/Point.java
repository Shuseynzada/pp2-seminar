package week5.ex10;

public class Point {
    private float x, y;

    Point() {
        this.x = 0f;
        this.y = 0f;
    }

    Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    float getX() {
        return this.x;
    }

    float getY() {
        return this.y;
    }

    void setX(float a) {
        this.x = a;
    }

    void setY(float a) {
        this.y = a;
    }

    void translate(float dX, float dY) {
        this.x += dX;
        this.y += dY;
    }

    float distance(Point p) {
        return (float) Math.sqrt((this.x - p.x) * (this.x - p.x) + (this.y - p.y) * (this.y - p.y));
    }

    boolean equals(Point p) {
        return (p.x - this.x) == 0 && (p.y - this.y) == 0;
    }

    public String toString(){
        return "Point{"+
            "x: "+this.x+", "+
            "y: "+this.y+
        "}";
    }
}