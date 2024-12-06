import java.util.ArrayList;
import java.time.LocalDate;

public class Sklep {
    private ArrayList<Produkt> produkty;
    private String nazwaSklepu;
    private LocalDate dataPowstania;
    private Magazyn magazynSklepu;

    public ArrayList<Produkt> getProdukty() {
        return produkty;
    }

    public void setProdukty(ArrayList<Produkt> produkty) {
        if(produkty == null) {
            throw new IllegalArgumentException("Argument is null");
        }
        this.produkty = produkty;
    }

    public String getNazwaSklepu() {
        return nazwaSklepu;
    }

    public void setNazwaSklepu(String nazwaSklepu) {
        if(nazwaSklepu == null) {
            throw new IllegalArgumentException("Argument is null");
        }
        this.nazwaSklepu = nazwaSklepu;
    }

    public LocalDate getDataPowstania() {
        return dataPowstania;
    }

    public void setDataPowstania(LocalDate dataPowstania) {
        if(dataPowstania == null) {
            throw new IllegalArgumentException("Argument is null");
        }
        this.dataPowstania = dataPowstania;
    }

    public Magazyn getMagazynSklepu() {
        return magazynSklepu;
    }

    public void setMagazynSklepu(Magazyn magazynSklepu) {
        if(magazynSklepu == null) {
            throw new IllegalArgumentException("Argument is null");
        }
        this.magazynSklepu = magazynSklepu;
    }

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
            System.out.println(produkty.get(i).getNazwa());
        }
    }
    public Produkt wyszukajProduktu(String nazwa) {
        for(int i = 0; i < produkty.size(); i++) {
            if(produkty.get(i).getNazwa().equals(nazwa)) {
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
