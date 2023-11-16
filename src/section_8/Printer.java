package section_8;

public class Printer {
    private int tonerLevel;
    private int pagePrinted;
    private boolean duplex;

    public Printer(int tonerLevel, int pagePrinted, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.pagePrinted = pagePrinted;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {

        int totalAmountOfToner = this.tonerLevel + tonerAmount;

        if (totalAmountOfToner <= 0) {
            return -1;
        } else if (totalAmountOfToner > 100) {
            return -1;
        } else {
            return tonerLevel + tonerAmount;
        }
    }

    public int printPages(int pages) {
        if (duplex) {
            System.out.println("It's a duplex printer!");
        }
        return pagePrinted + pages;
    }
}
