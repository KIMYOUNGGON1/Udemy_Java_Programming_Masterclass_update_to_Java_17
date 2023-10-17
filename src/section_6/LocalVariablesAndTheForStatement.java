package section_6;

public class LocalVariablesAndTheForStatement {
    public static void main(String[] args) {
        // Start on outer block - for example main / method block.
        {
            for (int i = 1; i <= 5; i++) { // i declared in for loop declaration
                System.out.println(i);
            }

            //System.out.println(i); // ERROR! i is out of scope
        }
    }
}
