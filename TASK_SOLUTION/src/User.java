import java.util.Date;

public class User {

    String name;
    String Surname;
    Card card;
    Boolean isAfilate;
    Date fistShopDate;

    public User(String name, String surname, Card card, Boolean isAfilate, Date fistShopDate) {
        this.name = name;
        Surname = surname;
        this.card = card;
        this.isAfilate = isAfilate;
        this.fistShopDate = fistShopDate;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Boolean getAfilate() {
        return isAfilate;
    }


    public void setAfilate(Boolean afilate) {
        isAfilate = afilate;
    }

    public Date getFistShopDate() {
        return fistShopDate;
    }

    public void setFistShopDate(Date fistShopDate) {
        this.fistShopDate = fistShopDate;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", card=" + card +
                ", isAfilate=" + isAfilate +
                ", fistShopDate=" + fistShopDate +
                '}';
    }
}
