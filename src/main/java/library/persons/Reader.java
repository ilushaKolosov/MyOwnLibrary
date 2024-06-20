package library.persons;

import library.items.LibraryItem;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reader {
    private String name;
    private String surname;
    private String readerTicket;
    private List<LibraryItem> borrowedItems = new ArrayList<>();

    public Reader(String name, String surname, String readerTicket) {
        this.name = name;
        this.surname = surname;
        this.readerTicket = readerTicket;
    }

    public void borrowItem(LibraryItem item) {
        borrowedItems.add(item);
    }

    public void returnItem(LibraryItem item) {
        borrowedItems.remove(item);
    }
}
