
package com.mycompany.market;

public class Sepet {
    private SepetUrunu[] urunler=new SepetUrunu[20];
    private int urunSayisi=0;
    
    public boolean urunEkle(Urunler urun,int adet){
        if(adet<=0){
            System.out.println("Urun adedi 1'den kucuk olamaz!");
            return false;
        }
        
        for(int i=0;i<urunSayisi;i++){
            if(urunler[i].getUrun()==urun){
                urunler[i].setAdet(urunler[i].getAdet()+adet);
                return true;
            }
            
        }
        
        if(urunSayisi>=urunler.length){
            System.out.println("Sepet doldu yeni urun eklenemiyor!");
            return false;
        }
        SepetUrunu yeniurun=new SepetUrunu(urun,adet);
        urunler[urunSayisi]=yeniurun;
        urunSayisi++;
        return true;
    }
    
   public boolean sepetiGoster(){
       if(urunSayisi==0){
           System.out.println("Sepetiniz bos");
           return false;
       }
 
        for(int i=0;i<urunSayisi;i++){
            double tutar = urunler[i].getAdet() * urunler[i].getUrun().getfiyat();
            System.out.println((i+1)+"."+urunler[i].getUrun().geturunAdi()+" "+urunler[i].getAdet()+" Adet"+"x"+urunler[i].getUrun().getfiyat()+"TL"+"   "+tutar+"TL");
        }
        return true;
   }
   
   public double topTutar(){
       double toplam=0;
       
       for(int i=0;i<urunSayisi;i++){
           double tutar = urunler[i].getAdet()* urunler[i].getUrun().getfiyat();
            toplam = toplam + tutar;
       }
       return toplam;
   }
   
   public void urunSil(int sira){

       if (sira-1 < 0 || sira-1 >= urunSayisi) {
            System.out.println("Geçersiz ürün sırası!");
            return ;
        }
       
       for(int i=sira-1;i<urunSayisi-1;i++){
           urunler[i]=urunler[i+1];
        }
        urunSayisi--;
        urunler[urunSayisi]=null;
        System.out.println("urun basariyla silindi");
        return ;
    }
}
