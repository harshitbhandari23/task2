import java.util.*;
  interface transaction {
    void withdraw(double amount);

    void deposit(double amount);

    void checkBalance();
}

class user
{ double balance;
    user(double b) {
        balance = b;

    }
}
 class Atm  extends user implements transaction
 {
    Atm(double a){
        super(a);
    }
   public void withdraw(double amount)
    {
        if(amount>balance)
            System.out.println("INSUFFICIENT BALANCE");
        else
        {
            balance=balance-amount;
            System.out.println("Transaction success");
            System.out.println("current balance "+ balance);
    }
}
 public void deposit(double amount)
{balance=balance+amount;
    System.out.println("Transaction success");
    System.out.println("Current balance"+balance);
}
 public void checkBalance()
{System.out.println("Balance is"+balance);

}
 }
 class one
 {
     public static void main(String args[])

     { Scanner sc=new Scanner(System.in);
       System.out.println("enter initial amount");
       double a=sc.nextDouble();

         Atm obj=new Atm(a);

         System.out.println("Enter 1 to start atm");
         int ch1=sc.nextInt();
         System.out.println("Enter 0 to stop ");
         System.out.println("Enter 2 to withdraw amount");
         System.out.println("Enter 3 to deposit amount");
         System.out.println("Enter 4 to check balance");
         if(ch1==1)
         {
         while(true)

         {  System.out.println("Enter choice");
             int ch=sc.nextInt();
             if(ch==0) {
                 break;
             }



             if(ch==2)
             {System.out.println("Enter amount");
                 double amount=sc.nextDouble();
                 obj.withdraw(amount);}
             else if(ch==3)

             { System.out.println("Enter amount");
                 double amount=sc.nextDouble();
                 obj.deposit(amount);}
             if(ch==4)
                 obj.checkBalance();




         }
 }}}

