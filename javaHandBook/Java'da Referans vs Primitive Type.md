
# Java'da Değer Tip ve Referans Tip

## 🟢 1. Değer Tip (Primitive Type)

### 📌 Nedir?
Bellekte **doğrudan değeri** tutan veri tipleridir. Yani değişkenin tuttuğu veri, bellekteki ilgili adreste **bizzat kendisi** yer alır.

### 📦 Örnek Veri Tipleri:
- `int`, `double`, `float`, `char`, `boolean`, `byte`, `short`, `long`

### 🔍 Özellikleri:
- Sabittir, Java'da toplamda 8 tane değer tipi vardır.
- Stack bellekte saklanırlar.
- Daha hızlıdırlar.
- Nesne değildirler.
- `==` ile doğrudan karşılaştırılabilirler.

### 🧪 Örnek:
```java
int a = 5;
int b = a;
b = 10;
System.out.println(a);  // Çıktı: 5
```

---

## 🔵 2. Referans Tip (Reference Type)

### 📌 Nedir?
Değişkenin tuttuğu şey verinin **kendisi değil**, bellekteki **adresidir**. Bu adres aracılığıyla nesneye erişilir.

### 📦 Örnek Veri Tipleri:
- Tüm sınıflar (`String`, `Scanner`, `Array`, `ArrayList`, vb.)
- Nesneler, diziler, wrapper sınıflar (`Integer`, `Double` vs.)

### 🔍 Özellikleri:
- Heap bellekte tutulurlar, referansları stack’te saklanır.
- `==` operatörü adresi karşılaştırır. İçeriği karşılaştırmak için `.equals()` kullanılmalıdır.
- Aynı referansla farklı değişkenler aynı nesneyi gösterebilir.

### 🧪 Örnek:
```java
int[] x = {1, 2, 3};
int[] y = x;
y[0] = 100;
System.out.println(x[0]);  // Çıktı: 100
```

---

## 📊 Değer Tip vs Referans Tip

| Özellik             | Değer Tip (Primitive)         | Referans Tip (Reference)             |
|---------------------|-------------------------------|--------------------------------------|
| Bellek konumu       | Stack                         | Stack (referans) + Heap (nesne)      |
| Tutulan veri        | Doğrudan veri                 | Bellek adresi (referans)             |
| Performans          | Daha hızlı                    | Biraz daha yavaş                     |
| Uygulama alanı      | Sayılar, karakterler          | Nesneler, diziler, sınıflar          |
| Nesne mi?           | Hayır                         | Evet                                 |
| `==` neyi karşılaştırır? | Değerleri               | Adresleri                            |

---

# 🔄 Java'da Referans Tip = Pointer mı?

## ✅ Evet, benzer yönleri var:

- Java’daki **referans tipler**, nesnenin bellekteki yerini tutar. (Yani bir tür "adres")
- Bu açıdan **C/C++’taki pointer’lara benzer şekilde davranır**.
- Referans üzerinden nesneye ulaşılır ve üzerinde işlem yapılabilir.

## ❌ Ama birebir pointer değildir:

| Özellik                          | Java Referans Tip                 | C/C++ Pointer                   |
|----------------------------------|-----------------------------------|----------------------------------|
| Bellek adresini görme            | ❌ Mümkün değil                   | ✅ Adrese erişebilirsin         |
| Pointer aritmetiği (`ptr+1` vb) | ❌ Desteklenmez                   | ✅ Mümkündür                     |
| Bellek güvenliği                 | ✅ Yüksek                         | ❌ Daha riskli (segmentation fault) |
| Düşük seviye işlemler            | ❌ Yapılamaz                      | ✅ Mümkün                        |

---

## 📌 Java Örneği:
```java
String a = "hello";
String b = a;

b = "world";
System.out.println(a); // Çıktı: "hello"
```

> Burada `b = a;` ifadesi, `b`’yi `a` ile aynı nesneye **referans** olacak şekilde atar.

---

## 📌 C Örneği:
```c
char* a = "hello";
char* b = a;

b = "world";
printf("%s", a); // Çıktı: "hello"
```

> Burada `b`, `a` ile aynı adresi tutar ama `b` başka bir adrese yönlendirilince `a` etkilenmez.

---

## 🧠 Özet:
- Java’daki referans tipler **pointer gibi davranır**, ama **gizlidir ve sınırlandırılmıştır**.
- Amaç: **güvenli, kontrol edilebilir, nesne tabanlı** bir yapı sunmak.
- Pointer aritmetiği veya doğrudan adres işlemleri yapılmasına **izin verilmez**.

> 🎯 Kısaca: **Java referansı = Güvenli, soyut bir pointer gibidir.**
