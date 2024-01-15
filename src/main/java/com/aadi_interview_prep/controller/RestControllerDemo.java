package com.aadi_interview_prep.controller;

import com.aadi_interview_prep.dto.Book;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestControllerDemo {

    @GetMapping("/restController/welcome")
    public String welcome(){
        return "hello";
    }

    @PostMapping("/books")
    public String processBook(@RequestBody Book book){
       return book.getTitle()+" New book has been published on year "+book.getPublicationYear();
    }
}
