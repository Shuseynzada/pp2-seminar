package week5.ex11;

public class Rectangle {
    int width, height;

    public Rectangle(int w, int h){
        this.width = w;
        this.height = h;
    }

    public boolean equals(Object object){
        Rectangle rect = (Rectangle) object;
        if(rect.width == this.width && rect.height == this.height) return true;
        return false;
    }
}
