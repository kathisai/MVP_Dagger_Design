package com.sample.wireviewer.screens.items.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.simpsonsviewer.R;
import com.sample.wireviewer.model.RelatedTopic;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;


public class ItemListAdapter extends RecyclerView.Adapter<ItemListAdapter.ViewHolder> {

    private List<RelatedTopic> list;

    public ItemListAdapter(FragmentActivity activity, List<RelatedTopic> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View itemView = inflater.inflate(R.layout.item_list, viewGroup, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        RelatedTopic topic = list.get(position);
        String[] textArray = topic.getText().split("-"); // Assuming that Text contain Title - Description format
        if (textArray.length > 0) {
            viewHolder.titleTextView.setText(textArray[0]);
        }

        if (textArray.length > 1) {
            viewHolder.descriptionButton.setText(textArray[1]);
        }


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.item_title)
        TextView titleTextView;
        @BindView(R.id.item_description)
        TextView descriptionButton;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
