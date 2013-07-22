package com.taskmanager.taskmanager;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class ListaTarefas extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lista_tarefas);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.lista_tarefas, menu);
		return true;
	}
	
	public void adicionarTarefa(View v){
		Intent intent = new Intent(this, AdicionarTarefa.class);
		startActivity(intent);
	}

}
