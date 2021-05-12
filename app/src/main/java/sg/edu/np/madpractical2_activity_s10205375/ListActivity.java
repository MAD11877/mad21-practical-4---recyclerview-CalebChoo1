package sg.edu.np.madpractical2_activity_s10205375;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class ListActivity extends AppCompatActivity {
    User user1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        user1 = new User();
    }
    public void imgClick(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("Profile");
        builder.setMessage("Madness");
        builder.setPositiveButton("View", new DialogInterface.OnClickListener(){
            public void onClick(DialogInterface dialog, int id){
                Random ran = new Random();
                String ranInt = " " + String.valueOf(ran.nextInt());
                Intent in = new Intent(ListActivity.this, MainActivity.class);
                in.putExtra("ranInt", ranInt);
                startActivity(in);
            }
        });
        builder.setNegativeButton("Close", new DialogInterface.OnClickListener(){
            public void onClick(DialogInterface dialog, int id){

            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }

}