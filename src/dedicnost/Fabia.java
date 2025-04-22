package dedicnost;

public class Fabia extends Auto {

    public Fabia(int pocetKoni, int cena, String barva) {
        super(pocetKoni, cena, barva);
    }

    public void jizdaStart(){
        System.out.println("Fawwia začala svou jízdu");
        System.out.println("Fawwia je pro " + super.getPocetSedadel() + " osob");
    }

}
