package percabangan;

public class Switch {
    public static void main(String[] args) {
        char Nilai = 'D';
        switch (Nilai){
            case 'A':
                System.out.println("Mhs     :\"Terimakasih Pak ^^\"");
                System.out.println("Dosen   :\"Selamat Yaa...\"");
                break;
            case 'B':
                System.out.println("Mhs     :\"Kenapa ulun kada dapat A, Pak? \"");
                System.out.println("Dosen   :\"!@#$%\"");
                break;
            case 'C':
                System.out.println("Mhs     :\"Ulun turun pul pak ai, tugas pul jua \"");
                System.out.println("Dosen   :\"Tapi bisa lah menjawab ujian?\"");
                System.out.println("Mhs     :\"Hehe.. \"");
                break;
            default:
                System.out.println("Mhs     :\"Ulun turun pul pak ai, tugas pul jua \"");
                System.out.println("Dosen   :\"Bujur jua kah?\"");
                System.out.println("Dosen   :\"*Memeriksa Berkas..*\"");
                System.out.println("Dosen   :\"*Menceleng!!*\"");
                System.out.println("Mhs     :\"Kaboor.. \"");
                break;
        }


    }
}
