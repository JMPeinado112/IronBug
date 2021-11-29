import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.print.DocFlavor.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

@SuppressWarnings("serial")
public class MyFrame extends JPanel implements ActionListener {
	JButton button;
	JButton button1;
	JLabel background;
	public MyFrame() {
		setLayout(null);
		button = new JButton();
		button.setBounds(650, 350, 200, 80);
		button.addActionListener(this);
		java.net.URL url1 = Main.class.getResource("assets/botton2.png");
		java.net.URL url2 = Main.class.getResource("assets/botton.png");
		java.net.URL url3 = Main.class.getResource("assets/wallpaper1.jpg");
		button.setIcon(new ImageIcon(url1));
		button.setPressedIcon(new ImageIcon(
		new ImageIcon(url2).getImage().getScaledInstance(200, 82, Image.SCALE_DEFAULT)));
		button.setFocusable(true);
		button.setBorder(null);
		button.setFocusPainted(false);
		button.setContentAreaFilled(false);
		button1 = new JButton();
		button1.setBounds(20, 50, 120, 40);
		button1.addActionListener(this);
		
		this.setSize(940, 529);

		this.add(button);
		this.add(button1);
		
		ImageIcon image = new ImageIcon(url3);
		background = new JLabel("", image, JLabel.CENTER);
		background.setBounds(0, 0, 940, 529);
		this.add(background);
		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			Runtime obj = Runtime.getRuntime();

			try {
				obj.exec("C:\\Users\\DAW2\\Desktop\\PelotaGame\\IronBug.exe");
			
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			System.exit(0);
		}
		if (e.getSource() == button1) {
			JFrame Marco = (JFrame)SwingUtilities.getWindowAncestor(this);
			Marco.remove(this);
			Marco.getContentPane().add(new iniciarsesion());
			Marco.setVisible(true);	
		}
		
	}
		
}
