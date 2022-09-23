public class Circle {
    private Point xy;
    private double circle;

    Circle(Point xy, double c){
        this.xy = xy;
        this.circle = c;
    }

    double GetCircle(){
        return this.circle;
    }
}
