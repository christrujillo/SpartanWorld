package edu.miracosta.cs134.ctrujillo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Instance variables = named views in our layout
    private ImageView logoImageView;
    private Button swapImageButton;
    private boolean isMCCLogo = true;

    //Equivalent of main method (entry point of code)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Wire up (hook up) the controller to the view

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logoImageView = findViewById(R.id.logoImageView);
        swapImageButton = findViewById(R.id.swapImageButton);
    }

    public void swapImage(View v)
    {
        if(isMCCLogo)
        {
            logoImageView.setImageResource(R.drawable.spartan_logo);
            Toast.makeText(this, R.string.toasts_text, Toast.LENGTH_LONG).show();
        }
        else
            logoImageView.setImageResource(R.drawable.miracosta_logo);

        isMCCLogo = !isMCCLogo;
    }
}
