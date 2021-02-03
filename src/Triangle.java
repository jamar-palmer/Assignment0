public class Triangle extends Shape{

    private int side1;
    private int side2;
    private int side3;

    public Triangle(String name) {
        super(name);
    }

    public void setDimensions(int side1, int side2, int side3 ){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public void printDimensions(){
        System.out.println("Triangle Side 1: " + side1 + "\nTriangle Side 2: " + side2 + "\nTriangle Side 3: " + side3);
    }

    @Override
    public double getArea() {
        int s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s-side1) * (s-side2) * (s - side3));
    }
}
