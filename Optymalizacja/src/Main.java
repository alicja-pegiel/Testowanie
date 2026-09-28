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
