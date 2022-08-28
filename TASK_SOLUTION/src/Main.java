import java.util.Date;

public class Main {

    public static void main(String args[])  //static method
    {
        Card card = new Card();
        User user = new User("ali","veli",card,true,new Date());

        Float billAmount = Float.valueOf(12000);
        Payment payment = new Payment(user,billAmount,"Phon");

        System.out.println(billAmount-payment.getTotalDiscount());


    }


}
