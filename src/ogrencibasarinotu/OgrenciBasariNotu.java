/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ogrencibasarinotu;

import net.sourceforge.jFuzzyLogic.plot.JFuzzyChart;
import java.net.URISyntaxException;
import java.util.Scanner;

/**
 *
 * @author feyza
 */
public class OgrenciBasariNotu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner in =new Scanner(System.in);
        System.out.println("Derse devam(%):");
        double derse_devam =in.nextDouble();
        System.out.println("Ödev Sayısı(0-5):");
        double odev_sayisi =in.nextDouble();
        System.out.println("Sınav Notu(0-100):");
        double sinav_notu =in.nextDouble();
    
        try{
            
            BasariNotu b=new BasariNotu(derse_devam,odev_sayisi,sinav_notu);
               
            JFuzzyChart.get().chart(b.getModel());
            System.out.println(b);

        }
        catch(URISyntaxException ex)
        {
            System.out.print("HATA");
        }
    }
    
}
