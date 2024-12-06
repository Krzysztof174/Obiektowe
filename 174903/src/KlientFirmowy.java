import java.util.ArrayList;

public class KlientFirmowy extends Klient {
    private final static String NIP = "123";
    private final static String REGON = "456";
    public KlientFirmowy(String imie, String nazwisko, ArrayList<Zamowienie> listaZamowien, Adres adres) {
        super(imie, nazwisko, listaZamowien, adres);
    }
}
