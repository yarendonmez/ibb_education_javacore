# **Java'da String Tanımlama Yöntemleri ve Farkları**

## **1️⃣ `String kelime = new String();`**
Bu yöntemle `String` nesnesi **`new` anahtar kelimesi ile oluşturulur**.

```java
String kelime = new String();
```

### **📌 Özellikleri:**
- **Heap (Yığın) bellekte** yeni bir `String` nesnesi oluşturur.
- `kelime` değişkeni **boş bir String içerir (`""` ile aynıdır).**
- Java, bu `String` nesnesini **String Pool'a (String Havuzu) eklemez!**
- `new` kullanıldığı için her seferinde **yeni bir nesne oluşturulur**.

---

## **2️⃣ `String kelime = "";`**
Bu yöntem ise **doğrudan `String Pool` içinde bir `String` nesnesi oluşturur**.

```java
String kelime = "";
```

### **📌 Özellikleri:**
- `""` ile oluşturulan `String` nesneleri **String Pool (Havuz)** içinde saklanır.
- Aynı değere sahip başka bir `String` değişkeni varsa, **Java aynı nesneyi paylaşır (hafıza tasarrufu sağlar).**
- **Heap'te yeni bir nesne oluşturmaz**, var olan nesneyi kullanır.

---

## **3️⃣ Aralarındaki Temel Farklar**

| **Özellik** | `String kelime = new String();` | `String kelime = "";` |
|------------|--------------------------------|-----------------------|
| **Bellekte Saklandığı Yer** | Heap (Yığın) | String Pool (Havuz) |
| **Nesne Oluşturma** | Her çağrıldığında yeni nesne oluşturur | Aynı değerde bir nesne varsa onu kullanır |
| **Performans** | Daha fazla bellek tüketir, yavaş çalışır | Daha az bellek tüketir, daha hızlıdır |
| **String Pool İçine Girer mi?** | **Hayır** | **Evet** |

---

## **4️⃣ Örnek ile Açıklama**
Bu farkı görmek için şu kodu çalıştırabiliriz:

```java
public class StringFarki {
    public static void main(String[] args) {
        String s1 = "Merhaba";
        String s2 = "Merhaba"; // Aynı nesneyi paylaşır (String Pool)
        String s3 = new String("Merhaba"); // Heap'te yeni nesne oluşturur

        System.out.println(s1 == s2); // true (Aynı nesneyi kullanıyor)
        System.out.println(s1 == s3); // false (Farklı nesneler)
    }
}
```

### **📌 Çıktı:**
```
true
false
```

### **✅ Açıklama:**
- `s1` ve `s2` aynı `"Merhaba"` nesnesini paylaşır, bu yüzden `true` döner.
- `s3` ise `new String("Merhaba")` ile oluşturulduğundan farklı bir nesnedir, bu yüzden `false` döner.

---

## **5️⃣ Sonuç: Hangi Kullanımı Seçmelisin?**
- **Genellikle `String kelime = "";` kullanmalısın!**  
  → Çünkü **daha performanslıdır ve gereksiz bellek tüketmez**.
- **Eğer bilinçli olarak yeni bir `String` nesnesi oluşturman gerekiyorsa `new String()` kullanabilirsin.**  
  → Ama genellikle bu **gereksizdir** ve önerilmez.

---