public class Square extends Rectangle {
    public Square(int a) {
        super(a, a);
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (Exception e) {
            System.out.println("salam");
        }
        return null;
    }
}
