void main() {
    long startTime = System.nanoTime();
    funkcjaPrzyklad();
    long stopTime = System.nanoTime();
    long czas = stopTime - startTime;
    System.out.println("Funkcja przykładowa przed optymalizacją: ");
    System.out.println("Czas wykonania w nanosekundach: " + czas);
    System.out.println("Czas wykonania w sekundach: " + (double) czas/1_000_000_000);

    startTime = System.nanoTime();
    funkcjaPrzykladZoptymalizowana();
    stopTime = System.nanoTime();
    czas = stopTime - startTime;
    System.out.println("\nFunkcja przykładowa po optymalizacji: ");
    System.out.println("Czas wykonania w nanosekundach: " + czas);
    System.out.println("Czas wykonania w sekundach: " + (double) czas/1_000_000_000);
}

public static void funkcjaPrzyklad() {
    String slowo = "";
    for (int i = 0; i < 100000; i++) {
        slowo = slowo + "a";
    }
}

public static void funkcjaPrzykladZoptymalizowana() {
    StringBuilder slowo = new StringBuilder();
    slowo.repeat("a", 100000);
}

// Zoptymalizuj poniższą funkcję, porównaj czas wykonania przed i po optymalizacji
public static boolean zad1(int argument) {
    boolean flaga = false;
    for (int i = 0; i < 5; i++) {
        int[] T = new int[] {4, 15, -2, 9, 202};
        if (T[i] == argument) {
            flaga = true;
        }
    }
    return flaga;
}

// Zoptymalizuj poniższą funkcję, porównaj czas wykonania przed i po optymalizacji
public static void zad2() {
    double[] tablica = new double[10000];
    Arrays.setAll(tablica, i -> i + 1);

    for (int i = 0; i < 10000; i++) {
        double j = Math.pow(4, 3);
        tablica[i] = j * tablica[i];
    }
}

// Zoptymalizuj poniższą funkcję, porównaj czas wykonania przed i po optymalizacji
public static int zad3() {
    int[] tab = new int[1000];
    int i, j, szukana = 20, indeksSzukanej = -1;

    Random random = new Random();
    for (i = 0; i < tab.length; i++) {
        tab[i] = random.nextInt(255);
    }

    for (i = 0; i < tab.length; i++) {
        if (tab[i] == szukana) {
            indeksSzukanej = i;
        }
    }

    return indeksSzukanej;
}

// Zoptymalizuj poniższą funkcję, porównaj czas wykonania przed i po optymalizacji
public static void zad4() {
    Integer suma = 0;
    for (int i = 0; i < 1000000; i++) {
        suma += i;
    }
}

// Zoptymalizuj poniższą funkcję, porównaj czas wykonania przed i po optymalizacji
public static void zad5() {
    List<String> userIds = new ArrayList<>();
    for (int i = 0; i < 100_000; i++) {
        userIds.add("user" + (i+1));
    }
    if (userIds.contains("user123")) {
        System.out.println("OK");
    }
}

// Zoptymalizuj poniższą funkcję, porównaj czas wykonania przed i po optymalizacji
public static boolean zad6(String kodPocztowy) {
    return kodPocztowy.matches("\\d{2}-\\d{3}");
}