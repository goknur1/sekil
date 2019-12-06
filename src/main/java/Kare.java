public class Kare extends Sekil {


    public double kenar;

    public double getKenar() {
        return kenar;
    }

    public void setKenar(double kenar) {
        this.kenar = kenar;
    }

    public Kare(double kenar) {
        this.kenar= (int) kenar;


    }

    @Override
    public double cevreHesapla() {

    return 4*this.kenar;
    }
    @Override
    public double alanHesapla() {
        return this.kenar*this.kenar;

    }


}
