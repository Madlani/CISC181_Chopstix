package chopstixapp.camato.udel.edu.chopstixapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import static android.provider.AlarmClock.EXTRA_MESSAGE;


public class ChopStixTitleScreen extends AppCompatActivity {

    private Button startButton;
    private EditText player1Name;
    public  String p1Name;

    private EditText player2Name;
    private TextView p1TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chop_stix_title_screen);

        startButton = (Button) findViewById(R.id.button_start);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGameScreen();
                player1Name = findViewById(R.id.p1Name);
                player2Name = findViewById(R.id.p2Name);
                p1TextView = (TextView) findViewById(R.id.gs_centerText);
            }
        });



        // Use if you want a textview to be scrollable
        TextView instructions = (TextView) findViewById(R.id.testScroll);
        instructions.setMovementMethod(new ScrollingMovementMethod());
    }

    public void openGameScreen()
    {
        Intent intent = new Intent(this, GameActivity.class);
        TextView p1NameText = (TextView) findViewById(R.id.p1Name);
        this.p1Name = p1NameText.getText().toString();
        intent.putExtra("p1Name", p1Name);
        startActivity(intent);
    }

    /*public void startGame(View view) {
        Intent intent = new Intent(this, GameActivity.class);
        findViewById(R.id.startButton);

    }*/

    public void sendMessage(View view){

        //Toast.makeText(this, "" + images[current_image__index] + " your own message here!",
        //        Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this,GameActivity.class);
        //EditText editText = (EditText) findViewById(R.id.editText);
        //String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE,images[current_image__index]);
        startActivity(intent);
    }
}







