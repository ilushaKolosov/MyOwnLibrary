package library.items;

import library.persons.Reader;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class NonFictionBook extends Book {
    private final String subjectArea;

    public NonFictionBook(String title, int year, Boolean available, List<Reader> borrowers, String author, String isbn, String subjectArea) {
        super(title, year, available, borrowers, author, isbn);
        this.subjectArea = subjectArea;
    }

    @Override
    public Boolean matches(String s) {
        return super.matches(s) || subjectArea.contains(s);
    }
}
