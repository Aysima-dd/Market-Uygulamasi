
package com.mycompany.market;

public class SepetUrunu {
    private Urunler urun;
    private int adet;
    
    SepetUrunu(Urunler urun,int adet){
        this.urun=urun;
        this.adet=adet;
    }
    
    public Urunler getUrun(){
        return this.urun;
    }
    
    public void setUrun(Urunler urun){
        this.urun=urun;
    }
    
    public int getAdet(){
        return this.adet;
    }
    
    public void setAdet(int adet){
        if(adet<=0){
            System.out.println("Gecersi urun adedi");
            return;
        }
        this.adet=adet;
    }
         
}
