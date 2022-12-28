package LibraryManagementSystem;

import java.util.List;
import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        do {


            System.out.println("******************Library Management System***********************");
            System.out.println("Press 1 to add book");
            System.out.println("Press 2 to issue a book");
            System.out.println("Press 3 to return a book");
            System.out.println("Press 4 to print complete issue details");
            System.out.println("Press 5 to exit");
            System.out.println("Enter your option :");
            int op = sc.nextInt();
            Library lib1 = new Library();
            switch (op) {
                case 1 -> lib1.add();
                case 2 -> lib1.issue();
                case 3 -> lib1.returnBook();
                case 4 -> lib1.details();
                case 5 -> lib1.exit();
                default -> System.out.println("Please Choose correct option");
            }
            System.out.println("Want to continue Y/N");
            ch = sc.next().charAt(0);

        } while (ch == 'y' || ch=='Y');

        if(ch=='N' || ch=='n'){
            System.exit(0);
        }


    }
}

class Library{
   static int add_bookId,issue_bookId,total_issued,return_bookId;
   static float add_price;
   static String add_name,issue_name,issue_date,return_date,user_name;
    Scanner sc= new Scanner(System.in);
    void add(){
        System.out.println("******************Library Management System***********************");
        System.out.println("Enter book Name,Price and Book-no :");
        add_name = sc.nextLine();
        System.out.println("Enter Price of the Book : ");
        add_price = sc.nextFloat();
        System.out.println("Enter Book-Id");
        add_bookId= sc.nextInt();

        System.out.println("Your details is "+add_name+" "+add_price+" "+add_bookId);
    }

    void issue(){
        System.out.println("******************Library Management System***********************");
        System.out.println("Enter the Book name ");
        issue_name = sc.nextLine();
        System.out.println("Enter the Book Id ");
        issue_bookId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Issue Date");
        issue_date= sc.nextLine();
        System.out.println("Total number of book issued");
        total_issued = sc.nextInt();
        sc.nextLine();
        System.out.println("Return  date of book : ");
        return_date = sc.nextLine();

    }

    int getId(){
        return issue_bookId;
    }

    void returnBook(){
        System.out.println("******************Library Management System***********************");
        System.out.println("Enter the Your  name ");
        user_name = sc.nextLine();
        System.out.println("Enter Book Id");
        return_bookId = sc.nextInt();

        if(issue_bookId==return_bookId){
            System.out.println("Total Details ");
            System.out.println("Book Name :: "+Library.issue_name);
            System.out.println("Book Id :: "+Library.issue_bookId);
            System.out.println("Issue Date :: "+Library.issue_date);
            System.out.println("Total Number of book issues :: "+Library.total_issued);
            System.out.println("Book Return Date :: "+Library.return_date);
        }
        else{
            System.out.println("Wrong Id,Please Enter correct Id");

        }

    }

    void details(){
        System.out.println("Book Name :: "+Library.issue_name);
        System.out.println("Book Id :: "+Library.issue_bookId);
        System.out.println("Issue Date :: "+Library.issue_date);
        System.out.println("Total Number of book issues :: "+Library.total_issued);
        System.out.println("Book Return Date :: "+Library.return_date);
    }
    void exit(){
        System.exit(0);
    }
}
