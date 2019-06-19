public class Main {

    public static void main(String[] args){
        String recipient1 = "Gudrun Meier";
        String recipient2 = "Anna Müller";

        //For Paypal
        String username = "Haino";
        String password = "xyz";

        int amount1 = 11225;
        int amount2 = 225;

        Payment webpay = new WebshopPayment(recipient1);
        webpay.pay(amount1);

        Payment paypal = new PaypalAdapter(recipient2, username, password);
        paypal.pay(amount2);

    }


}
