public class WebshopPayment implements Payment {

    private String recipient;

    public WebshopPayment(String recipient){
        this.recipient = recipient;
    }

    @Override
    public void pay(int amount){
        System.out.println("Sie haben " +amount+"€ an "+this.recipient+" über "+this.getClass().getSimpleName()+" gezahlt.");
    }
}
