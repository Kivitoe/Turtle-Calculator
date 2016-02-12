package main.packagefolder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import folder.contains.New.methoids.*;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.text.Format;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.Toolkit;

public class Div {

	private JFrame frmTurtleCalculator;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Div window = new Div();
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
	public Div() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		frmTurtleCalculator = new JFrame();
		frmTurtleCalculator.setIconImage(Toolkit.getDefaultToolkit().getImage(Div.class.getResource("/com/sun/javafx/scene/control/skin/modena/HTMLEditor-Break.png")));
		frmTurtleCalculator.setResizable(false);
		frmTurtleCalculator.setTitle("Turtle Calculator");
		frmTurtleCalculator.setBounds(100, 100, 376, 202);
		frmTurtleCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		//TODO Main
		textField = new JTextField();
		textField.setColumns(10);
		
		
		
		
		JLabel lblTypeInThe = new JLabel("Type in the numbers in the following text boxes:");
		
		
		JLabel label = new JLabel("/");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		
		
		
		JLabel label_1 = new JLabel("=");
		
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		JLabel lblErrorNoNumbers = new JLabel("Error: Incorrect character/no numbers found!");
		lblErrorNoNumbers.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblErrorNoNumbers.setForeground(Color.RED);
		lblErrorNoNumbers.setVisible(false);
		
		JButton btnAdd = new JButton("Divide");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					String hi2 = textField.getText();
					String hi1 = textField_1.getText();
					double x = Double.parseDouble(hi1);
					double o = Double.parseDouble(hi2);
					double p = o - x;
					String hi4 = "" + p;
					textField_2.setText(hi4);
				} catch(Exception i){
					i.printStackTrace();
					lblErrorNoNumbers.setVisible(true);
				}
			}
		}); 
		
		
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		
		//TODO Group layout
		GroupLayout groupLayout = new GroupLayout(frmTurtleCalculator.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblTypeInThe)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(14)
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(label)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_1, 107, 107, 107)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnCancel)
							.addPreferredGap(ComponentPlacement.RELATED, 236, Short.MAX_VALUE)
							.addComponent(btnAdd))
						.addComponent(lblErrorNoNumbers))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblTypeInThe)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label)
						.addComponent(label_1)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
					.addComponent(lblErrorNoNumbers)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCancel)
						.addComponent(btnAdd))
					.addContainerGap())
		);
		frmTurtleCalculator.getContentPane().setLayout(groupLayout);
		
		//TODO Menu Bar
		JMenuBar menuBar = new JMenuBar();
		frmTurtleCalculator.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		
		
		
		
		JMenuItem mntmClearHistory = new JMenuItem("Clear History");
		mntmClearHistory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnFile.add(mntmClearHistory);
		
		mnFile.addSeparator();
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnFile.add(mntmExit);
		
	}
}
