package ui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import principal.CadastroAlunoDialog;

public class MainJFrame extends JFrame
{
	JMenuBar menuBar;
	JMenu menuCad;
	JMenuItem miAluno;
	JLabel titulo;
	
	private void abrirCadastroAluno() {
		CadastroAlunoDialog cadastroAlunoDialog = new CadastroAlunoDialog();
		cadastroAlunoDialog.setVisible(true);
	}
	
	public MainJFrame()
	{
		super("Sistema Gestão Escolar");
		setSize(800, 600);
		setLocationRelativeTo(null);
		setResizable(false);
		
		//Menu
		menuBar = new JMenuBar();
		menuCad = new JMenu("Cadastro");
		miAluno = new JMenuItem("Aluno");
		miAluno.addActionListener(_ -> abrirCadastroAluno());
		menuCad.add(miAluno);
		menuBar.add(menuCad);
		setJMenuBar(menuBar);
		
		titulo = new JLabel();
		titulo.setText("Bem-Vindo");
		
		add(titulo, BorderLayout.CENTER);
	}
}
