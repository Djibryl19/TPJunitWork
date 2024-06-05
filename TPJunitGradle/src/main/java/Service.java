import java.util.ArrayList;

public class Service implements Statistique{


    private ArrayList<Voiture> voitures;


    public Service() {
        this.voitures = new ArrayList();
    }

    public void ajouter(Voiture voiture) {

        voitures.add(voiture);

    }

    public double prix() {
        double prix = 0;
        int nb_voitures = 0;
        float remise = 0;

    for (Voiture voitures : voitures) {

        if (nb_voitures % 5 == 0 && remise <= 20000) {
            for (Voiture voitures2 : this.voitures) {
                voitures2.setPrix(voitures2.getPrix()*0.95);
            }
            nb_voitures += 1;
        }
        else {
            prix += voitures.getPrix();
            nb_voitures += 1;
        }

    }

        return prix;
    }

}
