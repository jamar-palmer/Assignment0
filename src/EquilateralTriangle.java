public class EquilateralTriangle extends Triangle{

    private int side;
    public EquilateralTriangle(String name) {
        super(name);
    }

    public void setDimensions(int side ){
        this.side = side;
    }

    @Override
    public void printDimensions(){
        System.out.println("Equilateral Triangle Sides: " + side);
    }

    @Override
    public double getArea() {
        int s = side * side;
        return s * Math.sqrt(3) / 4;
    }
}
