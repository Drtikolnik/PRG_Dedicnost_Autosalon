package dedicnost;

public class Auto {

    private int pocetSedadel = 5;
    private int pocetDveri = 5;
    private int pocetNahradnichKol = 1;
    private int pocetKoni;
    private int cena;
    private String barva;
    private String spz;


    public Auto(int pocetKoni, int cena, String barva){
        this.pocetKoni = pocetKoni;
        this.cena = cena;
        this.barva = barva;
    }

    public void vypisInsfo(){
        System.out.println("Počet sedadel: " +pocetSedadel+ " Počet dveří: " +pocetDveri+ " Počet náhradních kol: " +pocetNahradnichKol+ " Počet koní: " +pocetKoni+ " Cena: " +cena+ " Barva: " +barva);
    }


    public void jizdaStart(){
        System.out.println("Auto začalo svou jízdu");
    }

    public void vytvorSPZ(){

    }































    public int getPocetSedadel() {
        return pocetSedadel;
    }

    public int getPocetDveri() {
        return pocetDveri;
    }

    public int getPocetNahradnichKol() {
        return pocetNahradnichKol;
    }

    public int getPocetKoni() {
        return pocetKoni;
    }

    public int getCena() {
        return cena;
    }

    public String getBarva() {
        return barva;
    }
}
