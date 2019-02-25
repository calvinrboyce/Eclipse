import java.util.LinkedList;
public class StackLL implements StackIntrfc{
	
	public  StackLL() {
		
	}
	
	LinkedList<Double> list = new LinkedList<>();
	
	public void push(double d) {
		list.addLast(d);
	}
	
	public double pop() {
		return list.removeLast();
	}
	
	public double peek() {
		return list.getLast();
	}
	
	public int size() {
		return list.size();
	}
	
	public void clear() {
		list.clear();
	}
	
}
