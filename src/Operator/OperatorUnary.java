package Operator;

public class OperatorUnary {
    public static void main(String[] args) {
        int i = 1;
        i++;                    // i tadinya 1 ditambahkan 1 sehingga i = 2
        System.out.println(i);  // hasilnya i = 2
        i++;                    // i tadinya 2 ditambahkan 1 lagi sehingga i = 3
        System.out.println(i);  // hasilnya i = 2+1 = 3
        i = i+1;                // i++ sama dengan i=i+1
        System.out.println(i);  // hasil i=3+1 = 4

        // berlaku juga untuk penambahan angka lain dan operator aritmatika lain
        i+=3;                   // sama dengan i = i+3
        System.out.println(i);

        i+=3;
        System.out.println(i);

        i*=3;                   // sama dengan i = i*3
        System.out.println(i);

        i*=3;
        System.out.println(i);

    }
}
