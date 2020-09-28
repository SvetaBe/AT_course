import java.util.*;

public class Cellar extends ArrayList<Cask> {
    @Override
    public boolean add(Cask casc) {
        Random chanse = new Random();
        if (chanse.nextInt(99) == 0) {
            return false;
        }
        return super.add(casc);
    }


    public Cask getByLabel(String label) {
        for (Integer index = 0 ; index < this.size(); index++ ) {
            if ( this.get(index).label.equals(label)){
                Random chanse = new Random();
                if (chanse.nextInt(99) <= 1) {
                    this.remove((int) index);
                    throw new RuntimeException("Oops! The cask has been broken!\n");
                }
                Cask gotenCask =  this.get(index);
                this.remove((int) index);
                return gotenCask;
            }
        }
        return null;
    }
}