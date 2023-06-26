public class Kreis {

  private  double d;



  public Kreis(double d){
        setD(d);

  }
  private  double  Umfang(){

      return this.d*Math.PI;

  }
  private double Flaeche(){

      return Math.pow(this.d,2)*Math.PI;
  }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }


}
