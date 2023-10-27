package section_6;

public class Floor {

    private double width = 0;
    private double length = 0;

    public Floor(double width, double length) {
        if (width > 0) {
            this.width = width;
        }
        if (length > 0) {
            this.length = length;
        }
    }

    public double getArea() {
        return width * length;
    }

    public class Calculator {
        Floor floor;
        Carpet carpet;

        public Calculator(Floor floor, Carpet carpet) {
            this.floor = floor;
            this.carpet = carpet;
        }

        public double getTotalCost() {
            return floor.getArea() * carpet.getCost();
        }
    }

    public class Carpet {
        double cost = 0;

        public Carpet(double cost) {
            if (cost > 0) {
                this.cost = cost;
            }
        }

        public double getCost() {
            return cost;
        }
    }

//    public static void main(String[] args) {
//        Carpet carpet = new Carpet(3.5);
//        Floor floor = new Floor(2.75, 4.0);
//
//        Calculator calculator = new Calculator(floor, carpet);
//        System.out.println("Total = " + calculator.getTotalCost());
//
//        Carpet carpet1 = new Carpet(1.5);
//        Floor floor1 = new Floor(5.4, 4.5);
//
//        Calculator calculator1 = new Calculator(floor1, carpet1);
//        System.out.println("Total = " + calculator1.getTotalCost());
//    }
}
