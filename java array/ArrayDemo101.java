
public class ArrayDemo101 {
	public static void main(String[] args){
		int a = 3;
		int b = 6;
		int c = 14;
		int[] d = {21,23,25,29};
		variableParameter(a,b,c);
		variableParameter(d);
		
	}
	public static void variableParameter(int ... y){
		int i=0;
		for(int x: y){
			i++;
			System.out.println("x "+i+"= "+x);
			
		}
	}
}
