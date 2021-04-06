//NABILA ASSHAFA PUTRI
package tugas_modul3_searching;
import java.util.Scanner;
public class nomor1_sequential_searching {

    public static void main(String[] args) {
        System.out.println("***** sequential search *****" +"\n");
        String data[] = {"Galileo" , "Archimedes" , "Alkhawarizmi" , "Aljabar" , "Bila" , "Tesla"};
        String key;
        
        //fitur scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan data yang sedang dicari : ");
        key = scan.nextLine();
        
        System.out.print("Data berisi : ");
            for (int i = 0; i <= data.length; i++){
                System.out.print(data[i] + " ");
            }
            
        System.out.println("");
        System.out.println("");
        
        for (int i = 0; i < data.length; i++){
            if (key.equalsIgnoreCase(data[i])){
                System.out.print("Data " + key + " berada pada indeks ke-" +i);
                break; //stop perulangan
            }
        }
        
        System.out.println("\n");
        System.out.println();
        System.out.println("***** SAYA NABILA ASSHAFA PUTRI MENGUCAPKAN TERIMAKASIH*****");
    }    
}
