package com.example.tareqcalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {
	TextView txtview;
	Button pointbutton;
	Button onedelete;
	Button alldelete;
	Button addButton;
	Button subButton;
	Button divButton;
	Button one;
	Button two;
	Button three;
	Button four;
	Button five;
	Button six;
	Button seven;
	Button eight;
	Button nine;
	Button mul;
	Button zero;
	Button btnequal;

	float mValueOne, mValueTwo;

	boolean mAddition, mSubtract, mMultiplication, mDivision;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);

		txtview = (TextView) findViewById(R.id.textView1);
		txtview.setText("");

		pointbutton = (Button) findViewById(R.id.button1);

		onedelete = (Button) findViewById(R.id.button2);

		alldelete = (Button) findViewById(R.id.button3);

		addButton = (Button) findViewById(R.id.button4);

		subButton = (Button) findViewById(R.id.button5);

		divButton = (Button) findViewById(R.id.button6);

		one = (Button) findViewById(R.id.button7);

		two = (Button) findViewById(R.id.button8);

		three = (Button) findViewById(R.id.button9);

		four = (Button) findViewById(R.id.button10);

		five = (Button) findViewById(R.id.button11);

		six = (Button) findViewById(R.id.button12);

		seven = (Button) findViewById(R.id.button13);

		eight = (Button) findViewById(R.id.button14);

		nine = (Button) findViewById(R.id.button15);

		mul = (Button) findViewById(R.id.button16);

		zero = (Button) findViewById(R.id.button17);

		btnequal = (Button) findViewById(R.id.button18);

		pointbutton.setOnClickListener(this);
		onedelete.setOnClickListener(this);
		alldelete.setOnClickListener(this);
		// addButton.setOnClickListener(this);
		addButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {

				if (txtview == null) {
					txtview.setText("");
				} else {
					mValueOne = Float.parseFloat(txtview.getText() + "");
					mAddition = true;
					txtview.setText(null);
				}
			}
		});

		subButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				mValueOne = Float.parseFloat(txtview.getText() + "");
				mSubtract = true;
				txtview.setText(null);
			}
		});

		divButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				mValueOne = Float.parseFloat(txtview.getText() + "");
				mDivision = true;
				txtview.setText(null);
			}
		});

		one.setOnClickListener(this);
		two.setOnClickListener(this);
		three.setOnClickListener(this);
		four.setOnClickListener(this);
		five.setOnClickListener(this);
		six.setOnClickListener(this);
		seven.setOnClickListener(this);
		eight.setOnClickListener(this);
		nine.setOnClickListener(this);
		mul.setOnClickListener(this);
		mul.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				mValueOne = Float.parseFloat(txtview.getText() + "");
				mMultiplication = true;
				txtview.setText(null);
			}
		});
		zero.setOnClickListener(this);
		btnequal.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				mValueTwo = Float.parseFloat(txtview.getText() + "");

				if (mAddition == true) {

					txtview.setText(mValueOne + mValueTwo + "");
					mAddition = false;
				}

				if (mSubtract == true) {
					txtview.setText(mValueOne - mValueTwo + "");
					mSubtract = false;
				}

				if (mMultiplication == true) {
					txtview.setText(mValueOne * mValueTwo + "");
					mMultiplication = false;
				}

				if (mDivision == true) {
					txtview.setText(mValueOne / mValueTwo + "");
					mDivision = false;
				}
			}
		});

	}

	@Override
	public void onClick(View v) {
		String result;
		int id = v.getId();
		String addSymbol = "";
		switch (id) {
		case R.id.button1:
			addSymbol = ".";
			break;

		case R.id.button7:
			addSymbol = "1";
			break;

		case R.id.button8:
			addSymbol = "2";
			break;

		case R.id.button9:
			addSymbol = "3";
			break;

		case R.id.button10:
			addSymbol = "4";
			break;

		case R.id.button11:
			addSymbol = "5";
			break;

		case R.id.button12:
			addSymbol = "6";
			break;

		case R.id.button13:
			addSymbol = "7";
			break;

		case R.id.button14:
			addSymbol = "8";
			break;

		case R.id.button15:
			addSymbol = "9";
			break;

		case R.id.button2:
			String s = txtview.getText().toString();
			s = s.substring(0, s.length() - 1);
			txtview.setText(s);
			break;

		case R.id.button3:
			txtview.setText("");
			break;

		case R.id.button4:
			addSymbol = "+";
			break;

		case R.id.button5:
			addSymbol = "-";
			break;

		case R.id.button6:
			addSymbol = "/";
			break;

		case R.id.button16:
			addSymbol = "*";
			break;

		case R.id.button17:
			addSymbol = "0";
			break;

		default:
			break;
		}
		txtview.setText(txtview.getText().toString() + addSymbol);

	}

}
