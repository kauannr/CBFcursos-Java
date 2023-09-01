import java.util.Comparator;

public class ComparatorMoto implements Comparator<Motos>{
//Comparar por ordem alfabética
    @Override
    public int compare(Motos moto1, Motos moto2) {
        if(moto1.getNome().compareToIgnoreCase(moto2.getNome()) > 0){
            return 1;
        }else{
            return -1;
        }

        }
        
    }
    

