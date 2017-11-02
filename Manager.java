
public class Manager extends Employee{
	private boolean bonus;
	
	public Manager() {
		double r  = Math.random();
		if(r > 0.5)
			this.bonus = true;
		else
			this.bonus = false;
	}
}
