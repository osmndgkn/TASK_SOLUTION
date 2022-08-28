public class Card {

    String card;
      int percentage;

    public Card() {
    }

    public Card(String  card) {
        this.card = card;
       setPercentage(card);

    }



    public String getCard() {
        return card;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(String card) {

        switch(card) {
            case "Gold":
                percentage =20;
                break;
            case "Silver":
                percentage = 10;
                break;
            default: percentage = 0;
        }

    }

    public void setCard(String card) {
        this.card = card;

        setPercentage(card);
    }




}
