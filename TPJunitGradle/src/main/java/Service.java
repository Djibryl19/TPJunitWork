import java.util.ArrayList;

public class Service implements Statistique {

    private ArrayList<Voiture> voitures;

    public Service() {
        this.voitures = new ArrayList<>();
    }

    public void ajouter(Voiture voiture) {
        voitures.add(voiture);
    }

    public double prix() throws ArithmeticException {
        if (voitures.isEmpty()) {
            throw new ArithmeticException("Il n'y a pas de voiture");
        }

        double prixTotal = 0;
        int nb_voitures = 0;
        double remise = 0;

        for (Voiture voiture : voitures) {
            prixTotal += voiture.getPrix();
            nb_voitures++;
            if (nb_voitures % 5 == 0) {
                remise += 0.05;
            }
        }

        remise = Math.min(remise, 1.0); // Remise maximale de 100%
        double remiseMax = 20000; // Remise maximale en euros
        double montantRemise = prixTotal * remise;

        if (montantRemise > remiseMax) {
            montantRemise = remiseMax;
        }
        else {
            // Pas d'action nécessaire
            // montantRemise reste inchangé
        }

        prixTotal -= montantRemise;

        return prixTotal;
    }
}
