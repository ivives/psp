package serpis.psp;

public class PruebaRun {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
			
			Runtime  aplicacion = Runtime.getRuntime(); 
			Process process = aplicacion.exec("/usr/bin/chromium-browser");
			
			// gnome-calculator
			// gnome-text-editor
			// gnome-terminal
			// chromium-browser
			
			
			process.waitFor();
		}
        catch(Exception e){}
			
			System.out.println("La aplicacion se ha cerrado");
	}

}
