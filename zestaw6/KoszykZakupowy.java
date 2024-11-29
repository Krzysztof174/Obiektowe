import java.util.ArrayList;

public class KoszykZakupowy {
    ArrayList<Produkt> produkty = new ArrayList<Produkt>();

    public KoszykZakupowy(ArrayList<Produkt> produkty) {
        this.produkty = produkty;
    }
    public void dodajProdukt(Produkt produkt) {
        if(produkt.iloscNaMagazynie >= 0) {
            produkty.add(produkt);
            produkt.usunZMagazynu(1);
        }
    }
    public void wyswietlZawartoscKoszyka() {
        System.out.println("");
        int ilosc = 0;
        ArrayList<String> wyswietlone = new ArrayList<String>();
        boolean pomin = false;

        for(int i = 0; i < produkty.size(); i++) {
            for(int z = 0; z < wyswietlone.size(); z++) {
                if(produkty.get(i).nazwa.equals(wyswietlone.get(z))) {
                    pomin = true;
                    break;
                }
            }
            if(pomin) {
                pomin = false;
                continue;
            }

            for(int j = 0; j < produkty.size(); j++) {
                if(produkty.get(i).nazwa.equals(produkty.get(j).nazwa)) {
                    ilosc++;
                }
            }
            wyswietlone.add(produkty.get(i).nazwa);
            System.out.println(produkty.get(i).nazwa + ": " + ilosc);
            ilosc = 0;
        }
    }
    public double obliczCalkowitaWartosc() {
        double suma = 0;
        for(int i = 0; i < produkty.size(); i++) {
            suma += produkty.get(i).cena;
        }
        return suma;
    }
}
