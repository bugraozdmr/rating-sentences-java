import java.util.ArrayList;

public class rate {

    private ArrayList<String> kelimeListesi;
    private int u,l;

    private int m;

    //bunları başlatmam gerek
    public rate() {
        this.kelimeListesi = new ArrayList<String>();
        this.u = 0;
        this.l = 0;
    }

    public String[] goodies={"güzel","iyi","canım","estetik","yenilikçi","benzersiz","harika","mükemmel",
                            "üstün","özgün","akıllıca","verimli","lider","etkili","titiz","dinamik","naber",
                            "müdür","merhaba","nasıl"};

    public String[] badi={"mal","salak","enayi","akılsız","gerizekalı","aptal","düşüncesiz","başarısız",
                          "belirsiz","ahmak","kısıtlı","sorunlu","hatalı","ezik"};
    public void ratee(cumle cumle1){
        String[] kelimeler=cumle1.getCumle().split(" ");

        m=kelimeler.length;     //yuzde yapacagız

        //olanı tekrar alma
        for (String kelime : kelimeler) {
            if (!kelimeListesi.contains(kelime)) {
                kelimeListesi.add(kelime);
            }
        }

        //kontrol
        for(String word : kelimeListesi){
            for (String g : goodies){
                if (word.toLowerCase().contains(g)) u++;
            }
            for (String t : badi){
                if (word.toLowerCase().contains(t)) l++;
            }
        }
    }

    //tekrar duzeltmicem
    public float deger(rate rate1){
        if(rate1.getU() > rate1.getL()){

            return ((float)(rate1.getU()-rate1.getL())/(float)rate1.getM())*(float)100;
        }
        else {
            return ((float)(rate1.getU()-rate1.getL())/(float)rate1.getM())*(float)100;
        }
    }

    public void clearKelimeListesi() {
        kelimeListesi.clear();
        for (String a:kelimeListesi){
            System.out.println(a);
        }
    }



    public int getU() {
        return u;
    }

    public void setU(int u) {
        this.u = u;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public ArrayList<String> getKelimeListesi() {
        return kelimeListesi;
    }

    public void setKelimeListesi(ArrayList<String> kelimeListesi) {
        this.kelimeListesi = kelimeListesi;
    }
}
