package pl.kostrzynkamien.asymetricencoding.api;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookApi {

    private List<String> bookList;


    public BookApi() {
        this.bookList = new ArrayList<>();
        bookList.add("Harry Potter");
        bookList.add("Narnia");
    }

    @GetMapping
    public List<String> getBookList() {
        return bookList;
    }

    @PostMapping
    public void setBookList(@RequestBody String book) {
        this.bookList.add(book);
    }
}
