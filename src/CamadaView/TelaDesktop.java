package CamadaView;



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import CamadaControle.ControleDesktopAcesso;
import CamadaControle.ControleDesktopPesquisa;
import CamadaDao.ConexaoDesktopAcesso;
import CamadaDao.ConexaoDesktopPesquisa;
import CamadaDao.ConexaoNoiva;
import CamadaModel.Desktop;
import CamadaModel.TrageNoiva;

import javax.swing.*;

public class TelaDesktop extends JFrame implements ActionListener {

	public static int testes;
	JComboBox<String> combo;
	JLabel foto;
	ImageIcon[] image;
	int retorno;
	String resultado;
	String result;
	
	private JTextField modelo;
	private JTextField local_estoque;
	private JTextField cores;
	private JTextField observacao;
	private JTextField quantidade;
	private JTextField Registro;
	private JTextField modello;
	private JTextField retorno_codigo;
	private JTextField nome_usuario;
	private JTextField data_hora_acesso;
	
	public TelaDesktop() {
		
		setContentPane(complemento());

		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setSize(1000,700);
		setTitle("Tela Inicial");
		setVisible(true);
    	setResizable(false);
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frameSize = getSize();
		setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);

	}
	
	public Container complemento(){
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setLayout(null);

		ImageIcon centro = new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivo.png"));
		centro.setImage(centro.getImage().getScaledInstance(400, 300, 300));
		JLabel LabelCentro = new JLabel(centro);
		LabelCentro.setLocation(0,79);
		LabelCentro.setSize(415,433);
		LabelCentro.setToolTipText("Acesse o Logon");
		
//==============================================================================================================================================================		
				//	Tabelas
				JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
					tabbedPane.setBorder(null);
					tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
					tabbedPane.setBackground(Color.LIGHT_GRAY);
					tabbedPane.setBounds(459, 0, 525, 661);
		
//==================================================================================================================================================================		
					//Primeira aba
						JPanel Cadastros = new JPanel();
						Cadastros.setBackground(Color.LIGHT_GRAY);
						Cadastros.setLayout(null);
		
//==================================================================================================================================================================		
							JPanel subpainel_cadastro1 = new JPanel();
							subpainel_cadastro1.setBackground(Color.LIGHT_GRAY);
							subpainel_cadastro1.setBounds(24, 80, 475, 309);
							subpainel_cadastro1.setLayout(null);
							subpainel_cadastro1.setBorder(javax.swing.BorderFactory.createEtchedBorder()); 
							subpainel_cadastro1.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações Gerais"));
		
							nome_usuario = new JTextField();
							nome_usuario.setEditable(false);
							nome_usuario.setBounds(273, 51, 182, 20);
							nome_usuario.setColumns(10);
		
							data_hora_acesso = new JTextField();
							data_hora_acesso.setEditable(false);
							data_hora_acesso.setColumns(10);
							data_hora_acesso.setBounds(273, 99, 182, 20);
		
		
							JLabel lblUsuarioLogado = new JLabel("Usuario Logado");
							lblUsuarioLogado.setBounds(273, 26, 103, 14);
		
							JLabel lblDataEHora = new JLabel("Data e Hora do Logon");
							lblDataEHora.setBounds(273, 74, 122, 14);
				
//==================================================================================================================================================================		
							JPanel subpainel_cadastro2 = new JPanel();
							subpainel_cadastro2.setBackground(Color.LIGHT_GRAY);
							subpainel_cadastro2.setBounds(66, 420, 400, 202);
							subpainel_cadastro2.setLayout(null);
							subpainel_cadastro2.setBorder(javax.swing.BorderFactory.createEtchedBorder()); 
							subpainel_cadastro2.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastros Rápidos"));
		
		
							ImageIcon Funcionario = new ImageIcon(getClass().getResource("../Imagens/img/Desktop/funcionario.png"));	
							Funcionario.setImage(Funcionario.getImage().getScaledInstance(30, 20, 20));
		
							ImageIcon  banco= new ImageIcon(getClass().getResource("../Imagens/img/Desktop/exitt.png"));	
							banco.setImage(banco.getImage().getScaledInstance(30, 20, 20));	
		
							JLabel lblLojas = new JLabel("Lojas");
							lblLojas.setBounds(235, 35, 47, 14);
							
							JButton butao_loja = new JButton("");
							butao_loja.setBounds(237, 57, 89, 23);
							butao_loja.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent arg0) {
									
									TelaLoja loja = new TelaLoja();
									
								}
							});
							butao_loja.setIcon(banco);
		
							JLabel lblFuncionario = new JLabel("Funcionario");
							lblFuncionario.setBounds(89, 35, 70, 14);
							
							JButton butao_funcionario = new JButton("");
							butao_funcionario.setBounds(68, 57, 89, 23);
							butao_funcionario.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent arg0) {
									TelaUsuario usuario = new TelaUsuario();
									
								}
							});
							butao_funcionario.setIcon(Funcionario);
							
							JLabel lblRoupas = new JLabel("Roupas");
							lblRoupas.setBounds(237, 89, 55, 14);
							
							JButton butao_roupa = new JButton("Roupas");
							butao_roupa.setBounds(237, 114, 89, 23);
							butao_roupa.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent arg0) {
									TragesNoiva noiva = new TragesNoiva();
									
								}
							});
		
							JLabel lblBancos = new JLabel("Bancos");
							lblBancos.setBounds(89, 89, 47, 14);
							JButton butao_banco = new JButton("Banco");
							butao_banco.setBounds(68, 114, 89, 23);
							butao_banco.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent arg0) {
									TelaBanco banco = new TelaBanco();
									
								
								}
							});
		

//=============================================================================================================================================================
							JMenuBar Barra1 = new JMenuBar();
							Barra1.setBounds(0, 0, 530, 21);
		
							JMenu trages																							 	 = new JMenu("Trages");
							JMenu clientes 																							 	 = new JMenu("Clientes");
							JMenu funcionarios 																						 	 = new JMenu("Funcionarios");
						
								JMenuItem vestido_noiva 																				 = new JMenuItem("Vestidos Noivas");
								vestido_noiva.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent arg0) {
										TragesNoiva noiva = new TragesNoiva();
									}
								});
								JMenuItem trage_noivo																					 = new JMenuItem("Trage Noivo");
								trage_noivo.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent arg0) {
										TragesNoivo tragesnoivo = new TragesNoivo();
									}
								});
								JMenuItem item_Cliente																					 = new JMenuItem("Clientes ");
								item_Cliente.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent arg0) {
										TelaCliente cliente = new TelaCliente();
									}
								});
								JMenuItem usuario_sistema																				 = new JMenuItem("Usuario do Sistema");
								usuario_sistema.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent arg0) {
										TelaUsuario usuario = new TelaUsuario();
									}
								});
								JMenuItem administradores																				 = new JMenuItem("Administradores");
								administradores.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent arg0) {
										TelaUsuario usuario = new TelaUsuario();
									}
								});
								JMenuItem VestidosP15Anos																					 = new JMenuItem("Vestidos P/15 Anos");
								VestidosP15Anos.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent arg0) {
										Trages15Anos QuinzeAnos = new Trages15Anos();
									}
								});
								JMenuItem VestidosMadrinhas 																			 = new JMenuItem("Vestidos Madrinhas");
								VestidosMadrinhas.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent arg0) {
										TragesMadrinha madrinhas = new TragesMadrinha();
									}
								});
								JMenuItem DamaDeHonra 																					 = new JMenuItem("Dama de Honra");
								DamaDeHonra.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent arg0) {
										TragesDamadeHonra dama = new TragesDamadeHonra();
									}
								});
								JMenuItem Outros 																					 = new JMenuItem("Outros");
								Outros.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent arg0) {
										TragesCasuais outros = new TragesCasuais();
									}
								});
								
								
//===============================================================================================================================================================================
	
		Barra1.add(trages);							trages.add(vestido_noiva);				 	funcionarios.add(usuario_sistema);
		Barra1.add(clientes);						trages.add(trage_noivo);				 	funcionarios.add(administradores);
		trages.add(VestidosP15Anos);				trages.add(VestidosMadrinhas);				trages.add(DamaDeHonra);
		trages.add(Outros);							Barra1.add(funcionarios);		    		clientes.add(item_Cliente);	
																		
		
		subpainel_cadastro1.add(nome_usuario); 		subpainel_cadastro1.add(data_hora_acesso);	subpainel_cadastro1.add(lblUsuarioLogado);
		subpainel_cadastro1.add(lblDataEHora);
		
		subpainel_cadastro2.add(butao_loja);		subpainel_cadastro2.add(butao_roupa);		subpainel_cadastro2.add(butao_funcionario);
		subpainel_cadastro2.add(butao_banco); 		subpainel_cadastro2.add(lblBancos); 		subpainel_cadastro2.add(lblFuncionario);
		subpainel_cadastro2.add(lblLojas);  		subpainel_cadastro2.add(lblRoupas);
		
		Cadastros.add(Barra1);						Cadastros.add(subpainel_cadastro1);		    Cadastros.add(subpainel_cadastro2);
		
//============================================================================================================================================================================		
					//Segunda Aba
						JPanel Pesquisas = new JPanel();
						Pesquisas.setBackground(Color.LIGHT_GRAY);
						Pesquisas.setLayout(null);

							ImageIcon pesquisa = new ImageIcon(getClass().getResource("../Imagens/img/Desktop/Psquisa.png"));
							foto = new JLabel(pesquisa);
							foto.setBounds(71, 50, 410, 360);
							combo = new JComboBox<String>();
							combo.setBounds(119, 421, 337, 22);
		
							JMenuBar Barra2 = new JMenuBar();
							Barra2.setBounds(0, 0, 530, 21);

							JMenu menu1 																								= new JMenu("Trages");
							JMenu menu2																									= new JMenu("Contratos");
							JMenu menu3 																								= new JMenu("usuarios");
			
								JMenuItem noivas 																						= new JMenuItem("Noivas");
								noivas.setActionCommand("noivas");
								noivas.addActionListener(this);
								JMenuItem noivo 																						= new JMenuItem("Noivos");
								noivo.setActionCommand("noivos");
								noivo.addActionListener(this);
								JMenuItem quinze_anos 																					= new JMenuItem("15 anos");
								quinze_anos.setActionCommand("quinze_anos");
								quinze_anos.addActionListener(this);
								JMenuItem madrinhas 																					= new JMenuItem("Madrinhas");
								madrinhas.setActionCommand("Madrinhas");
								madrinhas.addActionListener(this);
								JMenuItem dama_de_honra 																				= new JMenuItem("Dama de Honra");
								dama_de_honra.setActionCommand("Dama de Honra");
								dama_de_honra.addActionListener(this);
								JMenuItem mntmCasuais 																					= new JMenuItem("Casuais");
								mntmCasuais.setActionCommand("Casuais");
								mntmCasuais.addActionListener(this);
								JMenuItem PorCliente 																				= new JMenuItem("Por Cliente");
								PorCliente.setActionCommand("Por Cliente");
								PorCliente.addActionListener(this);
		
								PorCliente.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent arg0) {
									
									}
								});
								JMenuItem PorData 																					= new JMenuItem("Por Data ");
								PorData.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent arg0) {
										
									}
								});
								JMenuItem PorPeas 																					= new JMenuItem("Por pe\u00E7as");
								PorPeas.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent arg0) {
									
									}
								});
								JMenuItem Usuarios 																					= new JMenuItem("Usuarios");
								PorPeas.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent arg0) {
								
									}
								});
//=============================================================================================================================================================		
									JPanel outro = new JPanel();
									outro.setBackground(Color.LIGHT_GRAY);
									outro.setBounds(50, 454, 449, 163);
									outro.setLayout(null);
									outro.setBorder(javax.swing.BorderFactory.createEtchedBorder()); 
									outro.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações da Pesquisa"));
		
										modelo = new JTextField();
										modelo.setToolTipText("Modelo retornado do cadastro");
										modelo.setEditable(false);
										modelo.setBounds(10, 36, 200, 20);
										modelo.setColumns(10);
		
										local_estoque = new JTextField();
										local_estoque.setEditable(false);
										local_estoque.setBounds(10, 76, 200, 20);
										local_estoque.setColumns(10);
		
										cores = new JTextField();
										cores.setEditable(false);
										cores.setBounds(244, 36, 195, 20);
										cores.setColumns(10);
		
										observacao = new JTextField();
										observacao.setEditable(false);
										observacao.setBounds(244, 76, 195, 20);
										observacao.setColumns(10);
		
										quantidade = new JTextField();
										quantidade.setEditable(false);
										quantidade.setBounds(347, 132, 92, 20);
										quantidade.setColumns(10);

		
										JLabel labelquantidade = new JLabel("Quantidade");
										labelquantidade.setBounds(347, 107, 71, 14);
			
										JLabel lblNewLabel = new JLabel("Modelo");
										lblNewLabel.setBounds(10, 22, 46, 14);

										JLabel label_cores = new JLabel("Cores Disponiveis");
										label_cores.setBounds(245, 22, 104, 14);
		
										JLabel lblNewLabel_2 = new JLabel("Loca em Estoque");
										lblNewLabel_2.setBounds(10, 63, 104, 14);
		
										JLabel label_Observacao = new JLabel("Observa\u00E7\u00F5es");
										label_Observacao.setBounds(244, 63, 88, 14);
		
		
										modello = new JTextField();
										modello.setEditable(false);
										modello.setBounds(118, 104, 92, 20);
										modello.setColumns(10);
		
										Registro = new JTextField();
										Registro.setEditable(false);
										Registro.setBounds(10, 104, 19, 20);
										Registro.setColumns(10);
	
										retorno_codigo = new JTextField();
										retorno_codigo.setEditable(false);
										retorno_codigo.setVisible(false);
										retorno_codigo.setBounds(246, 132, 86, 20);
										retorno_codigo.setColumns(10);
										
										JButton botao_Pesquisa = new JButton("Pesquisa ");
										botao_Pesquisa.addActionListener(new ActionListener() {
			
											@Override
											public void actionPerformed(ActionEvent arg0) {

												if(Registro.getText().equals("")){
														JOptionPane.showMessageDialog(null, " O campo responsável Registro que é responsável pela funcão está "
																+ "= 0 " + "O valor atual é ="+ Registro.getText()+"--");
														return;
												}else {
														Desktop desk = new Desktop();
														desk.setModelo(combo.getSelectedItem().toString());
														int reg;
														reg = Integer.parseInt(Registro.getText());
														desk.setRegistro(reg);
														
														ControleDesktopPesquisa desktop = new ControleDesktopPesquisa();
														desktop.ControleEscolhaCadastroaba1(desk);
								
													
													if (ConexaoDesktopPesquisa.retorno == 1){
														
														retorno_codigo.setText(""+desk.getId());
														cores.setText(""+desk.getCores());
														local_estoque.setText(""+desk.getLocal_estoque());
														modello.setText(""+desk.getCombo());
														modelo.setText(""+desk.getModelo());
														observacao.setText(""+desk.getObservacao());
														quantidade.setText(""+desk.getQuantidade());
													
														
														
													}else if (ConexaoDesktopPesquisa.retorno == 2 ){
														JOptionPane.showMessageDialog(null, "Verifique a execução dos Scripts "); 	
													}else if (ConexaoDesktopPesquisa.retorno == 3){
														JOptionPane.showMessageDialog(null, "Verifique a integridade da Tabela ");
													}
												}
											}
										});
										botao_Pesquisa.setBounds(119, 131, 91, 23);
										
										JButton Acesso_cadastro  = new JButton(" Cadastro");
										Acesso_cadastro.addActionListener(new ActionListener() {
											@Override
											public void actionPerformed(ActionEvent arg0) {
												if(retorno_codigo.getText().equals("")){
													JOptionPane.showMessageDialog(null, " O campo responsável Registro que é responsável pela funcão está "
															+ "= 0 " + "O valor atual é ="+ retorno_codigo.getText()+"--");
													return;
												}else {
														Desktop desk = new Desktop();
														int codigo;
														int reg;
														reg = Integer.parseInt(Registro.getText());
														codigo = Integer.parseInt(retorno_codigo.getText());
														desk.setId(codigo);
														desk.setRegistro(reg);
														JOptionPane.showMessageDialog(null, "Efetuou o CLique");
														ControleDesktopAcesso desktop = new ControleDesktopAcesso();
														desktop.ControleAcessoCadastroaba1(desk);
													
												   if (ConexaoDesktopAcesso.retorno == 1){
														JOptionPane.showMessageDialog(null, "Pesquisa Concluida");														
													}else if (ConexaoDesktopPesquisa.retorno == 2 ){
														JOptionPane.showMessageDialog(null, "Verifique a execução dos Scripts "); 	
													}else if (ConexaoDesktopPesquisa.retorno == 3){
														JOptionPane.showMessageDialog(null, "Verifique a integridade da Tabela ");
													}
													
												}
											}
										});
										Acesso_cadastro.setBounds(10, 131, 104, 23);
		
		

//==================================================================================================================================================================
		
		outro.add(modelo);				outro.add(observacao);		outro.add(labelquantidade);
		outro.add(local_estoque);		outro.add(quantidade);			outro.add(lblNewLabel);
		outro.add(cores);				outro.add(label_cores);	outro.add(lblNewLabel_2);
		outro.add(Registro);			outro.add(label_Observacao);	outro.add(modello);
		outro.add(Acesso_cadastro);				outro.add(botao_Pesquisa);		outro.add(retorno_codigo);
		
		Barra2.add(menu1);				Barra2.add(menu2);			Barra2.add(menu3);
		menu1.add(noivas);				menu1.add(noivo);			menu1.add(quinze_anos);		
		menu1.add(madrinhas);			menu1.add(dama_de_honra);   menu1.add(mntmCasuais);
		menu2.add(PorCliente); 		menu2.add(PorData);		menu2.add(PorPeas);
		menu3.add(Usuarios);
		
		Pesquisas.add(Barra2);			Pesquisas.add(foto);		Pesquisas.add(combo);					Pesquisas.add(outro);		
					
					JLabel registro_trages = new JLabel("N. Trages");
					registro_trages.setBounds(39, 107, 69, 14);
					outro.add(registro_trages);

//==================================================================================================================================================================		
		//Terceiro Aba

					 	JPanel Movimentacao = new JPanel();
					 	Movimentacao.setBackground( Color.LIGHT_GRAY);
					 	Movimentacao.setLayout(null);
		
					 		JMenuBar barra3 = new JMenuBar();
					 		barra3.setBounds(0, 0, 530, 21);
		
		
					 		JMenu mnVendas 																												= new JMenu("Vendas");
					 		JMenu mnAlugueis 																											= new JMenu("Alugueis");
					 		JMenu mnEstoque 																											= new JMenu("Estoque");
					 		JMenu mnRelatorios 																											= new JMenu("Relatorios");
		
					 		JMenuItem mntmModuloDeVendas 																								= new JMenuItem("Modulo de Vendas");
					 		mntmModuloDeVendas.addActionListener(new ActionListener() {
					 			public void actionPerformed(ActionEvent arg0) {
					 				Alugueis aluguel = new Alugueis();
					 			
					 			}
					 		});
					 		JMenuItem mntmModuloDeAluguel 																								= new JMenuItem("Modulo de Aluguel");
					 		mntmModuloDeAluguel.addActionListener(new ActionListener() {
					 			public void actionPerformed(ActionEvent arg0) {
					 				Alugueis aluguel = new Alugueis();
					 				
					 			}
					 		});
					 		JMenuItem mntmEntradaDeMercadorias 																							= new JMenuItem("Entrada de Mercadorias");
					 		mntmEntradaDeMercadorias.addActionListener(new ActionListener() {
					 			public void actionPerformed(ActionEvent arg0) {
					 				EntradaMercadoria mercadoria= new EntradaMercadoria();
				
					 			}
					 		});
					 		JMenuItem mntmRelaoDeEntradas 																								= new JMenuItem("Rela\u00E7\u00E3o de Entradas");
					 		mntmRelaoDeEntradas.addActionListener(new ActionListener() {
					 			public void actionPerformed(ActionEvent arg0) {
					 			
					 			}
					 		});
					 		JMenuItem mntmAlugueis 																										= new JMenuItem("Alugueis");
					 		mntmAlugueis.addActionListener(new ActionListener() {
					 			public void actionPerformed(ActionEvent arg0) {
					 
					 			}
					 		});
					 		JMenuItem mntmVendas 																										= new JMenuItem("Vendas");
					 		mntmVendas.addActionListener(new ActionListener() {
					 			public void actionPerformed(ActionEvent arg0) {
					 			
					 			}
					 		});
					 		JMenuItem mntmReultadosFinanceiros 																							= new JMenuItem("Reultados Financeiros");
					 		mntmReultadosFinanceiros.addActionListener(new ActionListener() {
					 			public void actionPerformed(ActionEvent arg0) {
					 			
					 			}
					 		});

//===================================================================================================================================================================
		barra3.add(mnVendas);			mnVendas.add(mntmModuloDeVendas);			mnRelatorios.add(mntmVendas);
		barra3.add(mnAlugueis);			mnAlugueis.add(mntmModuloDeAluguel);		mnRelatorios.add(mntmReultadosFinanceiros);
		barra3.add(mnEstoque);			mnRelatorios.add(mntmRelaoDeEntradas);		mnEstoque.add(mntmEntradaDeMercadorias);
		barra3.add(mnRelatorios);		mnRelatorios.add(mntmAlugueis);
		
		Movimentacao.add(barra3);
//===================================================================================================================================================================
		tabbedPane.addTab("Cadastros", null, Cadastros, null);
		tabbedPane.addTab("Pesquisas", null, Pesquisas, null);
		tabbedPane.addTab("Movimenta\u00E7\u00E3o", null, Movimentacao, null);
//===================================================================================================================================================================	
		panel.add(tabbedPane);		panel.add(LabelCentro);
		
		ImageIcon sair = new ImageIcon(getClass().getResource("../Imagens/img/Desktop/exitt.png"));	
		sair.setImage(sair.getImage().getScaledInstance(30, 20, 20));
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setBounds(26, 624, 91, 23);	
		btnExit.setIcon(sair);
		panel.add(btnExit);
		
		return panel;
		
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
       if (e.getActionCommand() == "noivas") { 
				modelo.setText("");
				local_estoque.setText("");
				cores.setText("");
				observacao.setText("");
				quantidade.setText("");
				modello.setText("");
				
        	 	image = new ImageIcon[] {
        				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivas/noivas1.jpg")),
        				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivas/noivas2.jpg")),
        				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivas/noivas3.jpg")),
        				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivas/noivas4.jpg")),
        				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivas/noivas5.jpg")),
        				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivas/noivas6.jpg")),
        				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivas/noivas7.jpg")),
        				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivas/noivas8.jpg")),
        				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivas/noivas9.jpg")),
        				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivas/noivas10.jpg")),
        				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivas/noivas11.jpg")),
        				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivas/noivas12.jpg")),

        							
        		};
        	 		
        			foto.setIcon(image[0]);
        			combo.removeAllItems();
    				combo.addItem("noiva 1");
    				combo.addItem("noiva 2");
    				combo.addItem("noiva 3");
    				combo.addItem("noiva 4");
    				combo.addItem("noiva 5");
    				combo.addItem("noiva 6");
    				combo.addItem("noica 7");
    				combo.addItem("noiva 8");
    				combo.addItem("noiva 9");
    				combo.addItem("noiva 10");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
    				combo.addItem("noica 11");
    				combo.addItem("noiva 12");
    				Registro.setText("1");
    				combo.addItemListener(new ItemListener() {
    					public void itemStateChanged(ItemEvent e) {
    						if(e.getStateChange() == ItemEvent.SELECTED){
    							foto.setIcon(image[combo.getSelectedIndex()]);
    						}
    					}
    				});
    				combo.setBounds(119, 421, 337, 22);
    		}
        
           
        else if(e.getActionCommand() == "noivos")  {
				modelo.setText("");
				local_estoque.setText("");
				cores.setText("");
				observacao.setText("");
				quantidade.setText("");
				modello.setText("");
				
        		image =	new ImageIcon[] {
        				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo1.jpg")),
        				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo2.jpg")),
        				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo3.jpg")),
        				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo4.jpg")),
        				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo5.jpg")),
        				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo6.jpg")),
        				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo7.jpg")),
        				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo8.jpg")),
        				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo9.jpg")),
        				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo10.jpg")),
        				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo11.jpg")),
        				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo12.jpg")),

        							
        		};
        			
        			foto.setIcon(image[0]);
        			combo.removeAllItems();
    				combo.addItem("noivo 1");
    				combo.addItem("noivo 2");
    				combo.addItem("noivo 3");
    				combo.addItem("noivo 4");
    				combo.addItem("noivo 5");
    				combo.addItem("noivo 6");
    				combo.addItem("noivo 7");
    				combo.addItem("noivo 8");
    				combo.addItem("noivo 9");
    				combo.addItem("noivo 10");
    				combo.addItem("noivo 11");
    				combo.addItem("noivo 12");
    				Registro.setText("2");
    				combo.addItemListener(new ItemListener() {
    					public void itemStateChanged(ItemEvent e) {
    						if(e.getStateChange() == ItemEvent.SELECTED){
    							foto.setIcon(image[combo.getSelectedIndex()]);
    						}
    					}
    				});
    				combo.setBounds(119, 421, 337, 22);
        	}
        
        else if(e.getActionCommand() == "quinze_anos"){
				modelo.setText("");
				local_estoque.setText("");
				cores.setText("");
				observacao.setText("");
				quantidade.setText("");
				modello.setText("");
				
        		image =	new ImageIcon[] {
        				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo1.jpg")),
        				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo2.jpg")),
        				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo3.jpg")),
        				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo4.jpg")),
        				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo5.jpg")),
        				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo6.jpg")),
        				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo7.jpg")),
        				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo8.jpg")),
        				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo9.jpg")),
        				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo10.jpg")),
        				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo11.jpg")),
        				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo12.jpg")),

        							
        		};
        			
        			foto.setIcon(image[0]);
        			combo.removeAllItems();
        			combo.addItem("noivo 1");
        			combo.addItem("noivo 2");
        			combo.addItem("noivo 3");
        			combo.addItem("noivo 4");
        			combo.addItem("noivo 5");
        			combo.addItem("noivo 6");
        			combo.addItem("noivo 7");
        			combo.addItem("noivo 8");
        			combo.addItem("noivo 9");
        			combo.addItem("noivo 10");
        			combo.addItem("noivo 11");
        			combo.addItem("noivo 12");
        			Registro.setText("3");
        			combo.addItemListener(new ItemListener() {
        				public void itemStateChanged(ItemEvent e) {
        					if(e.getStateChange() == ItemEvent.SELECTED){
        						foto.setIcon(image[combo.getSelectedIndex()]);
        					}
        				}
        			});
        			combo.setBounds(119, 421, 337, 22);
			
			}
        else if(e.getActionCommand() == "Madrinhas"){
			modelo.setText("");
			local_estoque.setText("");
			cores.setText("");
			observacao.setText("");
			quantidade.setText("");
			modello.setText("");
			
    		image =	new ImageIcon[] {
    				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo1.jpg")),
    				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo2.jpg")),
    				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo3.jpg")),
    				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo4.jpg")),
    				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo5.jpg")),
    				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo6.jpg")),
    				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo7.jpg")),
    				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo8.jpg")),
    				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo9.jpg")),
    				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo10.jpg")),
    				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo11.jpg")),
    				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo12.jpg")),

    							
    		};
    			
    			foto.setIcon(image[0]);
    			combo.removeAllItems();
    			combo.addItem("noivo 1");
    			combo.addItem("noivo 2");
    			combo.addItem("noivo 3");
    			combo.addItem("noivo 4");
    			combo.addItem("noivo 5");
    			combo.addItem("noivo 6");
    			combo.addItem("noivo 7");
    			combo.addItem("noivo 8");
    			combo.addItem("noivo 9");
    			combo.addItem("noivo 10");
    			combo.addItem("noivo 11");
    			combo.addItem("noivo 12");
    			Registro.setText("4");
    			combo.addItemListener(new ItemListener() {
    				public void itemStateChanged(ItemEvent e) {
    					if(e.getStateChange() == ItemEvent.SELECTED){
    						foto.setIcon(image[combo.getSelectedIndex()]);
    					}
    				}
    			});
    			combo.setBounds(119, 421, 337, 22);
		
		}
        else if(e.getActionCommand() == "Dama de Honra"){
			modelo.setText("");
			local_estoque.setText("");
			cores.setText("");
			observacao.setText("");
			quantidade.setText("");
			modello.setText("");
			
    		image =	new ImageIcon[] {
    				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo1.jpg")),
    				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo2.jpg")),
    				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo3.jpg")),
    				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo4.jpg")),
    				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo5.jpg")),
    				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo6.jpg")),
    				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo7.jpg")),
    				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo8.jpg")),
    				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo9.jpg")),
    				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo10.jpg")),
    				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo11.jpg")),
    				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo12.jpg")),

    							
    		};
    			
    			foto.setIcon(image[0]);
    			combo.removeAllItems();
    			combo.addItem("noivo 1");
    			combo.addItem("noivo 2");
    			combo.addItem("noivo 3");
    			combo.addItem("noivo 4");
    			combo.addItem("noivo 5");
    			combo.addItem("noivo 6");
    			combo.addItem("noivo 7");
    			combo.addItem("noivo 8");
    			combo.addItem("noivo 9");
    			combo.addItem("noivo 10");
    			combo.addItem("noivo 11");
    			combo.addItem("noivo 12");
    			Registro.setText("5");
    			combo.addItemListener(new ItemListener() {
    				public void itemStateChanged(ItemEvent e) {
    					if(e.getStateChange() == ItemEvent.SELECTED){
    						foto.setIcon(image[combo.getSelectedIndex()]);
    					}
    				}
    			});
    			combo.setBounds(119, 421, 337, 22);
		
		}
        else if(e.getActionCommand() == "Casuais"){
			modelo.setText("");
			local_estoque.setText("");
			cores.setText("");
			observacao.setText("");
			quantidade.setText("");
			modello.setText("");
			
    		image =	new ImageIcon[] {
    				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo1.jpg")),
    				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo2.jpg")),
    				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo3.jpg")),
    				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo4.jpg")),
    				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo5.jpg")),
    				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo6.jpg")),
    				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo7.jpg")),
    				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo8.jpg")),
    				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo9.jpg")),
    				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo10.jpg")),
    				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo11.jpg")),
    				new ImageIcon(getClass().getResource("../Imagens/img/Desktop/noivos/noivo12.jpg")),

    							
    		};
    			
    			foto.setIcon(image[0]);
    			combo.removeAllItems();
    			combo.addItem("noivo 1");
    			combo.addItem("noivo 2");
    			combo.addItem("noivo 3");
    			combo.addItem("noivo 4");
    			combo.addItem("noivo 5");
    			combo.addItem("noivo 6");
    			combo.addItem("noivo 7");
    			combo.addItem("noivo 8");
    			combo.addItem("noivo 9");
    			combo.addItem("noivo 10");
    			combo.addItem("noivo 11");
    			combo.addItem("noivo 12");
    			Registro.setText("6");
    			combo.addItemListener(new ItemListener() {
    				public void itemStateChanged(ItemEvent e) {
    					if(e.getStateChange() == ItemEvent.SELECTED){
    						foto.setIcon(image[combo.getSelectedIndex()]);
    					}
    				}
    			});
    			combo.setBounds(119, 421, 337, 22);
		
		}
	
		
	}
}
