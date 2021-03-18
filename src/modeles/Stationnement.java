package modeles;

import java.time.LocalDateTime;

public class Stationnement {
    //attributes
    private int num;
    private Vehicule vehicule;
    private Place place;
    private LocalDateTime date_entree;
    private LocalDateTime date_sortie;
    private Tarif tarif;
    //constructors
    public Stationnement(int num, Vehicule vehicule, Place place, LocalDateTime date_entree, LocalDateTime date_sortie, Tarif tarif) {
        this.num = num;
        this.vehicule = vehicule;
        this.place = place;
        this.date_entree = date_entree;
        this.date_sortie = date_sortie;
        this.tarif = tarif;
    }

    public Stationnement() {
    }

    public int getNum() {
        return num;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public Place getPlace() {
        return place;
    }

    public LocalDateTime getDate_entree() {
        return date_entree;
    }

    public LocalDateTime getDate_sortie() {
        return date_sortie;
    }

    public Tarif getTarif() {
        return tarif;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public void setDate_entree(LocalDateTime date_entree) {
        this.date_entree = date_entree;
    }

    public void setDate_sortie(LocalDateTime date_sortie) {
        this.date_sortie = date_sortie;
    }

    public void setTarif(Tarif tarif) {
        this.tarif = tarif;
    }

}
