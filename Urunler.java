package com.mycompany.market;



public class Urunler {
    private String urunAdi;
    private double fiyat;
    
    Urunler(String urunAdi,double fiyat){
        this.urunAdi=urunAdi;
        this.fiyat=fiyat;
    }
    
    public String geturunAdi(){
        return this.urunAdi;
    }
    
    public void seturunAdi(String urunAdi){
        this.urunAdi=urunAdi;
    }
    
    public double getfiyat(){
        return this.fiyat;
    }
    
    public void setfiyat(double fiyat){
        this.fiyat=fiyat;
    }
    
    
}
