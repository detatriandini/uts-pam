package lat.pam.pizzarestaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity4);
    }

    public void Page5(View view) {
        Intent intent = new Intent(Activity4.this, Activity5.class);
        startActivity(intent);
    }

    public void Kembali(View view) {
        Intent intent = new Intent(Activity4.this, Activity3.class);
        startActivity(intent);
    }
}