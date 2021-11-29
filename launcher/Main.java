import java.io.IOException;
import java.awt.Image;
import java.awt.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Frame frame1 = new Frame();
		Image icon = Toolkit.getDefaultToolkit().getImage("assets/Creeper.png");  
		frame1.setIconImage(icon);  
	}

}
