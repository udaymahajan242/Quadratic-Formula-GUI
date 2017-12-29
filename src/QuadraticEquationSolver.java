
// Name of the programmer student : UDAY MAHAJAN

// Course                         : CS 143 - Java Programming II.
// Assignment                     : Robustness. 
// Topic                          : Quadratic Equation Solver.
// Due Day, & Date                : Monday, 1/09/2017.

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;


public class QuadraticEquationSolver {

	private static JFrame frmQuadraticEquationSolver;
	JLabel lblEnterTheCoefficients;
	JTextField textField;
	JTextField textField_1;
	JTextField textField_2;
	JLabel lblA;
	JLabel lblB;
	JLabel lblC;
	JButton btnCalculate;
	JTextField textField_3;
	JTextField textField_4;
	JLabel lblRoot_1;
	JLabel lblRoot_2;
	JLabel lblTheEquationIs;
	JTextField textField_5;
	JTextField textField_6;
	JLabel lblDiscriminant;
	JLabel lblImage1;
	JButton btnReset;
	JMenuBar menuBar;
	JMenu mnOptions;
	JMenuItem mntmExit;
	JMenuItem mntmVeiwQuadraticFormula;
	JMenuItem mntmGiveFeedback;
	JLabel lblPleaseOnlyEnter;
	JLabel lblX;
	JLabel label;
	JMenu mnHelp;
	JMenuItem menuItem;
	JMenuItem mntmInstructions;
	JButton btnMoreInstructions;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuadraticEquationSolver window = new QuadraticEquationSolver();
					Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
					frmQuadraticEquationSolver.setLocation(
							dim.width / 2 - frmQuadraticEquationSolver.getSize().width / 2,
							dim.height / 2 - frmQuadraticEquationSolver.getSize().height / 2);
					window.frmQuadraticEquationSolver.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public QuadraticEquationSolver() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmQuadraticEquationSolver = new JFrame();
		frmQuadraticEquationSolver
				.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Tutorial-icon.png")));
		
		frmQuadraticEquationSolver.setResizable(false);
		frmQuadraticEquationSolver.setForeground(Color.WHITE);
		frmQuadraticEquationSolver.setTitle("Robustness Assignment: Quadratic Equation Solver by UDAY MAHAJAN");
		frmQuadraticEquationSolver.setBounds(100, 100, 919, 506);
		frmQuadraticEquationSolver.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmQuadraticEquationSolver.getContentPane().setLayout(null);

		
		lblEnterTheCoefficients = new JLabel("Please enter the coefficients for a quadratic equation of the form");
		lblEnterTheCoefficients.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblEnterTheCoefficients.setBounds(119, 53, 571, 32);
		frmQuadraticEquationSolver.getContentPane().add(lblEnterTheCoefficients);
		

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(37, 166, 152, 32);
		textField.setHorizontalAlignment(JTextField.CENTER);
		frmQuadraticEquationSolver.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setBounds(375, 166, 163, 32);
		textField_1.setHorizontalAlignment(JTextField.CENTER);
		frmQuadraticEquationSolver.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_2.setBounds(698, 166, 152, 32);
		textField_2.setHorizontalAlignment(JTextField.CENTER);
		frmQuadraticEquationSolver.getContentPane().add(textField_2);
		textField_2.setColumns(10);

		lblA = new JLabel("a");
		lblA.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblA.setBounds(110, 199, 23, 42);
		frmQuadraticEquationSolver.getContentPane().add(lblA);

		lblB = new JLabel("b");
		lblB.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblB.setBounds(449, 202, 23, 37);
		frmQuadraticEquationSolver.getContentPane().add(lblB);

		lblC = new JLabel("c");
		lblC.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblC.setBounds(767, 210, 23, 20);
		frmQuadraticEquationSolver.getContentPane().add(lblC);

		btnCalculate = new JButton("Calculate");
		btnCalculate.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCalculate.addActionListener(new BtnCalculateActionListener());
		btnCalculate.setBounds(270, 241, 175, 40);
		frmQuadraticEquationSolver.getContentPane().add(btnCalculate);

		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_3.setEditable(false);
		textField_3.setBounds(15, 389, 289, 28);
		textField_3.setHorizontalAlignment(JTextField.CENTER);
		frmQuadraticEquationSolver.getContentPane().add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_4.setEditable(false);
		textField_4.setBounds(636, 390, 262, 27);
		textField_4.setHorizontalAlignment(JTextField.CENTER);
		frmQuadraticEquationSolver.getContentPane().add(textField_4);
		textField_4.setColumns(10);

		lblRoot_1 = new JLabel("Root 1");
		lblRoot_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblRoot_1.setBounds(129, 424, 69, 23);
		frmQuadraticEquationSolver.getContentPane().add(lblRoot_1);

		lblRoot_2 = new JLabel("Root 2");
		lblRoot_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblRoot_2.setBounds(736, 422, 90, 26);
		frmQuadraticEquationSolver.getContentPane().add(lblRoot_2);

		lblTheEquationIs = new JLabel("Your Equation");
		lblTheEquationIs.setFont(new Font("Tahoma", Font.ITALIC, 20));
		lblTheEquationIs.setBounds(400, 340, 131, 32);
		frmQuadraticEquationSolver.getContentPane().add(lblTheEquationIs);

		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_5.setEditable(false);
		textField_5.setBounds(270, 297, 388, 42);
		textField_5.setHorizontalAlignment(JTextField.CENTER);
		frmQuadraticEquationSolver.getContentPane().add(textField_5);
		textField_5.setColumns(10);

		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_6.setEditable(false);
		textField_6.setBounds(388, 390, 163, 26);
		textField_6.setHorizontalAlignment(JTextField.CENTER);
		frmQuadraticEquationSolver.getContentPane().add(textField_6);
		textField_6.setColumns(10);

		lblDiscriminant = new JLabel("Discriminant");
		lblDiscriminant.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblDiscriminant.setBounds(411, 425, 116, 20);
		frmQuadraticEquationSolver.getContentPane().add(lblDiscriminant);

		lblImage1 = new JLabel(" ");
		lblImage1.setFont(new Font("Tahoma", Font.PLAIN, 81));
		lblImage1.setBounds(705, 53, 131, 32);
		frmQuadraticEquationSolver.getContentPane().add(lblImage1);
		Image Images = new ImageIcon(this.getClass().getResource("/image1.png")).getImage();
		lblImage1.setIcon(new ImageIcon(Images));

		btnReset = new JButton("Reset ");
		btnReset.addActionListener(new BtnResetActionListener());
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnReset.setBounds(483, 241, 175, 41);
		frmQuadraticEquationSolver.getContentPane().add(btnReset);

		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 913, 31);
		frmQuadraticEquationSolver.getContentPane().add(menuBar);

		mnOptions = new JMenu("Options");
		menuBar.add(mnOptions);

		mntmVeiwQuadraticFormula = new JMenuItem("Veiw Quadratic Formula");
		mntmVeiwQuadraticFormula.addActionListener(new MntmVeiwQuadraticFormulaActionListener());
		mnOptions.add(mntmVeiwQuadraticFormula);

		mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new MntmExitActionListener());

		mntmGiveFeedback = new JMenuItem("Give Feedback");
		mntmGiveFeedback.addActionListener(new MntmGiveFeedbackActionListener());
		mnOptions.add(mntmGiveFeedback);
		mnOptions.add(mntmExit);
		
		mnHelp = new JMenu("Help (?)");
		menuBar.add(mnHelp);
		
		menuItem = new JMenuItem("About");
		menuItem.addActionListener(new MenuItemActionListener());
		
		mntmInstructions = new JMenuItem("Instructions");
		mntmInstructions.addActionListener(new MntmInstructionsActionListener());
		mnHelp.add(mntmInstructions);
		mnHelp.add(menuItem);

		lblPleaseOnlyEnter = new JLabel(
				"Valid Input => Integers, decimals or scientific notations.");
		lblPleaseOnlyEnter.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblPleaseOnlyEnter.setBounds(153, 88, 473, 32);
		frmQuadraticEquationSolver.getContentPane().add(lblPleaseOnlyEnter);
		
		lblX = new JLabel("x^2    +  ");
		lblX.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblX.setBounds(226, 163, 121, 32);
		frmQuadraticEquationSolver.getContentPane().add(lblX);
		
		label = new JLabel("x    +  ");
		label.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label.setBounds(574, 163, 121, 32);
		frmQuadraticEquationSolver.getContentPane().add(label);
		
		btnMoreInstructions = new JButton("More Details.");
		btnMoreInstructions.addActionListener(new BtnMoreInstructionsActionListener());
		btnMoreInstructions.setBounds(639, 91, 163, 29);
		frmQuadraticEquationSolver.getContentPane().add(btnMoreInstructions);

	}

	private class BtnCalculateActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {

			if ((textField.getText().equals("")) && (textField_1.getText().equals("")) // when all three fields are empty.
					&& (textField_2.getText().equals(""))) {
				JOptionPane.showMessageDialog(frmQuadraticEquationSolver, "Sorry. Please enter a value for a,b and c ",
						"ERROR", JOptionPane.ERROR_MESSAGE);
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
			
				
			} else if ((textField.getText().equals("")) && (textField_1.getText().equals(""))) { // when only c has a value
				
				try { //checks if c is parsible and displays error for missing values of a and b.
					double c = Double.parseDouble(textField_2.getText()); 
					JOptionPane.showMessageDialog(frmQuadraticEquationSolver, "Sorry. Please enter a value for a and b ",
							"ERROR", JOptionPane.ERROR_MESSAGE);
					
				} catch (Exception e) { // if c is not parsible, program displays invalid input and missing value error for a and b.
					JOptionPane.showMessageDialog(frmQuadraticEquationSolver,
							"Sorry, INVALID INPUT. Please input all three values in integers, decimals or scientific notation, enter a value for a and b and try again !",
							"ERROR - INVALID INPUT", JOptionPane.ERROR_MESSAGE);
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
					textField_4.setText("");
					textField_5.setText("");
					textField_6.setText("");
				}
				

			} else if ((textField.getText().equals("")) && (textField_2.getText().equals(""))) {
				
				try {
					double b = Double.parseDouble(textField_1.getText());
					JOptionPane.showMessageDialog(frmQuadraticEquationSolver, "Sorry. Please enter a value for a and c ",
							"ERROR", JOptionPane.ERROR_MESSAGE);

				} catch (Exception e) {
					JOptionPane.showMessageDialog(frmQuadraticEquationSolver,
							"Sorry, INVALID INPUT. Please input all three values in integers, decimals or scientific notation, enter a value for a and c and try again !",
							"ERROR - INVALID INPUT", JOptionPane.ERROR_MESSAGE);
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
					textField_4.setText("");
					textField_5.setText("");
					textField_6.setText("");
				}
				
				

			} else if ((textField_1.getText().equals("")) && (textField_2.getText().equals(""))) {
				
				try {
					double a = Double.parseDouble(textField.getText());
					
					if (a == 0) {
						JOptionPane.showMessageDialog(frmQuadraticEquationSolver,
								"Sorry, INVALID INPUT.The value of \"a\" cannot be zero as it transforms the quadratic equation into a linear equation. Also, please enter a value for b and c and Try Again.",
								"ERROR", JOptionPane.ERROR_MESSAGE);
						textField.setText("");

					
					}else {JOptionPane.showMessageDialog(frmQuadraticEquationSolver, "Sorry. Please enter a value for b and c ",
							"ERROR", JOptionPane.ERROR_MESSAGE);
						}
				

				}catch (Exception e) {
					JOptionPane.showMessageDialog(frmQuadraticEquationSolver,
							"Sorry, INVALID INPUT. Please input all three values in integers, decimals or scientific notation, enter a value for b and c and try again !",
							"ERROR - INVALID INPUT", JOptionPane.ERROR_MESSAGE);
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
					textField_4.setText("");
					textField_5.setText("");
					textField_6.setText("");
				}
				
				
			} else if (textField.getText().equals("")) {
				try {
					double b = Double.parseDouble(textField_1.getText());
					double c = Double.parseDouble(textField_2.getText());
					
					JOptionPane.showMessageDialog(frmQuadraticEquationSolver, "Sorry. Please enter a value for a ", "ERROR",
							JOptionPane.ERROR_MESSAGE);

				} catch (Exception e) {
					JOptionPane.showMessageDialog(frmQuadraticEquationSolver,
							"Sorry, INVALID INPUT. Please input all three values in integers, decimals or scientific notation, enter a value for a and try again !",
							"ERROR - INVALID INPUT", JOptionPane.ERROR_MESSAGE);
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
					textField_4.setText("");
					textField_5.setText("");
					textField_6.setText("");
				}
				
		

			} else if (textField_1.getText().equals("")) {
				
				try {
					double a = Double.parseDouble(textField.getText());
					double c = Double.parseDouble(textField_2.getText());
					
					if (a == 0) {
						JOptionPane.showMessageDialog(frmQuadraticEquationSolver,
								"Sorry, INVALID INPUT.The value of \"a\" cannot be zero as it transforms the quadratic equation into a linear equation. Also, please enter a value for b and Try Again.",
								"ERROR", JOptionPane.ERROR_MESSAGE);
						textField_1.setText("");
					
					}else { JOptionPane.showMessageDialog(frmQuadraticEquationSolver, "Sorry. Please enter a value for b ", "ERROR",
							JOptionPane.ERROR_MESSAGE);
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
					textField_4.setText("");
					textField_5.setText("");
					textField_6.setText("");
						}
						
				} catch (Exception e) {
					JOptionPane.showMessageDialog(frmQuadraticEquationSolver,
							"Sorry, INVALID INPUT. Please input all three values in integers, decimals or scientific notation, enter a value for b and try again !",
							"ERROR - INVALID INPUT", JOptionPane.ERROR_MESSAGE);
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
					textField_4.setText("");
					textField_5.setText("");
					textField_6.setText("");
				}
			}

			else if (textField_2.getText().equals("")) {
				try {
					double a = Double.parseDouble(textField.getText());
					double b = Double.parseDouble(textField_1.getText());
				
					if (a == 0) {
						JOptionPane.showMessageDialog(frmQuadraticEquationSolver,
								"Sorry, INVALID INPUT.The value of \"a\" cannot be zero as it transforms the quadratic equation into a linear equation. Also, please enter a value for c and Try Again.",
								"ERROR", JOptionPane.ERROR_MESSAGE);
						textField.setText("");
					
		
					} else { JOptionPane.showMessageDialog(frmQuadraticEquationSolver, "Sorry. Please enter a value for c ", "ERROR",
							JOptionPane.ERROR_MESSAGE);
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(frmQuadraticEquationSolver,
							"Sorry, INVALID INPUT. Please input all three values in integers, decimals or scientific notation, enter a value for c and try again !",
							"ERROR - INVALID INPUT", JOptionPane.ERROR_MESSAGE);
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
					textField_4.setText("");
					textField_5.setText("");
					textField_6.setText("");
				}

			} else {

				try {
					double a = Double.parseDouble(textField.getText());
					double b = Double.parseDouble(textField_1.getText());
					double c = Double.parseDouble(textField_2.getText());

					double toCheckA = a;

					// Formulas for calculating discriminant, complex, real and single roots: 
					
					double discriminant = (b * b - 4 * a * c);

					double realRoot1 = (-b + Math.sqrt(discriminant)) / (2 * a);
					double realRoot2 = (-b - Math.sqrt(discriminant)) / (2 * a);
					double complexRoot1 = (-b / (2 * a));
					double complexRoot2 = (Math.sqrt(-discriminant) / (2 * a));
					double singleRoot = (-b / 2 * a);
					
					// a CANNOT BE ZERO.

					if (toCheckA == 0) {
						JOptionPane.showMessageDialog(frmQuadraticEquationSolver,
								"Sorry, INVALID INPUT.The value of \"a\" cannot be zero as it transforms the quadratic equation into a linear equation. Please Try Again.",
								"ERROR - a cannot be zero", JOptionPane.ERROR_MESSAGE);
						textField.setText("");

					}
                   // IF DISCRIMINANT IS POSITIVE i.e. GREATER THAN ZERO, REAL ROOTS EXIST.
					else if (discriminant > 0) {
						JOptionPane.showMessageDialog(frmQuadraticEquationSolver,
								"The quadratic equation has two real roots", "TWO REAL SOLUTIONS",
								JOptionPane.INFORMATION_MESSAGE);

						String realRoot1String = String.format("%.5g%n", realRoot1); //rounds realRoot1 to five significant figures and declares it as a new string.
						String realRoot2String = String.format("%.5g%n", realRoot2); //rounds realRoot2 to five significant figures and declares it as a new string.
						String discriminantString = String.format("%.5g%n", discriminant); //rounds discriminant to five significant figures and declares it as a new string.

						textField_3.setText(realRoot1String); // displays realRoot1String to Root 1 text field
						textField_4.setText(realRoot2String); // displays realRoot2String to Root 2 text field.
						textField_5.setText("(" + a + ")" + "X^2" + "+ (" + b + ")" + "X" + "+ (" + c + ")"); // displays the equation based on user input.
						textField_6.setText("" + discriminantString); // displays the discriminant string to discriminant text field.
				
						// IF DISCRIMINANT IS EQUAL TO ZERO, ONLY ONE ROOT EXISTS.
					
			  
					} else if (discriminant == 0) {
						JOptionPane.showMessageDialog(frmQuadraticEquationSolver,
								"The quadratic equation only has one real root.", "ONE REAL SOLUTION",
								JOptionPane.INFORMATION_MESSAGE);

						String singleRootString = String.format("%.5g%n", singleRoot); //rounds singleRoot to five significant figures and declares it as a new string.
						String discriminantString = String.format("%.5g%n", discriminant); //rounds discriminant to five significant figures and declares it as a new string.

						textField_3.setText(singleRootString);
						textField_4.setText("N/A");
						textField_5.setText("" + a + "X^2" + "+ " + b + "X" + "+ " + c);
						textField_6.setText("" + discriminantString);

					}
					// IF DISCRIMINANT IS NEGATIVE i.e. LESS THAN ZERO, COMPLEX ROOTS EXIST.
					else if (discriminant < 0) {

						JOptionPane.showMessageDialog(frmQuadraticEquationSolver,
								"The quadratic equation has two Imaginary roots.", "TWO COMPLEX SOLUTIONS",
								JOptionPane.INFORMATION_MESSAGE);

						String complexRoot1String = String.format("%.5g%n", complexRoot1); //rounds complexRoot1 to five significant figures and declares it as a new string.
						String complexRoot2String = String.format("%.5g%n", complexRoot2); //rounds complexRoot2 to five significant figures and declares it as a new string.
						String discriminantString = String.format("%.5g%n", discriminant); //rounds discriminant to five significant figures and declares it as a new string.

						textField_3.setText(complexRoot1String + "+ " + complexRoot2String + " i");
						textField_4.setText(complexRoot1String + "- " + complexRoot2String + " i");
						textField_5.setText("" + a + "X^2" + "+ " + b + "X" + "+ " + c);
						textField_6.setText("" + discriminantString);

					}
					// WHEN INPUT contains non parsible text. 
				} catch (Exception e) {
					JOptionPane.showMessageDialog(frmQuadraticEquationSolver,
							"Sorry, INVALID INPUT. Please input all three values in integers, decimals or scientific notation and try again !",
							"ERROR - INVALID INPUT", JOptionPane.ERROR_MESSAGE); // when all three text boxes contain valid input but one or more input is invalid.
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
					textField_4.setText("");
					textField_5.setText("");
					textField_6.setText("");
				}
			}
		}
	}

	private class BtnResetActionListener implements ActionListener { // changes the text in all fields (editable or non-editable) to "" when Reset button is clicked.
		public void actionPerformed(ActionEvent arg0) {

			textField.setText("");
			textField_1.setText("");
			textField_2.setText("");
			textField_3.setText("");
			textField_4.setText("");
			textField_5.setText("");
			textField_6.setText("");
		}
	}

	private class MntmExitActionListener implements ActionListener { // exits the program when the exit menu item is clicked.
		public void actionPerformed(ActionEvent arg0) {
			System.exit(JFrame.EXIT_ON_CLOSE);
		}
	}

       
	private class MntmVeiwQuadraticFormulaActionListener implements ActionListener { // displays quadratic formula in a dialog box when this button is clicked
		public void actionPerformed(ActionEvent e) {
			ImageIcon Image2 = new ImageIcon(this.getClass().getResource("/image2.png"));

			JOptionPane.showMessageDialog(null, new JLabel("", Image2, JLabel.CENTER), "Quadratic Formula",
					JOptionPane.INFORMATION_MESSAGE);

		}
	}
  // Feedback Action Listener:
	private class MntmGiveFeedbackActionListener implements ActionListener { // opens default application for mailing, adds developer's email in the to box and "Feedback Email" in subject line.
		public void actionPerformed(ActionEvent arg0) {
			Desktop desktop = Desktop.getDesktop();
			String message = "mailto:UMahajan72409@tacomacc.edu?subject=Feedback%20Email";
			URI uri = URI.create(message);
			try {
				desktop.mail(uri);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	// About - Copyright Information - Just for Fun:
	
	private class MenuItemActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(frmQuadraticEquationSolver,
					"Quadratic Equation Solver (Ver. 1.00) Developed by Uday Mahajan \n \u00a9 Uday M. 2017 \n All Rights Reserved.",
					"ABOUT", JOptionPane.PLAIN_MESSAGE);
		}
	}
	// Help >> Instructions Message Box:
	private class MntmInstructionsActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(frmQuadraticEquationSolver,
					" Valid Input => Integers, decimals or scientific notations. \n \n  Integers => 0, 1, 2, etc. \n  Decimals => 0.2 ,1.00, 2.09905 etc. \n Scientific notation => 2.5*10^(-6): should be entered as 2.5E-6. \n \n Note: The values will be dispayed with 5 significant figures each time. \n \n "
					+ "NaN => Not a Number & N/A => Not Applicable. \n\n The value of a must be non zero. ",
					"INSTRUCTIONS", JOptionPane.PLAIN_MESSAGE);
			
		}
	}
	
	// More Details Message Box:
	private class BtnMoreInstructionsActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(frmQuadraticEquationSolver,
					" Valid Input => Integers, decimals or scientific notations. \n \n  Integers => 0, 1, 2, etc. \n  Decimals => 0.2 ,1.00, 2.09905 etc. \n Scientific notation => 2.5*10^(-6): should be entered as 2.5E-6. \n \n Note: The values will be dispayed with 5 significant figures each time. \n \n "
					+ "NaN => Not a Number & N/A => Not Applicable. \n\n The value of a must be non zero. ",
					"INSTRUCTIONS", JOptionPane.PLAIN_MESSAGE);
		}
	}
}
