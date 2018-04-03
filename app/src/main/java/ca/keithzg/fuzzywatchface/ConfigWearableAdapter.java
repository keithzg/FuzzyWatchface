package ca.keithzg.fuzzywatchface;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.support.wear.widget.WearableRecyclerView;
import android.util.Log;
import android.view.ViewGroup;

import java.util.ArrayList;

import ca.keithzg.fuzzywatchface.ConfigData;


public class ConfigWearableAdapter extends WearableRecyclerView.Adapter {

    private static final String TAG = "Fuzzy";

    public static final int TYPE_FUZZINESS_CONFIG = 0;

    private ArrayList<ConfigData.ConfigItemType> mSettingsDataSet;

    public ConfigWearableAdapter(Context context, ArrayList<ConfigData.ConfigItemType> settingsDataSet) {

    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.d(TAG, "onCreateViewHolder(): viewType: " + viewType);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount()  {
        return mSettingsDataSet.size();
    }

    @Override
    public int getItemViewType(int position) {
        ConfigData.ConfigItemType configItemType = mSettingsDataSet.get(position);
        return configItemType.getConfigType();
    }
}
