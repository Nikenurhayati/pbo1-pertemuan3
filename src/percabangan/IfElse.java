package percabangan;

public class IfElse {
    public static void main(String[] args) {
        double totalBelanja = 25000;
        double uangDiDompet = 50000;

        if (uangDiDompet<totalBelanja){
            System.out.println("Uang kurang, Kurangi Belanjaan Anda!!");
        }else if (uangDiDompet>totalBelanja){
            double kembali = uangDiDompet - totalBelanja;
            System.out.println("Uang sudah Cukup, Kembali :"+kembali);
        }else {
            System.out.println("Uang Cukup, Selamat Menikmati");
        }

    }
}