/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO4.Pertemuan5;

/**
 *
 * @author User
 */
class suaraHewan {
    public String Respons() {
        return("Ini adalah suara hewan\n");
    }
}

class Ayam extends suaraHewan {
    public String Respons() {
        return("Kukuruyuuukkk!!\n");
    }
}

class Kucing extends suaraHewan {
    public String Respons() {
        return("Meow~\n");
    }
}

class Anjing extends suaraHewan {
    public String Respons() {
        return("GUK GUK GUK!!\n");
    }
}

public class tugasPolimorfis {
    public static void main (String[]args) {
        System.out.println("Contoh Polimorfisme");
        suaraHewan objSuara = new suaraHewan();
        Ayam objAyam = new Ayam();
        Kucing objKucing = new Kucing();
        Anjing objAnjing = new Anjing();
        
        suaraHewan [] bunyi = new suaraHewan[4];
        bunyi[0] = objSuara;
        bunyi[1] = objAyam;
        bunyi[2] = objKucing;
        bunyi[3] = objAnjing;
        
        for (int i=0;i<4;i++) {
            System.out.println("Suara ["+i+"] = "+bunyi[i].Respons());
        }
    }
}
