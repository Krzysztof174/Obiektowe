public class Zamowienie {
    KoszykZakupowy koszykZakupowy;
    String statusZamowienia;
    Platnosc platnosc;

    public Zamowienie(KoszykZakupowy koszykZakupowy, String statusZamowienia) {
        this.koszykZakupowy = koszykZakupowy;
        this.statusZamowienia = statusZamowienia;
        this.platnosc = new Platnosc(koszykZakupowy.obliczCalkowitaWartosc(), "Oczekuje na zaplate");
    }
    public void ustawStatusZamowienia(String statusZamowienia) {
        this.statusZamowienia = statusZamowienia;
    }
    public void wyswietlZamowienie() {
        System.out.println(statusZamowienia);
        for(int i = 0; i < koszykZakupowy.produkty.size(); i++) {
            System.out.println(koszykZakupowy.produkty.get(i).nazwa);
        }
    }
    public void finalizujZamowienie() {
        if(platnosc.statusPlatnosci.equals("Oplacone")) {
            this.statusZamowienia = "Gotowe do wysylki";
        }
    }
    public void zwrocProdukt(Produkt produkt, int ilosc) {
        for(int i = 0; i < ilosc; i++) {
            koszykZakupowy.produkty.remove(produkt);
            produkt.dodajDoMagazynu(1);
        }
    }
}
