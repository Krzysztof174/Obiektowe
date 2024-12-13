import java.util.ArrayList;

interface PrzykladowyKoszykZakupowy {
    public void dodajProdukt(Produkt produkt);
    public void wyswietlZawartoscKoszyka();
    public double obliczCalkowitaWartosc();
    default String getString() {
        return "Łańcuch domyślny";
    }
}

public class KoszykZakupowy implements PrzykladowyKoszykZakupowy {
    private ArrayList<Produkt> produkty = new ArrayList<Produkt>();
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

    public KoszykZakupowy(ArrayList<Produkt> produkty) {
        this.produkty = produkty;
        this.ilosc = produkty.size();
    }
    public void dodajProdukt(Produkt produkt) {
        if(produkt.getIloscNaMagazynie() >= 0) {
            produkty.add(produkt);
            produkt.usunZMagazynu(1);
            this.ilosc = produkty.size();
        }
    }
    public void wyswietlZawartoscKoszyka() {
        System.out.println("");
        int ilosc = 0;
        ArrayList<String> wyswietlone = new ArrayList<String>();
        boolean pomin = false;

        for(int i = 0; i < produkty.size(); i++) {
            for(int z = 0; z < wyswietlone.size(); z++) {
                if(produkty.get(i).getNazwa().equals(wyswietlone.get(z))) {
                    pomin = true;
                    break;
                }
            }
            if(pomin) {
                pomin = false;
                continue;
            }

            for(int j = 0; j < produkty.size(); j++) {
                if(produkty.get(i).getNazwa().equals(produkty.get(j).getNazwa())) {
                    ilosc++;
                }
            }
            wyswietlone.add(produkty.get(i).getNazwa());
            System.out.println(produkty.get(i).getNazwa() + ": " + ilosc);
            ilosc = 0;
        }
    }
    public double obliczCalkowitaWartosc() {
        double suma = 0;
        for(int i = 0; i < produkty.size(); i++) {
            suma += produkty.get(i).getCena();
        }
        return suma;
    }
}
