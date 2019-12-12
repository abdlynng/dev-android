package sn.uadb.abdlynng.example_asynchtask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageDownloader imgDownloader = new ImageDownloader(this);

        imgDownloader.execute("https://pbs.twimg.com/profile_images/473255172001382400/nGapeZoH.jpeg");
    }
}
