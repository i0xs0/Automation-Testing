package HomeTest;

import Base.BaseClass;
import Pages.TestPages;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass {


    @Test
    public void HomePageLoginMethod() throws InterruptedException {
        TestPages homepage = new TestPages(driver);
        homepage.OpenUrl();
    }


    @Test
    public void TuwaiqTestMethod() throws InterruptedException {
        TestPages homepage = new TestPages(driver);
        homepage.OpenUrl();
        homepage.ChangeLanguge();
        Thread.sleep(2000);
        homepage.ClickBootCamp();
        Thread.sleep(2000);
        homepage.ClickFilter();
        Thread.sleep(2000);
        homepage.ClickSearche();
        Thread.sleep(2000);
        homepage.EnterText();
        Thread.sleep(2000);
        homepage.ClickRegion();
        Thread.sleep(2000);
        homepage.SelectFromRegion();
        Thread.sleep(2000);
        homepage.ClickData();
        Thread.sleep(2000);
        homepage.ClickCatogray();
        Thread.sleep(2000);





    }

    @Test
    public void BootCampMethod1() throws InterruptedException {
        TestPages homepage = new TestPages(driver);
        homepage.OpenUrl();
        homepage.ChangeLanguge();
        Thread.sleep(2000);
        homepage.ClickBootCamp();
        Thread.sleep(2000);
        homepage.Scroll(0, 600);
        Thread.sleep(2000);
        homepage.ClickBoot2();
        Thread.sleep(2000);








    }





        /*
        homepage.test();
        Thread.sleep(1000);

        homepage.test2();
        Thread.sleep(1000);




        /*
        homepage.LoginHomePageMethod();
        homepage.EnterLoginCredentials();
        homepage.click1();
        homepage.click2();
        homepage.;
*/

        //Thread.sleep(1000);




}




