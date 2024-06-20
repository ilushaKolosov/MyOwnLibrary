package library.items;

import library.interfaces.Searchable;
import library.persons.Reader;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LibraryItem implements Searchable<LibraryItem> {
    private String title;
    private int year;
    private Boolean available;
    private List<Reader> borrowers;

    @Override
    public Boolean matches(String s) {
        return title.contains(s);
    }
}
