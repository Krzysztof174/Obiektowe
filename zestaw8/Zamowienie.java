interface PrzykladoweZamowienie {
    public void ustawStatusZamowienia(String statusZamowienia);
    public void wyswietlZamowienie();
    public void finalizujZamowienie();
    public void zwrocProdukt(Produkt produkt, int ilosc);
    default String getString() {
        return "Łańcuch domyślny";
    }
}

public class Zamowienie implements PrzykladoweZamowienie {
    private KoszykZakupowy koszykZakupowy;
    private String statusZamowienia;
    private Platnosc platnosc;

    public Zamowienie(KoszykZakupowy koszykZakupowy, String statusZamowienia) {
        this.koszykZakupowy = koszykZakupowy;
        this.statusZamowienia = statusZamowienia;
        this.platnosc = new Platnosc(koszykZakupowy.obliczCalkowitaWartosc(), "Oczekuje na zaplate");
    }

    public KoszykZakupowy getKoszykZakupowy() {
        return koszykZakupowy;
    }

    public void setKoszykZakupowy(KoszykZakupowy koszykZakupowy) {
        if(koszykZakupowy == null) {
            throw new IllegalArgumentException("Argument is null");
        }
        this.koszykZakupowy = koszykZakupowy;
    }

    public String getStatusZamowienia() {
        return statusZamowienia;
    }

    public void setStatusZamowienia(String statusZamowienia) {
        if(statusZamowienia == null) {
            throw new IllegalArgumentException("Argument is null");
        }
        this.statusZamowienia = statusZamowienia;
    }

    public Platnosc getPlatnosc() {
        return platnosc;
    }

    public void setPlatnosc(Platnosc platnosc) {
        if(platnosc == null) {
            throw new IllegalArgumentException("Argument is null");
        }
        this.platnosc = platnosc;
    }

    public void ustawStatusZamowienia(String statusZamowienia) {
        this.statusZamowienia = statusZamowienia;
    }
    public void wyswietlZamowienie() {
        System.out.println(statusZamowienia);
        for(int i = 0; i < koszykZakupowy.getProdukty().size(); i++) {
            System.out.println(koszykZakupowy.getProdukty().get(i).getNazwa());
        }
    }
    public void finalizujZamowienie() {
        if(platnosc.getStatusPlatnosci().equals("Oplacone")) {
            this.statusZamowienia = "Gotowe do wysylki";
        }
    }
    public void zwrocProdukt(Produkt produkt, int ilosc) {
        for(int i = 0; i < ilosc; i++) {
            koszykZakupowy.getProdukty().remove(produkt);
            koszykZakupowy.setIlosc(koszykZakupowy.getProdukty().size());
            produkt.dodajDoMagazynu(1);
        }
    }
}
