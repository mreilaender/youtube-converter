package reilaender.at.youtubeconverter.fragments;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import reilaender.at.youtubeconverter.R;

/**
 * @author manuel
 * @version 2/18/17
 */
public class ResultFragment extends ListFragment {
    public static final String QUERY = "QUERY";
    private static final String TAG = ListFragment.class.getName();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        getListView().setDivider(null);
        setListAdapter(new ArrayAdapter<>(getActivity(), R.layout.result_list, R.id.video_title, new String[]{"Title 1", "Title 2", "Title 3", "Title 4", "Title 5"}));
    }
}
