public class Würfel extends Zufall {

    public Würfel() {

    }
    @Override
    protected double generieren(){

        return (int)1+Math.random()*(6-1+1);
    }

}
