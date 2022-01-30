package com.library.controller;

import com.library.model.Book;
import com.library.service.BookCollectionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class BookCollectionController {

    private final BookCollectionService service;

    @GetMapping("/admin/orders")
    public String getBookList(Model model) {
        List<Book> allBooks = service.getBookList();
        model.addAttribute("Book", allBooks);
        return "cms/book-collection";
    }
}
