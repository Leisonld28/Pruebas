package co.com.tigo.qa.utils;

public class EsperaForzada {
    public static void espera(int seg){
        seg = (seg*1000);
        try {
            Thread.sleep(seg);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
