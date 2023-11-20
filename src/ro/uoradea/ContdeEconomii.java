package ro.uoradea;

public class ContdeEconomii extends ContBancar {

    private Double limita;

    public ContdeEconomii(Double limita)
    {
        this.limita=limita;
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);

        if(amount>=limita)
        {
            System.out.println("nu se poate face operatiunea");
        }
        else
            if(amount<=balance && amount<=limita)
            {
                System.out.println("puteti extrage suma dorita");
            }

    }
}
