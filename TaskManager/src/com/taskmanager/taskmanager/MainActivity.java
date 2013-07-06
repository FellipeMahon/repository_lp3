package com.taskmanager.taskmanager;

import com.taskmanagertaskmanager.R;
import com.taskmanagertaskmanager.R.id;
import com.taskmanagertaskmanager.R.layout;
import com.taskmanagertaskmanager.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity{


	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tela_login);
		Button button1 = (Button)findViewById(R.id.entrar_button);
		button1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				chamaMenuPrincipal();
				
				Button button2 = (Button)findViewById(R.id.lista_tarefas_button);
				button2.setOnClickListener(new View.OnClickListener() {

					@Override
					public void onClick(View v) {
						chamaListaTarefas();
						
						Button button7 = (Button)findViewById(R.id.addTarefa_button);
						button7.setOnClickListener(new View.OnClickListener() {
							
							@Override
							public void onClick(View v) {
								chamaAddTarefa();
								
								Button button20 = (Button)findViewById(R.id.voltarAddTarefa_button);
								button20.setOnClickListener(new View.OnClickListener() {
									
									@Override
									public void onClick(View v) {
										chamaListaTarefas();
										
										Button button19 = (Button)findViewById(R.id.voltarListaTarefas_button);
										button19.setOnClickListener(new View.OnClickListener() {
											
										@Override
										public void onClick(View v) {
											chamaMenuPrincipal();
																	
										Button button15 = (Button)findViewById(R.id.conta_button);
										button15.setOnClickListener(new View.OnClickListener() {
											
											@Override
											public void onClick(View v) {
												chamaConta();
												
												Button button16 = (Button)findViewById(R.id.voltarConta_button);
												button16.setOnClickListener(new View.OnClickListener() {
													
													@Override
													public void onClick(View v) {
														chamaMenuPrincipal();
														
														Button button17 = (Button)findViewById(R.id.logoff_button);
														button17.setOnClickListener(new View.OnClickListener() {
															
															@Override
															public void onClick(View v) {
																chamaLogoff();
																
																Button button3 = (Button)findViewById(R.id.cadastrar_button);
																button3.setOnClickListener(new View.OnClickListener() {
																	
																	public void onClick(View v) {
																		chamaMenuDeCadastro();
																		
																		Button button4 = (Button)findViewById(R.id.tela_cadastro_cadastrar_button);
																		button4.setOnClickListener(new View.OnClickListener() {
																			
																			public void onClick(View v) {
																				chamaMenuPrincipal();
																				
																				Button button6 = (Button)findViewById(R.id.logoff_button);
																				button6.setOnClickListener(new View.OnClickListener() {
																					
																					@Override
																					public void onClick(View v) {
																						chamaLogoff();
																					}
																			});															
																		  }																			
																		}
																		);
																	}
																});
															}
														});
													}
												});
												
											}
										});
										}
									});
									}
								});
							}
						});
											
					  }
					
					});
				
				Button button5 = (Button)findViewById(R.id.conta_button);
				button5.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						chamaConta();
						
						
												
					}
				});
				
				Button button6 = (Button)findViewById(R.id.logoff_button);
				button6.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						chamaLogoff();
					}
				});
				
	
			}
		});
		
		
		Button button3 = (Button)findViewById(R.id.cadastrar_button);
		button3.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				chamaMenuDeCadastro();
				
				Button button4 = (Button)findViewById(R.id.tela_cadastro_cadastrar_button);
				button4.setOnClickListener(new View.OnClickListener() {
					
					public void onClick(View v) {
						chamaMenuPrincipal();						
							
							Button button2 = (Button)findViewById(R.id.lista_tarefas_button);
							button2.setOnClickListener(new View.OnClickListener() {

								@Override
								public void onClick(View v) {
									chamaListaTarefas();
									
									Button button11 = (Button)findViewById(R.id.voltarListaTarefas_button);
									button11.setOnClickListener(new View.OnClickListener() {
										
										@Override
										public void onClick(View v) {
											chamaMenuPrincipal();
											
											Button button12 = (Button)findViewById(R.id.conta_button);
											button12.setOnClickListener(new View.OnClickListener() {
												
												@Override
												public void onClick(View v) {
													chamaConta();
													
													Button button13 = (Button)findViewById(R.id.voltarConta_button);
													button13.setOnClickListener(new View.OnClickListener() {
														
														@Override
														public void onClick(View v) {
															chamaMenuPrincipal();
														
															Button button14 = (Button)findViewById(R.id.logoff_button);
															button14.setOnClickListener(new View.OnClickListener() {
																
																@Override
																public void onClick(View v){
																chamaLogoff();
																}
															});
															
														}
													});
																													
												}
											});
								
										}
									});
									
									Button button7 = (Button)findViewById(R.id.addTarefa_button);
									button7.setOnClickListener(new View.OnClickListener() {
										
										@Override
										public void onClick(View v) {
											chamaAddTarefa();
										}
									});
														
								  }
								
								});
							
							Button button5 = (Button)findViewById(R.id.conta_button);
							button5.setOnClickListener(new View.OnClickListener() {
								
								@Override
								public void onClick(View v) {
									chamaConta();
									
									Button button9 = (Button)findViewById(R.id.voltarConta_button);
									button9.setOnClickListener(new View.OnClickListener() {
										
										@Override
										public void onClick(View v){
											chamaMenuPrincipal();	
											
											Button button10 = (Button)findViewById(R.id.logoff_button);
											button10.setOnClickListener(new View.OnClickListener() {
												
												@Override
												public void onClick(View v) {
													chamaLogoff();
												}
											});
										}
									});
								}
							});
							
							Button button6 = (Button)findViewById(R.id.logoff_button);
							button6.setOnClickListener(new View.OnClickListener() {
								
								@Override
								public void onClick(View v) {
									chamaLogoff();
									
								}
							});
											
					  }					
				});
				
				Button button8 = (Button)findViewById(R.id.tela_cadastro_retornar_button);
				button8.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						chamaLogoff();
					}
				});
			}	
			
		});
			
	}


	public void chamaMenuPrincipal(){
		setContentView(R.layout.tela_menu);
	}
	
	public void chamaListaTarefas(){
		setContentView(R.layout.lista_tarefas);
	}
	
	public void chamaMenuDeCadastro(){
		setContentView(R.layout.tela_cadastro);
	}

	
	public void chamaConta(){
		setContentView(R.layout.conta);
	}
	
	public void chamaLogoff(){
		setContentView(R.layout.tela_login);
	}
	
	public void chamaAddTarefa(){
		setContentView(R.layout.adicionar_tarefa);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	

}
