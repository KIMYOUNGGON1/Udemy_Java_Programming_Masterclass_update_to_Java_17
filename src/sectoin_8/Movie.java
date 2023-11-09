package sectoin_8;

public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie() {
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film");
    }
}

class Adventure extends Movie {
    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n" .repeat(3),
                "Pleasant Scene",
                "Scary Music",
                "Somthing Bad Happens");
    }
}

class Comedy extends Movie {
    public Comedy (String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n" .repeat(3),
                "Somthing Funny Happens",
                "Scary Music",
                "Somthing Bad Happens");
    }
}
