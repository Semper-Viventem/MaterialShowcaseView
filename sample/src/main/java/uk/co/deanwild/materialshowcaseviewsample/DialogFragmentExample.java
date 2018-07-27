package uk.co.deanwild.materialshowcaseviewsample;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;


public class DialogFragmentExample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog_fragment_example);

        DialogFragment dialogFragment = new ExampleBottomSheetDialogFragment();
        dialogFragment.show(getSupportFragmentManager(), dialogFragment.getTag());
    }
}
