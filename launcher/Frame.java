import java.io.IOException;

import javax.swing.*;
public class Frame extends JFrame{
	
	public Frame() throws IOException {
		MyFrame pinicio;
			
			setTitle("Launcher Defiende la villa");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setResizable(false);
			setSize(940, 529);
			setBounds(0, 0, 940, 529);
			
			pinicio = new MyFrame();
			setBounds(0, 0, 940, 529);
			getContentPane().add(pinicio);
			setVisible(true);
			
	}
}
