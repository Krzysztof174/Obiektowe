import java.util.ArrayList;
import java.time.LocalDate;

public class Sklep {
    ArrayList<Produkt> produkty;
    String nazwaSklepu;
    LocalDate dataPowstania;
    Magazyn magazynSklepu;

    public Sklep(ArrayList<Produkt> produkty, String nazwaSklepu, LocalDate dataPowstania, Magazyn magazynSklepu) throws Exception {
        this.produkty = produkty;
        this.nazwaSklepu = nazwaSklepu;
        if(dataPowstania.isAfter(LocalDate.now())) {
            throw new Exception("Niepoprawna data");
        }
        this.dataPowstania = dataPowstania;
        this.magazynSklepu = magazynSklepu;
    }
    public void dodajProdukt(Produkt produkt) {
        produkty.add(produkt);
    }
    public void wyswietlOferty() {
        for(int i = 0; i < produkty.size(); i++) {
            System.out.println(produkty.get(i).nazwa);
        }
    }
    public Produkt wyszukajProduktu(String nazwa) {
        for(int i = 0; i < produkty.size(); i++) {
            if(produkty.get(i).nazwa.equals(nazwa)) {
                return produkty.get(i);
            }
        }
        return null;
    }
    public void zakupy(Produkt produkt, int ilosc, KoszykZakupowy koszyk) {
        for(int i = 0; i < ilosc; i++) {
            koszyk.dodajProdukt(produkt);
        }
    }

}
