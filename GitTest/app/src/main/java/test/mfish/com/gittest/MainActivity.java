package test.mfish.com.gittest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private int n = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("呵呵", "呵呵");
        Person p = new Person();
        p.setAge(18);
        p.setName("ly");
        for (int i = 0; i < 10; i++) {
//            f1();
            Log.i("i:--", i+"-");
        }
        Log.i(p.getName(), p.getAge()+"");

    }
    public void f1(){
        n = 6;
    }
}
