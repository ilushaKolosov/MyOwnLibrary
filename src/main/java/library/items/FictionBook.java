package library.items;

import library.persons.Reader;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class FictionBook extends Book {
    private final String genre;

    public FictionBook(String title, int year, Boolean available, List<Reader> borrowers, String author, String isbn, String genre) {
        super(title, year, available, borrowers, author, isbn);
        this.genre = genre;
    }

    @Override
    public Boolean matches(String s) {
        return super.matches(s) || genre.contains(s);
    }
}
