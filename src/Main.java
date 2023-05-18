
import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);




        while (true) {

            System.out.println("1-Login");
            System.out.println("2-Register");
            System.out.println("3-Exit");
            int num = input.nextInt();
            switch (num) {

                case 1:
                    if (User.login()) {
                        while(true){
                            System.out.println("1-Add book");
                            System.out.println("2-View all books");
                            System.out.println("3-View book information");
                            System.out.println("4-Delete book");
                            System.out.println("5-Exit");

                            int number = input.nextInt();
                            switch (number) {
                                case 1:
                                    App.add_book();
                                    break;

                                case 2:
                                    App.View_all_books();
                                    break;

                                case 3:
                                    System.out.println("Enter the name of the book to view its information");
                                    String name;
                                    name = input.next();
                                    App.View_book_information(name);
                                    break;

                                case 4:
                                    System.out.println("Enter the name of the book you want to delete");
                                    String nameD = input.next();
                                    App.Delete_book(nameD);
                                    break;

                                case 5:
                                    App.exist_from_app();
                                    break;
                            }
                        }


                    }
                    else {
                        System.out.println("There is an error in the username or password");
                        System.out.println("________________________________________________________");
                    }
                    break;
                case 2:
                    User.register();
                    break;
                case 3:
                    App.exist_from_app();
                    break;
            }
        }

    }
}