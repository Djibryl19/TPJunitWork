import java.util.ArrayList;

public class StatistiqueVoiture implements Statistique{


    private ArrayList<Voiture> voitures;


    public StatistiqueVoiture() {
        this.voitures = new ArrayList();
    }

    public void ajouter(Voiture voiture) {

        voitures.add(voiture);

    }

    public double prix() {
        if (voitures.isEmpty()) {
            throw new ArithmeticException("Il n'y aucune voiture !");
        }

        double prixTotal = 0;
        double remiseTotale = 0;

        for (int i = 0; i < voitures.size(); i++) {
            Voiture voiture = voitures.get(i);
            double prixVoiture = voiture.getPrix();

            int groupeDeCinq = (i / 5) + 1;
            double remise = 0.05 * groupeDeCinq * prixVoiture;

            if (remiseTotale + remise > 20000) {
                remise = 20000 - remiseTotale;
            }
            remiseTotale += remise;

            prixTotal += prixVoiture - remise;
        }

        return prixTotal;
    }

}
