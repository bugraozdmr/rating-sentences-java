public class degerlendir {
    //değerlendirme sınıfı
    public void deger(rate rate2){
        float m=rate2.deger(rate2);

        if (rate2.deger(rate2)>0){
            if(rate2.deger(rate2)>0 && rate2.deger(rate2)<30){
                System.out.println("Eh işte... - %"+m);
            }
            else if(rate2.deger(rate2)>30 && rate2.deger(rate2)<65){
                System.out.println("iyi... - %"+m);
            }
            else if(rate2.deger(rate2)>65 && rate2.deger(rate2)<=100) System.out.println("çok iyi... - %"+m);
        }

        else if(rate2.deger(rate2)<0){
            if(rate2.deger(rate2)<0 && rate2.deger(rate2)>-30){
                System.out.println("napalım... - %"+m);
            }
            else if(rate2.deger(rate2)<-30 && rate2.deger(rate2)>-65){
                System.out.println("kötü... - %"+m);
            }
            else if(rate2.deger(rate2)<-65 && rate2.deger(rate2)>=(-100)) System.out.println("çok kötü... - %"+m);
        }
        else System.out.println("ne iyi ne kötü...");
    }
}
