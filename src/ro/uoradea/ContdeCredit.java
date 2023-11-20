package ro.uoradea;

public class ContdeCredit extends ContBancar {

       private double suma_initiala;
       private double plata_lunara;

    public ContdeCredit(double suma_initiala, double plata_lunara) {
        this.plata_lunara=plata_lunara;
        this.suma_initiala=suma_initiala;
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        if(amount>suma_initiala)
        {
            double diferenta=amount-suma_initiala;
            plata_lunara+= diferenta;
        }
    }
}
