import java.util.ArrayList;

public class Magazyn {
    ArrayList<Produkt> produkty;
    int ilosc;

    public Magazyn(ArrayList<Produkt> produkty, int ilosc) {
        this.produkty = produkty;
        this.ilosc = ilosc;
    }
    public void wyswietlAsortyment() {
        for(int i = 0; i < produkty.size(); i++) {
            System.out.println(produkty.get(i).nazwa);
        }
    }
}
