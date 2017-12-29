package tim.com.activationcodeview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ActivationCodeView activationCodeView = ((ActivationCodeView)findViewById(R.id.icv));
        activationCodeView.setInputCompleteListener(new ActivationCodeView.InputCompleteListener() {
            @Override
            public void inputComplete() {
                Log.i("icv_input", activationCodeView.getInputContent());
            }

            @Override
            public void deleteContent() {
                Log.i("icv_delete", activationCodeView.getInputContent());
            }
        });
    }
}
