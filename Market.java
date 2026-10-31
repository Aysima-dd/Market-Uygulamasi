
package com.mycompany.market;

import java.util.Scanner;

public class Market {

    public static void main(String[] args) {
        Sepet sepet = new Sepet();
        Scanner scanner=new Scanner(System.in);
        
        Urunler elma=new Urunler("elma",25);
        Urunler armut=new Urunler("armut",35);
        Urunler muz=new Urunler("muz",90);
        
        Katagori meyve=new Katagori("meyve",elma,armut,muz);
        
        Urunler salatalık=new Urunler("salatalık",40.5);
        Urunler marul=new Urunler("marul",90.2);
        Urunler biber=new Urunler("biber",15.8);
        
        Katagori sebze=new Katagori("sebze",salatalık,marul,biber);
        
        Urunler yumuşatıcı=new Urunler("yumuşatıcı",256);
        Urunler camsil=new Urunler("camsil",89);
        Urunler domestos=new Urunler("domestos",125);
        
        Katagori deterjan=new Katagori("deterjan",yumuşatıcı,camsil,domestos);
        
        while(true){       
            System.out.println("\n----İslemler---\n1.katagoriler\n2.sepeti goruntule\n3.sepetten urun sil\n4.sepeti onayla");
            System.out.println("yapmak istediginiz islemin nosunu girin:");
            int islem=scanner.nextInt();

            switch(islem){
                case 1:
                    System.out.println("\n----Katagoriler---\n1.meyve\n2.sebze\n3.deterjan");
                    System.out.println("urunleri goruntulemek icin bir numara secin cikmak icin 0 tuslayin:");
                    int secim=scanner.nextInt();
                    if(secim==0){
                        break;
                    }

                    switch(secim){
                        case 1:
                            meyve.urunleriGoster();
                            System.out.println("sepete eklemek icin önce ürün nosunu sonra adedi tuslayın iptal etmek icin 0 girin.");
                            int no=scanner.nextInt();
                            if (no == 0)
                                break;
                            Urunler secilenUrun=meyve.urunGetir(no);
                            if(secilenUrun==null){
                               System.out.println("Gecrsiz no!");
                               break;
                            }
                            System.out.println("Kac adet almak istiyorsunuz?");
                            int adet=scanner.nextInt();                                                    
                            if(sepet.urunEkle(secilenUrun,adet)){
                                System.out.println(no+" nolu urunden "+adet+" adet sepete eklendi");
                                break;
                            }
                            break;
                        case 2:
                            sebze.urunleriGoster();
                            System.out.println("sepete eklemek icin önce ürün nosunu sonra adedi tuslayın iptal etmek icin 0 girin.");
                            no=scanner.nextInt();
                            if (no == 0)
                                break;
                            secilenUrun=sebze.urunGetir(no);
                            if(secilenUrun==null){
                               System.out.println("Gecrsiz no!");
                               break;
                            }
                            System.out.println("Kac adet almak istiyorsunuz?");
                            adet=scanner.nextInt();                       
                            if(sepet.urunEkle(secilenUrun,adet)){
                                System.out.println(no+" nolu urunden "+adet+" adet sepete eklendi");
                                break;
                            }
                            break;
                        case 3:
                            deterjan.urunleriGoster();
                            System.out.println("sepete eklemek icin önce ürün nosunu sonra adedi tuslayın iptal etmek icin 0 girin.");
                            no=scanner.nextInt();
                            if (no == 0)
                                break;
                            secilenUrun=deterjan.urunGetir(no);
                            if(secilenUrun==null){
                               System.out.println("Gecrsiz no!");
                               break;
                            }
                            System.out.println("Kac adet almak istiyorsunuz?");
                            adet=scanner.nextInt();                       
                            if(sepet.urunEkle(secilenUrun,adet)){
                                System.out.println(no+" nolu urunden "+adet+" adet sepete eklendi");
                                break;
                            }                               
                            break;  
                        default:
                            System.out.println("Geçersiz kategori seçimi!");
                            break;
                        }
                    break;
                case 2:
                   sepet.sepetiGoster();
                   break;
                   
                case 3:
                    if(sepet.sepetiGoster()){
                        System.out.println("Silmek istediginiz urun satiri nosunu giriniz:");
                        int sil=scanner.nextInt();
                        sepet.urunSil(sil);
                    }
                    break;
                    
                case 4:
                    System.out.println("\n----SEPETINIZ----");
                    if(sepet.sepetiGoster()){
                        System.out.println("\nToplam sepet tutarı="+sepet.topTutar()+"TL");
                        System.out.println("Alisverisiniz tamamlandi. Iyi gunler!");
                        return; 
                    }
                    break;
                    
                default:
                    System.out.println("Geçersiz islem seçimi!");
                    break;
            }       
        }
    }
}
