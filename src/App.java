
public class App {

	public static void main(String[] args) {

		// Initialize string array and then allocate memory
		String[] names;
		names = new String[3];
		for (String s: names)
        {
          System.out.println(s);
        }
		
		// Initialize string array with memory allocated
		String[] fruits = new String[3];
		for (String t: fruits)
		{
			System.out.println(t);
		}
		
		// Initialize string array with initial values
		
		String[] colors = {"blue", "red", "purple"};
		for (int i = 0; i < colors.length; i++) {
			System.out.println(colors[i]);
		}
	}

}
