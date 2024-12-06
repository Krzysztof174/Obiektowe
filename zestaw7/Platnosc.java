import java.util.Objects;

public class Platnosc {
    @Override
    public int hashCode() {
        return Objects.hash(kwota, statusPlatnosci);
    }

    public double getKwota() {
        return kwota;
    }

    public void setKwota(double kwota) {
        this.kwota = kwota;
    }

    public String getStatusPlatnosci() {
        return statusPlatnosci;
    }

    public void setStatusPlatnosci(String statusPlatnosci) {
        if(statusPlatnosci == null) {
            throw new IllegalArgumentException("Argument is null");
        }
        this.statusPlatnosci = statusPlatnosci;
    }

    private double kwota;
    private String statusPlatnosci;

    public Platnosc(double kwota, String statusPlatnosci) {
        this.kwota = 0;
        this.statusPlatnosci = statusPlatnosci;
    }
    public void zaplac(double kwota, Zamowienie zamowiene) {
        this.kwota += kwota;
        if(zamowiene.getKoszykZakupowy().obliczCalkowitaWartosc() <= this.kwota) {
            statusPlatnosci = "Oplacone";
        }
    }
}
