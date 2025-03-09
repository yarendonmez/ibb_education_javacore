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
