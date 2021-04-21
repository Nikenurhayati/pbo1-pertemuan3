package percabangan;

public class IfElse {
    public static void main(String[] args) {
        double totalBelanja = 50000;
        double uangDiDompet = 20000;

        if (uangDiDompet<totalBelanja){
            System.out.println("Uang kurang, Kurangi Belanjaan Anda!!");
        }else {
            System.out.println("Uang Cukup, Selamat Menikmati");
        }

    }
}