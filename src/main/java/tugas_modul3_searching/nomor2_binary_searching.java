//NABILA ASSHAFA PUTRI NIM 20090105

package tugas_modul3_searching;
import java.util.Scanner;
public class nomor2_binary_searching {
    
    public static void main(String[] args) {
        System.out.println("\t" + "** binary search **" +"\n");
        
        int data[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        Scanner scan = new Scanner(System.in);
        System.out.println("Data yang sedang dicari ialah : ");
        int cari = scan.nextInt();
        
        int indeksawal = 0;
        int indeksakhir = data.length - 1;
        int ketemu = 0;
        int point = 0;
        
        System.out.println("Data berisi : ");
        for (int i = 0; i<data.length; i++){
            System.out.print(data[i] +" ");
        }
        System.out.println("");
        System.out.println("");
        
        while ((indeksawal <= indeksakhir) && (ketemu== 0)){
        point = (indeksawal + indeksakhir) / 2;
        System.out.println("Indeks pointer: "+ point);
            
            if(cari == data[point]){
                ketemu = 1;
                System.out.println("Data " +cari + " telah ditemukan dan berada pada indeks ke- "+ point);
        }
            else if (cari < data[point]){
                System.out.println("Cari dikiri: ");
                indeksakhir = point - 1;
            }
            
            else {
                indeksawal = point + 1;
                System.out.println("Cari dikanan: ");
            }
    }
        
        if (ketemu == 1)
            System.out.println("Kesimpulan : Data dapat ditemukan oleh sistem ");
        else
            System.out.println("Kesimpulan : Data tidak dapat ditemukan oleh sistem  ");
        
        System.out.println();
        System.out.println("***** saya nabila asshafa putri mengucapkan terimakasih *****");
    }
}
