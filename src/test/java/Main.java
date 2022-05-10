public class Main {

    public static void main(String[] args) {
        //(mainiga tips) (mainiga nosaukums) = (vertība);
        int dogAge = 3;
        String vardsSuns = "Reksis"; //Teksta
        String vardsSuns2 ="Reksis"; //Teksta

        double svarsSuns = 15.8123; //Daļskaitlis
        float augums = 60.12345F; //Daļskaitlis
        boolean isHungry= true; //true = 1 ; false = 0
        boolean isBreedDog = false;

        char dzimums = 'V';
        char dzimumsDivi = 'S';
     char vaditajaKategorija = 'B';



        boolean isStringTheSame = vardsSuns.equals(vardsSuns2);

        System.out.println("Mans suns");
        System.out.println("Vecums");
        System.out.println(dogAge+ "gadi");
        System.out.println("Vārds");
        System.out.println(vardsSuns);
        System.out.println("Mana suņa svars ir:");
        System.out.println(svarsSuns+" kg" + "\n");
        System.out.println("mans suņa augstums " + "" + augums + " cm");

        System.out.println("Hello Juris");

        //(mainiga tips) (mainiga nosaukums) = (vertība);
        byte monthsInYear = 12;
        int gadaApgrozijums = 123456789;
        short autoPrice = 12312;
        long netIncome = 123456789L;
        System.out.println("Hello Juris");

//Aritmetiskie
        int summa;
        int starpiba;
        int reizinajums;
        double dalijums;
        int atlikums;
        int x = 5;
        int y = 10;

        double z = 5;
        double q = 10;
        summa = x + y;
        starpiba = x - y;
        reizinajums = x * y;
        dalijums = z/q;
        atlikums = 12%5;

        // int rezultats = 
        System.out.println("DALIT" +x/z);


        int[] saraksts = {1,2,3,4,5,6,7,8,9};

        int skaitlis = 7;
        System.out.println("Ja atbilde ir 0, šis ir para skaitlis " + skaitlis%2);

        System.out.println("SUMMA " + summa);
        System.out.println("Starpiba " + starpiba);
        System.out.println("Reizinājums " + reizinajums);
        System.out.println("Dalījum " + dalijums);
        System.out.println("Atlikums " + atlikums);


        char vaditajaApliecibasKategorija= 'A';
        System.out.println(vaditajaApliecibasKategorija);
    }

}
