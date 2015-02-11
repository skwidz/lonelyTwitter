package ca.ualberta.cs.lonelytwitter.test;

import android.content.Intent;
import android.location.Address;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;
import ca.ualberta.cs.lonelytwitter.IntentReaderActivity;
import ca.ualberta.cs.lonelytwitter.R;
import ca.ualberta.cs.lonelytwitter.R.id;

public class LonelyTwitterActivityTest extends
		ActivityInstrumentationTestCase2<IntentReaderActivity> {

	public LonelyTwitterActivityTest() {
		super(IntentReaderActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}
	
	public void testSendText() {
		String text = "hello";
		IntentReaderActivity activity = startWithText(text, IntentReaderActivity.NORMAL);
		assertEquals("is the activity getting my text", text, activity.getText());
	}
	
	public void testRevTest(){
		String text = "hello";
		IntentReaderActivity activity = startWithText(text, IntentReaderActivity.REVERSE);
		assertEquals("is this reversing?","olleh" , activity.getText());
	}

	
	public void testDoubleText(){
		String text = "hi";
		IntentReaderActivity activity = startWithText(text, IntentReaderActivity.DOUBLE);
		assertEquals("correct?" , text+text, activity.getText());
	}
	
	public void testDisplayText(){
		IntentReaderActivity activity = startWithText("hello",	IntentReaderActivity.NORMAL);
		TextView veiw = (TextView) activity.findViewById(R.id.intentText);
	}
	
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testEmptyText(){
		String text = "";
		IntentReaderActivity activity = startWithText(text, IntentReaderActivity.NORMAL);
		assertEquals("empty text test", "the text field is empty", activity.getText());
	}
	
	private IntentReaderActivity startWithText(String text, int transformationCode){
		Intent intent = new Intent();
		if(text.isEmpty()){
			intent.putExtra(IntentReaderActivity.TEXT_KEY, "the text field is empty");
			
		}else{
			intent.putExtra(IntentReaderActivity.TEXT_KEY, text);
		}
		intent.putExtra(IntentReaderActivity.TRANSFORM_KEY, transformationCode);
		setActivityIntent(intent);
		return (IntentReaderActivity) getActivity();
	}
}
