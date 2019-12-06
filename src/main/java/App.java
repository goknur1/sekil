import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



    public class App {

        static List<Sekil> sekilList = new ArrayList<Sekil>();


        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);


            sekilOlustur(scanner);

            cevreHesaplariniGoster(sekilList);

            alanHesaplariniGoster(sekilList);




        }

        public static void cevreHesaplariniGoster(List<Sekil> sekilList){

            for (Sekil sekil : sekilList) {
                System.out.println(" çevresi: "+sekil.cevreHesapla());

            }

        }

        public static void alanHesaplariniGoster(List<Sekil> sekilList){

            for (Sekil sekil : sekilList) {
                System.out.println(" alani:"+ sekil.alanHesapla());

            }

        }

        public static void sekilOlustur(Scanner scanner){

            Sekil sekil;

            boolean cikisYap = true;

            while (cikisYap){

                System.out.println("Lütfen yapmak istediğiniz işlemi seciniz");
                System.out.println("1- Kare");
                System.out.println("2- Dikdörtgen");
                System.out.println("3-Çember");
                System.out.println("Çıkıs yapmak için lütfen 0'a basiniz!!!");

                int sekilIcinGirilenSayi = scanner.nextInt();


                switch (sekilIcinGirilenSayi){
                    case 0:
                        System.out.println("Çıkış yapildi");
                        cikisYap = false;
                        break;
                    case 1:
                        System.out.println("Karenin kenarını giriniz");

                        double kenar = scanner.nextDouble();

                        sekil = new Kare(kenar);

                        sekilList.add(sekil);

                        break;
                    case 2:
                        System.out.println("dikdörtgenin uzun kenarını girin");

                        double uzunKenar= scanner.nextDouble();

                        System.out.println("dikdörtgenin kısa kenarını girin");

                        double kisaKenar = scanner.nextDouble();

                        sekil = new Dikdortgen(uzunKenar, kisaKenar);

                        sekilList.add(sekil);

                        break;
                    case 3:
                        System.out.println("Çemberin yaricapını giriniz");

                        int yaricap = scanner.nextInt();

                        sekil = new Cember(yaricap);

                        sekilList.add(sekil);

                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + sekilIcinGirilenSayi);
                }
            }
        }

    }
