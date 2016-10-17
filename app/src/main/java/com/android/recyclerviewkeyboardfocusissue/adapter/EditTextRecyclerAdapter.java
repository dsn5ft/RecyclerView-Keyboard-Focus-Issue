package com.android.recyclerviewkeyboardfocusissue.adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.android.recyclerviewkeyboardfocusissue.R;

public class EditTextRecyclerAdapter extends RecyclerView.Adapter<EditTextRecyclerAdapter.EditTextRecyclerViewHolder> {

    private Context context;
    private int numRows;

    public EditTextRecyclerAdapter(Context context, int numRows) {
        this.context = context;
        this.numRows = numRows;
    }

    @Override
    public int getItemCount() {
        return numRows;
    }

    @Override
    public EditTextRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.edit_text_row, parent, false);
        return new EditTextRecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(EditTextRecyclerViewHolder holder, int position) {
        holder.bind(position);
    }

    class EditTextRecyclerViewHolder extends RecyclerView.ViewHolder {

        View container;
        EditText editText;

        public EditTextRecyclerViewHolder(View itemView) {
            super(itemView);

            container = itemView.findViewById(R.id.edit_text_row_container);
            editText = (EditText) itemView.findViewById(R.id.edit_text_row_edit_text);
        }

        public void bind(int position) {
            container.setBackgroundColor(position % 2 == 0 ? 0xFFFFFFFF : 0xFFEEEEEE);
            editText.setHint("Row number " + position);
        }
    }
}
