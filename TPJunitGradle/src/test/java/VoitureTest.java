import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class VoitureTest {

    /**
     * @Test
     */

    @Test
    void when_getprix_should_return_correct_price() {
        Voiture voiture = new Voiture("Volkswagen", 11800);

        double expectedPrice = 11800;
        double price = voiture.getPrix();

        Assertions.assertEquals(expectedPrice, voiture.getPrix());

    }

    @Test
    void when_setprix_should_set_correct_price() {
        Voiture voiture = new Voiture("Volkswagen", 20000);

        double expectedPrice = 10000;
        voiture.setPrix(10000);
        double price = voiture.getPrix();

        Assertions.assertEquals(expectedPrice, price);

    }

    @Test
    void when_getmarque_should_return_correct_mark() {
        Voiture voiture = new Voiture("Volkswagen", 5800);

        String expectedMarque = "Volkswagen";
        String marque = voiture.getMarque();

        Assertions.assertEquals(expectedMarque, marque);

    }

    @Test
    void when_setmarque_should_set_correct_mark() {
        Voiture voiture = new Voiture("Volkswagen", 5000);

        String expectedMarque = "Mitsubishi";
        voiture.setMarque("Mitsubishi");
        String marque = voiture.getMarque();

        Assertions.assertEquals(expectedMarque, marque);

    }

}
