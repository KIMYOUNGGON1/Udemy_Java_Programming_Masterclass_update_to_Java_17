package section_6;

public class DeclaringVariablesInASwitchStatementBlock {
    public static void main(String[] args) {

    }

    public static void aMethod(int counter) {
        if (counter > 0) {
            int i = 10;
        }
        else {
            //System.out.println(i); // ERROR : i is out of scope
        }
        //System.out.println(i); // ERROR : i is out of scope
    }

    public static void bMethod(int value) {
        switch (value) {
            case 1 :
                int i = 10;
                break;
            default:
                i = value;              //this is ok
                System.out.println(i);  //this is ok
                break;
        }

//        System.out.println(i); // ERROR : i is out of scope outside of the switch
    }
}
