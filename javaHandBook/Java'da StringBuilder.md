# **Java `StringBuilder` Kullanımı ve Detayları**

## **1️⃣ `StringBuilder` Nedir?**
Java'da `String` nesneleri **immutable** (değiştirilemez) olduğu için her değişiklikte **yeni bir nesne oluşturulur**. Bu, **bellek tüketimini artırır ve performansı düşürür**.

📌 **Örnek: `String` Kullanımı**
```java
String str = "Merhaba";
str = str + " Dünya"; // Yeni bir String nesnesi oluşuyor!
```
Bu her değişiklikte **yeni bir nesne oluşturur**, bu yüzden **performans açısından verimsizdir**.

**İşte burada `StringBuilder` devreye giriyor!**
- **Değiştirilebilir (`mutable`) bir nesne** sağlar.
- **Bellekte yeni nesne oluşturmaz**, aynı nesne üzerinde değişiklik yapar.
- **Performans açısından daha hızlıdır**, özellikle çok fazla string birleştirme işlemi yapıyorsan.

📌 **Örnek: `StringBuilder` Kullanımı**
```java
StringBuilder sb = new StringBuilder("Merhaba");
sb.append(" Dünya"); // Aynı nesne üzerinde işlem yapar
System.out.println(sb); // Çıktı: Merhaba Dünya
```
**✅ Burada yeni bir `String` nesnesi oluşturulmadı, var olan nesne değiştirildi!**

---

## **2️⃣ `StringBuilder` Metotları**

### **📌 `append()` – String ekleme**
```java
StringBuilder sb = new StringBuilder("Java");
sb.append(" Programlama");
System.out.println(sb); // Çıktı: Java Programlama
```
- `append()` metodu, belirtilen stringi sona ekler.

### **📌 `insert()` – Belirli bir yere ekleme**
```java
StringBuilder sb = new StringBuilder("Merhaba!");
sb.insert(7, " Dünya");
System.out.println(sb); // Çıktı: Merhaba Dünya!
```
- `insert(index, value)` → **Belirtilen indekse string ekler.**

### **📌 `replace()` – Parça değiştirme**
```java
StringBuilder sb = new StringBuilder("Java Güzel");
sb.replace(5, 10, "Harika"); 
System.out.println(sb); // Çıktı: Java Harika
```
- `replace(start, end, newText)` → **Belirtilen aralıktaki stringi değiştirir.**

### **📌 `delete()` – Silme**
```java
StringBuilder sb = new StringBuilder("Java Programlama");
sb.delete(5, 16);
System.out.println(sb); // Çıktı: Java
```
- `delete(start, end)` → **Belirtilen aralıktaki karakterleri siler.**

### **📌 `reverse()` – String'i ters çevirme**
```java
StringBuilder sb = new StringBuilder("Merhaba");
sb.reverse();
System.out.println(sb); // Çıktı: abahreM
```
- `reverse()` metodu, stringi tersine çevirir.

---

## **3️⃣ `StringBuilder` vs `StringBuffer`**
İkisi de aynı işi yapar ama **farklıdır**:
| **Özellik** | **StringBuilder** | **StringBuffer** |
|------------|----------------|----------------|
| **Hız** | Daha hızlı | Daha yavaş |
| **Thread-Safety** | **Senkronize değil** (Thread-safe değil) | **Senkronize** (Thread-safe) |
| **Kullanım** | Tek iş parçacığında kullanılır | Çoklu iş parçacığında güvenlidir |

📌 **Eğer çoklu iş parçacığı (multi-threading) kullanmıyorsan, `StringBuilder` daha iyi performans sağlar.**

---

## **4️⃣ Ne Zaman `StringBuilder` Kullanmalısın?**
✅ **Çok fazla string birleştirme veya değiştirme işlemi yapıyorsan.**  
✅ **Performans önemliyse.**  
✅ **Tek iş parçacığında çalışıyorsan.**

**📌 Eğer string sadece okunacaksa ve değiştirilmeyecekse, `String` kullanman daha iyidir.** Ama **sürekli ekleme, değiştirme gibi işlemler yapacaksan `StringBuilder` çok daha verimli olur.**

---

## **5️⃣ Özet**
| **Metot** | **Açıklama** |
|----------|-------------|
| `append()` | String'in sonuna ekleme yapar |
| `insert()` | Belirtilen indekse string ekler |
| `replace()` | Belirtilen aralıktaki stringi değiştirir |
| `delete()` | Belirtilen aralıktaki karakterleri siler |
| `reverse()` | String’i ters çevirir |

---

## **Sonuç**
- `String` **immutable** (değiştirilemez), `StringBuilder` **mutable** (değiştirilebilir).
- `StringBuilder`, `String`'e göre **çok daha hızlı ve verimli** çalışır.
- `StringBuffer`, `StringBuilder` ile aynıdır ama **synchronized** olduğu için daha yavaştır.

**🚀 Genel olarak, eğer `String` üzerinde çok fazla işlem yapıyorsan, `StringBuilder` kullanmalısın!**

