package proje2;

import java.util.ArrayList;

public class DVD 
{
    public String adSoyad;
    public String baslik;
    public int cikisTarihi;
    public int fiyat;
    public ArrayList<String> sarkilar;
    
    public DVD()
    {
        this.adSoyad="";
        this.baslik="";
        this.cikisTarihi=0;
        this.fiyat=0;
        this.sarkilar=null;
        
    }
    
    public DVD(String adSoyad,String baslik,int cikisTarihi,int fiyat,ArrayList sarkilar)
    {
        this.adSoyad=adSoyad;
        this.baslik=baslik;
        this.cikisTarihi=cikisTarihi;
        this.fiyat=fiyat;
        this.sarkilar=sarkilar;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public int getCikisTarihi() {
        return cikisTarihi;
    }

    public void setCikisTarihi(int cikisTarihi) {
        this.cikisTarihi = cikisTarihi;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public String getSarkilar() 
    {
        int sarkisayisi= sarkilar.size();
        String cikti = "";
        cikti+= sarkilar.get(0);
        for(int i=1;i<sarkisayisi;i++)
        {
            cikti+= ","+sarkilar.get(i);
        }
        return cikti;
    }

    public void setSarkilar(ArrayList sarkilar) {
        this.sarkilar = sarkilar;
    }
    
    @Override
    public String toString()
    {
        return getAdSoyad()+", "+getBaslik()+", "+getCikisTarihi()+", "
                +getFiyat()+", "+getSarkilar();
    }
    
    
}
