import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*; 
@SuppressWarnings("serial")
public class iniciarsesion extends JPanel implements ActionListener{
	Conexion conexion = new Conexion();
	JButton button;
	JTextField textField1;
	JTextField textField2;
	Connection con; 
    Statement sql;
    ResultSet res;
	
    public iniciarsesion(){
    	button = new JButton();
		button.setBounds(650, 350, 200, 80);
		button.addActionListener(this);
		java.net.URL url1 = Main.class.getResource("assets/botton2.png");
		button.setIcon(new ImageIcon(url1));
		button.setFocusable(true);
		button.setBorder(null);
		button.setFocusPainted(false);
		button.setContentAreaFilled(false);
		textField1= new JTextField(5);
		textField1.setBounds(10, 368, 163, 40);
		
		textField1.addActionListener(this);
		this.add(textField1);
		textField2= new JTextField(5);
		textField2.setBounds(100, 340, 163, 40);
		textField2.addActionListener(this);
		this.add(textField2);
		this.add(button);
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			try {
				con = conexion.getConnection();
				sql = con.createStatement();
				String a = textField1.getText();
				String b = textField2.getText();
				sql.executeUpdate("INSERT INTO `usuarioj`(`id`, `Nombre`, `contraseña`) VALUES (null,'"+textField1.getText() +"','"+textField2.getText()+"')");
				JFrame Marco = (JFrame)SwingUtilities.getWindowAncestor(this);
				Marco.remove(this);
				Marco.getContentPane().add(new MyFrame());
				Marco.setVisible(true);	
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}


}
