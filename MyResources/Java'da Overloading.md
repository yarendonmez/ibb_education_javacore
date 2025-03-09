## Overloading Nedir?
Overloading, aynı isimde birden fazla metot tanımlayarak, farklı parametreler ile çağrılabilmelerini sağlamaktır.

Java’da aynı isimde ama farklı parametre listesine sahip metotlar oluşturabiliyoruz. Bu metotlar aynı sınıf içinde bulunabilir ve Java hangi metodu çağıracağını parametrelerin türüne ve sayısına göre otomatik olarak anlar.

### 1️⃣ Overloading Kuralları
Metot isimleri aynı olmalıdır.

Parametre listeleri farklı olmalıdır. (Farklı sayıda veya farklı türde parametre olabilir.)

Dönüş tipi (return type) değiştirilerek Overloading yapılamaz!

Erişim belirleyiciler (public, private vs.) farklı olabilir.

### 2️⃣ Overloading Örnekleri
📝 Örnek 1: Farklı Parametre Sayısı
```sh
class Hesaplama {
    int topla(int a, int b) {
        return a + b;
    }

    int topla(int a, int b, int c) { // Overloaded versiyon (3 parametre)
        return a + b + c;
    }
}

public class Test {
    public static void main(String[] args) {
        Hesaplama h = new Hesaplama();
        System.out.println(h.topla(5, 10));      // Çıktı: 15
        System.out.println(h.topla(5, 10, 20));  // Çıktı: 35
    }
}
```
📌 Burada topla() metodu hem 2 parametreyle hem de 3 parametreyle çalışabiliyor!

📝 Örnek 2: Farklı Parametre Türleri

```sh
class Hesaplama {
    int carp(int a, int b) {
        return a * b;
    }

    double carp(double a, double b) { // Overloaded versiyon (double parametreler)
        return a * b;
    }
}

public class Test {
    public static void main(String[] args) {
        Hesaplama h = new Hesaplama();
        System.out.println(h.carp(5, 10));      // Çıktı: 50  (int metodu çağrılır)
        System.out.println(h.carp(5.5, 2.2));  // Çıktı: 12.1 (double metodu çağrılır)
    }
}
```
📝 Örnek 3: Parametrelerin Sırasını Değiştirme

```sh
class Yazdirma {
    void yazdir(String mesaj, int tekrar) {
        for (int i = 0; i < tekrar; i++) {
            System.out.println(mesaj);
        }
    }

    void yazdir(int tekrar, String mesaj) { // Parametre sırası farklı
        for (int i = 0; i < tekrar; i++) {
            System.out.println(mesaj.toUpperCase());
        }
    }
}

public class Test {
    public static void main(String[] args) {
        Yazdirma y = new Yazdirma();
        y.yazdir("Merhaba", 2); // Küçük harfli yazdırır
        y.yazdir(2, "Merhaba"); // Büyük harfli yazdırır
    }
}
```
3️⃣ Overloading’de Dönüş Tipi Neden Değiştirilemez?

Java’da sadece dönüş tipini değiştirerek Overloading yapamayız!

```sh
class Hata {
    int topla(int a, int b) { // İlk metot
        return a + b;
    }

    double topla(int a, int b) { // HATA! Sadece dönüş tipi farklı olamaz!
        return a + b;
    }
}
```
📌 Java, sadece dönüş tipine bakarak hangi metodu çağıracağını anlayamaz. Bu yüzden parametreler de farklı olmalı!
### 4️⃣ Constructor Overloading (Yapıcı Metot Aşırı Yükleme)
Overloading sadece normal metotlarla sınırlı değildir!
Bir sınıfın constructor'ları (yapıcı metotları) da aşırı yüklenebilir.
```sh
class Araba {
    String marka;
    int hiz;

    Araba() { // Parametresiz constructor
        marka = "Bilinmiyor";
        hiz = 0;
    }

    Araba(String markaAdi) { // Marka parametresi alan constructor
        marka = markaAdi;
        hiz = 0;
    }

    Araba(String markaAdi, int maxHiz) { // Marka ve hız alan constructor
        marka = markaAdi;
        hiz = maxHiz;
    }

    void yazdir() {
        System.out.println("Araba: " + marka + ", Maksimum Hız: " + hiz);
    }
}

public class Test {
    public static void main(String[] args) {
        Araba a1 = new Araba();
        Araba a2 = new Araba("Toyota");
        Araba a3 = new Araba("BMW", 240);

        a1.yazdir(); // Araba: Bilinmiyor, Maksimum Hız: 0
        a2.yazdir(); // Araba: Toyota, Maksimum Hız: 0
        a3.yazdir(); // Araba: BMW, Maksimum Hız: 240
    }
}
```

📌 Burada üç farklı constructor var. Kullanıcı isterse marka girmeden, isterse hız bilgisiyle nesne oluşturabilir.

🔍 Özet:

✅ Aynı isimde birden fazla metot tanımlayarak parametre farklılığına göre çağrılmasını sağlar.

✅ Metot parametreleri farklı olmalıdır. (Sayısı, türü veya sırası değişebilir.)

✅ Sadece dönüş tipini değiştirerek Overloading yapılamaz.

✅ Constructor’lar da aşırı yüklenebilir.