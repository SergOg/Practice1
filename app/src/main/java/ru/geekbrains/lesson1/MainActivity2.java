package ru.geekbrains.lesson1;
//2. Создать ещё один макет (если не получается, то проект) с несколькими EditText, где
//использовать атрибут inputType: text, textPersonName, phone, number, textPassword,
//textEmailAddress и другие значения.
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
}