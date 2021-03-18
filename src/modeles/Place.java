package modeles;

public class Place {
    //attributes
    private int num;
    private boolean etat;
    private Bloc bloc;
    //constructors
    public Place() {
    }

    public Place(int num, boolean etat, Bloc bloc) {
        this.num = num;
        this.etat = etat;
        this.bloc = bloc;
    }

    public int getNum() {
        return num;
    }

    public boolean isEtat() {
        return etat;
    }

    public Bloc getBloc() {
        return bloc;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }

    public void setBloc(Bloc bloc) {
        this.bloc = new Bloc();
        this.bloc.setNom(bloc.getNom());
    }
}
