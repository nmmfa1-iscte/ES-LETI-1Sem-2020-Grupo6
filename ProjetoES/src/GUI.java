import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JToolBar;
import javax.swing.JSplitPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JList;
import javax.swing.JToggleButton;
import javax.swing.ButtonGroup;

public class GUI {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1093, 487);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnImportExcell = new JButton("Import Excell");
		btnImportExcell.setBounds(948, 414, 119, 23);
		btnImportExcell.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnImportExcell);
		
		JCheckBox chckbxLongMethod = new JCheckBox("Long Method");
		chckbxLongMethod.setBounds(162, 90, 97, 23);
		frame.getContentPane().add(chckbxLongMethod);
		
		JCheckBox chckbxFeatureEnvy = new JCheckBox("Feature Envy");
		chckbxFeatureEnvy.setBounds(566, 90, 97, 23);
		frame.getContentPane().add(chckbxFeatureEnvy);
		
		JCheckBox chckbxLOC = new JCheckBox("Lines of Code");
		chckbxLOC.setBounds(71, 162, 128, 23);
		frame.getContentPane().add(chckbxLOC);
		
		JCheckBox chckbxCYCLO = new JCheckBox("Cyclomatic Complexity");
		chckbxCYCLO.setBounds(71, 239, 145, 23);
		frame.getContentPane().add(chckbxCYCLO);
		
		JCheckBox chckbxATFD = new JCheckBox("Access to Foreign Data");
		chckbxATFD.setBounds(466, 162, 151, 23);
		frame.getContentPane().add(chckbxATFD);
		
		JCheckBox chckbxLAA = new JCheckBox("New check box");
		chckbxLAA.setBounds(466, 239, 97, 23);
		frame.getContentPane().add(chckbxLAA);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		buttonGroup_1.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(41, 201, 71, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
		buttonGroup_1.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(128, 201, 71, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("New radio button");
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(435, 201, 71, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("New radio button");
		buttonGroup.add(rdbtnNewRadioButton_1_1);
		rdbtnNewRadioButton_1_1.setBounds(522, 201, 71, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1_1);
		
		textField = new JTextField();
		textField.setBounds(222, 163, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(222, 240, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(623, 239, 86, 20);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(623, 162, 86, 20);
		frame.getContentPane().add(textField_3);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
