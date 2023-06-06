package Cadastro;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Painel extends JPanel {
	
	private JButton Cadastrar;
	private JButton Listar;
	private JButton Atualizar;
	private JButton Deletar;
	Cadastro cadastro;
	
	
	
	private JButton criarBotao(String nome) {
		
		return new JButton(nome);
	}

	public Painel (Cadastro cadastro) {
		
		super(new GridLayout(0, 2));
		
		this.cadastro = cadastro;
		
		this.setLayout(new FlowLayout());
		
		this.Cadastrar = this.criarBotao("Cadastrar");
		this.add(this.Cadastrar);
		this.Cadastrar.addActionListener(new eventoCadastrar());
		
		this.Listar = this.criarBotao("Listar");
		this.add(this.Listar);

		this.Atualizar = this.criarBotao("Atualizar");
		this.add(this.Atualizar);

		this.Deletar = this.criarBotao("Deletar");
		this.add(this.Deletar);
		
	}
	
	public class eventoCadastrar implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			cadastro.CadastroPainel.setVisible(true);
			
			
		}
		
	}
	

}