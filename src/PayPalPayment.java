public class PayPalPayment {

//    Normally I would save them as a Hashcode with a Hashtable, but for this purpose Strings will do the Job
    private String username;
    private String password;


    private int amount;
    private String recipient;
    private boolean LoggedIn;

    public boolean login(String username, String password){
        this.username = username;
        this.password = password;
        // This will always return true, because there is no authentication method
        this.LoggedIn = true;
        return true;
    }

    public void setRecipient(String recipient){
        this.recipient = recipient;
    }

    public void setAmount(int amount){
        this.amount = amount;
    }

    public void confirm(){
        if (this.LoggedIn){
            System.out.println("Sie haben " +amount+"€ an "+this.recipient+" über "+this.getClass().getSimpleName()+" gezahlt.");
        }
    }

}
