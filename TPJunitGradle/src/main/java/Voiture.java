public class Voiture {

    private String marque;
    private double prix;
    
    
    public Voiture(String marque, double prix) {
        this.marque = marque;
        this.prix = prix;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}
