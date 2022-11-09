package lec9.solid;

public class O {
    public static abstract class GeometricFigure{
//        abstract double getArea();
    }

    public static class Square extends GeometricFigure{
        double a;
    }

    public static class Circle extends GeometricFigure{
        double r;
    }

    public static class Triangle extends GeometricFigure{
        double a;
        double b;
        double c;
    }

    public static class Manager{
        public double getArea(GeometricFigure figure){
            if(figure instanceof Square){
                return Math.pow(((Square) figure).a, 2);
            } else if(figure instanceof Circle){
                return Math.PI*Math.pow(((Circle) figure).r, 2);
            }

            return 0;
        }
    }
}
