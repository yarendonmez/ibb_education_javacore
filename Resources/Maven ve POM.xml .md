# Maven Nedir?

Maven özetle Apache tarafından geliştirilmiş, yazılım projelerinizin geliştirilmesi sırasında projenin geliştirilmesini kolaylaştıran, basitleştiren ve proje bağımlılıklarının kontrolünü yapmayı sağlayan bir araçtır

Şimdi Maven’ın asıl önemli olduğu noktalara gelelim. Java’da kütüphanelerin JAR(Java Archive) dosyaları ile projeye dahil edildiğini biliyor olmalısınız. JAR, aynı zip gibi çalışan ancak içerisinde genellikle derlenmiş Java sınıfları ve kütüphane ek dosyalarını barındıran arşiv formatıdır. Maven gibi bağımlılık(dependency) yönetim araçları yokken geliştiriciler projelerine başka bir framework ya da kütüphaneyi eklemek istediğinde o projenin sitesinden JAR dosyalarını indirip kendi projelerine ekliyorlardı. Projeye Hibernate eklemek istiyorsanız Hibernate sitesine girip JAR dosyalarını indirip projeye ekliyordunuz. Ancak projede kullanacağınız dependency sayısı artınca bu durum içinden çıkılmaz bir hal alıyor. Her eklenecek bağımlılık için JAR dosyalarını elle eklemek geliştirici için büyük yük. İşte Maven burada devreye giriyor. Maven tüm bunları sizin için yapıyor. Üstelik bu eklediğiniz bağımlılıkların bağımlı olduğu başka dependencyler varsa onları da sizin için projenize dahil ediyor.

# POM.xml ne işe yarıyor?
POM (Project Object Model) projenizin en üst dizininde bulunan proje konfigürasyon bilgilerini içeren xml uzantılı bir dosyadır. Maven’ın ana kalbi diyebiliriz. Üstte bahsettiğimiz Maven’ın yeteneklerini pom.xml içerisinde yapıyoruz. POM içerisinde projenizin adı, paketi, versiyon numarası, repolar, dependencyler ve daha birçok bilgiyi barındırabilir. Projenize bir bağımlılık(dependency) eklemek istediğinizde bu dosya içine yazıyorsunuz. Hemen bir örnekle görelim. Projemize Hibernate’i eklemek istediğimizi düşünelim.
Hibernate sitesine releases sayfasına giriyoruz ve orada tüm versiyonlar listelenmiş durumda. İstediğimiz bir sürümü seçiyoruz.

Sayfaya girdiğimizde Hibernate’in bizim için Maven ekleme kodlarını yazdığını görüyoruz. Bu yalnızca Hibernate için bir durum değil, birçok şirket yeniden kullanılabilir projelerini bu şekilde yayınlıyor.
Üstteki xml satırlarını POM.xml içerisine kopyalıyoruz. Daha sonra projede aşağıdaki gibi update project yapınca bağımlılıklar projemize dahil olmuş oluyor. Bu kadar basit.

## Kaynak: https://tugrulbayrak.medium.com/maven-java-geliştiricisinin-kurtarıcısı-914f345170a2