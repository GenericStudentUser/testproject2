package tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.example.sean.testproject.MyActivity;
import com.example.sean.testproject.R;

/**
 * Created by Sean on 4/20/2016.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MyActivity> {

    MyActivity myActivity;
    public JUnit_test(){
            super(MyActivity.class);
    }

    public void test_first()
    {
        myActivity = getActivity();

        TextView textView = (TextView) myActivity.findViewById(R.id.tv1);
        String tester = textView.getText().toString();

        assertEquals("Hello World!", tester);
    }

}
