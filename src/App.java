import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static Scanner input = new Scanner(System.in);

    //This function is to add a book and store its information
    static void add_book()
    {
        System.out.println("Enter the number of books to add");
        int num = input.nextInt();

        if (num < 1)
        {
            System.out.println("Enter a number greater than zero");
        }
        else
        {
            for (int i = 0; i < num; i++)
            {
                System.out.println("Enter name for " + (i + 1) + " book");
                String name = input.next();
                System.out.println("Enter the author's name for " + (i + 1 )+ " book");
                String author = input.next();
                System.out.println("Enter number of pages for " + (i + 1) + " book");
                int num_of_pages = input.nextInt();
                System.out.println("Enter publication year for " + (i + 1) + " book");
                int publication_year = input.nextInt();
                System.out.println("Enter price for " + (i + 1) + " book");
                double price = input.nextDouble();

                Book b = new Book();
                b.setName(name);
                b.setAuthor(author);
                b.setNum_of_pages(num_of_pages);
                b.setPublication_year(publication_year);
                b.setPrice(price);

                Book.books_list.add(b);


            }
        }
    }


    //This function prints all stored books
    static public void View_all_books()
    {
        System.out.println("________________________________________________________");
        System.out.println("There are " + Book.getNum_of_books()+ " books");
        for (int i = 0; i < Book.books_list.size(); i++)
        {
            System.out.println(Book.books_list.get(i).getName());
        }
        System.out.println("________________________________________________________");
    }

    //This function to prints all information about books
    static public void View_book_information(String name)
    {
        System.out.println("________________________________________________________");
        for (Book b : Book.books_list)
        {
            if(name.equals(b.getName()))
            {
                System.out.println("A "+ b.getName() + " book written by " + b.getAuthor()
                        + ", the number of pages of this book is " + b.getNum_of_pages());
                System.out.println("pages, it was published in " + b.getPublication_year()
                        + ", and its price is " + b.getPrice() + " pounds");

            }
            else
                continue;
        }
        System.out.println("________________________________________________________");

    }

    static public void Delete_book(String name)
    {
        for (Book b : Book.books_list)
        {
            if(name.equals(b.getName()))
                Book.books_list.remove(b);
            else
                continue;
        }
    }


    static public void exist_from_app()
    {
        System.exit(0);
    }


}
