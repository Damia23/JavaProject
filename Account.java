public class Account 
{
    private int accountNo;
    private String accountType;
    private double balance;  
    private String dateCreated;
    
    public Account(int accNo, String at, double b, String dc) 
    {
        this.setAccountNo(accNo);
        this.setAccountType(at);
        this.setBalance(b);
        this.setDateCreated(dc);
    }

    public Account(Account acc) 
    {
        this.setAccountNo(acc.accountNo);
        this.setAccountType(acc.accountType);
        this.setBalance(acc.balance);
        this.setDateCreated(acc.dateCreated);
    }
    
    public void setAccountNo(int accNo) 
    {
        this.accountNo = accNo; 
    }
    public void setAccountType(String at) 
    { 
        this.accountType = at; 
    }
    public void setBalance(double b) 
    {
        this.balance = b; 
    }
    public void setDateCreated(String dc) 
    {
        this.dateCreated = dc;
    }
     
    public int getAccountNo() 
    {
        return this.accountNo; 
    }
    public String getAccountType() 
    {
        return this.accountType; 
    }
    public double getBalance() 
    {
        return this.balance; 
    }
    public String getDateCreated() 
    {
        return this.dateCreated; 
    } 
 
    public String toString() 
    {
        return ("\t"+this.getAccountNo()+" ("+this.getAccountType()+"), BALANCE RM"+this.getBalance()+"\n");
    }
}
