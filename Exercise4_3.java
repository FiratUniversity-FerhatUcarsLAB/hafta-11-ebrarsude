public class Exercise4_3 {

    public static void zoop() {
        baffle();
        System.out.print("You wugga ");
        baffle();
    }

    public static void main(String[] args) {
        System.out.print("No, I ");
        zoop();
        System.out.print("I ");
        baffle();
    }

    public static void baffle() {
        System.out.print("wug");
        ping();
    }

    public static void ping() {
        System.out.println(".");
    }
}


Sistemin Ciktisi;
No, I wug.
You wugga wug.
I wug.

Stack Diyagrami;
┌──────────────────────────────┐
│          ping()              │
│  Parametre: yok              │
│  Yerel değişken: yok         │
└──────────────▲───────────────┘
               │ çağıran
┌──────────────────────────────┐
│         baffle()             │
│  Parametre: yok              │
│  Yerel değişken: yok         │
└──────────────▲───────────────┘
               │ çağıran
┌──────────────────────────────┐
│           zoop()             │
│  Parametre: yok              │
│  Yerel değişken: yok         │
└──────────────▲───────────────┘
               │ çağıran
┌──────────────────────────────┐
│  main(String[] args)         │
│  Parametre: args             │
│  Yerel değişken: yok         │
└──────────────────────────────┘



