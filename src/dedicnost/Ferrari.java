package dedicnost;

public class Ferrari extends Auto{

    public Ferrari(int pocetKoni, int cena, String barva) {
        super(pocetKoni, cena, barva);
    }

    public void jizdaStart(){
        System.out.println("Fewwawi začalo svou jízdu");
        System.out.println("Fewwawi je pro " + super.getPocetSedadel() + " osob");
    }

}
