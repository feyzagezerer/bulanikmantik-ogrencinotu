
package ogrencibasarinotu;

import java.io.File;
import java.net.URISyntaxException;
import net.sourceforge.jFuzzyLogic.FIS;


public class BasariNotu {
    private FIS fis;
    private double derse_devam;
    private double odev_sayisi;
    private double sinav_notu;
      
    public BasariNotu(double dersed,double odevs,double sinavn)throws URISyntaxException{
        derse_devam=dersed;
        odev_sayisi=odevs;
        sinav_notu=sinavn;
             
        File dosya=new File(getClass().getResource("ogrencibasarinotu.fcl").toURI());
        fis=FIS.load(dosya.getPath(),true);
       
        fis.setVariable("derse_devam",derse_devam );
        fis.setVariable("odev_sayisi", odev_sayisi);
        fis.setVariable("sinav_notu", sinav_notu);
        fis.evaluate();
        
    }
  
    /*
    public BasariNotu()throws URISyntaxException
    { 
    //inputsuz grafik çizdirmek için kullandığım fonksiyon
        File dosya=new File(getClass().getResource("ogrencibasarinotu.fcl").toURI());
        fis=FIS.load(dosya.getPath(),true);
    }   
    */
   public FIS getModel(){
        return fis;
    }
   
    @Override
    public String toString(){
        String cikti="Derse devam : "+derse_devam+"\n"
                    +"Odev sayisi : "+odev_sayisi+"\n"
                    +"Sinav notu : "+sinav_notu+"\n"
                    +"Basari notu : "+fis.getVariable("basari_notu").getValue();
        return cikti;
    }
}
