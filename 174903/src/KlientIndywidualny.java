import java.util.ArrayList;

public class KlientIndywidualny extends Klient {
    private final static String PESEL = "0123456789";
    public KlientIndywidualny(String imie, String nazwisko, ArrayList<Zamowienie> listaZamowien, Adres adres) {
        super(imie, nazwisko, listaZamowien, adres);
    }
}
