import java.util.Scanner;

class Tabung {
    private double jariJari;
    private double tinggi;
    private String nama;

    public Tabung(String nama) {
        this.nama = nama;
    }

    public void inputNilai() {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jari-jari tabung:");
        jariJari = input.nextDouble();
        System.out.println("Masukkan tinggi tabung:");
        tinggi = input.nextDouble();
    }

    public void luasPermukaan() {
        double luasPermukaan = 2 * Math.PI * jariJari * (jariJari + tinggi);
        System.out.println("Luas permukaan " + nama + " adalah: " + luasPermukaan);
    }

    public void volume() {
        double volume = Math.PI * Math.pow(jariJari, 2) * tinggi;
        System.out.println("Volume " + nama + " adalah: " + volume);
    }
}

class Kubus {
    private double sisi;
    private String nama;

    public Kubus(String nama) {
        this.nama = nama;
    }

    public void inputNilai() {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan panjang sisi kubus:");
        sisi = input.nextDouble();
    }

    public void luasPermukaan() {
        double luasPermukaan = 6 * Math.pow(sisi, 2);
        System.out.println("Luas permukaan " + nama + " adalah: " + luasPermukaan);
    }

    public void volume() {
        double volume = Math.pow(sisi, 3);
        System.out.println("Volume " + nama + " adalah: " + volume);
    }
}

class Balok {
    private double panjang;
    private double lebar;
    private double tinggi;
    private String nama;

    public Balok(String nama) {
        this.nama = nama;
    }

    public void inputNilai() {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan panjang balok:");
        panjang = input.nextDouble();
        System.out.println("Masukkan lebar balok:");
        lebar = input.nextDouble();
        System.out.println("Masukkan tinggi balok:");
        tinggi = input.nextDouble();
    }

    public void luasPermukaan() {
        double luasPermukaan = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
        System.out.println("Luas permukaan " + nama + " adalah: " + luasPermukaan);
    }

    public void volume() {
        double volume = panjang * lebar * tinggi;
        System.out.println("Volume " + nama + " adalah: " + volume);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Balok balok = new Balok("balok");
        Kubus kubus = new Kubus("kubus");
        Tabung tabung = new Tabung("tabung");

        balok.inputNilai();
        balok.luasPermukaan();
        balok.volume();

        kubus.inputNilai();
        kubus.luasPermukaan();
        kubus.volume();

        tabung.inputNilai();
        tabung.luasPermukaan();
        tabung.volume();
    }
}
