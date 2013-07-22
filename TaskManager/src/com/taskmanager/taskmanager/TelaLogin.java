package com.taskmanager.taskmanager;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class TelaLogin extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tela_login);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tela_login, menu);
		return true;
	}

	public void telaMenu(View v){
		Intent intent = new Intent(this, TelaMenu.class);
		startActivity(intent);					
	}
	
	public void Cadastrese(View v){
		Intent intent = new Intent(this, TelaCadastro.class);
		startActivity(intent);
	}
}
