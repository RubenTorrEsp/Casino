package elements;

public class FrenchDeck {

    String[] values = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10","J", "Q", "K"};
    String[] suits = {"spades", "hearts", "clubs", "diamonds"};

    String[] deck = new String[52];

    public FrenchDeck(){
        createDeck();
    }



    public void createDeck(){
        int index = 0;

        for(int i = 0; i<suits.length; i++){
            for(int j=0; j<values.length; j++){
                String card = values[j]+" of "+suits[i];
                deck[index] = card;
                index++;
            }
        }
    }

    public String randomCard() {
        int position = (int)(Math.random()*48);
        String card = deck[position];
        return card;
    }

}