import dedicnost.Ferrari;
import dedicnost.Audi;
import dedicnost.Fabia;

public class Main {
    public static void main(String[] args) {

        Ferrari fewwawi = new Ferrari(2,100000, "žůžový");
        Audi awwdi = new Audi(80,100000000, "oradžoví");
        Fabia fawwia = new Fabia(4,1000, "UwU pink");

        fewwawi.vypisInfo();
        fewwawi.jizdaStart();

        awwdi.vypisInfo();
        awwdi.jizdaStart();

        fawwia.vypisInfo();
        fawwia.jizdaStart();

        System.out.println(awwdi.getBarva());

    }
}