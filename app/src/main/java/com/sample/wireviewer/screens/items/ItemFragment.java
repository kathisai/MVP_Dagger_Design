package com.sample.wireviewer.screens.items;


import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.simpsonsviewer.R;
import com.sample.wireviewer.di.ActivityScoped;
import com.sample.wireviewer.model.RelatedTopic;
import com.sample.wireviewer.model.simpsons.SimpsonModel;
import com.sample.wireviewer.network.APIInterface;
import com.sample.wireviewer.screens.items.adapter.ItemListAdapter;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 */
@ActivityScoped
public class ItemFragment extends Fragment implements ItemContract.View {

    private static final String TAG = ItemFragment.class.getSimpleName();
    @Inject
    APIInterface apiInterface;

    private List<RelatedTopic> list = new ArrayList<>();

    private ItemListAdapter adapter;
    @Inject
    public ItemFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Call<SimpsonModel> call = apiInterface.getItems();
        call.enqueue(new Callback<SimpsonModel>() {
            @Override
            public void onResponse(Call<SimpsonModel> call, Response<SimpsonModel> response) {
                if (response.isSuccessful()) {
                    list.addAll(response.body().getRelatedTopics());
                    adapter.notifyDataSetChanged();
                }
                Log.d(TAG, "onResponse: " + response);

            }

            @Override
            public void onFailure(Call<SimpsonModel> call, Throwable t) {
                Log.d(TAG, "onFailure: " + t);

            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_item, container, false);
        RecyclerView recyclerView = rootView.findViewById(R.id.rv_item_list);
        recyclerView.setHasFixedSize(true);
        adapter = new ItemListAdapter(getActivity(), list);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        // First param is number of columns and second param is orientation i.e Vertical or Horizontal
//        StaggeredGridLayoutManager gridLayoutManager =
//                new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
//// Attach the layout manager to the recycler view
//        recyclerView.setLayoutManager(gridLayoutManager);
        return rootView;
    }

}
