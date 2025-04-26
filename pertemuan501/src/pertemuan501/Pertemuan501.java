/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan501;

/**
 *
 * TGL 26 April 2025
 * @author LAB F
 */
public class Pertemuan501 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        buah apel = new buah ();
        apel.warna = "Hijau";
        apel.SetRasa("Manis");
        
        System.out.printf("Warna Apel diset %s\n",apel.warna );
        System.out.printf("Rasa Apel diset %s\n", apel.GetRasa() );
        
        buah anggur = new buah();
        anggur.warna ="Hitam";
        
        System.out.printf("Warna Anggur diset %s\n",anggur.warna );
        System.out.printf("Rasa Anggur diset %s\n", anggur.GetRasa() );
    }
    
}
class buah {
    public String warna;
    private String rasa;
    
    public void SetRasa(String txRasa){
        this.rasa = txRasa;
        
    }
    public String GetRasa(){
        return this.rasa;
    }
}

