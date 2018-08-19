package slav40.myheroacademy.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import slav40.myheroacademy.R;

public class CharacterDetailsActivity extends AppCompatActivity
{
    private TextView mCharacterName;
    private TextView mCharacterDescription;
    private ImageView mCharacterImage;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_details);

        mCharacterName = findViewById(R.id.listdata);
        mCharacterDescription = findViewById(R.id.description);
        mCharacterImage = findViewById(R.id.imageView);

        Intent intent = getIntent();

        mCharacterName.setText(intent.getStringExtra("name"));
        mCharacterDescription.setText(intent.getStringExtra("description"));
        mCharacterImage.setImageResource(intent.getIntExtra("image", 0));
    }
}
