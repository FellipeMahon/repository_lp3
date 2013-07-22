package com.taskmanager.taskmanager;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class TelaCadastro extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tela_cadastro);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tela_cadastro, menu);
		return true;
	}

}
