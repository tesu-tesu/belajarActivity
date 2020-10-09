package pens.lab.app.belajaractivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityLogin extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        TextView t1 = (TextView) findViewById(R.id.text_viewname);
        Bundle bundle = getIntent().getExtras();
        String s1 = bundle.getString("email");
        t1.setText(s1);

        TextView t2 = (TextView) findViewById(R.id.text_viewpassword);
        Bundle bundle1 = getIntent().getExtras();
        String s2 = bundle.getString("password");
        t2.setText(s2);
    }
}
