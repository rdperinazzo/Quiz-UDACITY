package com.rdper.questoesudacity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class Lesson7 extends AppCompatActivity {
    CheckBox chTablet, chNotebook, chCelular;
    RadioButton rdChrome, rdFirefox, rdExplorer;
    RadioGroup rdGroupOpcao;
    Button btRespostas;
    TextView mostraNatela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson7);

        CheckBox chnotebook = (CheckBox) findViewById(R.id.chNotebook);
        CheckBox chcelular = (CheckBox) findViewById(R.id.chCelular);
        CheckBox chtablet = (CheckBox) findViewById(R.id.chTablet);


// Aviso na tela: Notebook
        chnotebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {

                    Toast.makeText(Lesson7.this, "Notebook", Toast.LENGTH_SHORT).show();
                }
            }
        });

// Aviso na tela: Celular
        chcelular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {

                    Toast.makeText(Lesson7.this, "Celular", Toast.LENGTH_SHORT).show();
                }
            }
        });

// Aviso na tela: Tablet
        chtablet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {

                    Toast.makeText(Lesson7.this, "Tablet", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void btRespostas(View view) {

        String retornoPergunta2 = new String();
        String per2 = rdPergunta2(retornoPergunta2);

        String retornoPergunta4 = new String();
        String per4 = rdPergunta4(retornoPergunta4);

        String asd = new String();
        String per3 = checkPergunta3(asd);

        EditText ednome = (EditText) findViewById(R.id.edNome);
        String nome = ednome.getText().toString();

        String x = resultado(nome, per2, per3, per4);

        tela(x);
    }

    private String rdPergunta2(String checkradio) {
        //Checando os radiobutton
        RadioButton rdchrome = (RadioButton) findViewById(R.id.rdChrome);
        RadioButton rdexplorer = (RadioButton) findViewById(R.id.rdExplorer);
        RadioButton rdfirefox = (RadioButton) findViewById(R.id.rdFirefox);

        RadioGroup rg = (RadioGroup) findViewById(R.id.rdGroupOpcao);

        switch (rg.getCheckedRadioButtonId()) {
            case R.id.rdChrome:
                checkradio = "chrome";
                break;
            case R.id.rdExplorer:
                checkradio = "Internet Explorer";
                break;
            case R.id.rdFirefox:
                checkradio = "Firefox";
                break;
        }
        return checkradio;
    }


    private String checkPergunta3(String selcheck) {
        // checando os checkbox

        CheckBox chtablet = (CheckBox) findViewById(R.id.chTablet);
        CheckBox chnotebook = (CheckBox) findViewById(R.id.chNotebook);
        CheckBox chcelular = (CheckBox) findViewById(R.id.chCelular);


        if (chcelular.isChecked()) {
            selcheck += chcelular.getText() + ", ";
        }
        if (chnotebook.isChecked()) {
            selcheck += chnotebook.getText() + ", ";
        }
        if (chtablet.isChecked()) {
            selcheck += chtablet.getText() + " ";
        }
        // return new String("Tablet");

        return selcheck;
    }


    private String rdPergunta4(String checkredesocial) {

        //Checando os segundos radiobuttons
        RadioButton rdface = (RadioButton) findViewById(R.id.rdFace);
        RadioButton rdinstagram = (RadioButton) findViewById(R.id.rdInstagram);
        RadioButton rdoutros = (RadioButton) findViewById(R.id.rdOutros);

        RadioGroup rgredesocial = (RadioGroup) findViewById(R.id.rgRedesocial);

        switch (rgredesocial.getCheckedRadioButtonId()) {
            case R.id.rdFace:
                checkredesocial = "FaceBook";
                break;
            case R.id.rdInstagram:
                checkredesocial = "Instagram";
                break;
            case R.id.rdOutros:
                checkredesocial = "Outros";
                break;
        }
        return checkredesocial;
    }

    //Exibe na tela
    private void tela(String xtela) {
        TextView mostranatela = (TextView) findViewById(R.id.mostraNatela);

        mostranatela.setText(xtela);

    }

    //Retorna o resultado para exibir na tela
    private String resultado(String xnome, String navegador, String junto, String redesocial) {
        String Menssagem = "\nQual curso você faria na UDACITY: " + xnome;
        Menssagem += "\nQual navegador você costuma usar: " + navegador;
        Menssagem += "\nVocê gosta de usar junto com a TV: " + junto;
        Menssagem += "\nQual rede social você usa: " + redesocial;
        return Menssagem;
    }


}