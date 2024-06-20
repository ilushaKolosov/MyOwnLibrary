package library.items;

import library.persons.Reader;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public abstract class Book extends LibraryItem {
    private final String author;
    private final String isbn;

    public Book(String title, int year, Boolean available, List<Reader> borrowers, String author, String isbn) {
        super(title, year, available, borrowers);
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public Boolean matches(String s) {
        return super.matches(s) || author.contains(s) || isbn.contains(s);
    }
}
