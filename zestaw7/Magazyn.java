import java.util.ArrayList;

public class Magazyn {
    private ArrayList<Produkt> produkty;
    private int ilosc;

    public ArrayList<Produkt> getProdukty() {
        return produkty;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setProdukty(ArrayList<Produkt> produkty) {
        if(produkty == null) {
            throw new IllegalArgumentException("Argument is null");
        }
        this.produkty = produkty;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

    public Magazyn(ArrayList<Produkt> produkty, int ilosc) {
        this.produkty = produkty;
        this.ilosc = ilosc;
    }
    public void wyswietlAsortyment() {
        for(int i = 0; i < produkty.size(); i++) {
            System.out.println(produkty.get(i).getNazwa());
        }
    }
}
