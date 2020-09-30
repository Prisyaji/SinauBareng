// materi nested if (if yang bersarang)

public class Kondisi3 {
    public static void main(String[] args) {
        

        int a = 5;
        int b = 6;

        System.out.println("ini adalah awal dari program");

        if (a == 5){
            
            if ( b == 10) {

                System.out.println("ini jalan apabila a dan b bernilai benar");
            } else {

                System.out.println("ini jalan apabila nilai b/ nilai kedua tidak benar ");
            }
        } else {

            System.out.println("ini dijalankan apabila nilai a sudah bernilai salah walau nilai b benar");
        }

        System.out.println("ini adalah akhir dari program");
    }
    
}
