package section_8;

public class Encapsulation {
    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//        player.health = 200;
//        player.loseHealth(11);
//        System.out.println("Remaining health = " + player.healthRemaining());

//        EnhancedPlyer tim = new EnhancedPlyer("Tim", 200, "Sword");
//        System.out.println("Initial health is " + tim.healthRemaining());
//
//        Printer printer = new Printer(50, 20, true);
//        System.out.println(printer.addToner(40));
//        System.out.println(printer.printPages(40));
//
//        Printer printer_NotDup = new Printer(90, 30, false);
//        System.out.println(printer_NotDup.addToner(20));
//        System.out.println(printer_NotDup.printPages(40));

        PrinterLecture printerLecture = new PrinterLecture(50, false);
        System.out.println("initial page count = " + printerLecture.getPagesPrinted());

        int pagesPrinted = printerLecture.printPages(5);
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n",
                pagesPrinted, printerLecture.getPagesPrinted());

        pagesPrinted = printerLecture.printPages(10);
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n",
                pagesPrinted, printerLecture.getPagesPrinted());
    }
}
