
// 20140821
// 
public class CodeBlockDemo{
	int a=1;
	public static void main(String[] args){
		/* //error
		{
			int a = 3;
		}
		System.out.println("a ="+a);
		*/
		//new CodeBlockDemo();
		int a =0;
		
		System.out.println("a ="+a);
		{
			a = 3;
		}
		
	}
	CodeBlockDemo(){
		this.a = 22;
		System.out.println("CodeBlockDemo a ="+a);
	}
	{
		this.a = 33;
		System.out.println("{}  ="+a);
		//System.out.println("{} a ="+a);
	}
	static{
		System.out.println("static {} ");
		}
}
