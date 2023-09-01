import java.util.Comparator;

public class ComparatorKm implements Comparator<Motos>{

    @Override
    public int compare(Motos moto1, Motos moto2) {
        if(moto1.getQuilometragem() > moto2.getQuilometragem()){
            return 1;
        }
        else{
            return -1;
        }
        
    }
    
}
