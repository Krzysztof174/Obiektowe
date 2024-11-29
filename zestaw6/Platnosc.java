public class Platnosc {
    double kwota;
    String statusPlatnosci;

    public Platnosc(double kwota, String statusPlatnosci) {
        this.kwota = 0;
        this.statusPlatnosci = statusPlatnosci;
    }
    public void zaplac(double kwota, Zamowienie zamowiene) {
        this.kwota += kwota;
        if(zamowiene.koszykZakupowy.obliczCalkowitaWartosc() <= this.kwota) {
            statusPlatnosci = "Oplacone";
        }
    }
}
