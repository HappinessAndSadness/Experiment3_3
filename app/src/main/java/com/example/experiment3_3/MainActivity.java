package com.example.experiment3_3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = findViewById(R.id.txt);
        registerForContextMenu(txt);
    }
    @Override public void onCreateContextMenu(ContextMenu menu,
                                    View source, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        menu.setHeaderIcon(R.drawable.tools);
    }
    @Override public boolean onContextItemSelected(MenuItem mi) {
        mi.setChecked(true);
        switch (mi.getItemId()) {
            case R.id.font_10: txt.setTextSize(10 * 2); break;
            case R.id.font_16: txt.setTextSize(16 * 2); break;
            case R.id.font_20: txt.setTextSize(20 * 2); break;
            case R.id.red_font: txt.setTextColor(Color.RED); break;
            case R.id.black_font: txt.setTextColor(Color.BLACK); break;
            case R.id.plain_item:
                Toast.makeText(MainActivity.this, "您单击了普通菜单项"
                        , Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}