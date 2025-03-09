# **Java String Metotları ve Açıklamaları**

Bu dökümanda Java'da kullanılan temel String metotlarını ve nasıl çalıştıklarını inceleyeceğiz.

---

## **1️⃣ String Tanımlama Yöntemleri**
Java'da String tanımlamanın farklı yolları vardır:

### **1.1 `new String()` Kullanımı**
```java
String vocabulary = new String(" Java öğreNİYOrum ");
```
- Heap bellekte yeni bir String nesnesi oluşturur.
- String Pool'a eklenmez.

### **1.2 `new String();` Boş String Tanımlama**
```java
String vocabulary = new String();
```
- İçeriği olmayan boş bir String oluşturur.

### **1.3 Literallerle String Tanımlama**
```java
String vocabulary = " Java öğreNİYOrum ";
```
- String Pool'da saklanır.
- Aynı içeriğe sahip başka bir değişken varsa, var olan nesne kullanılır.

---

## **2️⃣ String Metotları**
### **2.1 `length()` - String Uzunluğunu Döndürme**
```java
System.out.println("Harf Sayısı: " + vocabulary1.length());
```
- String içindeki karakter sayısını döndürür.

### **2.2 `toUpperCase()` & `toLowerCase()` - Büyük/Küçük Harf Dönüştürme**
```java
System.out.println("BÜYÜK HARF: " + vocabulary1.toUpperCase());
System.out.println("küçük harf: " + vocabulary1.toLowerCase());
```
- `toUpperCase()` tüm harfleri büyük yapar.
- `toLowerCase()` tüm harfleri küçük yapar.

### **2.3 `trim()` - Baş ve Sondaki Boşlukları Kaldırma**
```java
System.out.println("Trim:" + vocabulary1.trim().length());
System.out.println("Trim:" + vocabulary1.trim());
```
- Başında ve sonunda bulunan boşlukları temizler.

### **2.4 `equals()` ve `==` Operatörü - String Karşılaştırma**
```java
System.out.println("== " + (vocabulary1 == vocabulary2));
System.out.println("equals: " + vocabulary1.equals(vocabulary2));
System.out.println("equalsIgnoreCase: " + vocabulary1.equalsIgnoreCase(vocabulary2));
```
- `==` bellek adreslerini karşılaştırır.
- `.equals()` içeriği karşılaştırır.
- `.equalsIgnoreCase()` büyük/küçük harf duyarsız karşılaştırma yapar.

### **2.5 `startsWith()` ve `endsWith()` - Başlangıç/Bitiş Kontrolü**
```java
System.out.println(vocabulary1.startsWith("J") + " ile mi başlıyor");
System.out.println(vocabulary1.endsWith(" ") + " ile mi bitiyor");
```
- `startsWith()` belirtilen harfle mi başlıyor kontrol eder.
- `endsWith()` belirtilen harfle mi bitiyor kontrol eder.

### **2.6 `charAt()` - Belirtilen İndeksteki Karakteri Getirme**
```java
System.out.println(vocabulary1.charAt(1));
```
- Sıfırdan başlayarak belirli bir indeksteki karakteri döndürür.

### **2.7 `substring()` - String Parçalama**
```java
System.out.println(vocabulary1.substring(1));
System.out.println(vocabulary1.substring(1,10));
```
- `substring(başlangıç)` -> Belirtilen indexten itibaren kalan kısmı döndürür.
- `substring(başlangıç, bitiş)` -> Belirtilen aralıktaki kısmı döndürür.

### **2.8 `contains()` - String İçinde Kelime Geçiyor mu?**
```java
System.out.println("Geçiyor mu ? " + vocabulary1.contains("Java"));
```
- Verilen alt string'in içeride olup olmadığını kontrol eder.

### **2.9 `replace()` - String Değiştirme**
```java
vocabulary1 = vocabulary1.replace("Java", "Java 2025");
System.out.println(vocabulary1);
```
- Belirtilen kelimeyi yenisiyle değiştirir.

### **2.10 `concat()` - String Birleştirme**
```java
System.out.println(vocabulary1.concat(" jsp").concat(" jsf"));
```
- İki veya daha fazla String'i birleştirir.

### **2.11 `StringBuilder` ile Birleştirme**
```java
StringBuilder stringBuilder= new StringBuilder();
stringBuilder.append(vocabulary1).append(" jsp").append(" jsf");
System.out.println(stringBuilder.toString());
```
- `StringBuilder` daha performanslıdır, çünkü mutable (değiştirilebilir) bir nesnedir.

### **2.12 `StringBuffer` ile Birleştirme**
```java
StringBuffer stringBuffer= new StringBuffer();
stringBuffer.append(vocabulary1).append(" jsp").append(" jsf");
System.out.println(stringBuffer.toString());
```
- `StringBuffer`, `StringBuilder` gibi çalışır ama **synchronized** olduğu için **çoklu thread ortamlarında güvenlidir**.

### **2.13 `hashCode()` - String'in Hash Kodu**
```java
System.out.println(vocabulary1.hashCode());
System.out.println(vocabulary2.hashCode());
System.out.println(vocabulary3.hashCode());
```
- `hashCode()` String’in içeriğine göre bir hash değeri döndürür.
- İki String aynı içeriğe sahipse, aynı hashCode değerini döndürür.

---

## **3️⃣ Özet**
| **Metot** | **Açıklama** |
|----------|-------------|
| `length()` | String uzunluğunu döndürür |
| `toUpperCase()` | Tüm harfleri büyük yapar |
| `toLowerCase()` | Tüm harfleri küçük yapar |
| `trim()` | Başındaki ve sonundaki boşlukları temizler |
| `equals()` | İçeriği karşılaştırır |
| `==` | Bellek adreslerini karşılaştırır |
| `startsWith()` | Belirli bir harfle mi başlıyor kontrol eder |
| `endsWith()` | Belirli bir harfle mi bitiyor kontrol eder |
| `charAt()` | Belirtilen indeksteki karakteri döndürür |
| `substring()` | String'in bir kısmını döndürür |
| `contains()` | String belirli bir alt kelimeyi içeriyor mu kontrol eder |
| `replace()` | Bir kelimeyi başka bir kelimeyle değiştirir |
| `concat()` | String birleştirir |
| `StringBuilder` | Daha performanslı String birleştirme yöntemi |
| `StringBuffer` | Çoklu thread ortamlarında güvenli String birleştirme yöntemi |
| `hashCode()` | String’in hash değerini döndürür |

---

