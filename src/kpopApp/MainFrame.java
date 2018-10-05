package kpopApp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Label;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class MainFrame {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField txtStageName;
	private JTextField txtRealName;
	private JTextField txtBirthDate;
	private JTextField txtBirthPlace;
	private JTextField txtNationality;
	private JTextField txtPosition;
	private JTextField txtHeight;
	private JTextField txtPrimaryGroup;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
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
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(72, 209, 204));
		frame.setBounds(100, 100, 614, 545);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel pnlMain = new JPanel();
		pnlMain.setBackground(new Color(72, 209, 204));
		frame.getContentPane().add(pnlMain, "name_114975278147073");
		pnlMain.setLayout(null);
		
		Label label = new Label("Add:");
		label.setFont(new Font("Dialog", Font.PLAIN, 15));
		label.setBounds(34, 23, 85, 24);
		pnlMain.add(label);
		
		JButton btnAddIdol = new JButton("Idol");
		btnAddIdol.setBounds(34, 98, 121, 39);
		pnlMain.add(btnAddIdol);
		
		JButton btnAddGroup = new JButton("Group");
		btnAddGroup.setBounds(34, 53, 121, 39);
		pnlMain.add(btnAddGroup);
		
		Label label_1 = new Label("Search:");
		label_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_1.setBounds(34, 170, 85, 24);
		pnlMain.add(label_1);
		
		JButton btnSearchGroup = new JButton("Group");
		btnSearchGroup.setBounds(34, 200, 127, 39);
		pnlMain.add(btnSearchGroup);
		
		JButton btnSearchForA = new JButton("Idol");
		btnSearchForA.setBounds(34, 246, 127, 39);
		pnlMain.add(btnSearchForA);
		
		Label label_2 = new Label("List all:");
		label_2.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_2.setBounds(34, 316, 85, 24);
		pnlMain.add(label_2);
		
		JButton btnGroups = new JButton("Groups");
		btnGroups.setBounds(34, 342, 127, 39);
		pnlMain.add(btnGroups);
		
		JButton btnIdols = new JButton("Idols");
		btnIdols.setBounds(34, 388, 127, 39);
		pnlMain.add(btnIdols);
		
		JLabel lblCurrentlyGroups = new JLabel("Currently:");
		lblCurrentlyGroups.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblCurrentlyGroups.setBounds(289, 33, 238, 39);
		pnlMain.add(lblCurrentlyGroups);
		
		JLabel lblCountGroup = new JLabel("0 groups in database");
		lblCountGroup.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblCountGroup.setBounds(289, 73, 238, 39);
		pnlMain.add(lblCountGroup);
		
		JLabel lblCountIdol = new JLabel("0 idols in database");
		lblCountIdol.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblCountIdol.setBounds(289, 114, 238, 39);
		pnlMain.add(lblCountIdol);
		
		JPanel pnlAddGroup = new JPanel();
		pnlAddGroup.setBackground(new Color(72, 209, 204));
		frame.getContentPane().add(pnlAddGroup, "name_114975295015890");
		pnlAddGroup.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add a new group");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel.setBounds(12, 13, 144, 35);
		pnlAddGroup.add(lblNewLabel);
		
		JLabel lblGroupName = new JLabel("Group name:");
		lblGroupName.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblGroupName.setBounds(12, 84, 144, 35);
		pnlAddGroup.add(lblGroupName);
		
		JLabel lblNumberOfMembers = new JLabel("Number of members:");
		lblNumberOfMembers.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNumberOfMembers.setBounds(12, 168, 144, 35);
		pnlAddGroup.add(lblNumberOfMembers);
		
		JLabel lblDebuted = new JLabel("Debuted:");
		lblDebuted.setHorizontalAlignment(SwingConstants.LEFT);
		lblDebuted.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblDebuted.setBounds(12, 120, 144, 35);
		pnlAddGroup.add(lblDebuted);
		
		textField = new JTextField();
		textField.setFont(new Font("Dialog", Font.PLAIN, 15));
		textField.setBounds(101, 91, 217, 22);
		pnlAddGroup.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(101, 127, 217, 22);
		pnlAddGroup.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Dialog", Font.PLAIN, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(154, 174, 164, 22);
		pnlAddGroup.add(textField_2);
		
		JPanel pnlAddIdol = new JPanel();
		pnlAddIdol.setBackground(new Color(72, 209, 204));
		frame.getContentPane().add(pnlAddIdol, "name_115641722244856");
		pnlAddIdol.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Add new idol");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_1.setBounds(12, 13, 132, 28);
		pnlAddIdol.add(lblNewLabel_1);
		
		txtStageName = new JTextField();
		txtStageName.setFont(new Font("Dialog", Font.PLAIN, 15));
		txtStageName.setBounds(117, 63, 235, 22);
		pnlAddIdol.add(txtStageName);
		txtStageName.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Stage name:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(22, 66, 83, 19);
		pnlAddIdol.add(lblNewLabel_2);
		
		JLabel lblRealName = new JLabel("Real name:");
		lblRealName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRealName.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblRealName.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblRealName.setBounds(22, 98, 83, 19);
		pnlAddIdol.add(lblRealName);
		
		txtRealName = new JTextField();
		txtRealName.setFont(new Font("Dialog", Font.PLAIN, 15));
		txtRealName.setColumns(10);
		txtRealName.setBounds(117, 97, 235, 22);
		pnlAddIdol.add(txtRealName);
		
		JLabel lblBirthDate = new JLabel("Birth date:");
		lblBirthDate.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBirthDate.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblBirthDate.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblBirthDate.setBounds(22, 134, 83, 19);
		pnlAddIdol.add(lblBirthDate);
		
		txtBirthDate = new JTextField();
		txtBirthDate.setFont(new Font("Dialog", Font.PLAIN, 15));
		txtBirthDate.setColumns(10);
		txtBirthDate.setBounds(117, 133, 235, 22);
		pnlAddIdol.add(txtBirthDate);
		
		JLabel lblBornIn = new JLabel("Birth place:");
		lblBornIn.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBornIn.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblBornIn.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblBornIn.setBounds(22, 169, 83, 19);
		pnlAddIdol.add(lblBornIn);
		
		txtBirthPlace = new JTextField();
		txtBirthPlace.setFont(new Font("Dialog", Font.PLAIN, 15));
		txtBirthPlace.setColumns(10);
		txtBirthPlace.setBounds(117, 168, 235, 22);
		pnlAddIdol.add(txtBirthPlace);
		
		JLabel lblHeight = new JLabel("Height:");
		lblHeight.setHorizontalAlignment(SwingConstants.RIGHT);
		lblHeight.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblHeight.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblHeight.setBounds(22, 274, 83, 19);
		pnlAddIdol.add(lblHeight);
		
		txtNationality = new JTextField();
		txtNationality.setFont(new Font("Dialog", Font.PLAIN, 15));
		txtNationality.setColumns(10);
		txtNationality.setBounds(117, 206, 235, 22);
		pnlAddIdol.add(txtNationality);
		
		JLabel lblPosition = new JLabel("Position:");
		lblPosition.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPosition.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblPosition.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblPosition.setBounds(22, 240, 83, 19);
		pnlAddIdol.add(lblPosition);
		
		txtPosition = new JTextField();
		txtPosition.setFont(new Font("Dialog", Font.PLAIN, 15));
		txtPosition.setColumns(10);
		txtPosition.setBounds(117, 239, 235, 22);
		pnlAddIdol.add(txtPosition);
		
		JLabel lblBloodType = new JLabel("Nationality:");
		lblBloodType.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBloodType.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblBloodType.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblBloodType.setBounds(22, 208, 83, 19);
		pnlAddIdol.add(lblBloodType);
		
		txtHeight = new JTextField();
		txtHeight.setFont(new Font("Dialog", Font.PLAIN, 15));
		txtHeight.setColumns(10);
		txtHeight.setBounds(117, 272, 235, 22);
		pnlAddIdol.add(txtHeight);
		
		JButton btnSaveIdol = new JButton("Save idol");
		btnSaveIdol.setBounds(231, 399, 121, 39);
		pnlAddIdol.add(btnSaveIdol);
		
		JLabel lblPrimaryGroup = new JLabel("Primary group:");
		lblPrimaryGroup.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPrimaryGroup.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblPrimaryGroup.setAlignmentX(1.0f);
		lblPrimaryGroup.setBounds(0, 308, 105, 19);
		pnlAddIdol.add(lblPrimaryGroup);
		
		txtPrimaryGroup = new JTextField();
		txtPrimaryGroup.setFont(new Font("Dialog", Font.PLAIN, 15));
		txtPrimaryGroup.setColumns(10);
		txtPrimaryGroup.setBounds(117, 306, 235, 22);
		pnlAddIdol.add(txtPrimaryGroup);
		
		JPanel pnlSearchGroup = new JPanel();
		pnlSearchGroup.setBackground(new Color(72, 209, 204));
		frame.getContentPane().add(pnlSearchGroup, "name_116742304157886");
		pnlSearchGroup.setLayout(null);
		
		JLabel lblSearchForA_1 = new JLabel("Search for a group:");
		lblSearchForA_1.setFont(new Font("Dialog", Font.BOLD, 15));
		lblSearchForA_1.setBounds(12, 13, 150, 32);
		pnlSearchGroup.add(lblSearchForA_1);
		
		JPanel pnlSearchIdol = new JPanel();
		pnlSearchIdol.setBackground(new Color(72, 209, 204));
		frame.getContentPane().add(pnlSearchIdol, "name_116770567019340");
		pnlSearchIdol.setLayout(null);
		
		JLabel lblSearchForA = new JLabel("Search for a idol:");
		lblSearchForA.setFont(new Font("Dialog", Font.BOLD, 15));
		lblSearchForA.setBounds(12, 13, 136, 32);
		pnlSearchIdol.add(lblSearchForA);
		
		JPanel pnlGroupList = new JPanel();
		pnlGroupList.setBackground(new Color(72, 209, 204));
		frame.getContentPane().add(pnlGroupList, "name_116791338216842");
		pnlGroupList.setLayout(null);
		
		JLabel lblListOfAll = new JLabel("List of all groups:");
		lblListOfAll.setFont(new Font("Dialog", Font.BOLD, 15));
		lblListOfAll.setBounds(12, 13, 136, 32);
		pnlGroupList.add(lblListOfAll);
		
		JPanel pnlIdolList = new JPanel();
		pnlIdolList.setBackground(new Color(72, 209, 204));
		frame.getContentPane().add(pnlIdolList, "name_116838889932439");
		pnlIdolList.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("List of all idols:");
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_3.setBounds(12, 13, 136, 32);
		pnlIdolList.add(lblNewLabel_3);
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
