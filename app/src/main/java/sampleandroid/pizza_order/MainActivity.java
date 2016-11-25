package sampleandroid.pizza_order;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et_pizza_val, et_spagetti_val, et_salad_val;
    CheckBox cb_membership;
    RadioButton rb_pickle, rb_sauce;
    ImageView iv_option;
    Button bt_order;
    TextView tv_order_val, tv_order_cost, tv_order_option;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
