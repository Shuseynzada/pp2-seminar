public class Cuboid extends Square implements My3DInt {
    int z;

    public Cuboid(int a) {
        super(a);
        this.z = a;
    }

    @Override
    public double getSurfaceArea() {
        return 6 * super.getArea();
    }

    public double getVolume() {
        return z * super.getArea();
    }

}
