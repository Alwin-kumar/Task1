public class Circle {

    static  double calculateCircumference(double r){
        return  2*Math.PI*r;
    }

    static  double calculateArea(double r ){
        return  Math.PI*r*r;
    }
    public static void main(String[] args) {
        double radius = 3;
        System.out.printf("Circumference: %2f \n", calculateCircumference(radius));
        System.out.printf("Area: %.2f\n", calculateArea(radius));

    }
}
