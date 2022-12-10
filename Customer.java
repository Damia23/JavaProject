class Customer 
{
    //instance data member
    private String nric;
    private String name;
    private Account[] account;
    
    public Customer(String ic, String n)
    {
        this.setNric(ic);
        this.setName(n);
        this.account=new Account[2];
    }
    
    //instance mutator
    public void setNric(String ic) 
    { 
        this.nric = ic; 
    }
    public void setName(String n) 
    { 
        this.name = n; 
    }
    public void setAccount(Account acc)
    {
        if(this.account[0] == null)
        {
            this.account[0] = new Account(acc);
        }
        else if(this.account[1] == null)
        {
            this.account[1] = new Account(acc);
        }
    }
    public void setAccount(int accNo, String at, double b, String dc)
    {
        if(this.account[0] == null)
        {
            this.account[0] = new Account(accNo, at, b, dc);
        }
        else if(this.account[1] == null)
        {
            this.account[1] = new Account(accNo, at, b, dc);
        }
    }
    
    //instance accessor
    public String getNric() 
    { 
        return this.nric; 
    }
    public String getName() 
    { 
        return this.name; 
    }
    public Account getAccount(int i)
    {
        return this.account[i];
    }
    public Account[] getAccount()
    {
        return this.account;
    }
    
    //printer
    public String toString() 
    {
        String accInfo = "";
        if (account[0] != null || account[1] != null ) 
        {
            if (account[0] != null)
            {
                accInfo = accInfo + account[0].toString();
            }
            if (account[1] != null)
            {
                accInfo = accInfo + account[1].toString();
            }
        }
        return(" "+this.getNric()+" "+this.getName()+"\n"+accInfo);
    }
}