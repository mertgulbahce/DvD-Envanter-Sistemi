package proje2;

public class Node
{
    private DVD DVD;
    private Node sonraki;
    private Node onceki;
 
    
    public Node()
    {
        this.DVD=null;
        this.onceki=null;
        this.sonraki=null;
    }
    public Node(DVD DVD, Node sonraki,Node onceki)
    {
        this.DVD=DVD;
        this.sonraki=sonraki;
        this.onceki=onceki;
    }

    public DVD getDVD() {
        return DVD;
    }

    public void setDVD(DVD DVD) 
    {
        this.DVD = DVD;
    }

    public Node getOnceki() 
    {
        return onceki;
    }

    public void setOnceki(Node onceki)
    {
        this.onceki = onceki;
    }

    public Node getSonraki() 
    {
        return sonraki;
    }

    public void setSonraki(Node sonraki)
    {
        this.sonraki = sonraki;
    }
}
