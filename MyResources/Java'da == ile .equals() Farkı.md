# **Java'da `==` ve `.equals()` Farkı**

## **1️⃣ `==` Operatörü**
`==` operatörü, **bellek adreslerini** karşılaştırır. Yani iki değişkenin **aynı nesneye mi işaret ettiğini** kontrol eder.

### **📝 Örnek:**
```java
public class Test {
    public static void main(String[] args) {
        String s1 = "Merhaba";
        String s2 = "Merhaba";
        String s3 = new String("Merhaba");

        System.out.println(s1 == s2); // true (Aynı String Pool nesnesi)
        System.out.println(s1 == s3); // false (Heap'te farklı nesneler)
    }
}
```

### **📌 Açıklama:**
- `s1` ve `s2`, **String Pool** içinde aynı nesneye işaret ettiği için `true` döner.
- `s3`, `new String()` ile oluşturulduğundan **Heap'te yeni bir nesne** oluşur, bu yüzden `s1 == s3` **false** döner.

---

## **2️⃣ `.equals()` Metodu**
`.equals()` metodu, **içerik karşılaştırması** yapar. Yani iki String'in **aynı karakterleri içerip içermediğini** kontrol eder.

### **📝 Örnek:**
```java
public class Test {
    public static void main(String[] args) {
        String s1 = "Merhaba";
        String s2 = "Merhaba";
        String s3 = new String("Merhaba");

        System.out.println(s1.equals(s2)); // true (İçerikler aynı)
        System.out.println(s1.equals(s3)); // true (İçerikler aynı)
    }
}
```

### **📌 Açıklama:**
- `.equals()` **sadece karakter içeriğini kontrol eder.**
- `s1.equals(s2)` ve `s1.equals(s3)` **true** döner çünkü **içerikleri aynıdır.**

---

## **3️⃣ `==` vs `.equals()` Karşılaştırması**

| **Karşılaştırma** | `==` Operatörü | `.equals()` Metodu |
|------------------|---------------|------------------|
| **Karşılaştırdığı Şey** | Bellek adresi (referans) | İçerik (değer) |
| **Aynı nesneyi mi kontrol eder?** | Evet | Hayır |
| **Aynı içeriği mi kontrol eder?** | Hayır | Evet |
| **Genellikle Kullanım Amacı** | Nesnelerin aynı olup olmadığını kontrol etmek | İçerik karşılaştırması yapmak |

---

## **4️⃣ Özet: Hangisini Kullanmalısın?**
- Eğer **iki değişkenin aynı nesneye mi işaret ettiğini** kontrol etmek istiyorsan, `==` kullanabilirsin.
- Eğer **iki değişkenin içeriklerinin aynı olup olmadığını** kontrol etmek istiyorsan, `.equals()` kullanmalısın.

**🚀 Genel olarak, `String` karşılaştırmalarında `.equals()` kullanmak en doğru yaklaşımdır!**

