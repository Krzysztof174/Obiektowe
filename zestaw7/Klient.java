import java.util.ArrayList;
import java.util.Objects;

public class Klient {
    private String imie;
    private String nazwisko;
    private ArrayList<Zamowienie> listaZamowien;
    private Adres adres;

    public void setImie(String imie) {
        if(imie == null) {
            throw new IllegalArgumentException("Argument is null");
        }
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        if(nazwisko == null) {
            throw new IllegalArgumentException("Argument is null");
        }
        this.nazwisko = nazwisko;
    }

    public void setListaZamowien(ArrayList<Zamowienie> listaZamowien) {
        if(listaZamowien == null) {
            throw new IllegalArgumentException("Argument is null");
        }
        this.listaZamowien = listaZamowien;
    }

    public void setAdres(Adres adres) {
        if(adres == null) {
            throw new IllegalArgumentException("Argument is null");
        }
        this.adres = adres;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public ArrayList<Zamowienie> getListaZamowien() {
        return listaZamowien;
    }

    public Adres getAdres() {
        return adres;
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, adres);
    }
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
            suma += listaZamowien.get(i).getKoszykZakupowy().obliczCalkowitaWartosc();
        }
        return suma;
    }
}
