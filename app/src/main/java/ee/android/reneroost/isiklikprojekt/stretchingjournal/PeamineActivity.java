package ee.android.reneroost.isiklikprojekt.stretchingjournal;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PeamineActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raam_uldine);

        FragmentManager fragmendiHaldur = getSupportFragmentManager();
        Fragment fragment = fragmendiHaldur.findFragmentById(R.id.fragmendi_konteiner_harjutuse_kirjeldus);

        if (fragment == null) {
            fragment = new AvalehtFragment();
            fragmendiHaldur.beginTransaction()
                    .add(R.id.fragmendi_konteiner_harjutuse_kirjeldus, fragment)
                    .commit();
        }
    }
}
