import java.util.Objects;

interface PrzykladowyProdukt {
    public int hashCode();
    public void wyswietlInformacje();
    public void dodajDoMagazynu(int ilosc);
    public void usunZMagazynu(int ilosc);
    default String getString() {
        return "Łańcuch domyślny";
    }
}

public class Produkt implements PrzykladowyProdukt {
    private String nazwa;
    private double cena;
    private int iloscNaMagazynie;

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        if(nazwa == null) {
            throw new IllegalArgumentException("Argument is null");
        }
        this.nazwa = nazwa;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public int getIloscNaMagazynie() {
        return iloscNaMagazynie;
    }

    public void setIloscNaMagazynie(int iloscNaMagazynie) {
        this.iloscNaMagazynie = iloscNaMagazynie;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazwa, cena);
    }
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
