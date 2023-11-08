import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int counter = 0;
        while (counter < 10) {
            System.out.print("+----");
            counter++;
        }
        System.out.print("+");
        System.out.println();

        for (int i = 1; i < 11; i++) {
            System.out.print("|");
            for (int j = 1; j < 11; j++) {
                System.out.print(String.format("%4s", i * j + " "));
                System.out.print("|");
            }
            System.out.println();
            counter = 0;
            while (counter < 10) {
                System.out.print("+----");
                counter++;
            }
            System.out.print("+");
            System.out.println();
        }

        int sizeGeneral;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the size of the figures: ");
            int size = scanner.nextInt();
            sizeGeneral = size;

            if (size <= 0) {
                System.out.println("Wrong size of figures");
            }
        } while (sizeGeneral <= 0);

        if (sizeGeneral % 2 == 0) {
            System.out.println("Hourglass and the square with diagonals cannot be drawn with a size of an even number. The two won't be displayed.");
        }

        printFigures(sizeGeneral);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the result of the game: ");
        String result = scanner.nextLine();

        result = result.replace("0", "O");
        result = result.toUpperCase();
        Character[][] characters = new Character[3][3];
        int counterList = 0;
        for (int i = 0; i < characters.length; i++) {
            for (int j = 0; j < characters.length; j++) {
                characters[i][j] = result.charAt(counterList);
                counterList++;
            }
        }

        for (int i = 0; i < characters.length; i++) {
            for (int j = 0; j < characters.length; j++) {
                System.out.print(characters[i][j]);
            }
            System.out.println();
        }

        if ((characters[0][0].equals(characters[1][0]) && characters[1][0].equals(characters[2][0])) || ((characters[0][0].equals(characters[0][1]) && characters[0][1].equals(characters[0][2])))) {
            System.out.println("The winner is: " + characters[0][0]);
        } else if ((characters[0][1].equals(characters[1][1]) && characters[1][1].equals(characters[2][1])) || ((characters[1][0].equals(characters[1][1]) && characters[1][1].equals(characters[1][2])))) {
            System.out.println("The winner is: " + characters[1][1]);
        } else if ((characters[0][2].equals(characters[1][2]) && characters[1][2].equals(characters[2][2])) || ((characters[2][0].equals(characters[2][1]) && characters[2][1].equals(characters[2][2])))) {
            System.out.println("The winner is: " + characters[2][2]);
        } else if ((characters[0][0].equals(characters[1][1]) && characters[1][1].equals(characters[2][2])) || ((characters[0][2].equals(characters[1][1]) && characters[1][1].equals(characters[2][0])))) {
            System.out.println("The winner is: " + characters[1][1]);
        } else {
            System.out.println("It is a draw");
        }

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter your SMS: ");
        String sms = scanner1.nextLine();
        System.out.println("The length of your sms is: " + sms.length());
        sms = sms.trim();
        System.out.print(sms.charAt(0));
        int counterSms = 1;
        for (int i = 1; i < sms.length(); i++) {
            String subBefore = String.valueOf(sms.charAt(i - 1));
            String sub = String.valueOf(sms.charAt(i));
            if (subBefore.equals(" ")) {
                sub = sub.toUpperCase();
                System.out.print(sub);
                counterSms++;
                continue;
            } else if (sms.charAt(i) == ' ') {
                continue;
            } else {
                System.out.print(sms.charAt(i));
                counterSms++;
            }
        }

        System.out.println();
        System.out.println("The length of the message now: " + counterSms);

        int price = counterSms / 160;
        price += 1;
        System.out.println(Float.valueOf(price * 0.25f));

        String peselG;
        int peselLength;
        do {
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Enter your pesel: ");
            String pesel = scanner2.nextLine();
            peselG = pesel;
            peselLength = pesel.length();

            if (peselLength != 11) {
                System.out.println("Wrong pesel");
            }
        } while (peselLength != 11);

        checkPesel(peselG);

        Stack stack = new Stack(5);
        System.out.println(stack.isEmpty());
        stack.pop();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println(stack.isFull());
        System.out.println(stack.toString());

        IntArray intArray = new IntArray();
        intArray.add(1);
        intArray.add(2,1);
        System.out.println(intArray.get(0));
        System.out.println(intArray.toString());
        intArray.swap(0,1);
        System.out.println(intArray.toString());
        intArray.remove(0);
        System.out.println(intArray.toString());

    }

    public static void printFigures(int size) {
        System.out.println();

        int sizeGeneral = size;

        for (int i = 0; i < sizeGeneral; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < sizeGeneral; i++) {
            for (int j = sizeGeneral - i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < sizeGeneral; i++) {
            for (int j = 0; j < sizeGeneral - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < sizeGeneral; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == 0) {
                    continue;
                } else {
                    System.out.print("  ");
                }
            }
            for (int j = 0; j < sizeGeneral - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();


        for (int i = 0; i < sizeGeneral; i++) {
            System.out.print("* ");
            for (int j = 0; j < sizeGeneral - 2; j++) {
                if (i == 0 || i == sizeGeneral - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("* ");
            System.out.println();
        }

        System.out.println();

        int counter = 2;

        for (int i = 0; i < sizeGeneral; i++) {
            if (i != 0 && i != sizeGeneral - 1) {
                for (int k = counter; k > 0; k--) {
                    System.out.print(" ");
                }
                counter += 2;
            }
            System.out.print("* ");
            for (int j = 0; j < sizeGeneral - 1; j++) {
                if (i == 0 || i == sizeGeneral - 1) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        System.out.println();

        counter = sizeGeneral;

        for (int i = 0; i < sizeGeneral; i++) {
            if (i != 0 && i != sizeGeneral - 1) {
                for (int k = counter; k > (-1 * sizeGeneral) + 4; k--) {
                    System.out.print(" ");
                }
                counter -= 2;
            }
            System.out.print("* ");
            for (int j = 0; j < sizeGeneral - 1; j++) {
                if (i == 0 || i == sizeGeneral - 1) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        System.out.println();

        if (sizeGeneral % 2 != 0) {
            int n = sizeGeneral;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == j || i + j == n - 1 || i == 0 || i == n - 1) {
                        System.out.print("# ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }

            System.out.println();

            n = sizeGeneral;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == j || i + j == n - 1 || i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                        System.out.print("# ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
    }

    public static void checkPesel(String yourPesel) {

        Integer[] peselElems = new Integer[11];
        for (int i = 0; i < peselElems.length; i++) {
            peselElems[i] = Integer.parseInt(String.valueOf(yourPesel.charAt(i)));
        }

        for (int i = 0; i < peselElems.length; i++) {
            switch (i) {
                case 1:
                case 5:
                case 9:
                    peselElems[i] *= 3;
                    break;
                case 2:
                case 6:
                    peselElems[i] *= 7;
                    break;
                case 3:
                case 7:
                    peselElems[i] *= 9;
                    break;
                default:
                    peselElems[i] *= 1;
                    break;
            }
        }

        int sum = 0;
        for (Integer peselElem : peselElems) {
            sum += peselElem;
        }
        if (sum % 10 == 0) {
            System.out.println("Your pesel is correct");
        } else {
            System.out.println("Your pesel is not correct");
        }
    }
}

/*

Napisz program, który wypisze tabliczkę mnożenia do stu.


   1   2   3   4   5   6   7   8   9  10
   2   4   6   8  10  12  14  16  18  20
   3   6   9  12  15  18  21  24  27  30
   4   8  12  16  20  24  28  32  36  40
   5  10  15  20  25  30  35  40  45  50
   6  12  18  24  30  36  42  48  54  60
   7  14  21  28  35  42  49  56  63  70
   8  16  24  32  40  48  56  64  72  80
   9  18  27  36  45  54  63  72  81  90
  10  20  30  40  50  60  70  80  90 100
Do formatowania możesz użyć funkcji String.format()


String.format("%4s", <wartość-do-wyświetlenia>)
%4s wyświetla wartość na 4 znakach wyrównując do prawej strony.
Rozszerz tabliczkę mnożenia o linie poziome, pionowe oraz obramowanie zbudowane ze znaków |, - i +. Dla tabliczki do 9 mogłoby to wyglądać jak poniżej.


+---+---+---+
| 1 | 2 | 3 |
+---+---+---+
| 2 | 4 | 6 |
+---+---+---+
| 3 | 6 | 9 |
+---+---+---+
Napisz program, który rysuje poniższe wzory

Trójkąt 1


#
# #
# # #
# # # #
# # # # #
# # # # # #
# # # # # # #
# # # # # # # #
Trójkąt 2


# # # # # # # #
# # # # # # #
# # # # # #
# # # # #
# # # #
# # #
# #
#
Trójkąt 3


              #
            # #
          # # #
        # # # #
      # # # # #
    # # # # # #
  # # # # # # #
# # # # # # # #
Trójkąt 4


# # # # # # # #
  # # # # # # #
    # # # # # #
      # # # # #
        # # # #
          # # #
            # #
              #
Kwadrat


# # # # # # #
#           #
#           #
#           #
#           #
#           #
# # # # # # #
Litera S


# # # # # # #
  #
    #
      #
        #
          #
# # # # # # #
Litera Z


# # # # # # #
          #
        #
      #
    #
  #
# # # # # # #
Klepsydra


# # # # # # #
  #       #
    #   #
      #
    #   #
  #       #
# # # # # # #
Kwadrat z przekątnymi


# # # # # # #
# #       # #
#   #   #   #
#     #     #
#   #   #   #
# #       # #
# # # # # # #

Przenieś logikę wyświetlającą powyższe figury do osobnych metod, które jako parametr przyjmują wielkość (np. parametr o nazwie size) rysunku (liczbę znaków w figurze).


Napisz program, który dla podanej liczby (jako String) mnoży jej cyfry tak długo, aż wynik będzie jednocyfrowy. Np.

Przykład dla "123".


123
123 → 1x2x3 = 6
Przykład dla "277777788888899".


277777788888899
277777788888899 → 2x7x7x7x7x7x7x8x8x8x8x8x8x9x9 = 4996238671872
4996238671872 → 4x9x9x6x2x3x8x6x7x1x8x7x2 = 438939648
438939648 → 4x3x8x9x3x9x6x4x8 = 4478976
4478976 → 4x4x7x8x9x7x6 = 338688
338688 → 3x3x8x6x8x8 = 27648
27648 → 2x7x6x4x8 = 2688
2688 → 2x6x8x8 = 768
768 → 7x6x8 = 336
336 → 3x3x6 = 54
54 → 5x4 = 20
20 → 2x0 = 0
Skorzystaj z poniższego kodu, implementując metodę reduce(String number)


public class Reducer {

    public static void main(String[] args) {
        Reducer reducer = new Reducer();
        String numberToReduce = "<tu wpisz wartość>";
        int reducedValue = reducer.reduce(numberToReduce);
        System.out.println("Number to reduce: " + numberToReduce);
        System.out.println("After reduce: " + reducedValue);
    }

    public int reduce(String number) {
        return 0;
    }
}
Zastanów się, jak zoptymalizować ten program? Podpowiedź: cyfra zero.
Napisz program, który sprawdza, kto wygrał w Kółko i krzyżyk.

Stan planszy podawany jest jako String, np.

OX_OOXO_X
+ gdzie: * X oznacza krzyżyk * O oznacza kółko * _ oznacza puste pole

Zamień powyższy zapis na tablicę dwuwymiarową postaci:

OX_
OOX
O_X
Wypisz kto wygrał lub że był remis.

Przykładowe dane wejściowe:


XOXXXOOOX
XOXXOOXXO
XOXXOOOXO
OX_OOXO_X
XOOXOXOXO
OXOXOOXXX
Przystosuj program do obsługi małych i wielkich liter (x, o, X, O) oraz 0 (zero) jako kółko.

Napisz program, który skraca treść SMSów. Program powinien:

usuwać niepotrzebne puste znaki na początku i końcu treści

usuwać puste znaki pomiędzy słowami zaczynając każde słowo z wielkiej litery

Przykład działania programu.


   Ala ma kota, a  kot ma Alę !
AlaMaKota,AKotMaAlę!

Hej, będę dziś później. Nie czekaj na mnie z kolacją.
Hej,BędęDziśPóźniej.NieCzekajNaMnieZKolacją.
Ponadto niech program wypisuje: * liczbę znaków oryginalnej wiadomości * liczbę znaków po kompresji * cenę za wysłanie SMSa przy założeniu, że 1 SMS to 160 znaków, a każdy SMS kosztuje 25gr.

Napisz program, który sprawdza poprawność podanego numeru PESEL.
Numer PESEL jest postaci:


RRMMDDXXXXK
gdzie:

RR - rok

MM - miesiąc

DD - dzień

XXXX - liczba porządkowa

K - cyfra kontrolna

Przyporządkujmy wartości do zmiennych, np.


RRMMDDXXXXK
abcdefghijk
result = ``1``x``a`` + ``3``x``b`` + ``7``x``c`` + ``9``x``d`` + ``1``x``e`` + ``3``x``f`` + ``7``x``g`` + ``9``x``h`` + ``1``x``i`` + ``3``x``j`` + ``1``x``k``

Jeśli result % 10 = 0, to numer PESEL jest poprawny!

Zaproponuj sygnaturę metody sprawdzającej poprawność PESELu
Dana jest klasa Car


public class Car {
    private String model;
    private int productionYear;
    private String color;
    private boolean used = false;
}
Wygeneruj metody typu getter i setter dla wszystkich pól; użyj skrótów klawiszowych kbd:[Alt + Ins]

Przetestuj klasę Car za pomocą klasy CarApplication


public class CarApplication {
    public static void main(String[] args) {
        Car audi = new Car();
        audi.setModel("A8");
        audi.setColor("czerwony");
        audi.setProductionYear(2018);
        audi.setUsed(true);
        System.out.println(audi.getModel());
        System.out.println(audi.getColor());
        System.out.println(audi.getProductionYear());
        System.out.println(audi.isUsed());
    }
}
Dodaj do programu Car pole przechowujące kilometraż (int mileage); ustaw wartość domyślną na 0

Dodaj (wygeneruj) metodę typu getter dla tego pola (getMileage())

Dodaj metodę drive(int mileage), która zwiększa kilometraż

Przetestuj działanie

Zmodyfikuj metodę drive(int mileage) tak, aby ustawiała pole used na odpowiednią wartość; jeśli mileage jest dodatni, to pole used ma mieć wartość true

Przetestuj działanie

Dana jest klasa Calculator i CalculatorApplication


public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

public class CalculatorApplication {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 12));
    }
}
Na podstawie metody add(int a, int b) zaimplementuj kolejne metody:

int subtract(int a, int b) - odejmowanie: a - b

int multiply(int a, int b) - mnożenie: a * b

double divide(int a, int b) - dzielenie: a / b

boolean isPositive(int a) - sprawdza, czy liczba jest dodatnia

boolean isNegative(int a) - sprawdza, czy liczba jest ujemna

boolean isOdd(int a) - sprawdza, czy liczba jest nieparzysta

int min(int a, int b) - zwraca mniejszą z liczb

int max(int a, int b) - zwraca większą z liczb

double average(int a, int b) - zwraca średnią z liczb

int power(int a, int x) - zwraca a^m^ (a do potęgi m)

Na podstawie rozwiązania punktu a zaimplementuj 3-argumentowe wersje tych metod (postaraj się wykorzystać 2-argumentowe wersje tych metod):

int add(int a, int b, int c)

int subtract(int a, int b, int c)

int multiply(int a, int b, int c)

double divide(int a, int b, int c)

int min(int a, int b, int c)

int max(int a, int b, int c)

double average(int a, int b, int c)

Zaimplementuj stos przechowujący liczby typu Integer.


public class Stack {
    public Stack(int count) {}
    public void push(Integer e) {}
    public Integer pop() {}
    public boolean isEmpty() {}
    public boolean isFull() {}
    public String toString() {}
}
konstruktor tworzy tablicę count elementową do przechowywania elementów typu Integer

metoda push() wrzuca element na stos (na pierwszą wolną pozycję). Jeśli stos jest pusty, to wyświetla stosowny komunikat i nic nie robi

metoda pop() zdejmuje (zwraca i usuwa ze stosu) pierwszy element z „góry” stosu. Jeśli stos jest pusty, to wyświetla stosowny komunikat i nic nie robi (niech zwraca null)

metoda isEmpty() sprawdza, czy stos jest pusty, tj. nie ma w tablicy żadnego elementu

metoda isFull() sprawdza, czy stos jest zapełniony, tj. np. przy 5 elementowym stosie, wszystkie 5 elementów tablicy ma przypisaną jakąś wartość (różną od null)

metoda toString() wyświetla zawartość stosu

podpowiedź: wprowadź dodatkową zmienną przechowującą wskaźnik bieżącego lub następnego elementu w tablicy i modyfikuj jego wartość przy implementacji metod push() i pop()

Na podstawie powyższego zadania napisz program, który będzie "imitował" tablicę dowolnej wielkości, która może przechowywać wartości typu Integer. Dana jest klasa:


public class IntArray {

    public IntArray() {
    }

    public void add(Integer value) {
    }

    public void add(Integer value, int idx) {
    }

    public Integer get(int idx) {
        return null;
    }

    public void remove(int idx) {
    }

    public void swap(int from, int to) {
    }

    public String toString() {
        return "";
    }
}
Funkcjonalności:

IntArray() - konstruktor, powinien utworzyć inicjalną listę

void add(Integer value) - dodaje element na kolejną pozycję;

void add(Integer value, int idx) - dodaje element na wskazaną pozycję

Integer get(int idx) - zwraca element na pozycji idx; jeśli go tam nie ma, zwraca null

void remove(int idx) - usuwa element na pozycji idx

void swap(int from, int to) - zamienia miejscami elementy na pozycjach from oraz to;

String toString() - wyświetla całą listę

Dana jest klasa Account i AccountApplication

public class Account {
    private String name;
    private int balance;
}

public class AccountApplication {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("Konto Premium");
        System.out.println("Nazwa: " + account.getName());
        System.out.println("Stan konta: " + account.getBalance());
    }
}
Ustaw domyślną wartość 0 dla pola balance

Dodaj (wygeneruj) metody typu getter i setter dla pola name

Dodaj (wygeneruj) metodę typu getter dla pola balance

Dodaj (prywatne) pole debit typu boolean określające, czy stan konta jest ujemny; ustaw domyślną wartość na false

Dodaj możliwość wpłacania i wypłacania pieniędzy


public void deposit(int amount) {

}

public void withdraw(int amount) {

}
Zaimplementuj powyższe metody

Metoda withdraw ma ustawiać pole debit na true, gdy stan konta będzie ujemny

Sprawdź ich działanie

Dodaj walidację parametru amount w metodzie deposit i withdraw;

metody mają wykonywać logikę, tylko gdy wartość amount jest dodatnia

w przeciwnym wypadku mają wyświetlać komunikat: "Kwota wpłaty/wypłaty musi być dodatnia!"

W metodzie withdraw dodaj wyświetlanie komunikatu: "Ujemny stan konta" jeśli pole debit ma wartość true

Do metod deposit i withdraw dodaj wyświetlanie podsumowania, np. (dla - odpowiednio - deposit i withdraw)


"Stan konta: 300 | Wpłata: 250 | Po operacji: 550"
"Stan konta: 200 | Wypłata: 500 | Po operacji: -300"
Dodaj obsługę maksymalnego debetu np. 1000. Jeśli kwota po operacji miałaby być niższa, to nie wykonuj wypłaty i wyświetl komunikat: "Nie można wykonać operacji przekraczającej debet"

Zaimplementuj metodę transfer umożliwiającą wykonanie przelewu z bieżącego konta na inne.


public void transfer(Account other, int amount) {

}
Z bieżącego konta należy wypłacić amount

Na konto other należy wpłacić amount

Dodaj metodę toString


public String toString() {
    return " Account{name: " + name + ", balance: " + balance + "}";
}
i wywołuj ją jak poniżej:


public class AccountApplication {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("Konto Premium");
        System.out.println(account);
    }
}

 */
