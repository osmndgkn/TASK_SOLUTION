import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class DiscountTest {
    Card card = new Card("Gold");
    User user = new User("ali","veli",card,true,new Date());
    @Test
    void getDiscountPercentage() {
        Discount discount = new Discount(user,900);

        assertEquals(30,discount.getDiscountPercentage());

    }

    @Test
    void getcashDiscount() {
        Discount discount = new Discount(user,12000);
        assertEquals(300,discount.getcashDiscount());

    }
}