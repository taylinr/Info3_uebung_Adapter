import java.sql.SQLOutput;

public class PaypalAdapter implements Payment {
    private String recipient;
    private PayPalPayment paypal;

    public PaypalAdapter(String recipient, String username, String password){
        this.recipient = recipient;
        this.paypal = new PayPalPayment();
        this.paypal.login(username, password);
        this.paypal.setRecipient(this.recipient);
    }

    @Override
    public void pay(int amount) {

        paypal.setAmount(amount);

        paypal.confirm();
    }
}
