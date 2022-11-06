package lat.pam.pizzarestaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class Activity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity5);
    }

    public void order(View view) {
        Toast toast = Toast.makeText(this, "Terima kasih Asep sudah memesan  ditoko kami, pesanan Pepperoni Pizza  anda dikirim menggunakan Fast Delivery", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
}