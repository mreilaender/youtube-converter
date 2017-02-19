package reilaender.at.youtubeconverter.listener;

import android.view.View;
import android.widget.AdapterView;

/**
 * @author manuel
 * @version 2/19/17
 */
public class ApplicationDrawerListener implements AdapterView.OnItemClickListener {
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        // TODO: find best practice for implementing this method
        // do I really have to switch over the positions?
        String item = (String) adapterView.getItemAtPosition(position);

    }
}
