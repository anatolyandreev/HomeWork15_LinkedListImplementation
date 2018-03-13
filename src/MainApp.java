
public class MainApp {

	public static void main(String[] args) {

		AltLinkedList<String> altLs = new AltLinkedList<>();
		altLs.add("beautiful");
		altLs.add("beautiful");
		altLs.add("beautiful");
		altLs.add("sunny");
		altLs.add("perfect");
		altLs.add("world");
		
		System.out.println(altLs.getSize());
		altLs.findElement("beautiful");
		altLs.delete("beautiful");
		System.out.println(altLs.getSize());

	}

}
