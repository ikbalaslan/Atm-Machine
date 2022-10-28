package atmproject;

import java.util.Collection;
import java.util.Set;

public class Runner extends Options {
    int a =0;
    public static void main(String[] args) {
        Runner obj1 = new Runner();

        obj1.setCheckingBalance(1000);
        obj1.setAccountNumber(12345);
        obj1.setPinNumber(12345);
        obj1.accessYourAccount();


    }

    public void accessYourAccount() {

do {
    a++;


    System.out.println("Please enter your Username");
    int username = input.nextInt();
    System.out.println("Please enter your password");
    int password = input.nextInt();
    if (username == getAccountNumber() && password == getPinNumber()) {
        getAccountTypes();
    } else {
        System.out.println("Invalid username or password");

        if (a>=3){
            System.out.println("Your account suspended! ");
            break;
        }
        accessYourAccount();

    }
         }while(a<3);
    }
}