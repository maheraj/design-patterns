package prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Registry object that provide prototype instance
 */
public class Registry {
    private Map<String, Item> items = new HashMap<>();

    public Registry() {
        loadItems();
    }

    public Item getInstance(String type) {
        Item item = null;
        try {
            item = (Item) items.get(type).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return item;
    }

    private void loadItems() {
        Book book = new Book();
        book.setTitle("Gang of Four");
        book.setPrice("$200");
        book.setNumberOfPages(200);
        items.put("Book", book);

        Movie movie = new Movie();
        movie.setTitle("Gang of Four");
        movie.setPrice("$200");
        movie.setRunTime(2);
        items.put("Movie", movie);
    }
}
