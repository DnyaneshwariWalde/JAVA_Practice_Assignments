package Q2;
public class Rectangle {
    private double length;
    private double breadth;
    
    public Rectangle() {
        this.length = 0;
        this.breadth = 0;
    }
    
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    
    public double getLength() {
        return length;
    }
    
    public double getBreadth() {
        return breadth;
    }
    
    public void setLength(double length) {
        this.length = length;
    }
    
    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }
    
    public double calculateArea() {
        return length * breadth;
    }
    
    public void display() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + calculateArea());
    }
}
