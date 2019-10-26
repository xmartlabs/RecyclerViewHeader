/*
 * Copyright 2015 Bartosz Lipinski
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bartoszlipinski.recyclerviewheader2.sample.fragment;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bartoszlipinski.recyclerviewheader2.RecyclerViewHeader;
import com.bartoszlipinski.recyclerviewheader2.sample.R;
import com.bartoszlipinski.recyclerviewheader2.sample.adapter.ColorItemsAdapter;

/**
 * Created by Bartosz Lipinski
 * 01.04.15
 */
public class SampleListReversedFragment extends Fragment {

    private RecyclerViewHeader recyclerHeader;
    private RecyclerView recycler;

    public static SampleListReversedFragment newInstance() {
        SampleListReversedFragment fragment = new SampleListReversedFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sample_reversed, container, false);
        setupViews(view);
        return view;
    }

    private void setupViews(View view) {
        recycler = (RecyclerView) view.findViewById(R.id.recycler);
        recycler.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, true));
        recycler.setAdapter(new ColorItemsAdapter(getActivity(), 21));

        recyclerHeader = (RecyclerViewHeader) view.findViewById(R.id.header);
        recyclerHeader.attachTo(recycler);
    }

}
