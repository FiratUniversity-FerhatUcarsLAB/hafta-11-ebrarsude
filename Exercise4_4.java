public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor?
        getNumber();

        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // System.out.println(sayHello() + 7);

        // Cevaplarinizi yorum olarak ekleyin.
    }
}

cevap1;
-Java bunu tamamen geçerli kabul eder.
-Derleyici hata vermez, çünkü bu bir yan etki içeren çağrı olabilir (log yazabilir, bir şeyi başlatabilir vs.).
-Ancak IDE (IntelliJ, Eclipse vs.) “Return value is ignored” şeklinde uyarı verebilir. 
    
cevap2;
Bu derleme hatasıdır.
Çünkü sayHello() metodu void türündedir — yani değer döndürmez.

Java’da + operatörü iki değer arasında çalışır.
Ama void, bir değer değildir → bu nedenle işlem yapılamaz.
