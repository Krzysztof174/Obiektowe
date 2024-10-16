import java.util.Random;
public class Main {
    public static int[] generujTablice(int n, int minWartosc, int maxWartosc) {
        Random random = new Random();
        int[] tablica = new int[n];
        for (int i = 0; i < n; i++) {
            tablica[i] = random.nextInt(maxWartosc - minWartosc + 1) + minWartosc;
        }
        return tablica;
    }
    public static void wypiszTablice(int[][] tab, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i < tab.length && j < tab[i].length) {
                    System.out.printf("%-5d", tab[i][j]);
                } else {
                    System.out.printf("%-5s", "");
                }
            }
            System.out.println();
        }
    }
    public static void ileNieparzystych(int[] tab) {
        int ile = 0;
        for (int i = 0; i < tab.length; i++) {
            if(tab[i] % 2 != 0) {
                ile++;
            }
        }
        System.out.println("ileNieparzystych : " + ile);
    }
    public static void ileParzystych(int[] tab) {
        int ile = 0;
        for (int i = 0; i < tab.length; i++) {
            if(tab[i] % 2 == 0) {
                ile++;
            }
        }
        System.out.println("ileParzystych : " + ile);
    }
    public static void ileDodatnich(int[] tab) {
        int ile = 0;
        for (int i = 0; i < tab.length; i++) {
            if(tab[i] > 0) {
                ile++;
            }
        }
        System.out.println("ileDodatnich : " + ile);
    }
    public static void ileUjemnych(int[] tab) {
        int ile = 0;
        for (int i = 0; i < tab.length; i++) {
            if(tab[i] < 0) {
                ile++;
            }
        }
        System.out.println("ileUjemnych : " + ile);
    }
    public static void ileZerowych(int[] tab) {
        int ile = 0;
        for (int i = 0; i < tab.length; i++) {
            if(tab[i] == 0) {
                ile++;
            }
        }
        System.out.println("ileZerowych : " + ile);
    }
    public static void ileMaxymalnych(int[] tab) {
        int ile = 0;
        int max = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if(tab[i] > max) {
                max = tab[i];
            }
        }
        for (int i = 0; i < tab.length; i++) {
            if(tab[i] == max) {
                ile++;
            }
        }
        System.out.println("ileMaxymalnych : " + ile);
    }
    public static void ileMinimalnych(int[] tab) {
        int ile = 0;
        int min = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if(tab[i] < min) {
                min = tab[i];
            }
        }
        for (int i = 0; i < tab.length; i++) {
            if(tab[i] == min) {
                ile++;
            }
        }
        System.out.println("ileMinimalnych : " + ile);
    }
    public static void ileUnikalnych(int[] tab) {
        int ile = 0;
        boolean powtorzony = false;
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                if(tab[i] == tab[j] && i != j) {
                    powtorzony = true;
                }
            }
            if(!powtorzony) {
                ile++;
            }
            powtorzony = false;
        }
        System.out.println("ileUnikalnych : " + ile);
    }
    public static void sumaDodatnich(int[] tab) {
        int suma = 0;
        for (int i = 0; i < tab.length; i++) {
            if(tab[i] > 0) {
                suma += tab[i];
            }
        }
        System.out.println("sumaDodatnich : " + suma);
    }
    public static void sumaUjemnych(int[] tab) {
        int suma = 0;
        for (int i = 0; i < tab.length; i++) {
            if(tab[i] < 0) {
                suma += tab[i];
            }
        }
        System.out.println("sumaUjemnych : " + suma);
    }
    public static void sumaOdwrotnosci(int[] tab) {
        int suma = 0;
        for (int i = 0; i < tab.length; i++) {
            suma += 1/tab[i];
        }
        System.out.println("sumaOdwrotnosci : " + suma);
    }
    public static void sredniaArytmetyczna(int[] tab) {
        int suma = 0;
        for (int i = 0; i < tab.length; i++) {
            suma += tab[i];
        }
        suma = suma / tab.length;
        System.out.println("sredniaArytmetyczna : " + suma);
    }
    public static void sredniaGeometryczna(int[] tab) {
        double suma = 1;
        for (int i = 0; i < tab.length; i++) {
            if(tab[i] == 0) {
                suma = suma*tab[i];
            }
        }
        suma = Math.pow(suma, 1.0/tab.length);
        System.out.println("sredniaGeometryczna : " + suma);
    }
    public static void sredniaHarmoniczna(int[] tab) {
        double suma = 0;
        for (int i = 0; i < tab.length; i++) {
            suma += (double) 1/tab[i];
        }
        suma = tab.length / suma;
        System.out.println("sredniaHarmoniczna : " + suma);
    }
    public static double[] funkcjaLiniowa(int[] tab, double a, double b) {
        double[] tablica = new double[tab.length];
        for (int i = 0; i < tab.length; i++) {
            tablica[i] = (double) tab[i] * a + b;
        }
        return tablica;
    }
    public static double[] funkcjaKwadratowa(int[] tab, double a, double b, double c) {
        double[] tablica = new double[tab.length];
        for (int i = 0; i < tab.length; i++) {
            tablica[i] = (double) tab[i] * Math.pow(a, 2) + b*tab[i] + c;
        }
        return tablica;
    }
    public static double[] funkcjaWykladnicza(int[] tab, double a) {
        double[] tablica = new double[tab.length];
        for (int i = 0; i < tab.length; i++) {
            tablica[i] = Math.pow(tab[i], a);
        }
        return tablica;
    }
    public static double[] funkcjaSignum(int[] tab) {
        double[] tablica = new double[tab.length];
        for (int i = 0; i < tab.length; i++) {
            if(tab[i] > 0) {
                tablica[i] = 1;
                continue;
            }
            else if (tab[i] < 0) {
                tablica[i] = -1;
                continue;
            }
            tablica[i] = 0;
        }
        return tablica;
    }
    public static void najdluzszyCiagDodatnich(int[] tab) {
        int ciagStart = 0;
        int ciagKoniec = 0;
        int i = 0;
        int[] najdluzszyIndexy = new int[2];
        while(i < tab.length) {
            if(tab[i] > 0) {
                ciagKoniec++;
                i++;
                if(ciagKoniec - ciagStart > najdluzszyIndexy[1] - najdluzszyIndexy[0]) {
                    najdluzszyIndexy[0] = ciagStart;
                    najdluzszyIndexy[1] = ciagKoniec;
                }
                continue;
            }
            i++;
            ciagStart = i;
        }
    }

    public static void main(String[] args) {
        // zad 1
        int n = 10;
        int minWartosc = 10;
        int maxWartosc = 20;
        int[] losowaTablica = generujTablice(n, minWartosc, maxWartosc);
        for(int i = 0; i < losowaTablica.length; i++) {
            System.out.print(losowaTablica[i] + " ");
        }
        System.out.println();
        // zad 2
        int[][] tablica = new int[5][6];
        for(int i = 0; i < tablica.length; i++) {
            for(int j = 0; j < tablica[i].length - 1; j++) {
                tablica[i][j] = -i*10+j*10;
            }
        }
        wypiszTablice(tablica, 5, 6);
        // zad 3
        ileNieparzystych(losowaTablica);
        ileParzystych(losowaTablica);
        ileDodatnich(losowaTablica);
        ileUjemnych(losowaTablica);
        ileZerowych(losowaTablica);
        ileMaxymalnych(losowaTablica);
        ileMinimalnych(losowaTablica);
        ileUnikalnych(losowaTablica);
        // zad 4
        sumaDodatnich(losowaTablica);
        sumaUjemnych(losowaTablica);
        sumaOdwrotnosci(losowaTablica);
        sredniaArytmetyczna(losowaTablica);
        sredniaGeometryczna(losowaTablica);
        sredniaHarmoniczna(losowaTablica);
        // zad 5
        funkcjaLiniowa(losowaTablica, 4, 2);
        funkcjaKwadratowa(losowaTablica, 4, 2, 1);
        funkcjaWykladnicza(losowaTablica, 4);
        funkcjaSignum(losowaTablica);
        // zad 6

    }
}