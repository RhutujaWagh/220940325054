
/*
Q2 : Develop a class BankAccount having following data members : (10 Marks)
int accno
double balance
Write appropriate constructors to initialize data members
Define the following functions :
withdraw : balance will reduce
deposit  : balance will increase
show : display accno and balance
If user tries to withdraw more than the balance, use exception handling code. Demonstrate the
concept of exception handling in main() function.
 */

import java.util.Scanner;

class Account
{
    int account;
    double balence;

    Scanner sc = new Scanner(System.in);
    public Account() {

    }
    public Account(int account, double balence) {
        this.account = account;
        this.balence = balence;
    }

    public void withdrawBalence()
    {
        System.out.print("Enter the amount to be Withdraw:");
        int withdraw = sc.nextInt();
        if(withdraw <= balence)
        {
            balence = balence - withdraw;
            System.out.println("You Withdraw Amount..");
        }
        else
        {
            System.out.println("Unsufficient Balence..");
        }

    }
    public void depositBalence()
    {
        System.out.println("Enter the amount to be Diposit:");
        int diposit = sc.nextInt();
        balence = balence + diposit;
        System.out.println("Amount Diposited..");
    }
    public void showBalence()
    {
        System.out.println("Total net Balence :"+balence);
    }
}

public class Bank
{
    public static void main(String[] args) {
        Account account = new Account(300000954,8000);
        account.showBalence();
        account.depositBalence();
        account.showBalence();
        account.withdrawBalence();
        account.showBalence();

    }

}
