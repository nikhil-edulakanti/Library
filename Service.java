package Library;
import java.util.Scanner;


class Service {


    public void intro()
    {
        Books [] myBooks = new Books[5];

      
        myBooks[0] = new Books("978-0134685991", "Effective Java", "Joshua Bloch",true);
        myBooks[1] = new Books("978-0596009205", "Head First Java", "Kathy Sierra & Bert Bates",false);
        myBooks[2] = new Books("978-0201633610", "Design Patterns", "Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides", true);
        myBooks[3] = new Books("978-0132350884", "Clean Code", "Robert C. Martin",false);
        myBooks[4] = new Books("978-1491950357", "Java Concurrency in Practice", "Brian Goetz",true);
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello! Welcome to the library!");
        System.out.println("Please enter your details here!");
        System.out.println("UserName: ");
        String name = sc.nextLine();
        System.out.println("User ID: ");
        int id = sc.nextInt();
        System.out.println("User Dept: ");
        String dept = sc.nextLine();

        Users libUsers = new Users(name, id, dept);

        System.out.println("Please enter the book details");
        System.out.println("Title");
        String title = sc.nextLine();
        
        for (Books book : myBooks)
        {
            if (book.getTitle().equals(title))
            {
                if (book.getIsAvailable())
                {
                    System.out.println("Here you go!!");
                    break;
                }
                else
                {
                    System.out.println("We dont have the book come back later");
                }
            }

        }

    }
}