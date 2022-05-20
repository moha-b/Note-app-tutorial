package com.example.noteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;


public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);








        // Navigation bar
        MeowBottomNavigation nav = findViewById(R.id.nav);
        nav.add(new MeowBottomNavigation.Model(1,R.drawable.ic_outline_person_24));
        nav.add(new MeowBottomNavigation.Model(2,R.drawable.ic_outline_home_24));
        nav.add(new MeowBottomNavigation.Model(3,R.drawable.ic_outline_settings_24));

        nav.setOnClickMenuListener(new MeowBottomNavigation.ClickListener() {
            @Override
            public void onClickItem(MeowBottomNavigation.Model item) {
                switch (item.getId()){
                    case 1:

                        break;
                    case 2:
                        Intent intent = new Intent(Home.this,Home.class);
                        startActivity(intent);
                        break;
                    case 3:
                        //Intent intent = new Intent(Home.this,signIn.class);
                        //startActivity(intent);
                        break;
                    default:
                        break;
                }
            }
        });

        nav.setOnShowListener(new MeowBottomNavigation.ShowListener() {
            @Override
            public void onShowItem(MeowBottomNavigation.Model item) {
            }
        });



    }
}
// login xml
/*
* <RelativeLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".logIn">

    <RelativeLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:id="@+id/center"
        android:layout_centerInParent="true">
        </RelativeLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_above="@+id/center"
        android:layout_marginLeft="30dp"
        android:layout_marginRight="30dp"
        android:layout_marginBottom="150dp"
        android:orientation="vertical">

        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="ehh yasta 3amel ehh?"
            android:textColor="#4aba95"
            android:textSize="35sp"
            android:textStyle="bold"
            />
        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="3ayz te login yasta!"
            android:textSize="23sp"
            android:textColor="#F9AA33"
            />


    </LinearLayout>

    <com.google.android.material.textfield.TextInputLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginBottom="10dp"
        android:layout_above="@+id/center"
        android:id="@+id/email"
        android:layout_marginLeft="30dp"
        android:layout_marginRight="30dp"
        >

        <EditText
            android:id="@+id/logInUserName"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:hint="el username ya wa74"
            android:inputType="textPersonName"
            android:textColorHint="#4aba95" />

    </com.google.android.material.textfield.TextInputLayout>


    <com.google.android.material.textfield.TextInputLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginBottom="10dp"
        android:layout_below="@+id/center"
        android:id="@+id/Password"
        android:layout_marginLeft="30dp"
        android:layout_marginRight="30dp"
        app:passwordToggleEnabled="true"
        >

        <EditText
            android:id="@+id/logInPassword"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:hint="wel password bardo belmarra"
            android:inputType="textPassword"
            android:textColorHint="#4aba95" />

        </com.google.android.material.textfield.TextInputLayout>
    <!--    <EditText-->
<!--        android:id="@+id/Password"-->
<!--        android:layout_width="254dp"-->
<!--        android:layout_height="wrap_content"-->
<!--        android:layout_above="@+id/Login"-->
<!--        android:layout_alignParentStart="true"-->
<!--        android:layout_alignParentEnd="true"-->
<!--        android:layout_marginStart="78dp"-->
<!--        android:layout_marginEnd="79dp"-->
<!--        android:layout_marginBottom="91dp"-->
<!--        android:ems="10"-->

<!--        android:hint="@string/password"-->
<!--        android:textColorHint="#4aba95"-->
<!--        android:inputType="textPassword" />-->

    <RelativeLayout
        android:layout_width="match_parent"
        android:layout_height="50dp"
        android:layout_marginLeft="55dp"
        android:layout_marginRight="30dp"
        android:layout_marginTop="60dp"
        android:layout_below="@+id/Password">
        <Button
            android:id="@+id/Login"
            android:layout_width="300dp"
            android:layout_height="wrap_content"
            android:background="@drawable/rounded"
            android:textColor="@color/white"
            android:text="etfadal" />
    </RelativeLayout>



</RelativeLayout>
* */

// login class
/*
* // variable section
        EditText userName = findViewById(R.id.logInUserName);
        EditText password = findViewById(R.id.logInPassword);
        Button go = findViewById(R.id.Login);

        // go to home page
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String user = userName.getText().toString();
                String userPassword = password.getText().toString();

//                if (user.isEmpty() || userPassword.isEmpty()){
//                    Toast.makeText(getApplicationContext(),"lol",Toast.LENGTH_SHORT).show();
//                }else{
//                    connection with SQLite
//                }

                Intent intent = new Intent(logIn.this,Home.class);
                startActivity(intent);
            }
        });
*/

// signUp xml
/*
*<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#f9f9f9"
    tools:context=".signIn">

    <RelativeLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:id="@+id/singUpCenter"
        android:layout_centerInParent="true">
    </RelativeLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_above="@+id/singUpCenter"
        android:layout_marginLeft="30dp"
        android:layout_marginRight="30dp"
        android:layout_marginBottom="150dp"
        android:orientation="vertical">

        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="mnwar el app y5oya♥"
            android:textColor="#4aba95"
            android:textSize="34sp"
            android:textStyle="bold"
            />
        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="me4rfna"
            android:textSize="23sp"
            android:textColor="#F9AA33"
            />
    </LinearLayout>

    <com.google.android.material.textfield.TextInputLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginBottom="10dp"
        android:layout_above="@+id/singUpCenter"
        android:id="@+id/email"
        android:layout_marginLeft="30dp"
        android:layout_marginRight="30dp"
        >

        <EditText
            android:id="@+id/signUpUserName"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:hint="el username ya wa74"
            android:inputType="textPersonName"
            android:textColorHint="#4aba95" />

    </com.google.android.material.textfield.TextInputLayout>


    <com.google.android.material.textfield.TextInputLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginBottom="10dp"
        android:layout_below="@+id/singUpCenter"
        android:id="@+id/Password"
        android:layout_marginLeft="30dp"
        android:layout_marginRight="30dp"
        app:passwordToggleEnabled="true"
        >

        <EditText
            android:id="@+id/signUpPassword"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:hint="wel password bardo belmarra"
            android:inputType="textPassword"
            android:textColorHint="#4aba95" />

    </com.google.android.material.textfield.TextInputLayout>

    <RelativeLayout
        android:layout_width="match_parent"
        android:layout_height="50dp"
        android:layout_marginLeft="55dp"
        android:layout_marginRight="30dp"
        android:layout_marginTop="60dp"
        android:layout_below="@+id/Password">
        <Button
            android:id="@+id/signUp"
            android:layout_width="300dp"
            android:layout_height="wrap_content"
            android:background="@drawable/rounded"
            android:textColor="@color/white"
            android:text="Sign Up" />
    </RelativeLayout>

</RelativeLayout>
*/

// signUp class
/*
*
        // variable section
        EditText signUpUserName = findViewById(R.id.signUpUserName);
        EditText signUpPassword = findViewById(R.id.signUpPassword);
        Button go = findViewById(R.id.signUp);

        // go to home page
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = signUpUserName.getText().toString();
                String userPassword = signUpPassword.getText().toString();

//                if (user.isEmpty() || userPassword.isEmpty()){
//                    Toast.makeText(getApplicationContext(),"lol",Toast.LENGTH_SHORT).show();
//                }else{
//                    connection with firebase
//                }

                //Intent intent = new Intent(signIn.this,home.class);
                //startActivity(intent);
            }
        });
*/