package edu.northeastern.numad22fa_edgardavid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;
import android.view.ViewGroup;
import android.view.Gravity;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayToast();
            }
        });
    }

    public void displayToast() {
        LayoutInflater inflater = getLayoutInflater();

        View layout = inflater.inflate(R.layout.toast_layout, (ViewGroup) findViewById(R.id.toast_root));

        TextView toastNameEmail = layout.findViewById(R.id.toast_name_email);

        toastNameEmail.setText("Edgar Alan David david.e@northeastern.edu");

        Toast mtoast = new Toast(getApplicationContext());
        mtoast.setGravity(Gravity.CENTER, 0, 50);
        mtoast.setDuration(Toast.LENGTH_LONG);
        mtoast.setView(layout);

        mtoast.show();
    }
}