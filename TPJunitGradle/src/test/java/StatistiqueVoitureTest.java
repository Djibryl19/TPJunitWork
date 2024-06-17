import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatistiqueVoitureTest {

    @Test
    void when_getprix_service_should_return_correct_price() {
        Voiture voiture1 = new Voiture("Volkswagen", 10000);
        Voiture voiture2 = new Voiture("Volkswagen", 10000);
        Voiture voiture3 = new Voiture("Volkswagen", 10000);

        Service service = new Service();

        service.ajouter(voiture1);
        service.ajouter(voiture2);
        service.ajouter(voiture3);

        double expectedPrice = 28500;
        double price = service.prix();

        Assertions.assertEquals(expectedPrice, price);

    }


    void when_no_voitures_should_throw_arithmetic_exception() {
        Service service = new Service();

        Assertions.assertThrows(ArithmeticException.class, () -> {
            service.prix();
        });
    }



}
