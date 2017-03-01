package ace.know.you.ado.autofragment;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_show_fragment1;
    Button btn_show_fragment2;
    Fragment fragment_container;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_show_fragment1 =(Button)findViewById(R.id.btn_show_fragment1);
        btn_show_fragment1.setOnClickListener(this);

        btn_show_fragment2 =(Button)findViewById(R.id.btn_show_fragment2);
        btn_show_fragment2.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch(view.getId())
        {
            case R.id.btn_show_fragment1:
                FragmentManager manager = getFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                Fragment fragment = new Fragment1();
                transaction.add(R.id.id_Fragment_container,fragment);
                transaction.commit();
                break;
            case R.id.btn_show_fragment2:
                 manager = getFragmentManager();
                 transaction = manager.beginTransaction();
                 fragment = new Fragment2();
                transaction.add(R.id.id_Fragment_container,fragment);
                transaction.commit();

                break;


        }

    }
}
