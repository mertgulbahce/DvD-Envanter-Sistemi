package proje2;

import javax.swing.JTextArea;

public class DoublyLinkedList

{
    public static Node head;
    public static Node tail;
    public static int size;
    
    
    public  DoublyLinkedList()
    {
        this.head=null;
        this.tail=null;
        this.size=0;
    }
    
    public boolean bosMu()
    {
        return (head==null);
    }
    
    public int getSize()
    {
        return this.size;
    }
    
    
    public static void elemanEkle(DVD DVD)/*Listeye yeni bir eleman eklemek
            için oluşturulmuş bir metot*/
    {
        Node yeniDugum = new Node(DVD,null,null);/*listeye eklenecek 
        eleman için bir düğüm oluşturulur*/
        Node Dugum1,Dugum2; /*listeye yeni düğümü eklemek için kullanılacak
        yardımıcı düğümler*/
        boolean tercih = false; /*yeni düğümü eklemek için while döngüsüne
        girerse en son seçeneğe( if(!tercih) denkliğine) girmemesi için
        oluşturulmuş bir boolean değişkeni*/
        if(head==null)/*eğer liste boş ise*/
        {
            head=tail=yeniDugum;
        }
        else if(DVD.getAdSoyad().toUpperCase().
                compareTo(head.getDVD().getAdSoyad().toUpperCase())<=0)
        {
            yeniDugum.setSonraki(head);
            head.setOnceki(yeniDugum);
            head=yeniDugum;
        }
        else
        {
            Dugum1 = head;
            Dugum2 = head.getSonraki();
            while(Dugum2!=null)
            {
                if(DVD.getAdSoyad().toUpperCase().
                   compareTo(Dugum1.getDVD().getAdSoyad().toUpperCase())>=0
                   && DVD.getAdSoyad().toUpperCase().
                   compareTo(Dugum2.getDVD().getAdSoyad().toUpperCase())<=0)
                {
                    Dugum1.setSonraki(yeniDugum);
                    yeniDugum.setOnceki(Dugum1);
                    yeniDugum.setSonraki(Dugum2);
                    Dugum2.setOnceki(yeniDugum);
                    tercih = true;
                    break;
                    
                }
                else
                {
                    Dugum1 = Dugum2;
                    Dugum2 = Dugum2.getSonraki();
                }
            }
            if(!tercih)
            {
                Dugum1.setSonraki(yeniDugum);
                yeniDugum.setOnceki(Dugum1);
            }
        }
        size++;
    }
    
    public static void elemanSil(String adSoyad,String baslik)
    {
        adSoyad = adSoyad.toUpperCase()+baslik.toUpperCase();
        Node basla = head;
        sonElemanBul();
        while(basla!=null)
        {
            if(adSoyad.equals(basla.getDVD().getAdSoyad().toUpperCase()))
            {
                Node gecici = basla;
                if(basla==head)
                {
                    head=head.getSonraki();
                    return;
                }
                else if(basla==tail)
                {
                    tail=tail.getOnceki();
                    tail.setSonraki(null);
                    return;
                }
                else
                {
                    gecici.getSonraki().setOnceki(gecici.getOnceki());
                    gecici.getOnceki().setSonraki(gecici.getSonraki());
                    return;
                }
                
            }
            size--;
            basla = basla.getSonraki();
            
        }
    }
    
    public static void sonElemanBul()/*Listenin sondaki elemanını bulmak için 
            oluşturulmuş bir metot*/
    {
        Node dugum = head;
        while(dugum.getSonraki()!=null)
        {
            dugum = dugum.getSonraki();
        }
        
        if(dugum.getSonraki()==null)
        {
            tail=dugum;
        }
    }
    
    public static void elemanCagir(JTextArea textarea,String adSoyad)/*girilen
            kişinin ad ve soyadına göre bilgilerini bulur.*/
    {
        adSoyad = adSoyad.toUpperCase();/*büyük küçük harf ayrımını engellemek
        için yapıldı.*/
        Node dugum = head;
        while(dugum!=null)
        {
            if(adSoyad.equals(dugum.getDVD().getAdSoyad().toUpperCase()))
            {
                textarea.setText(dugum.getDVD().toString());
                return;
            }
            dugum = dugum.getSonraki();
        }
        if(dugum==null)
        {
            textarea.setText("Bu kişi rehberde ekli değil!");
        }
    }
    
    public static void bastanYazdir(JTextArea textarea) /*Oluşturulan ilgili
            listenin elemanlarını A'dan Z'ye doğru sıralar.*/
    {

        Node dugum = head;
        textarea.setText(dugum.getDVD().toString());
        dugum = dugum.getSonraki();
        while(dugum!=null)
        {
            textarea.setText(textarea.getText()+"\n"
                    +dugum.getDVD().toString());
            dugum = dugum.getSonraki();
        }  
        
    }
    
    public static void sondanYazdir(JTextArea textarea)  /*Oluşturulan ilgili
            listenin elemanlarını Z'den A'ya doğru sıralar.*/
    { 
        sonElemanBul();
        
        Node dugum =tail;
        textarea.setText(dugum.getDVD().toString());
        dugum = dugum.getOnceki();
        while(dugum!=null)
        {
            textarea.setText(textarea.getText()+
                    "\n"+dugum.getDVD().toString());
            dugum = dugum.getOnceki();
        }
    }
    
    public static void ikibin(JTextArea textarea)
    
    {
        Node dugum = head;
        textarea.setText(dugum.getDVD().toString());
        dugum = dugum.getSonraki();
        while(dugum!=null)
        {
            if(dugum.getDVD().getCikisTarihi()>=2000)
            {
                textarea.setText(dugum.getDVD().toString());
                
            }
            dugum = dugum.getSonraki();
        }
       
    }
}
