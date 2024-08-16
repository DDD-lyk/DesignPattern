package DependenceInversionPrinciple;

public class CarTest {
    public static void main(String[] args) {
        IDriver driver = new Driver();
        driver.driver(new Benz());
        driver.driver(new BM());
    }
}