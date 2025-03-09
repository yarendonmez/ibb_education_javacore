### **📌 `Integer.valueOf()` vs `Integer.parseInt()` Arasındaki Fark**

Java'da **`String` → `int` dönüşümü** için iki temel yöntem vardır:
1. **`Integer.parseInt(String s)`**
2. **`Integer.valueOf(String s)`**

İkisi de aynı işlemi yapar gibi görünse de aralarında önemli bir fark vardır. Şimdi detaylıca inceleyelim.

---

### **1️⃣ `Integer.parseInt(String s)`**
Bu metot, verilen **String değeri `int` primitive (temel) tipine çevirir**.

📌 **Örnek:**
```java
String cast4String = "10";
int cast4Int = Integer.parseInt(cast4String); // String → int dönüşümü
System.out.println(cast4Int + 20); // Çıktı: 30
```
📌 **Özellikleri:**  
✅ **`int` primitive türü döndürür.**  
✅ **Hafıza açısından daha verimlidir**, çünkü nesne (object) oluşturmaz.  
✅ **Performans açısından daha hızlıdır.**

---

### **2️⃣ `Integer.valueOf(String s)`**
Bu metot, verilen **String değeri `Integer` nesne (wrapper class) türüne çevirir**.

📌 **Örnek:**
```java
String cast4String = "10";
Integer cast4Int = Integer.valueOf(cast4String); // String → Integer dönüşümü
System.out.println(cast4Int + 20); // Çıktı: 30
```
📌 **Özellikleri:**  
✅ **`Integer` wrapper sınıfından bir nesne döndürür.**  
✅ **Otomatik olarak `int` primitive türüne çevrilebilir (unboxing).**  
✅ **Java’nın Integer cache mekanizmasını kullanarak sık kullanılan sayıları optimize eder.**

---

### **3️⃣ `valueOf()` ve `parseInt()` Karşılaştırması**
| **Özellik** | **`Integer.parseInt()`** | **`Integer.valueOf()`** |
|------------|-----------------|----------------|
| **Döndürülen Tür** | `int` (primitive) | `Integer` (wrapper class) |
| **Bellek Kullanımı** | Daha az bellek kullanır (nesne oluşturmaz) | Integer nesnesi oluşturabilir |
| **Performans** | Daha hızlıdır | Cache mekanizmasını kullanır |
| **Otomatik Dönüşüm (Unboxing)** | Gereksiz (zaten `int`) | `Integer` → `int` dönüşümü yapabilir |
| **Nesne Döndürme** | Hayır | Evet |

---

### **4️⃣ Hangisini Kullanmalısın?**
- **Eğer sadece `int` dönüşümü yapacaksan ve nesneye ihtiyacın yoksa,** `parseInt()` kullan.
- **Eğer bir `Integer` nesnesine ihtiyacın varsa veya Wrapper Class kullanıyorsan,** `valueOf()` tercih edebilirsin.

**🚀 Özet:**
- **`parseInt()`** daha hızlıdır ve az bellek tüketir.
- **`valueOf()`** `Integer` nesnesi döndürür ve cache optimizasyonu yapar.

