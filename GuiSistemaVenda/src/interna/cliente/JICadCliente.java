package interna.cliente;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;

public class JICadCliente extends JInternalFrame {

	private static JICadCliente instacia;
	private JButton btnFecha;
	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

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

	/**
	 * Create the frame.
	 */
	private JICadCliente() {
		
		setResizable(true);
		setMaximizable(true);
		setMaximizable(true);
		
		
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
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(676, 34, 89, 23);
		panelFiltro.add(btnBuscar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(676, 68, 89, 23);
		panelFiltro.add(btnLimpar);
		
		btnFecha = new JButton("Fecha");
		btnFecha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fecha();
			}
		});
		btnFecha.setBounds(676, 356, 89, 23);
		panelFiltro.add(btnFecha);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBounds(30, 34, 610, 345);
		panelFiltro.add(panel);
		panel.setLayout(null);
		
		JLabel lblCdigo = new JLabel("Código Cliente");
		lblCdigo.setBounds(30, 11, 100, 14);
		panel.add(lblCdigo);
		
		textField = new JTextField();
		textField.setBounds(30, 36, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(30, 67, 46, 14);
		panel.add(lblNome);
		
		textField_1 = new JTextField();
		textField_1.setBounds(30, 92, 465, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Tipo", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(30, 135, 207, 50);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JRadioButton rdbtnFsica = new JRadioButton("F\u00EDsica");
		rdbtnFsica.setBounds(6, 20, 56, 23);
		panel_1.add(rdbtnFsica);
		
		JRadioButton rdbtnJurdica = new JRadioButton("Jur\u00EDdica");
		rdbtnJurdica.setBounds(64, 20, 61, 23);
		panel_1.add(rdbtnJurdica);
		
		JRadioButton rdbtnOutras = new JRadioButton("Outras");
		rdbtnOutras.setBounds(134, 20, 78, 23);
		panel_1.add(rdbtnOutras);
		
		JLabel lblCpfcnpj = new JLabel("CPF/CNPJ");
		lblCpfcnpj.setBounds(30, 196, 59, 14);
		panel.add(lblCpfcnpj);
		
		textField_2 = new JTextField();
		textField_2.setBounds(30, 221, 150, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JPanel panelResultado = new JPanel();
		tabbedPaneSegunda.addTab("Resultado", null, panelResultado, null);
		panelResultado.setLayout(null);
		
		JPanel panelManutencao = new JPanel();
		tabbedPanePrincipal.addTab("Manutenção", null, panelManutencao, null);
		panelManutencao.setLayout(null);
		
		
		
		

	}

	public static JICadCliente getInstacia() {
		if (instacia == null) {
			instacia = new JICadCliente();
		}
		return instacia;
	}
	
	private void fecha(){
		instacia = null;
		this.dispose();
	}
}
