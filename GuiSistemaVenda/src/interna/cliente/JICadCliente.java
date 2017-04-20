package interna.cliente;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.ParseException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JSeparator;
import javax.swing.JFormattedTextField;

public class JICadCliente extends JInternalFrame {

	private static JICadCliente instacia;
	
	private JButton btnFiltroBuscar, btnFiltroLimpar;

	private JTextField textFiltoCodigo, textFiltroNome;

	private JRadioButton rdFiltroFsica, rdFiltroJurdica, rdFiltroOutras, rdManuFsica, rdManuJuridica, rdManuOutras ;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textFiltroCPF_CNPJ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JICadCliente frame = new JICadCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static JICadCliente getInstacia() {
		if (instacia == null) {
			instacia = new JICadCliente();
		}
		return instacia;
	}

	/**
	 * Create the frame.
	 */
	private JICadCliente() {
		
		setResizable(true);
		setMaximizable(true);
		setMaximizable(true);
		this.setClosable(true);
		
		
		setFrameIcon(new ImageIcon(getClass().getResource("/img/IconClient16x16.png")));
		setBounds(100, 100, 814, 486);
		getContentPane().setLayout(null);
		JTabbedPane tabbedPanePrincipal = new JTabbedPane(JTabbedPane.TOP);
		tabbedPanePrincipal.setBounds(0, 0, 800, 460);
		getContentPane().add(tabbedPanePrincipal);
		
		JPanel panelConsulta = new JPanel();
		tabbedPanePrincipal.addTab("Consulta", null, panelConsulta, null);
		panelConsulta.setLayout(null);
		
		JTabbedPane tabbedPaneSegunda = new JTabbedPane(JTabbedPane.TOP);
		tabbedPaneSegunda.setBounds(0, 0, 795, 432);
		panelConsulta.add(tabbedPaneSegunda);
		
		JPanel panelFiltro = new JPanel();
		tabbedPaneSegunda.addTab("Filtro", null, panelFiltro, null);
		panelFiltro.setLayout(null);
		
		btnFiltroBuscar = new JButton("Buscar");
		btnFiltroBuscar.setBounds(676, 34, 89, 23);
		panelFiltro.add(btnFiltroBuscar);
		
		btnFiltroLimpar = new JButton("Limpar");
		btnFiltroLimpar.setBounds(676, 68, 89, 23);
		panelFiltro.add(btnFiltroLimpar);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBounds(30, 34, 610, 345);
		panelFiltro.add(panel);
		panel.setLayout(null);
		
		JLabel lblCdigo = new JLabel("Código Cliente");
		lblCdigo.setBounds(30, 11, 100, 14);
		panel.add(lblCdigo);
		
		textFiltoCodigo = new JTextField();
		textFiltoCodigo.setBounds(30, 36, 86, 20);
		panel.add(textFiltoCodigo);
		textFiltoCodigo.setColumns(10);
		textFiltoCodigo.requestFocus();
		
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(30, 67, 46, 14);
		panel.add(lblNome);
		
		textFiltroNome = new JTextField();
		textFiltroNome.setBounds(30, 92, 465, 20);
		panel.add(textFiltroNome);
		textFiltroNome.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Tipo", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(30, 135, 218, 50);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		
		
		rdFiltroFsica = new JRadioButton("F\u00EDsica");
		rdFiltroFsica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rdFiltroJurdica.setSelected(false); 
				rdFiltroOutras.setSelected(false);
			}
		});
		rdFiltroFsica.setBounds(6, 20, 56, 23);
		panel_1.add(rdFiltroFsica);
		
		rdFiltroJurdica = new JRadioButton("Jur\u00EDdica");
		rdFiltroJurdica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdFiltroFsica.setSelected(false); 
				textFiltroCPF_CNPJ.setText("");
				rdFiltroOutras.setSelected(false);
			}
		});
		rdFiltroJurdica.setBounds(64, 20, 61, 23);
		panel_1.add(rdFiltroJurdica);
		
		rdFiltroOutras = new JRadioButton("Outras");
		
		rdFiltroOutras.setBounds(134, 20, 78, 23);
		panel_1.add(rdFiltroOutras);
		
		JLabel lblCpfcnpj = new JLabel("CPF/CNPJ");
		lblCpfcnpj.setBounds(30, 196, 51, 14);
		panel.add(lblCpfcnpj);
		
		textFiltroCPF_CNPJ = new JTextField();
		textFiltroCPF_CNPJ.setBounds(30, 221, 138, 20);
		panel.add(textFiltroCPF_CNPJ);
		textFiltroCPF_CNPJ.setColumns(10);
		
			
		
		JPanel panelResultado = new JPanel();
		tabbedPaneSegunda.addTab("Resultado", null, panelResultado, null);
		panelResultado.setLayout(null);
		
		table = new JTable();
		table.setBounds(0, 0, 790, 358);
		panelResultado.add(table);
		
		JButton btnExportExcel = new JButton();
		btnExportExcel.setBounds(10, 369, 24, 24);
		btnExportExcel.setIcon(new ImageIcon(getClass().getResource("/img/BtnExcel24x24.png")));
		panelResultado.add(btnExportExcel);
		
		JButton btnExportPDF = new JButton();
		btnExportPDF.setBounds(43, 369, 24, 24);
		btnExportPDF.setIcon(new ImageIcon(getClass().getResource("/img/BtnPDF24x24.png")));
		panelResultado.add(btnExportPDF);
		
		JButton btnPrinter = new JButton();
		btnPrinter.setBounds(77, 369, 24, 24);
		btnPrinter.setIcon(new ImageIcon(getClass().getResource("/img/BtnPrinter24x24.png")));
		panelResultado.add(btnPrinter);
		
		JPanel panelManutencao = new JPanel();
		tabbedPanePrincipal.addTab("Manutenção", null, panelManutencao, null);
		panelManutencao.setLayout(null);
		
		JTabbedPane tabbedManutencao = new JTabbedPane(JTabbedPane.TOP);
		tabbedManutencao.setBounds(0, 0, 795, 387);
		panelManutencao.add(tabbedManutencao);
		
		JPanel panelDados = new JPanel();
		tabbedManutencao.addTab("Dados", null, panelDados, null);
		panelDados.setLayout(null);
		
		JLabel lblCdigo_1 = new JLabel("C\u00F3digo");
		lblCdigo_1.setBounds(10, 11, 46, 14);
		panelDados.add(lblCdigo_1);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(10, 23, 86, 20);
		panelDados.add(textField);
		textField.setColumns(10);
		
		JLabel lblNome_1 = new JLabel("Nome");
		lblNome_1.setBounds(106, 11, 46, 14);
		panelDados.add(lblNome_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(106, 23, 472, 20);
		panelDados.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Tipo", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(588, 11, 192, 55);
		panelDados.add(panel_2);
		panel_2.setLayout(null);
		
		rdManuFsica = new JRadioButton("F\u00EDsica");
		rdManuFsica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rdManuJuridica.setSelected(false);
				rdManuOutras.setSelected(false);
				
			}
		});
		rdManuFsica.setBounds(6, 18, 51, 23);
		panel_2.add(rdManuFsica);
		
		rdManuJuridica = new JRadioButton("Jur\u00EDdica");
		rdManuJuridica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdManuOutras.setSelected(false);
				rdManuFsica.setSelected(false);
			}
		});
		rdManuJuridica.setBounds(59, 18, 61, 23);
		panel_2.add(rdManuJuridica);
		
		rdManuOutras = new JRadioButton("Outras");
		rdManuOutras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdManuFsica.setSelected(false);
				rdManuJuridica.setSelected(false);
				
			}
		});
		rdManuOutras.setBounds(122, 18, 61, 23);
		panel_2.add(rdManuOutras);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Endere\u00E7o", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(10, 142, 770, 206);
		panelDados.add(panel_3);
		
		JButton button = new JButton("Cancelar");
		button.setBounds(109, 398, 89, 23);
		panelManutencao.add(button);
		
		JButton button_1 = new JButton("Salvar");
		button_1.setBounds(10, 398, 89, 23);
		panelManutencao.add(button_1);
		
		

	}
	
	@Override
	public void setClosable(boolean b) {
		
		instacia = null;
		super.setClosable(b);
		
	}

	
	
	
	
	
}
