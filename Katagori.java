
package com.mycompany.market;

public class Katagori {
    private String kategoriAdi;
    
    private Urunler urun1;
    private Urunler urun2;
    private Urunler urun3;
    
    public Urunler urunGetir(int sira) {
    switch (sira) {
        case 1: return urun1;
        case 2: return urun2;
        case 3: return urun3;
        default: return null;
    }
}
    
    Katagori(String katagoriAdi,Urunler urun1,Urunler urun2,Urunler urun3){
        this.kategoriAdi=katagoriAdi;
        this.urun1=urun1;
        this.urun2=urun2;
        this.urun3=urun3;
    }       
    
    public String getKatagoriAdi(){
        return this.kategoriAdi;
    }
    
    public void setKatagoriAdi(String katagoriAdi){
        this.kategoriAdi=katagoriAdi;
    }
    
    public void urunleriGoster(){
        System.out.println("\n--- " + getKatagoriAdi() + " ---");
        System.out.println("1."+urun1.geturunAdi()+"-"+urun1.getfiyat()+"TL");
        System.out.println("2."+urun2.geturunAdi()+"-"+urun2.getfiyat()+"TL");
        System.out.println("3."+urun3.geturunAdi()+"-"+urun3.getfiyat()+"TL");
    }
    
}
