import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ServiceTest {

    @Test
    void when_getprix_service_should_return_correct_price() {
        Voiture voiture = new Voiture("Volkswagen", 2);
        Voiture voiture2 = new Voiture("Volkswagen", 2);

        Service service = new Service();

        service.ajouter(voiture);
        service.ajouter(voiture2);




        double expectedPrice = 4;
        double price = service.prix();

        Assertions.assertEquals(expectedPrice, price);

    }



}
