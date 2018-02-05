
public abstract class Player {
	private String name;
	enum Roshambo {Rock, Paper, Scissors}
	
	public abstract Roshambo generateRoshambo();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
