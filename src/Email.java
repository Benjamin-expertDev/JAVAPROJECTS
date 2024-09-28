import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;

    //Constructor to recieve the first name and lat name
    public Email(String firsrtName, String lastName){
        this.firstName = firsrtName;
        this.lastName = lastName;
        System.out.println("Email created" + "" + this.firstName + "" + this.lastName);
    
        //Call a method asking for the department
    }
    //Ask for the department
    private String setDepartment(){
        System.out.print("Enter the department\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none");
        Scanner in = new Scanner(System.in);
        in.nextInt();
    }
    //Generate a random password

    //Set the mailbox capacity

    //Set the alternate email

    //Change the password
}
