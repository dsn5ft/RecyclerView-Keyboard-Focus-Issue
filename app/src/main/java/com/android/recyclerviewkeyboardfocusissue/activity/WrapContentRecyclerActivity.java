package com.android.recyclerviewkeyboardfocusissue.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.android.recyclerviewkeyboardfocusissue.R;
import com.android.recyclerviewkeyboardfocusissue.adapter.EditTextRecyclerAdapter;

public class WrapContentRecyclerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wrap_content_recycler);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.wrap_content_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new EditTextRecyclerAdapter(this, 6));
    }
}
