package com.pauldmps.GmailLikePullDownToRefresh;


import android.os.Bundle;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.pauldmps.GmailLikePullDownToRefresh.ButteryProgressBar;
import com.pauldmps.GmailLikePullDownToRefresh.SwipeRefreshHintLayout;


public class MainActivity extends ActionBarActivity implements OnRefreshListener {

	ListView lv;
	String[] list = {"Item1","Item2","Item3","Item4"};
	SwipeRefreshLayout mSwipeRefreshLayout;
	SwipeRefreshHintLayout mSwipeRefreshHintLayout;
    ButteryProgressBar progressBar;
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		progressBar = ButteryProgressBar.getInstance(this);
		
		
		lv = (ListView)findViewById(R.id.listView1);
	    ArrayAdapter<String> adp = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,list);
	    lv.setAdapter(adp);
	    
	    mSwipeRefreshLayout = (SwipeRefreshLayout)findViewById(R.id.swipe_container);
	    mSwipeRefreshHintLayout = (SwipeRefreshHintLayout)findViewById(R.id.swipe_hint);
	    mSwipeRefreshHintLayout.setSwipeLayoutTarget(mSwipeRefreshLayout);
	    mSwipeRefreshLayout.setOnRefreshListener(this);
	    mSwipeRefreshLayout.setColorScheme(R.color.holo_blue_light,android.R.color.transparent,android.R.color.transparent,android.R.color.transparent);

	    
	}
	    
	
	@Override public void onRefresh() {
		
		//setProgressBarIndeterminateVisibility(true);
		new Handler().postDelayed(new Runnable() {
            @Override public void run() {
          mSwipeRefreshLayout.setRefreshing(false);
          progressBar.setVisibility(View.VISIBLE);
            }
        }, 0);
		
		
	}
	
}

