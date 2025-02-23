# Giriş
Yazdığımız kaynak kodu, bilgisayarda çalışması için makine koduna çevrilmesi gerekir ve bu işlem de Compilerlar ve Interpreterlar ile sağlanır.

## Compailer

- Yüksek seviyeli bir dil ile yazılmış kod parçasını (JavaScript veya Java gibi) bilgisayarın veya virtual machine gibi programların direkt olarak çalıştırılabildiği düşük seviyeli kod parçasına çeviren (Assembly gibi) bir programdır.
-  Bir compiler’ı 2 parçaya bölebiliriz. Front-end olarak adlandırılan ilk kısmında, Kaynak kod’da bulunan sembolleri içeren veri yapısı tutulur, düzenlenir ve gelen kaynak kod, syntax error, tanımlanan değişkenlere bakmak (gerekirse tipini çıkarmak) ve her değişkenin tanımlandığı yerden önce kullanılmadığını garantilemek gibi işlemler içinde barındırır. Herhangi bir hata ile karşılaşıldığı zaman, kullanıcıya hata mesajı gösterilir. Eğer herhangi bir hata ile karşılaşılmazsa; taranmış, yukarıdaki bahsedilen operasyonlarla işleme tabii tutulmuş ve oluşturulmuş ara kod backend kısmına input olarak verilir.
- Compilerin 1.kısmı olan Front-end’in aşamaları lexical analysis, syntax analysis, semantic analysis and intermediate code generation olarak adlandırılır.
- Compilerin 2.kısmı olan Back-end ise optizimation ve code generation aşamalarını içerir.

# Compailer vs Interpretter

-Interpreters ve compilers birbirine oldukça benzer yapıdadırlar. Aralarındaki temel fark Interpreter kaynak programlama dili ile yazılan komutları doğrudan işlerken, Compiler da o komutları makina diline çevirir.

Interpreter’larda, Compiler’da olduğu gibi lexing, parsing ve type checking vardır. Ama interpreter syntax treeden üretilen koda gerek kalmadan, doğrudan syntax tree üzerinde işlem yapar, ifadelere erişir ve komutları çalıştırır. Aynı syntax tree üzerinde birden fazla çalışma durumunun da olmasından dolayı, interpretation, derlenmiş bir programın çalışmasına kıyasla daha yavaş çalışır.

Aralarındaki farkları madde madde inceleyelim.

- Compiler bir programı bütün olarak alır ve çevirirken; Interpreter programı satır satır çevirir.

- Compiler, ara kod veya hedef kodu oluşturur fakat Interpreter herhangi bir ara kod oluşturmaz. Bundan dolayı Compiler, kodun oluşturulması için daha fazla memory gerektirir.

- Compiler’da, bir hata oluştuduğunda, çeviri işlemi durur ve hata giderildikten sonra bütün program yeniden çeviri işlemine tabii tutulur. Interpreter, bunun tam aksine olarak, eğer bir hata meydana geldiğinde, o anki çeviriyi engeller ve hata giderildiğine çeviriyi kaldığı yerden devam ettirir. Bu yüzden debug işlemi daha kolaydır.

- Compiler’da, Interpreter’e kıyasla hata bulma daha zordur.

- Compiler, C, C++, C#, Scala, TypeScript gibi dillerde kullanılırken, Interpreter PHP, Perl, Ruby, Python gibi dillerde çalıştırılır.

Compilation ve interpretation bir programlama dilini uygulamak için beraber kullanılabilir. Compiler intermediate level code’u ürettikten sonra makine koduna derlenmeden, interpreter tarafından yorumlanır.

Mesela Java kodu önce Object koduna derlenir, çalışma zamanında ise bu object kodu, JVM tarafından, hedef bilgisayarın makine koduna yorumlanır.




















### Kaynak: https://abdulsamet-ileri.medium.com/compilers-ve-interpreters-eacd14a227c4