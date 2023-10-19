
public class Rectangle implements My2DInt {
    int h, w;

    Rectangle(int h, int w) {
        this.h = h;
        this.w = w;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (Exception e) {
        }
        return null;
    }

    @Override
    public double getArea() {
        return h*w;
    }

    @Override
    public double getPerimeter() {
        return 2*(h+w);
    }
}
