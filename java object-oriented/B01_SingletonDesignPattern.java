public class B01_SingletonDesignPattern {
	public static void main(String[] args) {
	}
}
class Singleton{
	private static Singleton instance = new Singleton();
	public static Singleton getInstance(){
		return instance;
	}
	private Singleton(){
	}
}
