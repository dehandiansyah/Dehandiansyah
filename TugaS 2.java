/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pkg2;

/**
 *
 * @author Kobong
 */
public class Tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nilaiAndroid = 40;
        String wajah = "cantk";
        String asal =  "malng";
        

        System.out.println("Apakah Kamu Mau Menikahh ?");
        
        char nilaiAndroidHuruf;
        if(nilaiAndroid >= 85){
            nilaiAndroidHuruf = 'A';
        }
        else if(nilaiAndroid >= 75){
            nilaiAndroidHuruf = 'B';
        }
        else if(nilaiAndroid >= 65){
            nilaiAndroidHuruf = 'C';
        }
        else if(nilaiAndroid >= 55){
            nilaiAndroidHuruf = 'D';
        }
        else{
            nilaiAndroidHuruf = 'E';
        }
        
        
        if(nilaiAndroidHuruf == 'A' && wajah == "cantik" && asal == "malang"){
            System.out.println("Mau banget dong");
        }
        else if((nilaiAndroidHuruf == 'A' || nilaiAndroidHuruf == 'C') && wajah == "cantik" && asal == "malang"){
            System.out.println("Bolehlahh...");  
        }
        else if(asal == "malang"){
            System.out.println("Saya pikir dulu");
        }
        else{
            System.out.println("Absolutely No !!");
        }
    }
    
}
     
