package class_and_object_in_java.class_quadraticEquation;

public class QuadraticEquation {
    private double a, b, c;

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return (this.b*2) - (4*this.a*this.c);
    }

    public double getRoot1() {
            return  -this.b + Math.sqrt(getDiscriminant()) / (2 * this.a);
    }

    public double getRoot2() {
            return  -this.b - Math.sqrt(getDiscriminant()) / (2 * this.a);
    }



}
