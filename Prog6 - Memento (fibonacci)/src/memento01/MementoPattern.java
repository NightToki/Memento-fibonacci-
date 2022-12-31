package memento01;
import java.math.*;
public class MementoPattern {
	static Originator originator = new Originator();
	static CareTaker careTaker = new CareTaker();
	public static BigInteger fibo(int n) {
		if (n==0 || n==1) {
			originator.setValue(BigInteger.ONE);
			careTaker.add(originator.saveValueToMemento());
			return originator.getValue();
			
		}
		else {
			originator.setValue(careTaker.get(n-1).getValue().add(careTaker.get(n-2).getValue()));
			careTaker.add(originator.saveValueToMemento());
			return originator.getValue();
		}
		
	}
	public static void main(String[] args) {
		long start, end;
		double dur;
		BigInteger f;

		for (int i=0; i<=1000; i++){
		    start = System.nanoTime();
		    f=fibo(i);
		    end = System.nanoTime();
		    dur = (end - start)/1000.0;
		    System.out.printf("Fibo(%d): %12d (Secs: %5.3f) \n",i,f,dur);
		}
	}
	


}
