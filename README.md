# Quiz-UDACITY
Quiz Just Java Udacity
<?xml version="1.0" encoding="utf-8"?>
<ScrollView xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginLeft="8dp"
        android:layout_marginRight="8dp"
        android:orientation="vertical">

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="horizontal">

            <ImageView
                android:layout_width="40dp"
                android:layout_height="40dp"
                android:layout_marginBottom="8dp"
                android:layout_marginTop="8dp"
                android:layout_weight="1"
                android:src="@drawable/udacity" />

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_marginBottom="10dp"
                android:layout_marginTop="10dp"
                android:layout_weight="1"
                android:text="pesquisa de mercado"
                android:textAllCaps="true"
                android:textColor="#26A69A"
                android:textSize="24sp" />

        </LinearLayout>

        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="1) Qual curso você faria na UDACITY?"
            android:layout_marginTop="8dp"
            android:textColor="?android:attr/textColorLink"
            android:textSize="18dp" />

        <EditText
            android:id="@+id/edNome"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="8dp"
            android:hint="Resposta"
            android:inputType="textCapSentences|textAutoCorrect|textMultiLine"
            android:textSize="16sp" />

        <TextView

            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:text="2) Qual navegador você costuma usar?"
            android:layout_marginTop="8dp"
            android:textColor="?android:attr/textColorLink"
            android:textSize="18sp" />


        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:orientation="horizontal">

            <RadioGroup
                android:id="@+id/rdGroupOpcao"
                android:layout_width="match_parent"
                android:layout_height="match_parent">

                <RadioButton
                    android:id="@+id/rdChrome"
                    android:layout_width="match_parent"
                    android:layout_height="match_parent"
                    android:layout_weight="1"
                    android:text="Chrome"
                    android:textSize="16sp" />

                <RadioButton
                    android:id="@+id/rdExplorer"
                    android:layout_width="match_parent"
                    android:layout_height="match_parent"
                    android:layout_weight="1"
                    android:text="Internet Explorer"
                    android:textSize="16sp" />

                <RadioButton
                    android:id="@+id/rdFirefox"
                    android:layout_width="match_parent"
                    android:layout_height="match_parent"
                    android:layout_weight="1"
                    android:text="Firefox"
                    android:textSize="16sp" />
            </RadioGroup>

        </LinearLayout>


        <TextView

            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_marginTop="8dp"
            android:text="3) Você gosta de usar junto com a TV?"
            android:textColor="?android:attr/textColorLink"
            android:textSize="18sp" />

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:orientation="horizontal">

            <CheckBox
                android:id="@+id/chCelular"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:layout_weight="1"
                android:text="Celular"
                android:textSize="16sp" />

            <CheckBox
                android:id="@+id/chNotebook"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:layout_weight="1"
                android:text="Notebook"
                android:textSize="16sp" />

            <CheckBox
                android:id="@+id/chTablet"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:layout_weight="1"
                android:text="Tablet"
                android:textSize="16sp" />
        </LinearLayout>

        <TextView

            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:text="4) Que rede social você mais utiliza?"
            android:layout_marginTop="8dp"
            android:textColor="?android:attr/textColorLink"
            android:textSize="18sp" />

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:orientation="horizontal">

            <RadioGroup
                android:id="@+id/rgRedesocial"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:orientation="horizontal">

                <RadioButton
                    android:id="@+id/rdFace"
                    android:layout_width="match_parent"
                    android:layout_height="match_parent"
                    android:layout_weight="1"
                    android:text="FaceBook"
                    android:textSize="16sp" />

                <RadioButton
                    android:id="@+id/rdInstagram"
                    android:layout_width="match_parent"
                    android:layout_height="match_parent"
                    android:layout_weight="1"
                    android:text="Instagram"
                    android:textSize="16sp" />

                <RadioButton
                    android:id="@+id/rdOutros"
                    android:layout_width="match_parent"
                    android:layout_height="match_parent"
                    android:layout_weight="1"
                    android:text="Outros"
                    android:textSize="16sp" />

            </RadioGroup>

        </LinearLayout>

        <Button

            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:onClick="btRespostas"
            android:padding="8dp"
            android:layout_marginTop="8dp"
            android:text="respostas"
            android:textSize="20sp" />

        <TextView
            android:id="@+id/mostraNatela"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:onClick="tela"
            android:padding="8dp"
            android:paddingLeft="8dp"
            android:paddingRight="8dp"
            android:text=""
            android:textColor="@android:color/black"
            android:textSize="16sp" />

    </LinearLayout>

</ScrollView>


