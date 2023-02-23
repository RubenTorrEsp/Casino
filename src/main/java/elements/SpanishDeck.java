package elements;

public class SpanishDeck {

    String[] values = {"1", "2", "3", "4", "5", "6", "7", "sota", "caballo", "rey"};
    String[] suits = {"oros", "copas", "espadas", "bastos"};

    String[] deck = new String[40];

    public SpanishDeck(){
        createDeck();
    }



    public void createDeck(){
        int index = 0;

        for(int i = 0; i<suits.length; i++){
            for(int j=0; j<values.length; j++){
                String card = values[j]+" de "+suits[i];
                deck[index] = card;
                index++;
            }
        }
    }

    public String randomCard() {
        int position = (int)(Math.random()*40);
        String card = deck[position];
        return card;
    }

}
