package ru.geekbrains.lesson1;
//1. Создать проект со следующими пользовательскими элементами: TextView, EditText, Button,
//Switch, CheckBox, ToggleButton. Для работы использовать LinearLayout. Использовать
//различные шрифты, цвета, размеры, прочие атрибуты.
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}