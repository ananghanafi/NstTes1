package com.masbie.nusantechtes1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText input1, input2, input3;
    CheckBox checkBox1, checkBox2, checkBox3;
    Button bt1, bt2, bt3, bt4;
    TextView hasil;
    String in[] = new String[3];
    boolean checked[] = new boolean[3];
//    int cek = 0;
//    int cekHasil = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input1 = (EditText) findViewById(R.id.input1);
        input2 = (EditText) findViewById(R.id.input2);
        input3 = (EditText) findViewById(R.id.input3);

        checkBox1 = (CheckBox) findViewById(R.id.checkbox1);
        checkBox2 = (CheckBox) findViewById(R.id.checkbox2);
        checkBox3 = (CheckBox) findViewById(R.id.checkbox3);

        bt1 = (Button) findViewById(R.id.bt1);
        bt2 = (Button) findViewById(R.id.bt2);

        hasil = (TextView) findViewById(R.id.hasil);
//        checked[0] = checkBox1.isChecked();
//        checked[1] = checkBox2.isChecked();
//        checked[2] = checkBox3.isChecked();
//
//        in[0] = Integer.parseInt(String.valueOf(input1.getText()));
//        in[1] = Integer.parseInt(String.valueOf(input2.getText()));
//        in[2] = Integer.parseInt(String.valueOf(input3.getText()));


        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int cek = 0;
                int cekHasil = 0;
                String tamp = "";
                checked[0] = checkBox1.isChecked();
                checked[1] = checkBox2.isChecked();
                checked[2] = checkBox3.isChecked();
                in[0] = input1.getText().toString();
                in[1] = input2.getText().toString();
                in[2] = input3.getText().toString();

                for (int i = 0; i < 3; i++) {
                    if (String.valueOf(in[i]).equals(" ") || checked[i] == false) {
                    } else {
                        cek = cek + 1;
                    }
                    System.out.println("Cek " + cek);
                }
                if (cek < 2) {
                    Toast.makeText(MainActivity.this, "Periksa Inputan dan chekbox anda (inputan dan chekbox harus lebih dari 1)", Toast.LENGTH_SHORT).show();
                } else {
                    for (int i = 0; i < 3; i++) {
                        if (String.valueOf(in[i]).equals(" ") || checked[i] == false) {
                            //     in[i] = 0;
//                            int k = Integer.parseInt(String.valueOf(in[i]));
//                            k = 0;
                        } else {
                            //                cekHasil = cekHasil + in[i];
                            cekHasil = cekHasil + Integer.parseInt(String.valueOf(in[i]));
                            tamp = in[0] + "+" + in[1] + "+" + in[2];
                        }
                    }
                    System.out.println("Cek Hasil " + cekHasil);
                    hasil.setText("Hasil = " + tamp + " = " + cekHasil);
                }

            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int cek = 0;
                int cekHasil = 0;
                int k = 2;
                String tamp = "";
                checked[0] = checkBox1.isChecked();
                checked[1] = checkBox2.isChecked();
                checked[2] = checkBox3.isChecked();
                in[0] = input1.getText().toString();
                in[1] = input2.getText().toString();
                in[2] = input3.getText().toString();

                for (int i = 0; i < 3; i++) {
                    if (String.valueOf(in[i]).equals(" ") || checked[i] == false) {
                        k = i;
                        System.out.println("k sebelum "+k);
                    } else {
                        cek = cek + 1;
                    }
                    System.out.println("Cek " + cek);
                }
                if (cek < 2) {
                    Toast.makeText(MainActivity.this, "Periksa Inputan dan chekbox anda (inputan dan chekbox harus lebih dari 1)", Toast.LENGTH_SHORT).show();
                } else {
                    System.out.println("k "+k);
                    if (k == 0) {
                        int b = Integer.parseInt(String.valueOf(in[1]));
                        int c = Integer.parseInt(String.valueOf(in[2]));
                        cekHasil = b - c;
                        tamp = b + "-" + c;
                    } else if (k == 1) {
                        int a = Integer.parseInt(String.valueOf(in[0]));
                        int c = Integer.parseInt(String.valueOf(in[2]));
                        cekHasil = a - c;
                        tamp = a + "-" + c;
                    } else if (k == 2) {
                        int a = Integer.parseInt(String.valueOf(in[0]));
                        int b = Integer.parseInt(String.valueOf(in[1]));
                        int c = Integer.parseInt(String.valueOf(in[2]));
                        cekHasil = a - b - c;
                        tamp = a + "-" + b + "-" + c;
                    }
                    System.out.println("Cek Hasil " + cekHasil);
                    hasil.setText("Hasil = " + tamp + " = " + cekHasil);
                }
            }
        });
    }

    public void bt3(View view) {
        int cek = 0;
        int cekHasil = 0;
        int k = 2;
        String tamp = "";
        checked[0] = checkBox1.isChecked();
        checked[1] = checkBox2.isChecked();
        checked[2] = checkBox3.isChecked();
        in[0] = input1.getText().toString();
        in[1] = input2.getText().toString();
        in[2] = input3.getText().toString();

        for (int i = 0; i < 3; i++) {
            if (String.valueOf(in[i]).equals(" ") || checked[i] == false) {
                k = i;
            } else {
                cek = cek + 1;
            }
            System.out.println("Cek " + cek);
        }
        if (cek < 2) {
            Toast.makeText(MainActivity.this, "Periksa Inputan dan chekbox anda (inputan dan chekbox harus lebih dari 1)", Toast.LENGTH_SHORT).show();
        } else {
            if (k == 0) {
                int b = Integer.parseInt(String.valueOf(in[1]));
                int c = Integer.parseInt(String.valueOf(in[2]));
                cekHasil = b * c;
                tamp = b + "x" + c;
            } else if (k == 1) {
                int a = Integer.parseInt(String.valueOf(in[0]));
                int c = Integer.parseInt(String.valueOf(in[2]));
                cekHasil = a * c;
                tamp = a + "x" + c;
            } else if (k == 2) {
                int a = Integer.parseInt(String.valueOf(in[0]));
                int b = Integer.parseInt(String.valueOf(in[1]));
                int c = Integer.parseInt(String.valueOf(in[2]));
                cekHasil = a * b * c;
                tamp = a + "x" + b + "x" + c;
            }
            System.out.println("Cek Hasil " + cekHasil);
            hasil.setText("Hasil = " + tamp + " = " + cekHasil);
        }

    }

    public void bt4(View view) {
        int cek = 0;
        int cekHasil = 0;
        int k = 2;
        String tamp = "";
        checked[0] = checkBox1.isChecked();
        checked[1] = checkBox2.isChecked();
        checked[2] = checkBox3.isChecked();
        in[0] = input1.getText().toString();
        in[1] = input2.getText().toString();
        in[2] = input3.getText().toString();

        for (int i = 0; i < 3; i++) {
            if (String.valueOf(in[i]).equals(" ") || checked[i] == false) {
                k = i;
            } else {
                cek = cek + 1;
            }
            System.out.println("Cek " + cek);
        }
        if (cek < 2) {
            Toast.makeText(MainActivity.this, "Periksa Inputan dan chekbox anda (inputan dan chekbox harus lebih dari 1)", Toast.LENGTH_SHORT).show();
        } else {
            if (k == 0) {
                int b = Integer.parseInt(String.valueOf(in[1]));
                int c = Integer.parseInt(String.valueOf(in[2]));
                cekHasil = b / c;
                tamp = b + "/" + c;
            } else if (k == 1) {
                int a = Integer.parseInt(String.valueOf(in[0]));
                int c = Integer.parseInt(String.valueOf(in[2]));
                cekHasil = a / c;
                tamp = a + "/" + c;
            } else if (k == 2) {
                int a = Integer.parseInt(String.valueOf(in[0]));
                int b = Integer.parseInt(String.valueOf(in[1]));
                int c = Integer.parseInt(String.valueOf(in[2]));
                cekHasil = a / b / c;
                tamp = a + "/" + b + "/" + c;
            }
            System.out.println("Cek Hasil " + cekHasil);
            hasil.setText("Hasil = " + tamp + " = " + cekHasil);
        }
    }
}
