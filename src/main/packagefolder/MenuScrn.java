package main.packagefolder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.Toolkit;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;

public class MenuScrn {

	private JFrame frmTurtleCalculator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuScrn window = new MenuScrn();
					window.frmTurtleCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MenuScrn() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		frmTurtleCalculator = new JFrame();
		frmTurtleCalculator.setResizable(false);
		frmTurtleCalculator.setTitle("Turtle Calculator");
		frmTurtleCalculator.setIconImage(Toolkit.getDefaultToolkit().getImage(MenuScrn.class.getResource("/com/sun/javafx/scene/control/skin/modena/HTMLEditor-Break.png")));
		frmTurtleCalculator.setBounds(100, 100, 450, 383);
		frmTurtleCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnLanguage;
		
		JButton btnAddition = new JButton("Add");
		btnAddition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.main(null);
			}
		});
		
		JButton btnMultiply = new JButton("Multiply");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Multi.main(null);
			}
		});
		
		JButton btnSubtract = new JButton("Subtract");
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sub.main(null);
			}
		});
		
		JButton btnDivide = new JButton("Divide");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Div.main(null);
			}
		});
		
		JLabel lblTurtleCalculator = new JLabel("Turtle Calculator");
		lblTurtleCalculator.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JSeparator separator = new JSeparator();
		
		btnLanguage = new JButton("Language");
		btnLanguage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnAddition.setText("Añadir");
				btnDivide.setText("Dividir");
				btnMultiply.setText("Se multiplican");
				btnSubtract.setText("Reste");
				btnLanguage.setText("Idioma");
			}
		});
		GroupLayout groupLayout = new GroupLayout(frmTurtleCalculator.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(btnMultiply, GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
				.addComponent(btnAddition, GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
				.addComponent(btnSubtract, GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
				.addComponent(btnDivide, GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(separator, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(154)
					.addComponent(lblTurtleCalculator)
					.addPreferredGap(ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
					.addComponent(btnLanguage)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(btnAddition, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnMultiply, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnSubtract, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnDivide, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblTurtleCalculator)
						.addComponent(btnLanguage))
					.addContainerGap(22, Short.MAX_VALUE))
		);
		frmTurtleCalculator.getContentPane().setLayout(groupLayout);
	}
}
