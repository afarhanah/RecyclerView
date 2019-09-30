package org.hanna.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class DetailsActivity extends AppCompatActivity {
    public static final String EXTRA_SKINCARE = "extra_skincare";
    public static final String EXTRA_DETAILS = "extra_details";
    public static final String EXTRA_PHOTOS = "extra_photos";

    TextView skincareName, skincareDetails;
    ImageView skincarePhoto;

    private ArrayList<Skincare> skincareList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        skincareName = findViewById(R.id.tvSkincarename);
        skincareDetails = findViewById(R.id.tvSkincareDetail);
        skincarePhoto = findViewById(R.id.skincarePhoto);

        String extraname = getIntent().getStringExtra(EXTRA_SKINCARE);
        String extradetail = getIntent().getStringExtra(EXTRA_DETAILS);
        int extraphoto = getIntent().getIntExtra(EXTRA_PHOTOS, 0);

        String textName = extraname;
        String textDetail = extradetail;
        int photo = extraphoto;

        skincareName.setText(textName);
        skincareDetails.setText(textDetail);
        skincarePhoto.setImageResource(photo);
    }
}
