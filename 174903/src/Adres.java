interface PrzykladowyAdres {
    public void pokaz();
    public boolean przed(String kodPocztowy);
    default String getString() {
        return "Łańcuch domyślny";
    }
}

public class Adres implements PrzykladowyAdres {
    private String ulica;
    private int numerDomu;
    private int numerMieszkania;
    private String miasto;
    private String kodPocztowy;

    public void setNumerMieszkania(int numerMieszkania) {
        this.numerMieszkania = numerMieszkania;
    }

    public void setUlica(String ulica) {
        if(ulica == null) {
            throw new IllegalArgumentException("Argument is null");
        }
        this.ulica = ulica;
    }

    public void setNumerDomu(int numerDomu) {
        this.numerDomu = numerDomu;
    }

    public void setMiasto(String miasto) {
        if(miasto == null) {
            throw new IllegalArgumentException("Argument is null");
        }
        this.miasto = miasto;
    }

    public void setKodPocztowy(String kodPocztowy) {
        if(kodPocztowy == null) {
            throw new IllegalArgumentException("Argument is null");
        }
        this.kodPocztowy = kodPocztowy;
    }

    public String getUlica() {
        return ulica;
    }

    public int getNumerDomu() {
        return numerDomu;
    }

    public int getNumerMieszkania() {
        return numerMieszkania;
    }

    public String getMiasto() {
        return miasto;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public Adres(String ulica, int numerDomu, int numerMieszkania, String miasto, String kodPocztowy) {
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.numerMieszkania = numerMieszkania;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
    }
    public Adres(String ulica, int numerDomu, String miasto, String kodPocztowy) {
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
    }
    public void pokaz() {
        System.out.println(this.kodPocztowy + this.miasto);
        System.out.println(this.ulica + " " + this.numerDomu + "/" + this.numerMieszkania);
    }
    public boolean przed(String kodPocztowy) {
        if(this.kodPocztowy.equals(kodPocztowy)) {
            return true;
        }
        return false;
    }

}
