import android.os.Bundle;
import android.widget.TextView;


public class q2 extends AppCompatActivity {
	
	TextView txtMarquee;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// casting of textview
		txtMarquee = (TextView) findViewById(R.id.marqueeText);
		
		// Now we will call setSelected() method
		// and pass boolean value as true
		txtMarquee.setSelected(true);
	}
}

