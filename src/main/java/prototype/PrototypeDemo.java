package prototype;

public class PrototypeDemo {
    public static void main(String[] args) {
        Registry registry = new Registry();
        Book book = (Book) registry.getInstance("Book");
        book.setNumberOfPages(500);

        System.out.println(book);
        System.out.println(book.getTitle());
        System.out.println(book.getPrice());
        System.out.println(book.getNumberOfPages());
        System.out.println(book.getUrl());
        System.out.println();

        Movie movie = (Movie)registry.getInstance("Movie");
        movie.setTitle("Star wars");
        movie.setRunTime(4);

        System.out.println(movie);
        System.out.println(movie.getTitle());
        System.out.println(movie.getPrice());
        System.out.println(movie.getRunTime());
        System.out.println(movie.getUrl());
    }

}
