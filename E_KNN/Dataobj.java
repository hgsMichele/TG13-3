public class Dataobj {
    int x;
    int y;
    int Klasse;
    
    public Dataobj(int x, int y, int klasse) {
        this.x = x;
        this.y = y;
        Klasse = klasse;
    }

    public Dataobj(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getKlasse() {
        return Klasse;
    }

    public void setKlasse(int klasse) {
        Klasse = klasse;
    }

    @Override
    public String toString() {
        return "Dataobj [x=" + x + ", y=" + y + ", Klasse=" + Klasse + "]\n";
    }

    
}
