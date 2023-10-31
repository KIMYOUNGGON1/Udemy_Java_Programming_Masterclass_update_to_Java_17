package section_7;

public class Point {

    private int x;
    private int y;

    // 첫 번째 생성자 (파라미터 없음)
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    // 두 번째 생성자 (x와 y 초기화)
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // x 값을 반환하는 메서드
    public int getX() {
        return x;
    }

    // y 값을 반환하는 메서드
    public int getY() {
        return y;
    }

    // x 값을 설정하는 메서드
    public void setX(int x) {
        this.x = x;
    }

    // y 값을 설정하는 메서드
    public void setY(int y) {
        this.y = y;
    }

    // (0, 0)과의 거리를 계산하는 메서드
    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

    // 다른 점과의 거리를 계산하는 메서드
    public double distance(Point other) {
        int dx = this.x - other.x;
        int dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // 지정된 x와 y와의 거리를 계산하는 메서드
    public double distance(int x, int y) {
        int dx = this.x - x;
        int dy = this.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static void main(String[] args) {
//        Point
//        You have to represent a point in 2D space. Write a class with the name Point. The class needs two fields (instance variables) with name x and y of type int.
//
//                The class needs to have two constructors. The first constructor does not have any parameters (no-arg constructor). The second constructor has parameters x and y of type int and it needs to initialize the fields.
//
//        Write the following methods (instance methods):
//
//        Method named getX without any parameters, it needs to return the value of x field.
//
//        Method named getY without any parameters, it needs to return the value of y field.
//
//        Method named setX with one parameter of type int, it needs to set the value of the x field.
//
//        Method named setY with one parameter of type int, it needs to set the value of the y field.
//
//        Method named distance without any parameters, it needs to return the distance between this Point and Point (0, 0) as a double.
//
//                Method named distance with parameter of type Point, it needs to return the distance between this Point and the parameter Point as a double.
//
//                Method named distance with two parameters x, y both of type int, it needs to return the distance between this Point and Point x, y as a double.
//
//
//
//                How to find the distance between two points?
//                To find a distance between points A(xA,yA) and B(xB,yB), we use the formula:
//
//        d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
//
//        Where √ represents square root.
//
//
//
//                TEST EXAMPLE
//
//→ TEST CODE:
//
//        Point first = new Point(6, 5);
//        Point second = new Point(3, 1);
//        System.out.println("distance(0,0)= " + first.distance());
//        System.out.println("distance(second)= " + first.distance(second));
//        System.out.println("distance(2,2)= " + first.distance(2, 2));
//        Point point = new Point();
//        System.out.println("distance()= " + point.distance());
//        OUTPUT
//
//        distance(0,0)= 7.810249675906654
//        distance(second)= 5.0
//        distance(2,2)= 5.0
//        distance()= 0.0
//
//
//        NOTE: Use Math.sqrt to calculate the square root √.
//
//        NOTE: Try to avoid duplicated code.
//
//                NOTE: All ​methods should be defined as public NOT public static.
//
//        NOTE: In total, you have to write 7 methods.
//
//                NOTE: Do not add a main method to the solution code.

        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());

    }
}
