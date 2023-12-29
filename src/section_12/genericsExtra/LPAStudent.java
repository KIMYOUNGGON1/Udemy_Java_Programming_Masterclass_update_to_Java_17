package section_12.genericsExtra;

public class LPAStudent extends Student {
    private double percentComplete;

    public LPAStudent() {
        super();
        percentComplete = random.nextDouble() * 100;
    }

    @Override
    public boolean matchFieldValue(String fieldName, String value) {
        if ("percentComplete".equalsIgnoreCase(fieldName)) {
            return percentComplete <= Double.parseDouble(value);
        }
        return super.matchFieldValue(fieldName, value);
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%8.1f%%", percentComplete);
    }

    public double getPercentComplete() {
        return percentComplete;
    }
}
