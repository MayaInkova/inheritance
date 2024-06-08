public class Lion  extends Felidae {

    private int weight;



    public Lion(boolean male, int weight) {
        super(male); // visible - Felidae's public constructor.

        super.setMale(male); // invsible – male is private.

        this.weight = weight;


        this.weight = weight;

    }

    public Lion() {

    }


    public int getWeight() {

        return weight;

    }



    public void setWeight(int weight) {

        this.weight = weight;

    }

}
