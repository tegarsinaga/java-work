/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul5;

/**
 *
 * @author pc-cold
 */
class Kendaraan{
    public void methodKendaraan()
    {
        System.out.println("Saya bisa bergerak.");
    }
}
class Mobil extends Kendaraan
{
    public void methodKendaraan()
    {
        super.methodKendaraan();
        System.out.println("Saya hanya dapat bergerak di daratan.");
    }
}
public class tugasinheritance {
    public static void main(String[]args)
    {
        Mobil car = new Mobil ();
        car.methodKendaraan();
    }
}
