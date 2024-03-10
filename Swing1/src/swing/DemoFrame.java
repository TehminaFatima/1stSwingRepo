package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;

public class DemoFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentpane;
	JLabel lblInfo;
	private JTextField txtName;
	private JTextField txtAge;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemoFrame frame = new DemoFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DemoFrame() {
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 17));
		getContentPane().setBackground(new Color(255, 255, 255));
		setTitle("1st_GUI_frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
	    JLabel lblName = new JLabel("Entre Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblName.setBounds(38, 46, 89, 20);
		getContentPane().add(lblName);
		
		JLabel lblInfo = new JLabel("");
		lblInfo.setBackground(new Color(240, 240, 240));
		lblInfo.setBounds(42, 230, 302, 20);
		getContentPane().add(lblInfo);
		
		JButton Btnok = new JButton("Ok");
		Btnok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String n = txtName.getText();
		int	age = Integer.parseInt(txtAge.getText());
			if(age>=18)
				lblInfo.setText( n + "! you are eligible for vote!");
			else
				lblInfo.setText( n + "! you are not eligible for vote!");
			}
		});
		Btnok.setFont(new Font("Tahoma", Font.BOLD, 14));
		Btnok.setBounds(91, 181, 89, 23);
		getContentPane().add(Btnok);
		
		JButton BtnReset = new JButton("Reset");
		BtnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 txtName.setText("");
				  txtAge.setText("");
				  lblInfo.setText(getName());
				
			}
		});
		BtnReset.setFont(new Font("Tahoma", Font.BOLD, 14));
		BtnReset.setBounds(195, 181, 89, 23);
		getContentPane().add(BtnReset);
		
		JLabel lblAge = new JLabel("Entre Age");
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAge.setBounds(38, 122, 89, 20);
		getContentPane().add(lblAge);
		
		txtName = new JTextField();
		txtName.setBounds(198, 48, 129, 20);
		getContentPane().add(txtName);
		txtName.setColumns(10);
		
		txtAge = new JTextField();
		txtAge.setBounds(198, 122, 129, 20);
		getContentPane().add(txtAge);
		txtAge.setColumns(10);
	}
}
