package namh.io.snapshot.snapshotdemoapp;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import namh.io.snapshot.snaptheview.Snapshot;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button takeSnap = findViewById(R.id.snap_btn);
        Button takeSnap2 = findViewById(R.id.snap_btn2);
        final ConstraintLayout rootV = findViewById(R.id.rootV);

        final ImageView pImg = findViewById(R.id.image_p);
        final ImageView sImg = findViewById(R.id.image_s);

        takeSnap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sImg.setImageBitmap(Snapshot.fromView(rootV));
            }
        });
        takeSnap2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sImg.setImageBitmap(Snapshot.fromView(pImg));
            }
        });
    }
}
