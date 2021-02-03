public class Square extends Shape{

    private int length;
    private int height;

    public Square(String name) {
        super(name);
    }

    public void setDimensions(int length, int height){
        this.length = length;
        this.height = height;
    }

    @Override
    public void printDimensions(){

        System.out.println("Square Length: " + length + "\nSquare Height: "+ height);
    }
    @Override
    public double getArea() {

        return length * height;
    }
}
