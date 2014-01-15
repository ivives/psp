using System;
using Gtk;

public partial class MainWindow: Gtk.Window
{	
	public MainWindow (): base (Gtk.WindowType.Toplevel)
	{
		Build ();
		
		buttonEditor.Clicked += delegate {
			System.Diagnostics.Process.Start("/usr/bin/gnome-text-editor");
		};
		
		
		buttonCalculadora.Clicked += delegate {
			System.Diagnostics.Process.Start("/usr/bin/gnome-calculator");
		};
		
		
		buttonTerminal.Clicked += delegate {
			System.Diagnostics.Process.Start("/usr/bin/gnome-terminal");
		};
		
		
		buttonNavegador.Clicked += delegate {
			System.Diagnostics.Process.Start("/usr/bin/chromium-browser");
		};
		
	}
	
	protected void OnDeleteEvent (object sender, DeleteEventArgs a)
	{
		Application.Quit ();
		a.RetVal = true;
	}
}
