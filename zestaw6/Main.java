import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // 1
        Produkt bulka = new Produkt("bulka", 1.00, 5);
        Produkt paczek = new Produkt("paczek", 3.00, 10);
        bulka.dodajDoMagazynu(15);
        bulka.usunZMagazynu(5);
        bulka.wyswietlInformacje();
        System.out.println();
        // 2
        KoszykZakupowy koszyk = new KoszykZakupowy(new ArrayList<Produkt>());
        koszyk.dodajProdukt(bulka);
        koszyk.dodajProdukt(bulka);
        koszyk.dodajProdukt(paczek);
        koszyk.wyswietlZawartoscKoszyka();
        System.out.println("Wartosc: " + koszyk.obliczCalkowitaWartosc());
        System.out.println();
        // 3
        Zamowienie zamowienie = new Zamowienie(koszyk, "Zapisywanie");
        zamowienie.ustawStatusZamowienia("Oczekuje na platnosc");
        zamowienie.wyswietlZamowienie();
        System.out.println();
        // 4
        Klient klient = new Klient("Jedrzej", "Wisniewski", new ArrayList<Zamowienie>());
        klient.dodajZamowienie(zamowienie);
        klient.wyswietlHistorieZamowien();
        klient.obliczLacznyKosztZamowien();
        System.out.println();
        // 5
        Sklep sklep = new Sklep(new ArrayList<Produkt>());
        sklep.dodajProdukt(bulka);
        sklep.dodajProdukt(paczek);
        sklep.wyswietlOferty();
        koszyk.dodajProdukt(sklep.wyszukajProduktu("paczek"));
        koszyk.wyswietlZawartoscKoszyka();
        System.out.println();
        // 6
        zamowienie.platnosc.zaplac(50, zamowienie);
        zamowienie.finalizujZamowienie();
        zamowienie.zwrocProdukt(paczek, 2);
        zamowienie.wyswietlZamowienie();
    }
}