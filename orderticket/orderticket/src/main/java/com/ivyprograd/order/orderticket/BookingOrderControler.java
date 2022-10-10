package com.ivyprograd.order.orderticket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/api/auth")
public class BookingOrderControler {
    @Autowired
    private BookRepository bookrepository;

    @PostMapping("/addOrder")
    public String saveBook(@RequestBody BookOrder book) {
        bookrepository.save(book);
        return "Booked ticket with id :  " + book.getMovieid();
    }

    @GetMapping("/{movieid}")
    public Optional<BookOrder> getBook(@PathVariable long movieid){
        return bookrepository.findById(movieid);
    }

    @DeleteMapping("/del/{id}")
    public String deleteOrder (@PathVariable long id) {
        bookrepository.deleteById(id);
        return "Order deleted with id : "+id;
    }
}
