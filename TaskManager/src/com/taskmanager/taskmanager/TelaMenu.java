package com.taskmanager.taskmanager;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class TelaMenu extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tela_menu);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tela_menu, menu);
		return true;
	}
	
	public void listaTarefas(View v){
		Intent intent = new Intent(this, ListaTarefas.class);
		startActivity(intent);
	}

	public void Conta(View v){
		Intent intent = new Intent(this, Conta.class);
		startActivity(intent);
	}
	
	public void Logoff(View v){
		Intent intent = new Intent(this, TelaLogin.class);
		startActivity(intent);
	}
}
