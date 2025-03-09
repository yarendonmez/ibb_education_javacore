# IBB Ecodation Java Core
[GtHub](https://github.com/yarendonmez/ibb_education_javacore.git)
[JDK](https://www.oracle.com/tr/java/technologies/downloads/)
[Intellij Idea Community](https://www.jetbrains.com/idea/download/?section=windows)
[Git](https://git-scm.com/downloads)
[Tutorials](https://www.w3schools.com/java/default.asp)

## Git
```sh
git init
git add .
git commit -m "add massage"
git push -u origin 

git clone https://github.com/yarendonmez/ibb_education_javacore.git

```
---

## Java Common Rules ()

```sh
Class isimleri: PascalCase göre yazılır.
Class isimleri: fiil olarak kullanmayız (mak-mek)
Class : Javada static class yoktur (inner class hariç!)

Paket isimleri: Küçük harflerle yazılır.
Paket isimleri: isimleri fiil olarak kullanmayız (mak-mek)

Javada her biten kelime ';' ile bitmek zorundadır.

```
## Static yapı nedir ?

Normalde Java'da nesne tabanlı bir programlama modeli vardır.
Yani, bir sınıftan değişkenlere ve metodlara erişmek için o sınıftan bir nesne oluşturmamız gerekir.
Ama static kelimesi işin içine girince işler değişir!

### 1️⃣ static Değişkenler (Class Variables)
Bir sınıfta tanımlanan normal değişkenler her nesne için ayrı ayrı oluşturulur. Ama static değişkenler sınıfa aittir ve tüm nesneler için ortak bir kopyası olur.

📝 Örnek 1: static Olmayan Değişken
Eğer değişken static olmazsa, her nesne için farklı bir kopya oluşur:

```sh
class Ogrenci {
String isim; // Nesneye özgü değişken

    Ogrenci(String isim) {
        this.isim = isim;
    }

    void yazdir() {
        System.out.println("Öğrenci: " + isim);
    }
}

public class Test {
public static void main(String[] args) {
Ogrenci o1 = new Ogrenci("Yaren");
Ogrenci o2 = new Ogrenci("İbo");

        o1.yazdir(); // Öğrenci: Yaren
        o2.yazdir(); // Öğrenci: İbo
    }
}
```
Burada isim değişkeni her nesne için ayrı tutuluyor.


📝 Örnek 2: static Kullanımı
Eğer değişkeni static yaparsak, artık bütün nesneler aynı değeri paylaşır.

```sh
class Ogrenci {
    static int ogrenciSayisi = 0; // Tüm nesneler için ortak değişken
    String isim;

    Ogrenci(String isim) {
        this.isim = isim;
        ogrenciSayisi++; // Her yeni öğrenci nesnesinde artar
    }

    void yazdir() {
        System.out.println("Öğrenci: " + isim + ", Toplam Öğrenci: " + ogrenciSayisi);
    }
}

public class Test {
    public static void main(String[] args) {
        Ogrenci o1 = new Ogrenci("Yaren");
        Ogrenci o2 = new Ogrenci("İbo");

        o1.yazdir(); // Öğrenci: Yaren, Toplam Öğrenci: 2
        o2.yazdir(); // Öğrenci: İbo, Toplam Öğrenci: 2
    }
}
```
💡 Burada ogrenciSayisi tüm nesneler için ortak!
Her yeni nesne oluşturduğumuzda bu değişken artıyor ama hepsi aynı değeri görüyor.

### 2️⃣ static Metotlar (Class Methods)
Normalde bir metodu çağırmak için nesne oluşturmak gerekir. Ama static metotlar doğrudan sınıf üzerinden çağrılabilir.

📝 Örnek 3: static Metot Olmadan
Burada nesne oluşturmadan metoda erişemiyoruz:
```sh
class Matematik {
    int kareAl(int sayi) { // Static değil!
        return sayi * sayi;
    }
}

public class Test {
    public static void main(String[] args) {
        Matematik m = new Matematik(); // Nesne oluşturmadan erişemeyiz
        System.out.println(m.kareAl(5)); // Çıktı: 25
    }
}
```
📝 Örnek 4: static Metot Kullanımı
Şimdi static metodumuzu yazalım:
```sh
class Matematik {
    static int kareAl(int sayi) { // Static metot
        return sayi * sayi;
    }
}

public class Test {
    public static void main(String[] args) {
        System.out.println(Matematik.kareAl(5)); // Çıktı: 25
    }
}
```

### 3️⃣ static Bloklar
Sınıf ilk yüklendiğinde otomatik çalışır.
Genellikle static değişkenleri başlatmak için kullanılır.
📝 Örnek 5: static Blok Kullanımı

```sh
class Test {
    static int sayi;

    static {
        sayi = 42; // Sınıf yüklenirken atanır
        System.out.println("Static blok çalıştı!");
    }

    public static void main(String[] args) {
        System.out.println("Main metodu çalıştı!");
        System.out.println("Sayi: " + sayi);
    }
}
```
💡 Çıktı:
```sh
Static blok çalıştı!
Main metodu çalıştı!
Sayi: 42
```
📌 Önce static blok çalıştı, sonra main() metodu çalıştı!
### 4️⃣ static İç Sınıflar
Bir sınıf içinde başka bir sınıf tanımlayabiliriz.
Normalde iç sınıflar dış sınıfın nesnesine ihtiyaç duyar.
Ama static iç sınıflar doğrudan erişilebilir

📝 Örnek 6: static İç Sınıf Kullanımı
```sh
class DisSinif {
    static class IcSinif { // Static iç sınıf
        void mesaj() {
            System.out.println("Static iç sınıftan mesaj!");
        }
    }
}

public class Test {
    public static void main(String[] args) {
        DisSinif.IcSinif nesne = new DisSinif.IcSinif();
        nesne.mesaj();
    }
}
```
📌 Normalde iç sınıflar dış sınıfın nesnesine ihtiyaç duyar, ama static yapınca direkt çağırabiliyoruz!

Özetle static:

✅ Değişkenleri (static değişkenler) tüm nesneler paylaşır.

✅ Metotları (static metotlar) nesne oluşturmadan kullanabiliriz.

✅ Blokları (static bloklar) sınıf yüklenirken otomatik çalışır.

✅ İç sınıflar (static iç sınıflar) doğrudan erişilebilir.


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



```sh

```

```sh

```

```sh

```

```sh

```

```sh

```

```sh

```
```sh

```

```sh

```

```sh

```



