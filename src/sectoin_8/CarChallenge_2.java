package sectoin_8;

public class CarChallenge_2 {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public CarChallenge_2(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public String startEngine() {
        String answer = getClass().getSimpleName() + " -> startEngine()";
        return answer;
    }

    public String accelerate() {
        String answer = getClass().getSimpleName() + " -> accelerate()";
        return answer;
    }

    public String brake() {
        String answer = getClass().getSimpleName() + " -> brake()";
        return answer;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}

class Mitsubishi extends CarChallenge_2 {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        String answer = getClass().getSimpleName() + " -> startEngine()";
        return answer;
    }

    @Override
    public String accelerate() {
        String answer = getClass().getSimpleName() + " -> accelerate()";
        return answer;
    }

    @Override
    public String brake() {
        String answer = getClass().getSimpleName() + " -> brake()";
        return answer;
    }
}

class Holden extends CarChallenge_2 {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        String answer = getClass().getSimpleName() + " -> startEngine()";
        return answer;
    }

    @Override
    public String accelerate() {
        String answer = getClass().getSimpleName() + " -> accelerate()";
        return answer;
    }

    @Override
    public String brake() {
        String answer = getClass().getSimpleName() + " -> brake()";
        return answer;
    }
}

class Ford extends CarChallenge_2 {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        String answer = getClass().getSimpleName() + " -> startEngine()";
        return answer;
    }

    @Override
    public String accelerate() {
        String answer = getClass().getSimpleName() + " -> accelerate()";
        return answer;
    }

    @Override
    public String brake() {
        String answer = getClass().getSimpleName() + " -> brake()";
        return answer;
    }
}

//public class Car {
//    private boolean engine;
//    private int cylinders;
//    private String name;
//    private int wheels;
//
//    public Car(int cylinders, String name) {
//        this.cylinders = cylinders;
//        this.name = name;
//        this.engine = true;
//        this.wheels = 4;
//    }
//
//    public String startEngine() {
//        String answer = getClass().getSimpleName() + " -> startEngine()";
//        return answer;
//    }
//
//    public String accelerate() {
//        String answer = getClass().getSimpleName() + " -> accelerate()";
//        return answer;
//    }
//
//    public String brake() {
//        String answer = getClass().getSimpleName() + " -> brake()";
//        return answer;
//    }
//
//    public int getCylinders() {
//        return cylinders;
//    }
//
//    public String getName() {
//        return name;
//    }
//}
//
//class Mitsubishi extends Car {
//    public Mitsubishi(int cylinders, String name) {
//        super(cylinders, name);
//    }
//
//    @Override
//    public String startEngine() {
//        String answer = getClass().getSimpleName() + " -> startEngine()";
//        return answer;
//    }
//
//    @Override
//    public String accelerate() {
//        String answer = getClass().getSimpleName() + " -> accelerate()";
//        return answer;
//    }
//
//    @Override
//    public String brake() {
//        String answer = getClass().getSimpleName() + " -> brake()";
//        return answer;
//    }
//}
//
//class Holden extends Car {
//    public Holden(int cylinders, String name) {
//        super(cylinders, name);
//    }
//
//    @Override
//    public String startEngine() {
//        String answer = getClass().getSimpleName() + " -> startEngine()";
//        return answer;
//    }
//
//    @Override
//    public String accelerate() {
//        String answer = getClass().getSimpleName() + " -> accelerate()";
//        return answer;
//    }
//
//    @Override
//    public String brake() {
//        String answer = getClass().getSimpleName() + " -> brake()";
//        return answer;
//    }
//}
//
//class Ford extends Car {
//    public Ford(int cylinders, String name) {
//        super(cylinders, name);
//    }
//
//    @Override
//    public String startEngine() {
//        String answer = getClass().getSimpleName() + " -> startEngine()";
//        return answer;
//    }
//
//    @Override
//    public String accelerate() {
//        String answer = getClass().getSimpleName() + " -> accelerate()";
//        return answer;
//    }
//
//    @Override
//    public String brake() {
//        String answer = getClass().getSimpleName() + " -> brake()";
//        return answer;
//    }
//}
