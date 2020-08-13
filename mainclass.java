import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class mainclass
{
    public static void main(String[] args)
    {   Scanner sc=new Scanner(System.in);
     // System.out.println("Enter Your age");
       // int age;
        //age=sc.nextInt();

      customer obj=new customer();
      account obj1=new account();
      transcation obj2=new transcation();
     //   accountstatement obj3=new accountstatement();
        {
           obj.custdetails();
           System.out.println("Do you want to open an account if yes press 1");
           int i;

           i = sc.nextInt();
           if (i == 1)
               obj1.accountdetails();

           System.out.println("Do you want to do transcation if yes press 1");
           i = sc.nextInt();
           if (i == 1)
               obj2.transct();
       }
       //else
         //  System.out.println("Sorry you are not eligible for opening account");
     /*   System.out.println("Do you want to see mini statement press 1");
          i=sc.nextInt();
          if(i==1)
           obj3.history();*/
    }
}
class customer
{
    public void custdetails()
    {
      Scanner sc =new Scanner(System.in);
      System.out.println("Welcome to Customer Section");
        System.out.println("Enter Your Customer Id");
        int Id =sc.nextInt();


        System.out.println("Enter your name ");
        String name=sc.nextLine();

        System.out.println("Enter Your age ");
        int age=sc.nextInt();
        if(age>=18) {


            System.out.println("enter Your Addhar ");
            long addhar = sc.nextLong();
            System.out.println("Customer details are :");
            System.out.println("Customer Id :" + Id);
            System.out.println("Name :" + name);
            System.out.println("Your age " + age);
            System.out.println("Addhar No " + addhar);
        }




    }
}
class account extends customer
{   public int balance=0;
    public void accountdetails()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Type of Account press 1 for saving else press 2 for Current");
        int acc=sc.nextInt();


        if(acc==1)

        {System.out.println("Account Created ");
            System.out.println("Your Account type :saving");
        System.out.println("Balance : " + balance);
        System.out.println("Account No :" + 1223245466);}

        if(acc==2) {
            System.out.println("Account Created ");
            System.out.println("Your Account type :Current");
            System.out.println("Balance : " + balance);
            System.out.println("Account No :" + 1223245466);
        }
      //else
        //  System.out.println("Your Pressed wrong button");
    }
}
class transcation extends account
{  public int k=0;
    public ArrayList<Integer> arr=new ArrayList<Integer>();
    public void transct() {
        Scanner sc = new Scanner(System.in);
      Date d1=new Date();
        for (int j = 0; j < 10; j++)
        {
            System.out.println("Press 1 for credit , Press 2 for Debit ,Press 0 for exit");
            int i = sc.nextInt();
            if(i==0)
                break;
            if (i == 1) {
                System.out.println("Enter Amount to be Credit");
                int credit = sc.nextInt();
                balance += credit;
                arr.add(+credit);
                System.out.println("Your balance " + balance);
             //  System.out.println("Do you want to continue press 3 ");
               //    if (i == 1)
                //continue;
            }

            if (i == 2) {
                System.out.println("Enter your Password");
                int pss= sc.nextInt();
                if(pss==1234) {
                    System.out.println("Enter Amount to be debit");
                    int debit = sc.nextInt();
                    if (debit > balance)
                        System.out.println("Enter less amount");
                    else {
                        System.out.println("You debited: " + debit);
                        balance -= debit;
                        arr.add(-debit);
                        System.out.println("Current balance " + balance);
                      //  System.out.println("Transcation :"+arr.get(k++));
                    }
                }
                else
                {System.out.println("Wrong pin");
                  continue;}
            }
        }
        System.out.println("Do you want to see the ministatement if yes press 1");
        int i= sc.nextInt();
        {  if(i==1) {
            System.out.println("+ sign for credit and - sign is for debit");
            for (int x = 0; x < arr.size(); x++)
                System.out.println("Ministatement  :" + arr.get(x)+" Transcation time: "+d1);
        }
        }
    }
}
/*class accountstatement extends transcation
{
    public void history()
    {   System.out.println("+ denoted for credit , - denoted for debit");
        for(int i=0;i< arr.size();i++)
            System.out.println("Transcation :"+arr.get(i));
    }

}*/
