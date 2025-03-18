
package pertemuan301;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author Trisandi Goser
 * TGL 18 Maret 2025
 */
public class Pertemuan301 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nama="";
        String kelas = "";
        String noAbsen = "";
        int nilai = 0;
        
        BufferedReader dtIN = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.print("Input Nama siswa: ");
            nama = dtIN.readLine();
            
            System.out.print("Input Kelas: ");
            kelas =dtIN.readLine();
            
            System.out.print ("Input Nilai: ");
            nilai = Integer.parseInt(dtIN.readLine());
            
        }catch(IOException err){
            System.out.println("Error Baca keyboard");
        
        }
        
        String ket="Tidak Lulus";
        
        noAbsen = JOptionPane.showInputDialog( "input Data Absen")
       if(nilai>60){
           ket = "Lulus";
       }
        System.out.printf("Nama Siswa %S dari kelas %S dengan nilai %d dinyatakan %S",nama,kelas,nilai,ket);
        
    }
    
}
