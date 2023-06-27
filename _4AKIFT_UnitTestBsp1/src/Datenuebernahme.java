public class Datenuebernahme {
    private int id_person; //muss immer positiv sein, wenn nicht wird sie auf 0
                   //gesetzt


    public Datenuebernahme() {

    }

    public int getId_person() {
        return id_person;
    }

    public void setId_person(int id_person) {
        if(id_person<0) id_person=0;
        this.id_person = id_person;
    }


}
