package hw13;

public class Main {
    public static void main(String[] args) {

        Author tery = new Author("Terence", "Pratchett");
        Author dmitriy = new Author("Dmitriy", "Glyhovskiy");
        Book Mort = new Book("Mort", tery, 1987);
        Mort.setPublicationYear(1988);
        Book metro2033 = new Book("Metro2033", dmitriy, 2005);
        System.out.println(metro2033);
        System.out.println(Mort);
        Author tery1 = new Author("Terence", "Pratchett");
        System.out.println(tery.equals(tery1));
        Book Mort1 = new Book("Mort", tery, 1987);
        System.out.println(Mort.equals(Mort1));
        Mort.setPublicationYear(1987);
        System.out.println(Mort.equals(Mort1));
    }
}