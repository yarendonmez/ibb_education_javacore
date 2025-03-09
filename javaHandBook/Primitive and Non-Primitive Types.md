Java'da veri tipleri primitive ve nonprimitive olmak üzere 2 sınıfa ayrılır.

# What are Primitive Data Types?

Temel değişkenleri tutan veri tipleridir.
- byte, short, int, long, float, double, char, and boolean

## Özellikleri:
- Direkt olarak hafızada depolanırlar ve bu sebeple erişim hızlıdır.
- Varsayılan değerleri vardır. (Sayısal veriler için 0, karakter için \u0000 ve boolean için false)
- Yığında tahsis edilirler, bu da belleklerinin çalışma zamanı tarafından verimli bir şekilde yönetildiği anlamına gelir ve boş olamazlar.
- Her ilkel türün sabit bir bellek boyutu vardır, bu da bellek kullanımını öngörülebilir ve verimli hale getirir.

# What are Non-Primitive Data Types?

Referans türleri olarak da bilinir, karmaşık verileri ve ilkel türlerden daha karmaşık yapıları temsil eder.
Sınıflar, diziler, arayüzler ve daha fazlasını içerirler. Gerçek değerleri depolayan primitive türlerin aksine, nonprimitive bellekteki nesnelere referansları depolar.

## Ana Kategoriler
- Sınıflar: Java'da nesne yönelimli programlamanın yapı taşı. Örnekler arasında String, Integer, System ve Person, Car gibi kullanıcı tanımlı sınıflar bulunur.
- Arayüzler: Sınıfların uygulaması gereken bir davranışı belirtmek için kullanılan soyut bir tür. Örneğin, List, Map ve Serializable arayüzleri.
- Diziler: Aynı türdeki öğelerin bir koleksiyonu. Diziler hem ilkel hem de ilkel olmayan türleri tutabilir.

### Kaynak: https://medium.com/@AlexanderObregon/java-data-types-primitive-vs-non-primitive-417925cee746