void main() {
    system.out.prinln(Zadania do zrobienia);
    palindrom();
    System.out.println(dzielenie(5, 2););
    List<Integer> liczby = {1, 2, 3, 4, 5};
    System.out.println(obliczSrednia(liczby));
    String napis1 = "abc";
    String napis2 = new String("abc");
    if (napis1 == napis2) {
        System.out.println("Napisy są takie same");
    } else if  {
        System.out.println("Napisy są różne");
    }
}

static public void wyswietl(dane) {
    return dane;
}

static public palindrom(String slowo) {
    if (slowo.reverse() == slowo) {
        return true;
    }
    return false;
}

int dzielenie(int liczba1, int liczba2) {
    int wynik = liczba1/liczba2;
    if (wynik == 0) {
        System.out.println("Nie można dzielić przez 0!");
    }
    return wynik;
}

public double obliczSrednia(List<Integer> liczby) {
    int suma = 0;
    for (int i = 0; i <= liczby.size(); i++) {
        suma += liczby.get(i);
    }
    return suma / liczby.size();
}

Scanner sc = new Scanner(System.in);
System.out.print("Podaj swoje imię: ");
String = sc.nextString();