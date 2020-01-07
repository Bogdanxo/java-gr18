public class Tema1 {

    // Exercitiul #1
    private static void printeazaSumaNumerelorPanaLa(int inputNumber) {
        if (inputNumber <= 0) {
            System.out.println("Nu ati introdus un numar > 0!");
        } else {
            int suma = 0;
            for (int i = 1; i <= inputNumber; i++) {
                suma += i;
            }
            System.out.println("Suma primelor " + inputNumber + " de numere mai mari ca 0 este: " + suma);
        }
    }

    // Exercitiul #2
    private static void printeazaCelMaiMicNumarDintre(int[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            System.out.println("Nu ati introdus nici un numar!");
        } else {

            // Varianta 1
            int celMaiMicNumar = Integer.MAX_VALUE;

            for (int n : inputArray) {
                if (n < celMaiMicNumar) {
                    celMaiMicNumar = n;
                }
            }

            // Varianta 2
//            int celMaiMicNumar = inputArray[0];
//
//            for (int i = 1; i < inputArray.length; i++) {
//                int numarCurent = inputArray[i];
//                if (numarCurent < celMaiMicNumar) {
//                    celMaiMicNumar = numarCurent;
//                }
//            }

            System.out.println("Cel mai mic numar este: " + celMaiMicNumar);
        }
    }

    // Exercitiul #3
    private static void printeazaMaxDigitDinNr(int inputNumber) {
        String inputNumberString = Integer.toString(inputNumber);
        //1023 -> "1023" -> '1', '0', '2', '3'

        int ceaMaiMareCifra = Integer.MIN_VALUE;

        for (char c : inputNumberString.toCharArray()) {
            String stringDinChar = Character.toString(c);
            int cifra = Integer.parseInt(stringDinChar);

            if (cifra > ceaMaiMareCifra) {
                ceaMaiMareCifra = cifra;
            }
        }

        System.out.println("Cea mai mare cifra din nr este: " + ceaMaiMareCifra);
    }

    // Exercitiul #4
     private static void estePalindrom(int numar) {
        int numarInitial = numar;
        int numarInversat = 0;

        if (Integer.toString(numar).length() == 1) {
            // ai o cifra
            numarInversat = numar;
        } else {
            while (numar > 0) {
                numarInversat = numarInversat * 10 + numar % 10;
                numar = numar / 10;
            }
        }

        if (numarInitial == numarInversat) {
            System.out.println(numarInitial + " este palindrom");
        } else {
            System.out.println(numarInitial + " nu este palindrom");
        }
    }

    //Exercitiul 5
    private static void printeazaNumerelePrimeMaiMiciDecat(int number) {
        System.out.println("Numerele prime pana la "+number+" sunt:");

        for (int i = 2; i < number; i++) {
            boolean estePrim = true;

            for (int j = 2; j < i/2; j++) {
                if (i %  j == 0) {
                    estePrim = false;
                    break;
                }
            }

            if (estePrim) {
                System.out.print(i+ " ");
            }
        }
    }

    public static void main (String[] args) {
        System.out.println("Exercitiul #1: ");
        printeazaSumaNumerelorPanaLa(100);

        System.out.println();

        int[] arrayInt = {1, 7, 2, 0};
        System.out.println("Exercitiul #2: ");
        printeazaCelMaiMicNumarDintre(arrayInt);

        System.out.println();

        System.out.println("Exercitiul #3: ");
        printeazaMaxDigitDinNr(127726);

        System.out.println();

        System.out.println("Exercitiul #4: ");
        estePalindrom(10);

        System.out.println();

        System.out.println("Exercitiul #5: ");
        printeazaNumerelePrimeMaiMiciDecat(88);
    }
}

