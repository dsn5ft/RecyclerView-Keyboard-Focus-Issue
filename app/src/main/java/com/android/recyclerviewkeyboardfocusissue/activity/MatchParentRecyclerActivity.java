package com.android.recyclerviewkeyboardfocusissue.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.android.recyclerviewkeyboardfocusissue.R;
import com.android.recyclerviewkeyboardfocusissue.adapter.EditTextRecyclerAdapter;

public class MatchParentRecyclerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match_parent_recycler);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.match_parent_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new EditTextRecyclerAdapter(this, 6));
    }
}
