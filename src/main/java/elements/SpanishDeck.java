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
                value = index%10;
                if (value==0||value==9||value==8) value=10;
                System.out.println("El valor de la carta es "+value);
            }
        }
        return value;
    }

}
