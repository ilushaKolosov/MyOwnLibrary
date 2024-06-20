package library;

import library.items.Book;
import library.items.FictionBook;
import library.items.LibraryItem;
import library.items.NonFictionBook;
import library.persons.Reader;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Database {

    @Getter
    private static List<Reader> readers = new ArrayList<>(List.of(
            new Reader("John", "Doe", "RT123"),
            new Reader("Jane", "Smith", "RT124")
    ));

    @Getter
    private static List<LibraryItem> items = new ArrayList<>(List.of(
            new FictionBook("Fiction Book 1", 2020, true, readers, "Author 1", "ISBN12345", "Fantasy"),
            new NonFictionBook("Non-Fiction Book 1", 2018, true, readers, "Author 2", "ISBN67890", "Science")
    ));

    public static void addItem(LibraryItem item) {
        items.add(item);
    }

    public static void addReader(Reader reader) {
        readers.add(reader);
    }

    public static void removeItem(LibraryItem item) {
        items.remove(item);
    }

    public static void removeReader(Reader reader) {
        readers.remove(reader);
    }
}
