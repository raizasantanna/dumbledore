package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import java.awt.BorderLayout;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import entidades.Recomendador;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TelaPrincipal {

	private JFrame frmNetflixChill;
	public Recomendador sistema = new Recomendador();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal window = new TelaPrincipal();
					window.frmNetflixChill.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaPrincipal() {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNetflixChill = new JFrame();
		frmNetflixChill.setTitle("NETFLIX & CHILL");
		frmNetflixChill.setBounds(100, 100, 500, 400);
		frmNetflixChill.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmNetflixChill.getContentPane().add(menuBar, BorderLayout.NORTH);
		
		JMenu menuUsuario = new JMenu("Usuário");
		menuBar.add(menuUsuario);
		
		JMenuItem criarUsuario = new JMenuItem("Criar Usuário");
		criarUsuario.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Clicou!!");
				
				
			}
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("Pressed");
				CriarUsuario tlNovoUsuario = new CriarUsuario();
				tlNovoUsuario.setVisible(true);
				
			}
		});
		menuUsuario.add(criarUsuario);
		
		JMenuItem listarUsuarios = new JMenuItem("Listar Usuários");
		menuUsuario.add(listarUsuarios);
	}

}