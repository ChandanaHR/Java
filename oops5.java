Write a Java program to create a class called "Book" with attributes for title, author, and ISBN, and methods to add and remove books from a collection.

import java.io.*;
import java.util.*;
import java.lang.*;

class Book {
    String title;
    String author;
    String isbn;
    static ArrayList<Book> bookcollection = new ArrayList<Book>();
    Book(String title,String author,String isbn)
    {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    public String gettitle()
    {
        return title;
    }
    public void settitle(String title)
    {
        this.title = title;
    }
    public String getauthor()
    {
        return author;
    }
    public void setauthor(String author)
    {
        this.author = author;
    }
    public String getisbn()
    {
        return isbn;
    }
    public void setisbn(String isbn)
    {
        this.isbn = isbn;
    }
    public static void addbook(Book book)
    {
        bookcollection.add(book);
    }
    public static void removebook(Book book)
    {
        bookcollection.remove(book);
    }
    public static ArrayList<Book> getcollection()
    {
        return bookcollection;
    }
}

public class Main {
    public static void main(String[] args)
    {
        Book book1 = new Book("Java","Chandu","15022000");
        Book book2 = new Book("Python","Asha","16042022");
        Book.addbook(book1);
        Book.addbook(book2);
        ArrayList<Book> bookcollection = Book.getcollection();
        System.out.println("List of books:");
        for(Book b : bookcollection)
        {
            System.out.println(b.gettitle()+" "+b.getauthor()+" "+b.getisbn());
        }
        System.out.println();
        Book.removebook(book1);
        System.out.println("After removing " +book1.gettitle());
        for(Book b : bookcollection)
        {
            System.out.println(b.gettitle()+" "+b.getauthor()+" "+b.getisbn());
        }
    }
}
