package Lab7;

public class MathProblem extends Problem {
	private int diffcultyLevel;
	
	MathProblem(){
		
	}
	MathProblem(int input, String output, String algorithm, int difficultyLevel){
		super (input, algorathim); 
	    this.diffcultyLevel = diffcultyLevel;
	}
	public int getDiffcultyLevel() {
		return diffcultyLevel;
	}
	public void setDiffcultyLevel(int diffcultyLevel) {
		this.diffcultyLevel = diffcultyLevel;
	}
	@Override
	public String toString() {
		return "MathProblem [diffcultyLevel=" + diffcultyLevel + ", getDiffcultyLevel()=" + getDiffcultyLevel()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
		
}
