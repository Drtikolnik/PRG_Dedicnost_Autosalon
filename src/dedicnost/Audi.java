package dedicnost;

public class Audi extends Auto{

    public Audi(int pocetKoni, int cena, String barva) {
        super(pocetKoni, cena, barva);
    }

    @Override
    public void jizdaStart(){
        System.out.println("Awwdi začalo svou jízdu");
        System.out.println("Awwdi je pro " + super.getPocetSedadel() + " osob");
    }



}