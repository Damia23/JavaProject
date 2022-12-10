import java.util.*;

public class CustomerAccountApp
{
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        Scanner inLine=new Scanner(System.in);
        Customer[]customerAccount=new Customer[2];
        String opt="";

        for(int i=0; i < customerAccount.length; i++)
        {
            System.out.print("CUSTOMER "+(i+1));
            System.out.print("\nEnter NRIC: ");
            String nric= in.next();
            System.out.print("Enter name: ");
            String name= in.next();
            customerAccount[i]=new Customer(nric, name);
            Account account;
            
            for(int j=0; j<2; j++)
            {
                System.out.print("\nEnter Account Number: ");
                int accNo=in.nextInt();
                System.out.print("Enter Account Type: ");
                String accType= in.next();
                System.out.print("Enter balance: RM");
                double balance= in.nextDouble();
                System.out.print("Enter Date Created: ");
                String date=in.next();
                account=new Account(accNo, accType, balance, date);
                customerAccount[i].setAccount(account);
            }
        }
        
        System.out.println();
        System.out.print("\nDo you want to display all customer's info (yes/no): ");
        opt=in.next();
        if(opt.equalsIgnoreCase("yes"))
        {
            for(int i=0;i<customerAccount.length;i++)
            {
                System.out.print("\nCustomer "+(i+1));
                System.out.print(customerAccount[i].toString());
            }
        }
    }
}
