package com.spring.framgent;


import com.spring.gowhere.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Uc_Fragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view			=  inflater.inflate(R.layout.uc, container, false);
		TextView textView	=(TextView) view.findViewById(R.id.title_text);
		textView.setText("个人中心");
		return view;
	}

}
