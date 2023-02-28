package elements;

public class FrenchDeck {

    String[] values = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10","J", "Q", "K"};
    String[] suits = {"spades", "hearts", "clubs", "diamonds"};

    String[] deck = new String[52];

    public FrenchDeck(){

    }

    public String[] createDeck(){
        int index = 0;

        for(int i = 0; i<suits.length; i++){
            for(int j=0; j<values.length; j++){
                String card = values[j]+" of "+suits[i];
                deck[index] = card;
                index++;
            }
        }

        return deck;
    }

    public String randomCard() {
        int position = (int)(Math.random()*48);
        String card = deck[position];
        return card;
    }

    public int getValue(String card) {
        int index = 0;
        for(String object:deck){
            index++;
            if (object.equalsIgnoreCase(card)) {
                int value = index%13;
                if (value==0) value=13;
                System.out.println("El valor de la carta es "+value);
            }
        }
        return index;
    }

    public int getValueCourtCards(String card) {
        int index = 0;
        int value = 0;
        for(String object:deck){
            index++;
            if (object.equalsIgnoreCase(card)) {
                value = index%13;
                if (value==0||value==12||value==11) value=10;
                System.out.println("El valor de la carta es "+value);
            }
        }
        return value;
    }


}