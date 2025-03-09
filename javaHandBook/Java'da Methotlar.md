# **Java'da Metotlar (Fonksiyonlar) Rehberi**

Bu dökümanda, Java'daki metot türlerini açıklayacağız. Metotlar, bir kod bloğunu tekrar tekrar kullanmak için tanımlanan işlevlerdir. Java'da metotlar genellikle iki temel kategoriye ayrılır:
1. **Returnsüz Metotlar (Void Metotlar)**
2. **Return'lü Metotlar (Geri Dönüş Değeri Olan Metotlar)**

---

## **1️⃣ Returnsüz (Void) Metotlar**
Returnsüz metotlar, herhangi bir değer döndürmezler ve `void` anahtar kelimesi ile tanımlanırlar.

### **📌 1.1 Returnsüz Parametresiz Metot**
- Parametre almaz ve çağrıldığında belirli bir işlemi gerçekleştirir.
- Genellikle ekrana çıktı vermek veya bir işlemi başlatmak için kullanılır.

📌 **Örnek:**
```java
public void metotReturnsuzParametresiz() {
    System.out.println("Methot returnsüz parametresiz.");
}
```
📌 **Çağrılması:**
```java
_13_1_MethodIsNotReturn data1 = new _13_1_MethodIsNotReturn();
data1.metotReturnsuzParametresiz();
```
Çıktı:
```
Methot returnsüz parametresiz.
```

---

### **📌 1.2 Returnsüz Parametreli Metot**
- Parametre alarak belirli bir işlem gerçekleştirir.
- Parametre kullanarak metodu daha dinamik hale getirebiliriz.

📌 **Örnek:**
```java
public static void metotReturnsuzParametreli(String name) {
    System.out.println("Methot returnsüz parametreli. " + name);
}
```
📌 **Çağrılması:**
```java
_13_1_MethodIsNotReturn.metotReturnsuzParametreli("Yaren");
```
Çıktı:
```
Methot returnsüz parametreli. Yaren
```

---

### **📌 1.3 Overloading ile Returnsüz Parametreli Metot**
- Aynı isimde ancak farklı parametre sayısı veya türüyle tanımlanmış metotlardır.
- Metot aşırı yükleme (Overloading) ile aynı metot adı ile farklı işlevler yazabiliriz.

📌 **Örnek:**
```java
public static void metotReturnsuzParametreli(String name, String surname) {
    System.out.println("metot Returnsuz Parametreli "+name+" "+surname);
}
```
📌 **Çağrılması:**
```java
_13_1_MethodIsNotReturn.metotReturnsuzParametreli("Yaren", "Dönmez");
```
Çıktı:
```
metot Returnsuz Parametreli Yaren Dönmez
```

---

## **2️⃣ Return'lü Metotlar**
Return'lü metotlar, belirli bir işlem yaparak bir değer döndürürler. **Dönüş tipi (`int`, `String`, `double` vb.) metot tanımlamasında belirtilmelidir.**

### **📌 2.1 Return'lü Parametresiz Metot**
- Parametre almaz, ancak geriye bir değer döndürür.
- Genellikle bir işlem yapıp sonucu geri döndürmek için kullanılır.

📌 **Örnek:**
```java
public String methotReturnluParametresiz() {
    return "Methot returnlü parametresiz";
}
```
📌 **Çağrılması:**
```java
_13_2_MethodIsReturn isReturn = new _13_2_MethodIsReturn();
String result1 = isReturn.methotReturnluParametresiz();
System.out.println(result1);
```
Çıktı:
```
Methot returnlü parametresiz
```

---

### **📌 2.2 Return'lü Parametreli Metot**
- Parametre alır ve işlemi yaptıktan sonra geriye bir değer döndürür.
- Verilen parametreyi işleyerek bir çıktı üretir.

📌 **Örnek:**
```java
public Integer methotReturnluParametreli(int number) {
    return number;
}
```
📌 **Çağrılması:**
```java
Integer result2 = isReturn.methotReturnluParametreli(5);
System.out.println(result2);
```
Çıktı:
```
5
```

---

## **3️⃣ Returnsüz vs. Return'lü Metotlar Karşılaştırması**

| **Özellik** | **Returnsüz (void) Metot** | **Return'lü Metot** |
|------------|-----------------|-----------------|
| **Dönüş Değeri** | Yok (`void`) | Var (Örn: `int`, `String`) |
| **Geriye Değer Döndürme** | **Döndürmez**, sadece işlem yapar | **Bir işlem sonucu döndürür** |
| **Kullanım Alanı** | **Ekrana çıktı vermek, işlem yapmak** | **Sonuç döndürmek için kullanılır** |
| **Çağrılması** | `metotAdi();` | `String result = metotAdi();` |

---

## **4️⃣ Özet**
| **Metot Türü** | **Tanım** |
|--------------|--------------------------------------|
| **Returnsüz Parametresiz** | Değer döndürmez, parametre almaz |
| **Returnsüz Parametreli** | Değer döndürmez, parametre alır |
| **Return'lü Parametresiz** | Değer döndürür, parametre almaz |
| **Return'lü Parametreli** | Değer döndürür, parametre alır |

**✅ Eğer metot bir işlem yapacak ancak bir sonuç döndürmeyecekse `void` kullanılır.**  
**✅ Eğer metot bir değer döndürüyorsa, dönüş tipi (`int`, `String`, `double` vb.) belirtilmelidir.**

**🚀 Metotları kullanarak kod tekrarını önleyebilir ve programını daha düzenli hale getirebilirsin!**

