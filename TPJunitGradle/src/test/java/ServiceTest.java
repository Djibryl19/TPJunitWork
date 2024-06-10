import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ServiceTest {

    @Test
    void when_getprix_service_should_return_correct_price() {
        Voiture voiture1 = new Voiture("Volkswagen", 10000);
        Voiture voiture2 = new Voiture("Volkswagen", 10000);
        Voiture voiture3 = new Voiture("Volkswagen", 10000);
        Voiture voiture4 = new Voiture("Volkswagen", 10000);
        Voiture voiture5 = new Voiture("Volkswagen", 10000);
        Voiture voiture6 = new Voiture("Volkswagen", 10000);
        Voiture voiture7 = new Voiture("Volkswagen", 10000);
        Voiture voiture8 = new Voiture("Volkswagen", 10000);

        Service service = new Service();

        service.ajouter(voiture1);
        service.ajouter(voiture2);
        service.ajouter(voiture3);
        service.ajouter(voiture4);
        service.ajouter(voiture5);
        service.ajouter(voiture6);
        service.ajouter(voiture7);
        service.ajouter(voiture8);

        double expectedPrice = 76000;
        double price = service.prix();

        Assertions.assertEquals(expectedPrice, price, 0.01);
    }

    @Test
    void when_no_car_added_should_throw_exception() {
        Service service = new Service();
        Assertions.assertThrows(ArithmeticException.class, () -> {
            service.prix();
        });
    }
}
