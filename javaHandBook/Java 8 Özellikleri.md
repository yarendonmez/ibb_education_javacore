### **📌 Neden Java 8 Bilmek Zorundayım?**

Java 8, **Java'nın en büyük güncellemelerinden biridir** ve modern Java kod yazma standartlarını belirlemiştir. Eğer **Java ile çalışıyorsan veya geliştirme yapıyorsan**, Java 8'i bilmek **zorundasın**, çünkü:

✅ **Modern Kod Yazımı:** Lambda ifadeleri, Stream API gibi yenilikler, Java kodunu daha okunabilir ve kısa hale getirir.  
✅ **Performans ve Verimlilik:** Java 8 ile gelen `Optional`, `Stream API`, ve `CompletableFuture` gibi özellikler, daha performanslı ve verimli uygulamalar yazmanı sağlar.  
✅ **Fonksiyonel Programlama:** Java 8, **fonksiyonel programlama paradigmasını** desteklemeye başladı. Bu da daha esnek ve hata ayıklaması kolay kod yazmamıza yardımcı olur.  
✅ **API ve Framework Güncellemeleri:** Java 8, Spring, Hibernate gibi popüler framework’ler için temel bir versiyondur. Modern Java ekosisteminde çalışabilmek için Java 8’i bilmek şart!  
✅ **Uzun Vadeli Destek (LTS):** Java 8, **uzun vadeli destek (LTS)** alan sürümlerden biridir, bu yüzden hâlâ birçok büyük şirket tarafından aktif olarak kullanılmaktadır.

---

### **📌 Java 8 ile Gelen Özellikler**

#### **1️⃣ Lambda Expressions (Lambda İfadeleri)**
Lambda ifadeleri, **Java'da fonksiyonel programlamaya** giriş kapısıdır. **Anonim fonksiyonlar** olarak da düşünebilirsin.

**📌 Örnek: Klasik ve Lambda Kullanımı**
```java
// Klasik yöntem
Runnable runnable1 = new Runnable() {
    @Override
    public void run() {
        System.out.println("Merhaba Dünya!");
    }
};

// Lambda ile
Runnable runnable2 = () -> System.out.println("Merhaba Dünya!");
```
**✅ Avantaj:** Daha kısa ve okunaklı kod yazmamızı sağlar.

---

#### **2️⃣ Functional Interfaces (Fonksiyonel Arayüzler)**
Java 8 ile birlikte **tek bir abstract metot içeren arayüzler** "Fonksiyonel Arayüz" olarak adlandırıldı.

📌 **Örnek: `FunctionalInterface` ile Lambda Kullanımı**
```java
@FunctionalInterface
interface Mesaj {
    void yaz(String mesaj);
}

public class Main {
    public static void main(String[] args) {
        Mesaj mesaj = (msg) -> System.out.println(msg);
        mesaj.yaz("Java 8 harika!");
    }
}
```
**✅ Avantaj:** Lambda ifadeleri ile kullanılır ve kod daha kısa hale gelir.

---

#### **3️⃣ Stream API (Akış API)**
**Veri işleme işlemlerini daha fonksiyonel hale getirir** ve **koleksiyonlar (List, Set, Map) üzerinde verimli işlemler yapmayı sağlar**.

📌 **Örnek: Stream API ile Liste Filtreleme**
```java
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> isimler = Arrays.asList("Yaren", "Ali", "Ayşe", "Burak");
        
        // 'A' harfiyle başlayanları filtreleyelim
        isimler.stream()
               .filter(isim -> isim.startsWith("A"))
               .forEach(System.out::println);
    }
}
```
**✅ Avantaj:** Daha az kod ile koleksiyon işlemlerini hızlandırır ve paralel çalışmayı destekler.

---

#### **4️⃣ Optional Class (`java.util.Optional`)**
**`NullPointerException` hatalarını önlemek** için kullanılır.

📌 **Örnek: `Optional` ile Null Kontrolü**
```java
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> isim = Optional.ofNullable(null);

        System.out.println(isim.orElse("Bilinmiyor")); // Çıktı: Bilinmiyor
    }
}
```
**✅ Avantaj:** `null` kontrollerini daha güvenli ve okunaklı hale getirir.

---

#### **5️⃣ Default & Static Methods in Interfaces (Arayüzlerde Varsayılan ve Statik Metotlar)**
Arayüzlere **`default` ve `static` metotlar eklenerek** daha esnek hale getirildi.

📌 **Örnek: Default Metot Kullanımı**
```java
interface Arayuz {
    default void selam() {
        System.out.println("Merhaba!");
    }
}

public class Main implements Arayuz {
    public static void main(String[] args) {
        Main main = new Main();
        main.selam(); // Çıktı: Merhaba!
    }
}
```
**✅ Avantaj:** Arayüzler içinde metotları implemente etmeden varsayılan davranış belirlenebilir.

---

#### **6️⃣ `java.time` API (Yeni Tarih ve Saat API)**
**Eski `Date` ve `Calendar` sınıflarının yerine** daha güçlü ve okunaklı bir tarih ve saat API’si getirildi.

📌 **Örnek: Java 8 `LocalDate` Kullanımı**
```java
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate tarih = LocalDate.now();
        System.out.println(tarih.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
}
```
**✅ Avantaj:** `LocalDate`, `LocalTime`, `LocalDateTime` gibi sınıflar sayesinde daha güvenli tarih/saat işlemleri yapılabilir.

---

#### **7️⃣ `CompletableFuture` (Asenkron Programlama)**
Java 8, **asenkron işlemler için `CompletableFuture` sınıfını** getirdi.

📌 **Örnek: `CompletableFuture` ile Asenkron Çalışma**
```java
import java.util.concurrent.CompletableFuture;

public class Main {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(() -> "Asenkron İşlem Tamamlandı!")
                .thenAccept(System.out::println);
    }
}
```
**✅ Avantaj:** Paralel ve asenkron işlemleri kolaylaştırır.

---

### **📌 Özet: Java 8 ile Gelen Temel Yenilikler**
| **Özellik** | **Açıklama** |
|------------|-------------|
| **Lambda Expressions** | Daha kısa ve okunaklı fonksiyonlar oluşturur. |
| **Functional Interfaces** | `@FunctionalInterface` kullanarak fonksiyonel programlamayı destekler. |
| **Stream API** | Koleksiyonlar üzerinde fonksiyonel işlemler yapmayı sağlar. |
| **Optional Class** | `NullPointerException` hatalarını önler. |
| **Default & Static Methods in Interfaces** | Arayüzlerde varsayılan ve statik metotlar eklenmesine izin verir. |
| **Yeni Tarih ve Saat API (`java.time`)** | `LocalDate`, `LocalTime`, `LocalDateTime` ile daha güçlü tarih/saat yönetimi sağlar. |
| **CompletableFuture** | Asenkron programlamayı kolaylaştırır. |

---

### **📌 Sonuç: Java 8 Öğrenmek Şart mı?**
✅ **Evet, çünkü modern Java geliştirme için temel bir sürümdür.**  
✅ **Spring, Hibernate, JPA gibi framework'ler Java 8’e göre optimize edilmiştir.**  
✅ **Fonksiyonel programlama, koleksiyon yönetimi, tarih/saat işlemleri gibi konularda büyük iyileştirmeler sağlar.**

🚀 Eğer **günümüz Java projelerinde çalışmak istiyorsan**, **Java 8’i öğrenmek zorundasın!** 😎

**Sormak istediğin bir şey var mı Yaren?** 🚀