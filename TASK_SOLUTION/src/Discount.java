import java.util.Date;

public class Discount {
    User user;
    float amountOfBill;


    public Discount(User user, float amountOfBill) {
        this.user = user;
        this.amountOfBill = amountOfBill;

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public float getAmountOfBill() {
        return amountOfBill;
    }

    public void setAmountOfBill(float amountOfBill) {
        this.amountOfBill = amountOfBill;
    }


    public int getDiscountPercentage(){
        if (user.getCard().getCard() == "Gold")   return 30;
        if (user.getCard().getCard() == "Silver") return 20;
        if (user.isAfilate)                       return 10;
        if(user.getFistShopDate().getYear() + 2 <= new Date().getYear()) return 5;
        return 0;
    }

    public int getcashDiscount(){
        int cashDiscount = 0;

        cashDiscount = (int) (amountOfBill / 200);
        return cashDiscount * 5;
    }

}
