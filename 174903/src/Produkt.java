public class Produkt {
    String nazwa;
    double cena;
    int iloscNaMagazynie;

    public Produkt(String nazwa, double cena, int iloscNaMagazynie) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.iloscNaMagazynie = iloscNaMagazynie;
    }
    public void wyswietlInformacje() {
        System.out.println("Nazwa: " + nazwa);
        System.out.println("Cena: " + cena);
        System.out.println("Ilosc: " + iloscNaMagazynie);
    }
    public void dodajDoMagazynu(int ilosc) {
        iloscNaMagazynie += ilosc;
    }
    public void usunZMagazynu(int ilosc) {
        if(iloscNaMagazynie >= ilosc) {
            this.iloscNaMagazynie -= ilosc;
        }
    }
}
