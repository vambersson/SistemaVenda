package principal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import interna.cliente.JICadCliente;
import util.Aparencia;

import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class JFramePrincipal extends JFrame {

	private JPanel contentPane, jpanelPrincipal, jpanelBarra, jpanelRodape;
	private JLabel lblDataAtual ,lblVersao, lblEmpresa, lblUsuario; // Rodape
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFramePrincipal frame = new JFramePrincipal();
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
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
	public JFramePrincipal() {
		
		Aparencia.setAparencia();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/IconPrincipal16x16.png")));
		contentPane = new JPanel();
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.PAGE_AXIS));
		
		jpanelBarra = new JPanel();
		jpanelBarra.setPreferredSize(new Dimension(Short.MAX_VALUE, 69));
		jpanelBarra.setMaximumSize(new Dimension(Short.MAX_VALUE, 69));
		jpanelBarra.setLayout(null);
		contentPane.add(jpanelBarra);
		
		jpanelPrincipal = new JPanel();
		jpanelPrincipal.setLayout(null);
		jpanelPrincipal.setBackground(Color.GRAY);
		contentPane.add(jpanelPrincipal);
		
		jpanelRodape = new JPanel();
		jpanelRodape.setPreferredSize(new Dimension(Short.MAX_VALUE, 30));
		jpanelRodape.setMaximumSize(new Dimension(Short.MAX_VALUE, 30));
		jpanelRodape.setLayout(null);
		//jpanelRodape.setBackground(Color.blue);
		contentPane.add(jpanelRodape);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, Short.MAX_VALUE, 21);
		jpanelBarra.add(menuBar);
		
		JMenu mnConfigurao = new JMenu("Configura\u00E7\u00E3o");
		menuBar.add(mnConfigurao);
		
		JMenu mnCadastros = new JMenu("Cadastros");
		mnConfigurao.add(mnCadastros);
		
		JMenuItem mntmEmpresa = new JMenuItem("Empresa");
		mnCadastros.add(mntmEmpresa);
		
		JMenuItem mntmUsurios = new JMenuItem("Usu\u00E1rios");
		mnCadastros.add(mntmUsurios);
		
		JMenu mnFaturamento = new JMenu("Faturamento");
		menuBar.add(mnFaturamento);
		
		JMenu mnManutenoCliente = new JMenu("Manuten\u00E7\u00E3o Cliente");
		mnFaturamento.add(mnManutenoCliente);
		
		JMenuItem mntmCadastroCliente = new JMenuItem("Cadastro Cliente");
		mntmCadastroCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				chamarTelaCadCliente();
			}
		});
		mnManutenoCliente.add(mntmCadastroCliente);
		
		JMenu mnManutenoNota = new JMenu("Manuten\u00E7\u00E3o Nota");
		mnFaturamento.add(mnManutenoNota);
		
		JMenuItem mntmNotas = new JMenuItem(" Notas");
		mnManutenoNota.add(mntmNotas);
		
		JMenuItem mntmReemisso = new JMenuItem("Reemiss\u00E3o");
		mnManutenoNota.add(mntmReemisso);
		
		JMenu mnProdutos = new JMenu("Produtos");
		menuBar.add(mnProdutos);
		
		JMenuItem mntmAtendimento = new JMenuItem("Atendimento");
		mnProdutos.add(mntmAtendimento);
		
		JMenu mnTransaes = new JMenu("Transa\u00E7\u00F5es");
		mnProdutos.add(mnTransaes);
		
		JMenuItem mntmAjusteItens = new JMenuItem("Ajuste Itens");
		mnTransaes.add(mntmAjusteItens);
		
		JMenuItem mntmEntradaDeNotas = new JMenuItem("Entrada de Notas");
		mnTransaes.add(mntmEntradaDeNotas);
		
		JSeparator separator = new JSeparator();
		mnProdutos.add(separator);
		
		JMenu mnCadastros_1 = new JMenu("Cadastros");
		mnProdutos.add(mnCadastros_1);
		
		JMenuItem mntmGrupos = new JMenuItem("Grupos");
		mnCadastros_1.add(mntmGrupos);
		
		JMenuItem mntmCategorias = new JMenuItem("Categorias");
		mnCadastros_1.add(mntmCategorias);
		
		JMenuItem mntmItem = new JMenuItem("Item");
		mnCadastros_1.add(mntmItem);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setFloatable(false);
		toolBar.setBounds(0, 21, 900, 48);
		jpanelBarra.add(toolBar);
		
		JButton btnToolBarCadCliente = new JButton();
		btnToolBarCadCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				chamarTelaCadCliente();
				btnToolBarCadCliente.setFocusable(false);
				
			}
		});
		btnToolBarCadCliente.setIcon(new ImageIcon(getClass().getResource("/img/BtnClient48x48.png")));
		btnToolBarCadCliente.setFocusable(false);
		toolBar.add(btnToolBarCadCliente);
		
		
		
		
		
		
		
		
		
		lblVersao = new JLabel("Versão");
		lblVersao.setBounds(10, 11, 100, 14);
		jpanelRodape.add(lblVersao);
		
		lblDataAtual = new JLabel("Data Atual");
		lblDataAtual.setBounds(137, 11, 300, 14);
		jpanelRodape.add(lblDataAtual);
		
		lblEmpresa = new JLabel("Empresa");
		lblEmpresa.setBounds(460, 11, 414, 14);
		jpanelRodape.add(lblEmpresa);
		
		lblUsuario = new JLabel("usuario");
		lblUsuario.setBounds(884, 11, 114, 14);
		jpanelRodape.add(lblUsuario);
		
		
		// Metodos
		
		rodapeVersao();
		rodapeDataAtual();
		rodapeNomeEmpresa();
		rodapeNomeUsuario();
		
		
		
	}
	
	private void rodapeVersao(){
		lblVersao.setText("Versão 1.0");
	}
	
	private void rodapeDataAtual(){
		lblDataAtual.setText( convertData(new Date()));
	}
	
	private void rodapeNomeEmpresa(){
		lblEmpresa.setText("Aqui fica o nome da empresa");
	}
	private void rodapeNomeUsuario(){
		lblUsuario.setText("Nome do usuário");
	}
	
	//FUNÇÕES 
	
	private String convertData(Date data){
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		String dataconvertida = sdf.format(data);
		
		return dataconvertida;
		
	}
	
	
	
	// TELAS DE CADASTROS 
	
	private void chamarTelaCadCliente(){
		
		JICadCliente cadcli = JICadCliente.getInstacia();
						
		// Centraliza 
		cadcli.setLocation((jpanelPrincipal.getSize().width - cadcli.getSize().width) /2, (jpanelPrincipal.getSize().height - cadcli.getSize().height) /2 );
		
		cadcli.setVisible(true);
		
		jpanelPrincipal.add(cadcli);
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
