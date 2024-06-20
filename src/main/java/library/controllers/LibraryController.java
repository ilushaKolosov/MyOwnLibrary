package library.controllers;

import library.Database;
import library.items.LibraryItem;
import library.persons.Reader;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/library")
public class LibraryController {

    @GetMapping("/items")
    public List<LibraryItem> getAllItems() {
        return Database.getItems();
    }

    @GetMapping("/readers")
    public List<Reader> getAllReaders() {
        return Database.getReaders();
    }

    @PostMapping("/items")
    public void addItem(@RequestBody LibraryItem item) {
        Database.addItem(item);
    }

    @PostMapping("/readers")
    public void addReader(@RequestBody Reader reader) {
        Database.addReader(reader);
    }

    @DeleteMapping("/items/{title}")
    public void removeItem(@PathVariable String title) {
        Database.getItems().removeIf(item -> item.getTitle().equals(title));
    }

    @DeleteMapping("/readers/{ticket}")
    public void removeReader(@PathVariable String ticket) {
        Database.getReaders().removeIf(reader -> reader.getReaderTicket().equals(ticket));
    }
}
