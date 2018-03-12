
public class MainApp {

	public static void main(String[] args) {

		AltLinkedList<String> altLs = new AltLinkedList<>();
//		altLs.add("Hello");
		altLs.add("beautiful");
		altLs.add("beautiful");
//		altLs.add("sunny");
//		altLs.add("perfect");
//		altLs.add("world");
		
		System.out.println(altLs.getSize());
		String str = new String("beautiful");
		altLs.delete(str);
		System.out.println(altLs.getSize());

	}

}
