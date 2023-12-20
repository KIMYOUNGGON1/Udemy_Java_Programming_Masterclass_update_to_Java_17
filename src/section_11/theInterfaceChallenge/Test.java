package section_11.theInterfaceChallenge;

public class Test {
    public static void main(String[] args) {
        Building building = new Building("test building", "for test");

        String geometryType = building.getGeometryType();
        System.out.println("The test of the Building Type " + geometryType);

    }
}
