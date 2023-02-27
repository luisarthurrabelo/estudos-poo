package app.ex1;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        DVD[] dvd = new DVD[5];
        CD[] cd = new CD[5];
        VHS[] vhs = new VHS[5];
        
        ArrayList<String> atores =new ArrayList<String>();

        atores.add("John");
        atores.add("Frank");

        dvd[0] = new DVD("O massacre", "video", "terror", 1999, 50000, 30.50, atores, "Renato Russo", 140, 18);
        dvd[0].showDVD();

        cd[0] = new CD("Para Sempre", "audio", "rock", 2001, 100000, 10.00, "Ednaldo Pereira", 10);
        cd[0].showCD();

        atores.remove("John");
        atores.remove("Frank");
        atores.add("Alphonse");
        atores.add("Robert");

        vhs[0] = new VHS("O Ritual", "video", "terror", 2006, 20000, 20.50, atores, "Amilton Santos", 100, 18, true);
        vhs[0].showVHS();
    }
}
