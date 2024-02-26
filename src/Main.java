public class Main {
    public static void main(String[] args) {


        Circle C = new Circle("black",false,1.0);
        System.out.printf(C.toString());
        System.out.printf("%nArea: "+C.getArea());
        System.out.printf("%nPerimeter: "+C.getPerimeter()+"%n");

        Rectangle R = new Rectangle("Red",true,2.0,1.0);
        System.out.printf("%n"+R.toString());
        System.out.printf("%nArea: "+R.getArea(R.getLength(),R.getWidth()));
        System.out.printf("%nPerimeter: "+R.getPerimeter(R.getLength(),R.getWidth())+"%n");

        Square S = new Square("black",false,4.0,4.0);
        System.out.printf("%n"+S.toString());
        System.out.printf("%nArea: "+S.getArea(S.getLength(),S.getWidth()));
        System.out.printf("%nPerimeter: "+S.getPerimeter(S.getLength(),S.getWidth())+"%n");
    }
}