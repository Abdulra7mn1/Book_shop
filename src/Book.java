import java.util.ArrayList;

public class Book {
    static ArrayList<Book> books_list = new ArrayList<Book>();

    private String name, author;
    private int num_of_pages, publication_year;
    private static int num_of_books;
    private double price;


    Book (){
        num_of_books ++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public void setNum_of_pages(int num_of_pages) {
        this.num_of_pages = num_of_pages;
    }

    public void setPublication_year(int publication_year) {
        this.publication_year = publication_year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }


    public int getNum_of_pages() {
        return num_of_pages;
    }

    public int getPublication_year() {
        return publication_year;
    }

    public double getPrice() {
        return price;
    }

    public static int getNum_of_books() {
        return num_of_books;
    }
}
