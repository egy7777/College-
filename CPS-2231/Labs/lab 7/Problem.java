package Lab7;

abstract class Problem {

	protected int input; 
	protected String output, algorathim; 
	
	Problem(){
		
	}
	Problem(int input, String output, String algorathim){
		this.input=input; 
		this.output=output;
		this.algorathim=algorathim; 
	}

	public int getInput() {
		return input;
	}
	public void setInput(int input) {
		this.input = input;
	}
	public String getOutput() {
		return output;
	}
	public void setOutput(String output) {
		this.output = output;
	}
	public String getAlgorathim() {
		return algorathim;
	}
	public void setAlgorathim(String algorathim) {
		this.algorathim = algorathim;
	}
	@Override
	public String toString() {
		return "Problem [input=" + input + ", output=" + output + ", algorathim=" + algorathim + "]";
	}
	public boolean isHard() {
		return false;
	}
}
