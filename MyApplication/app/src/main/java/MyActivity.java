import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import android.view.View;
import androidx.activity.R;
import androidx.annotation.Nullable;



import static android.content.ContentValues.TAG;

public class MyActivity extends Activity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
         Log.i(TAG, "onCreate: ");
         setContentView(R.layout.activity_main);

    }

}
