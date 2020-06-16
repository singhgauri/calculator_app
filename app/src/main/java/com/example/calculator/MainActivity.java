package com.example.calculator;

import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, button10, buttonC, buttonEqual, buttonDel, buttonMod;
    EditText editText;
    String str1,str2;
    char str0,stradd,strsub,strmul,strdiv,strmod;
    int i;
    float valueOne, valueTwo;

    boolean addition, subtraction, multiplication, division,  flag,modulus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        buttonAdd = findViewById(R.id.buttonadd);
        buttonSub = findViewById(R.id.buttonsub);
        buttonMul = findViewById(R.id.buttonmul);
        buttonDivision = findViewById(R.id.buttondiv);
        //buttonDel = findViewById(R.id.buttondel);
        buttonC = findViewById(R.id.buttonC);
        buttonMod = findViewById(R.id.buttonmod);

        buttonEqual = findViewById(R.id.buttonequal);
        editText = findViewById(R.id.editText);


            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    editText.setText(editText.getText() + "1");
                }
            });

            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    editText.setText(editText.getText() + "2");
                }
            });

            button3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    editText.setText(editText.getText() + "3");
                }
            });

            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    editText.setText(editText.getText() + "4");
                }
            });

            button5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    editText.setText(editText.getText() + "5");
                }
            });

            button6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    editText.setText(editText.getText() + "6");
                }
            });

            button7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    editText.setText(editText.getText() + "7");
                }
            });

            button8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    editText.setText(editText.getText() + "8");
                }
            });

            button9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    editText.setText(editText.getText() + "9");
                }
            });

            button0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    editText.setText(editText.getText() + "0");
                }
            });

            button10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    editText.setText(editText.getText() + ".");
                }
            });

            buttonC.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    editText.setText("");
                }
            });

            buttonAdd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (editText == null) {
                        editText.setText("");
                    } else {
                        try {
                            valueOne = Float.parseFloat(editText.getText() + "");
                            addition = true;
                            editText.setText(editText.getText() + "+" + "");

                        } catch (Exception e) {
                            editText.setText("Invalid Input");
                        }

                    }
                }
                });


            buttonSub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        valueOne = Float.parseFloat(editText.getText() + "");
                        subtraction = true;
                        editText.setText(editText.getText() + "-" + "");
                    }catch(Exception e) {
                        editText.setText("Invalid Input");
                    }
                }
            });

            buttonMul.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        valueOne = Float.parseFloat(editText.getText() + "");
                        multiplication = true;
                        editText.setText(editText.getText() + "*" + "");
                    } catch (Exception e) {
                        editText.setText("Invalid Input");
                    }
                }
            });

            buttonDivision.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try{
                    valueOne = Float.parseFloat(editText.getText() + "");
                    division = true;
                    editText.setText(editText.getText() + "/" + "");
                    } catch (Exception e) {
                        editText.setText("Invalid Input");
                    }
                }
            });

            buttonMod.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        valueOne = Float.parseFloat(editText.getText() + "");
                        modulus = true;
                        editText.setText(editText.getText() + "%" + "");
                    }catch (Exception e) {
                        editText.setText("Invalid Input");
                    }
                }
            });

            buttonEqual.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    str1 = editText.getText().toString();
                    flag = true;
                    stradd = '+';
                    strsub = '-';
                    strmul = '*';
                    strdiv = '/';
                    strmod = '%';
                    str2 = "";
                    System.out.println(str1.length());

                    for (i = 0; i < (str1.length()); i++) {
                        str0 = str1.charAt(i);
                        if (flag) {

                            if (str0 == stradd || str0 == strsub || str0 == strmul || str0 == strdiv || str0 == strmod) {
                                flag = false;
                            } else {
                                flag = true;
                            }

                        } else {
                            str2 = str2 + str1.charAt(i);
                            //Log.d(str2,str1.charAt(i));
                        }
                    }
                    try {
                        valueTwo = Float.parseFloat(str2 + "");
                    } catch (Exception e) {
                        editText.setText("Invalid Input");
                    }

                    if (addition == true) {
                        editText.setText(valueOne + valueTwo + "");
                        addition = false;
                    }

                    if (subtraction == true) {
                        editText.setText(valueOne - valueTwo + "");
                        subtraction = false;
                    }

                    if (multiplication == true) {
                        editText.setText(valueOne * valueTwo + "");
                        multiplication = false;
                    }

                    if (division == true) {
                        editText.setText(valueOne / valueTwo + "");
                        division = false;
                    }

                    if (modulus == true) {
                        editText.setText(valueOne % valueTwo + "");
                        modulus = false;
                    }
                }
            });

            buttonC.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    editText.setText("");
                }
            });


    }
}


