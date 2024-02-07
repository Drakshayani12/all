package practice.AccountAccessModifierQuestion;

class Account {
    private String accountNumber;
    private double balance;
    Account(String accountNumber, double balance)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }    
    Account(){}
    public String getAccountNumber() {
        return accountNumber;
    }
    protected void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount)
    {
        balance += amount;
    }    
    public void withdraw(double amount)
    {
        if(amount <= balance)
        {
            balance -= amount;
        }
        else 
        {
            System.out.println("Insufficient Funds!!");
        }
    }
}
