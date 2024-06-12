package BtAccessModifier;

public class CirCle {
    private double radius = 1.0;
    private String color = "red";
    public CirCle() {}
    public CirCle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double getarea(){
        return Math.PI * radius * radius;
    }
}
