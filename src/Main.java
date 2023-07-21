import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        while (true){
            degerlendir degerlendir=new degerlendir();

            rate rate2=new rate();


            System.out.print("cümleyi gir : ");
            String str=scanner.nextLine();

            cumle cumle1=new cumle(str);

            //rate her seferinde oluşmazsa silinen kelimesi tekrar oluşamaz


            rate2.ratee(cumle1);

            rate2.deger(rate2);

            degerlendir.deger(rate2);

            //System.out.println(rate2.getKelimeListesi());

            //her şey bitince artık arraylist boşalır
            rate2.clearKelimeListesi();

        }
    }
}