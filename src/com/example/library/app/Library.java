package com.example.library.app;
import com.example.library.model.Book;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz", "AASF323233");
        book1.showInfo();

        Book book2 = new Book();
        book2.setTitle("Pan Tadeusz");
        book2.setAuthor("Adam Mickiewicz");
        book2.setIsbn("UWES2323");
        book2.showInfo();

        System.out.println(book2.getAuthor() + " " + book2.getTitle() + " " + book2.getIsbn());
    }
}
