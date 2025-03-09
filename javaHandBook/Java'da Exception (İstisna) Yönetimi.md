# **Java'da Exception (İstisna) Yönetimi**

Java'da **Exception (İstisna)**, program çalışırken meydana gelen hataları ifade eder. Eğer bir hata uygun şekilde ele alınmazsa, program çöker ve hata mesajı görüntülenir.

---

## **1️⃣ Exception (İstisna) Nedir?**
**Exception**, bir Java programının çalışması sırasında meydana gelen **istenmeyen durumları veya hataları** ifade eder.

📌 **Örnek: `ArithmeticException` (Sıfıra Bölme Hatası)**
```java
int result = 10 / 0; // ArithmeticException: / by zero
```

📌 **Örnek: `NullPointerException` (Boş Referans Hatası)**
```java
String text = null;
System.out.println(text.length()); // NullPointerException
```

📌 **Örnek: `IOException` (Giriş/Çıkış Hatası)**
```java
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("dosya.txt"); // Dosya bulunamazsa IOException oluşur
    }
}
```

---

## **2️⃣ `try-catch` ile Exception Yönetimi**

Hataları yönetmek için **`try-catch` blokları** kullanılır.

📌 **Örnek: `try-catch` Kullanımı**
```java
try {
    int result = 10 / 0; // Hata oluşur
    System.out.println(result);
} catch (ArithmeticException e) {
    System.out.println("Sıfıra bölme hatası oluştu!");
}
```
Çıktı:
```
Sıfıra bölme hatası oluştu!
```

📌 **Örnek: Kullanıcıdan Veri Alma ve `try-catch` Kullanımı**
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz: ");
        int number1 = input.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        int number2 = input.nextInt();

        try {
            int result = number1 / number2;
            System.out.println("Sonuç: " + result);
        } catch (ArithmeticException e) {
            e.printStackTrace(); // Hatanın detaylarını yazdırır
        } finally {
            System.out.println("İstisna olsa da olmasa da çalışacak");
            input.close(); // Scanner'ı kapatır
        }
    }
}
```

**✅ Açıklama:**
- `try` bloğunda hata verebilecek kod bulunur.
- `catch` bloğu, hatayı yakalar ve işlemi yönetir.
- `finally` bloğu, hata olsun veya olmasın çalışacak olan kodları içerir. (Örneğin, kaynakları kapatma gibi işlemler için kullanılır.)

---

## **3️⃣ `printStackTrace()`, `getMessage()` ve `toString()` Kullanımı**

Java'da **hatayı görüntülemek için farklı metotlar vardır**:

| **Metot** | **Açıklama** |
|------------|--------------------------------------|
| `e.printStackTrace();` | Hatanın detaylarını ve hangi satırda olduğunu yazdırır. |
| `e.getMessage();` | Sadece hata mesajını döndürür. |
| `e.toString();` | Hata türünü ve mesajını döndürür. |

📌 **Örnek:**
```java
try {
    int result = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Hata Mesajı: " + e.getMessage());
    System.out.println("Hata Türü: " + e.toString());
    e.printStackTrace();
}
```
Çıktı:
```
Hata Mesajı: / by zero
Hata Türü: java.lang.ArithmeticException: / by zero
java.lang.ArithmeticException: / by zero
	at Main.main(Main.java:5)
```

---

## **4️⃣ `throws` ile Exception Bildirme**
Bazı metotlar, **kendilerinin bir hata fırlatabileceğini** bildirmek için `throws` anahtar kelimesini kullanır.

📌 **Örnek: `throws` Kullanımı**
```java
import java.io.IOException;

public class Main {
    public static void hataFirlat() throws IOException {
        throw new IOException("Bir giriş/çıkış hatası oluştu!");
    }

    public static void main(String[] args) {
        try {
            hataFirlat();
        } catch (IOException e) {
            System.out.println("Hata yakalandı: " + e.getMessage());
        }
    }
}
```

**✅ Açıklama:**
- `throws IOException` → Metodun `IOException` fırlatabileceğini bildirir.
- `throw new IOException()` → Hata **manuel olarak fırlatılır**.
- `catch (IOException e)` → Hata yakalanır ve mesaj görüntülenir.

---

## **5️⃣ `finally` Bloğu ile Kaynakları Kapatma**
`finally`, **hata olsun veya olmasın** çalıştırılacak kodları içerir. Genellikle **dosya, veritabanı veya scanner gibi kaynakları kapatmak için kullanılır**.

📌 **Örnek: `finally` ile Scanner Kapatma**
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Bir sayı giriniz: ");
            int number = input.nextInt();
            System.out.println("Girilen sayı: " + number);
        } catch (Exception e) {
            System.out.println("Geçersiz giriş!");
        } finally {
            input.close(); // Scanner kapanıyor
            System.out.println("Kaynak kapatıldı.");
        }
    }
}
```

Çıktı (hata oluşursa):
```
Geçersiz giriş!
Kaynak kapatıldı.
```

---

## **6️⃣ Özet: Exception Yönetimi**
| **Yöntem** | **Açıklama** |
|------------|----------------|
| `try-catch` | Hata yakalamak için kullanılır. |
| `finally` | Hata olsa da olmasa da çalışır. |
| `printStackTrace()` | Hata detaylarını yazdırır. |
| `getMessage()` | Sadece hata mesajını döndürür. |
| `throws` | Metodun bir hata fırlatabileceğini belirtir. |
| `throw` | Manuel olarak istisna fırlatır. |

---

## **Sonuç**
- **Java’da hataları yönetmek için `try-catch` blokları kullanılır.**
- **Hata detaylarını görmek için `printStackTrace()` kullanılabilir.**
- **`finally` bloğu, hata olsa da olmasa da çalışır ve genellikle kaynakları kapatmak için kullanılır.**
- **`throws` ve `throw` ile hata fırlatma işlemleri gerçekleştirilebilir.**

🚀 **Exception yönetimi, Java programlarını daha güvenli hale getirir ve hataları etkili bir şekilde ele almamızı sağlar!**

