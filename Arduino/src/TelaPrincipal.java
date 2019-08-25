import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class TelaPrincipal extends JPanel implements ActionListener {

	private JLayeredPane layeredPane;
	private JLabel labelPrincipal;
	private JCheckBox checkBox;
	private JComboBox comboBox;
	private JButton botao;

	/*
	 * controle arduino private static ControlePorta arduino;
	 */
	private static int LIGAR_VERMELHO = 1;
	private static int LIGAR_AMARELO = 2;
	private static int LIGAR_VERDE = 3;
	private static int APAGAR_VERMELHO = 4;
	private static int APAGAR_AMARELO = 5;
	private static int APAGAR_VERDE = 6;

	// ACTION COMANDS
	private static String CHK_COMMAND = "checkBox";
	private static String COMBO_COMMAND = "comboBox";
	private static String BTN_COMMAND = "botao";
	private static Color GRAY = Color.gray;

	private String[] layerStrings = { "Vermelho (0)", "Amarelo (1)", "Verde (2)" };
	private Color[] layerColors = { Color.red, Color.yellow, Color.green };

	public void start() {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				// configuraArduino();
				criaEMostraInterfaceGrafica();
			}
		});

	}
	/*
	 * private void configuArduino() { String porta =
	 * JOption.showInputDialog("Porta"); arduino = new ControlePorta(porta,9600);
	 * 
	 * }
	 */

	private static void criaEMostraInterfaceGrafica() {
		// create and set up the window.
		JFrame frame = new JFrame("Semáforo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// create and set up the content pane.
		JComponent newContentPane = new TelaPrincipal();
		newContentPane.setOpaque(true);// content panes must opaque
		frame.setContentPane(newContentPane);

		// display the window
		frame.pack();
		frame.setVisible(true);
	}

	public TelaPrincipal() {

		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));

		layeredPane = new JLayeredPane();
		layeredPane.setPreferredSize(new Dimension(250, 460));
		layeredPane.setBorder(BorderFactory.createTitledBorder("Semáfaro"));

		// This is the origin of the first label added.
		Point origin = new Point(10, 20);

		// this is the offset for computing the origin for the next label.
		int offsetX = 0;
		int offsetY = 145;

		Point posicoes[] = { new Point(10, 20), new Point(10, 165), new Point(10, 310) };

		for (int i = 0; i < posicoes.length; i++) {
			JLabel label = criaCaixaParaColorir(layerStrings[i], GRAY, posicoes[i]);
			layeredPane.add(label, new Integer(i));
		}
		add(Box.createRigidArea(new Dimension(0, 10)));
		add(criarPainelDeControle());
		add(Box.createRigidArea(new Dimension(0, 10)));
		add(layeredPane);
	}

	private JLabel criaCaixaParaColorir(String text, Color color, Point origin) {
		JLabel label = new JLabel(text);
		label.setVerticalAlignment(JLabel.TOP);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setOpaque(true);
		label.setBackground(color);
		label.setForeground(Color.black);
		label.setBorder(BorderFactory.createLineBorder(Color.black));
		label.setBounds(origin.x, origin.y, 140, 140);
		return label;
	}

	private JPanel criarPainelDeControle() {
		checkBox = new JCheckBox("Ligar");
		checkBox.setSelected(false);
		checkBox.setActionCommand(CHK_COMMAND);
		checkBox.addActionListener(this);

		comboBox = new JComboBox(layerStrings);
		comboBox.setSelectedIndex(0);
		comboBox.setActionCommand(COMBO_COMMAND);
		comboBox.addActionListener(this);

		botao = new JButton("Pifar");
		botao.setActionCommand(BTN_COMMAND);
		botao.addActionListener(this);

		JPanel controls = new JPanel();
		controls.add(comboBox);
		controls.add(botao);
		controls.add(checkBox);
		controls.setBorder(BorderFactory.createTitledBorder("Controle de tráfego"));
		return controls;
	}

	private void apagarLuzes(int pos) {
		for (int i = 0; i <= 2; i++) {
			layeredPane.getComponent(i).setBackground(GRAY);
		}
	}

	private void acendeLuz(int pos) {
		switch (pos) {
		case 0:
			acendeLuzVerde();
			break;
		case 1:
			acendeLuzAmarela();
		case 2:
			acendeLuzVermelha();
			break;

		}
	}

	private void acenderTudo() {
		acendeLuzVerde();
		acendeLuzAmarela();
		acendeLuzVermelha();
	}
	
	private void acendeLuzVerde() {
		layeredPane.getComponent(0).setBackground(layerColors[1]);
	}
	private void acendeLuzVermelha() {
		layeredPane.getComponent(2).setBackground(layerColors[0]);
		}
	
	private void acendeLuzAmarela() {
		layeredPane.getComponent(1).setBackground(layerColors[2]);
		
	}
	
	public void actionPerfomed(ActionEvent e) {
		String cmd = e.getActionCommand();
		int pos = comboBox.getSelectedIndex();
		
		if (checkBox.isSelected()) {
			acendeLuz (2-pos);
			}
	} else if (BTN_COMMAND.equals(cmd)) {
		acenderTudo();
	} }}
