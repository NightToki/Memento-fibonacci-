package memento01;
import java.util.ArrayList;
import java.util.List;
public class CareTaker {
	private List<Memento> mementoList = new ArrayList<Memento>();
	 
    public void add(Memento value){
       mementoList.add(value);
    }
    
    public Memento get(int index) {
        if (index < mementoList.size()) {
            return mementoList.get(index);
        }
        return null;
 
    }

}

