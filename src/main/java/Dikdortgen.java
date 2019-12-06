public class Dikdortgen extends Sekil {

   public double kısaKenar;
    public double uzunKenar;

    public Dikdortgen(double kısaKenar, double uzunKenar) {
        this.kısaKenar = kısaKenar;
        this.uzunKenar = uzunKenar;
    }

    public double getKısaKenar() {
        return kısaKenar;
    }

    public void setKısaKenar(int kısaKenar) {
        this.kısaKenar = kısaKenar;
    }

    public double getUzunKenar() {
        return uzunKenar;
    }

    public void setUzunKenar(int uzunKenar) {
        this.uzunKenar = uzunKenar;
    }

    @Override
    public double cevreHesapla() {


        return 2*(kısaKenar+uzunKenar);
    }

    @Override
    public double alanHesapla() {
        return this.uzunKenar*this.kısaKenar;
    }
}
