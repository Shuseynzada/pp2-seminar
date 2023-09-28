public class Segment {
    private Point p1, p2;
    
    Segment(Point p1, Point p2){
        this.p1 = new Point(p1);
        this.p2 = new Point(p2);
    }
    Segment(float x1, float y1, float x2, float y2){
        this.p1 = new Point(x1,y1);
        this.p2 = new Point(x2,y2);
    }
    Point getP1(){
        return this.p1;
    }
    void setP1(Point p){
        this.p1 = new Point(p);
    }
    Point getP2(){
        return this.p2;
    }
    void setP2(Point p){
        this.p2 = new Point(p);
    }
    void translate(float dX, float dY) {
        this.p1.translate(dX, dY);
        this.p2.translate(dX, dY);
    }
    float length(){
        return (float) this.p1.distance(this.p2);
    }
    boolean equals(Segment s){
        return this.p1.equals(s.getP1()) && this.p2.equals(s.getP2()) || this.p1.equals(s.getP2()) && this.p2.equals(s.getP1());
    }

    float getSlope(){
        return (float)Math.abs(this.p1.getY() - this.p2.getY())/Math.abs(this.p1.getX() - this.p2.getX());
    }
    float getIntercept(){
        return this.p1.getY() - this.p1.getX()*this.getSlope();
    }
    boolean isOnLine(Point p){
        return p.getY() == p.getX()*this.getSlope() + this.getIntercept();
    }
    boolean isOnSegment(Point p){
        return this.isOnLine(p) && p.getX() >= Math.min(this.p1.getX(),this.p2.getX()) && p.getX() <= Math.max(this.p1.getX(),this.p2.getX());
    }
}