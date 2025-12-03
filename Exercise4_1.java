public class Exercise4_1 {

    public static void printAmerican(String day, int date, String month, int year) {
      // Ornek: Carsamba, aralik 3 , 2025
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }

    public static void printEuropean(String day, int date, String month, int year) {
        // // Ornek: 3 Aralik 2025, Carsamba
        System.out.println(date + " " + month + " " + year + ", " + day);
    }

    public static void main(String[] args) {
        // TODO: test methods
        System.out.println("Amerikan Formati");
        printAmerican("Carsamba", 3, "Aralik", 2025);

        System.out.println("Avrupa Formati");
        printEuropean("Carsamba", 3, "Aralik", 2025);
    }
}
