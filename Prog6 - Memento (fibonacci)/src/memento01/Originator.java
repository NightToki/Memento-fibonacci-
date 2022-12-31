package memento01;

import java.math.*;

public class Originator {
	private BigInteger value;
	 
    public void setValue(BigInteger one){
       this.value = one;
    }

    public BigInteger getValue(){
       return value;
    }

    public Memento saveValueToMemento(){
       return new Memento(value);
    }

    public void getValueFromMemento(Memento memento){
            value = memento.getValue();
    }


}
