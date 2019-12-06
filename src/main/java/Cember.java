public class Cember extends Sekil {
    public int yaricap;
    public static double PI_SAYİSİ = 3.14;

    public Cember(int yaricap){
        this.yaricap = yaricap;
    }

    public double alanHesapla() {
        return PI_SAYİSİ * yaricap * yaricap;
    }

    public double cevreHesapla() {
        return 2* PI_SAYİSİ *  yaricap;
    }

}
