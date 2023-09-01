import java.util.Comparator;

public class ComparatorCilindrada implements Comparator<Motos>{

    @Override
    public int compare(Motos moto1, Motos moto2) {
        if(moto1.getCilindrada() > moto2.getCilindrada()){

            return 1;
        }
        else{
            return -1;
        }
         
    }
    
}
