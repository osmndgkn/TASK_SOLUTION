public class Payment {

   User user;
   float amountOfBill;
    String category;

    public Payment(User user, float amountOfBill, String category) {
        this.user = user;
        this.amountOfBill = amountOfBill;
        this.category = category;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getTotalDiscount(){
        float totalDiscount=0;
        int percantage = 0;
        int cashDiscount;

        Discount discount = new Discount(user,amountOfBill);
        if (category != "Phone") percantage = discount.getDiscountPercentage();

        cashDiscount = discount.getcashDiscount();


        if (percantage >= 0)
        totalDiscount +=  (percantage * amountOfBill ) / 100;
        totalDiscount += cashDiscount;

        return totalDiscount;
    }




}
