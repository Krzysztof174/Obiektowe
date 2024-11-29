public class Adres {
    String ulica;
    int numerDomu;
    int numerMieszkania;
    String miasto;
    String kodPocztowy;

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
