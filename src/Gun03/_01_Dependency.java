package Gun03;

import Utils.GeneralWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
  interviewlarda sorulan bir konu : testlere öncelikleri nasıl verirsin ?
  priority, dependecy;   Nasıl kullanırsın ?
  1- priority =1 gibi sıralı rakamlar vererek bununla çalışma sırasını belirtirim.
  2- dependOnMethods : bununla kendinden önce hangi metod çalışması gerekiyor ise onu belirtirim.
     bir metodu direkt çalıştırdığınızda kendinden önce bağımlı 1  metod var ise ototmaitk onları
     önce çağırıp sonra kendisi çalışır. Fakat 2 veya daha fazla tane var ise bağımlı olduğu metod ozaman çalışamaz.
*/
public class _01_Dependency {

    @Test
    void startcar()
    {

        System.out.println("Starting car");
    }

    @Test (dependsOnMethods = {"startcar"} )  // startcar'ın hatasız çalışmasına bağlı
    void Drivecar()
    {
        System.out.println("Drive car");
       Assert.fail();
    }

    @Test (dependsOnMethods = {"startcar","Drivecar"} )  // start ve drive çalışmasına bağlı, bu testin çalışması için iki testin hatasız çalışması lazım
    void parkcar()
    {
        System.out.println("Drive car");

    }

    @Test (dependsOnMethods = {"parkcar"} ,alwaysRun = true)  // parkcar a bağlı ancak hat çıksa bile alwaysrun true olduğu için daima çalışır
    void stopcar()
    {
        System.out.println("Drive car");
    }


}
