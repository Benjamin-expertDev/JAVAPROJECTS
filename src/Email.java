import java.util.Scanner;
import java.util.Random;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private int defaultPasswordLength = 10;
    private String alternateEmail;

    //Constructor to recieve the first name and lat name
    public Email(String firsrtName, String lastName){
        this.firstName = firsrtName;
        this.lastName = lastName;
        System.out.println("Email created" + "" + this.firstName + "" + this.lastName);
    
        //Call a method asking for the department - return the department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);
    }
    // Call a method that returns a random password
    //Ask for the department
    private String setDepartment(){
        System.out.print("Enter the department\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code:");
        Scanner in = new Scanner(System.in);
       int depChoice =  in.nextInt();
       if (depChoice == 1) {return "Sales"; }
       else if (depChoice == 2) {return "dev"; }
       else if (depChoice == 3) {return "acct"; }
       else {return "";}
    }
    //Generate a random password
    private String randomPassword(int length){
        String passwordSet =  "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*";
        char[]password = new char[length];
        for (int i = 0; i<length; i++){
            int rand = (int)(Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
            System.out.println(rand);
            System.out.println(passwordSet.charAt(rand));
        }
        return new String(password);
    }
    //Set the mailbox capacity

    //Set the alternate email

    //Change the password
}
