import java.util.ArrayList;

public class Klient {
    String imie;
    String nazwisko;
    ArrayList<Zamowienie> listaZamowien;
    Adres adres;

    public Klient(String imie, String nazwisko, ArrayList<Zamowienie> listaZamowien, Adres adres) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.listaZamowien = listaZamowien;
        this.adres = adres;
    }
    public void dodajZamowienie(Zamowienie zamowienie) {
        listaZamowien.add(zamowienie);
    }
    public void wyswietlHistorieZamowien() {
        for(int i = 0; i < listaZamowien.size(); i++) {
            listaZamowien.get(i).wyswietlZamowienie();
        }
    }
    public double obliczLacznyKosztZamowien() {
        double suma = 0;
        for(int i = 0; i < listaZamowien.size(); i++) {
            suma += listaZamowien.get(i).koszykZakupowy.obliczCalkowitaWartosc();
        }
        return suma;
    }
}
