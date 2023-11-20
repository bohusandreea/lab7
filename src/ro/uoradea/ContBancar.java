package ro.uoradea;

public class ContBancar {

    private String id;
    private Double balance;

    public ContBancar(String id, Double balance)
    {
        this.id=id;
        this.balance=balance;
    }

    public double getBalance()
    {
        return balance;
    }
    public void deposit(double amount)
    {
        balance+= amount;
        System.out.println("Ati depus suma de : "+ amount+ " suma disponibila este: "+ balance);
    }

    public void withdraw(double amount)
    {
        if(amount<=balance)
        {
            System.out.println("Ati extras" + amount);
        }
        else
        {
            System.out.println("Fonduri indisponibile!");
        }
    }
}
