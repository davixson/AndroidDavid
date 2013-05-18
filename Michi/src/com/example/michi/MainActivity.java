package com.example.michi;

import com.example.michi.R;

import android.os.Bundle;
import android.app.Activity;
import android.app.Dialog;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {
	Button botones[][]=new Button[3][3];
	Button nuevo_juego;
	int cuadrilla[][]={{2,2,2},{2,2,2},{2,2,2}};
	int contador_x=0;
	int contador_o=0;
	int jugada=1;
	String primero;
	char turno;
	Dialog dialogo;
	TextView tex;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		botones[0][0]= (Button) findViewById(R.id.button01);
		botones[0][1]= (Button) findViewById(R.id.button02);
		botones[0][2]= (Button) findViewById(R.id.button03);
		botones[1][0]= (Button) findViewById(R.id.button04);
		botones[1][1]= (Button) findViewById(R.id.button05);
		botones[1][2]= (Button) findViewById(R.id.button06);
		botones[2][0]= (Button) findViewById(R.id.button07);
		botones[2][1]= (Button) findViewById(R.id.button08);
		botones[2][2]= (Button) findViewById(R.id.button09);
		nuevo_juego= (Button) findViewById(R.id.btNuevo);
		dialogo=new Dialog(this);
		dialogo.setTitle("GANADOR");
		tex=new TextView(this);
		nuevo_juego.setOnClickListener(this);
		botones[0][0].setOnClickListener(this);
		botones[0][1].setOnClickListener(this);
		botones[0][2].setOnClickListener(this);
		botones[1][0].setOnClickListener(this);
		botones[1][1].setOnClickListener(this);
		botones[1][2].setOnClickListener(this);
		botones[2][0].setOnClickListener(this);
		botones[2][1].setOnClickListener(this);
		botones[2][2].setOnClickListener(this);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		
			case R.id.button01:{
				cuadrilla[0][0]=jugada;
				if(jugada==1){	
					botones[0][0].setBackgroundResource(R.drawable.letrax);
				}
				else 
					botones[0][0].setBackgroundResource(R.drawable.letrao);
				break;
			}
			case R.id.button02:{
				cuadrilla[0][1]=jugada;
				if(jugada==1){	
					botones[0][1].setBackgroundResource(R.drawable.letrax);
				}
				else 
					botones[0][1].setBackgroundResource(R.drawable.letrao);
				break;
			}
			case R.id.button03:{
				cuadrilla[0][2]=jugada;
				if(jugada==1){	
					botones[0][2].setBackgroundResource(R.drawable.letrax);
				}
				else 
					botones[0][2].setBackgroundResource(R.drawable.letrao);
				break;
			}				
			case R.id.button04:{
				cuadrilla[1][0]=jugada;
				if(jugada==1){	
					botones[1][0].setBackgroundResource(R.drawable.letrax);
				}
				else 
					botones[1][0].setBackgroundResource(R.drawable.letrao);
				break;
			}
			case R.id.button05:{
				cuadrilla[1][1]=jugada;
				if(jugada==1){	
					botones[1][1].setBackgroundResource(R.drawable.letrax);
				}
				else 
					botones[1][1].setBackgroundResource(R.drawable.letrao);
				break;
			}
			case R.id.button06:{
				cuadrilla[1][2]=jugada;
				if(jugada==1){	
					botones[1][2].setBackgroundResource(R.drawable.letrax);
				}
				else 
					botones[1][2].setBackgroundResource(R.drawable.letrao);
				break;
			}
			case R.id.button07:{
				cuadrilla[2][0]=jugada;
				if(jugada==1){	
					botones[2][0].setBackgroundResource(R.drawable.letrax);
				}
				else 
					botones[2][0].setBackgroundResource(R.drawable.letrao);
				break;
			}
			case R.id.button08:{
				cuadrilla[2][1]=jugada;
				if(jugada==1){	
					botones[2][1].setBackgroundResource(R.drawable.letrax);
				}
				else 
					botones[2][1].setBackgroundResource(R.drawable.letrao);
				break;
			}
			case R.id.button09:{
				cuadrilla[2][2]=jugada;
				if(jugada==1){	
					botones[2][2].setBackgroundResource(R.drawable.letrax);
				}
				else 
					botones[2][2].setBackgroundResource(R.drawable.letrao);
				break;
			}
			case R.id.btNuevo:{
				resetear();
				break;
			}
		}
		if(jugada==0) turno='O';
		else turno='X';
		for(int i=0; i<3;i++){
			if(cuadrilla[i][0]==jugada && cuadrilla[i][1]==jugada && cuadrilla[i][2]==jugada){
				if(jugada==1) contador_x++;
				else contador_o++;
				tex.setText("gana: "+turno);
				dialogo.setContentView(tex);
				dialogo.show();
				//resetear();
				return;
			}
			if(cuadrilla[0][i]==jugada && cuadrilla[1][i]==jugada && cuadrilla[2][i]==jugada){
				if(jugada==1) contador_x++;
				else contador_o++;
				tex.setText("gana: "+turno);
				dialogo.setContentView(tex);
				dialogo.show();
				//resetear();
				return;
			}
						
		}
		if(cuadrilla[0][0]==jugada && cuadrilla[1][1]==jugada && cuadrilla[2][2]==jugada){
			if(jugada==1) contador_x++;
			else contador_o++;
			tex.setText("gana: "+turno);
			dialogo.setContentView(tex);
			dialogo.show();
			//resetear();
			return;
		}
		if(cuadrilla[2][0]==jugada && cuadrilla[1][1]==jugada && cuadrilla[0][2]==jugada){
			if(jugada==1) contador_x++;
			else contador_o++;
			tex.setText("gana: "+turno);
			dialogo.setContentView(tex);
			dialogo.show();
			//resetear();
			return;
		}
		
		jugada=(jugada+1)%2;
		System.out.println(jugada);
	}
	
	public  void resetear(){
		for(int i=0; i<3;i++){
			for(int j=0; j<3; j++){
				cuadrilla[i][j]=2;
				botones[i][j].setBackgroundResource(R.drawable.cuadro);
			}
		}
	}

}
