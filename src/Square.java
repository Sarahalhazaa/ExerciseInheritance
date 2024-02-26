public class Square extends Rectangle {

    public Square(){

    }

    public Square(String color, boolean filled, double width, double length) {
        super(color, filled,width, length);

    }

    @Override
    public double getArea(double length,double width) {
        return length*length;
    }

    @Override
    public double getPerimeter(double length,double width) {
        return 4*length;
//        return (super.getPerimeter(length,width));
    }


    @Override
    public String toString() {
        return "Square{ side = "+ getLength()+" color= "+ getColor()+" filled= "+isFilled()+
                '}';
    }
}
