import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Produkt bulka = new Produkt("bulka", 1.00, 5);
        Produkt paczek = new Produkt("paczek", 3.00, 10);
        bulka.dodajDoMagazynu(15);
        bulka.usunZMagazynu(5);
        bulka.wyswietlInformacje();
        System.out.println();

        KoszykZakupowy koszyk = new KoszykZakupowy(new ArrayList<Produkt>());
        koszyk.dodajProdukt(bulka);
        koszyk.dodajProdukt(bulka);
        koszyk.dodajProdukt(paczek);
        koszyk.wyswietlZawartoscKoszyka();
        System.out.println("Wartosc: " + koszyk.obliczCalkowitaWartosc());
        System.out.println();

        Zamowienie zamowienie = new Zamowienie(koszyk, "Zapisywanie");
        zamowienie.ustawStatusZamowienia("Oczekuje na platnosc");
        zamowienie.wyswietlZamowienie();
        System.out.println();

        Klient klient = new Klient("Jedrzej", "Wisniewski", new ArrayList<Zamowienie>(), new Adres("Bukowa", 6, "Olsztyn", "25-500"));
        klient.dodajZamowienie(zamowienie);
        klient.wyswietlHistorieZamowien();
        klient.obliczLacznyKosztZamowien();
        System.out.println();

        Sklep sklep = new Sklep(new ArrayList<Produkt>(), "Super", LocalDate.now(), new Magazyn(new ArrayList<Produkt>(), 0));
        sklep.dodajProdukt(bulka);
        sklep.dodajProdukt(paczek);
        sklep.wyswietlOferty();
        koszyk.dodajProdukt(sklep.wyszukajProduktu("paczek"));
        koszyk.wyswietlZawartoscKoszyka();
        System.out.println();

        zamowienie.getPlatnosc().zaplac(50, zamowienie);
        zamowienie.finalizujZamowienie();
        zamowienie.zwrocProdukt(paczek, 2);
        zamowienie.wyswietlZamowienie();
    }
}