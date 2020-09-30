// materi if else if statement

public class Kondisi2 {
    public static void main(String[] args) {
        int a = 5;

        System.out.println("ini adalah awal program");

        // if else if statement rumus

        // if(ekspresi 1){

        //     statement 1;

        // } else if (ekspresi 2){
        //     statement 2;
        // } else {
        //     statement default;
        // }

        // if (a == 5 ){

        //     System.out.println("ini adalah aksi 1"); // ini yang dijalankan

        // } else if (a == 10) {

        //     System.out.println("ini adalah aksi 2");
        
        // } else {

        //     System.out.println("ini adalah aksi default jika semua tidak terpenuhi");
        // }


        // if (a == 9 ){

        //     System.out.println("ini adalah aksi 1"); 

        // } else if (a == 5) {

        //     System.out.println("ini adalah aksi 2"); // ini yang dijalankan
        
        // } else {

        //     System.out.println("ini adalah aksi default jika semua tidak terpenuhi");
        // }


        if (a == 9 ){

            System.out.println("ini adalah aksi 1"); 

        } else if (a == 10) {

            System.out.println("ini adalah aksi 2"); 
        
        } else {

            System.out.println("ini adalah aksi default jika semua tidak terpenuhi"); // ini yang dijalankan
        }

        //jika kondisi bernilai sama yang dijalankan dulu tetap aksi 1

        if (a == 5 ){

            System.out.println("ini adalah aksi 1"); // ini yang dijalankan

        } else if (a == 5) {

            System.out.println("ini adalah aksi 2"); 
        
        } else {

            System.out.println("ini adalah aksi default jika semua tidak terpenuhi"); 
        }
        // akhir dari if else if statement
        System.out.println("ini adalah akhir program");
    }
}
