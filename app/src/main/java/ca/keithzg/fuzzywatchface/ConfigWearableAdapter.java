package ca.keithzg.fuzzywatchface;

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
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

    private Context mContext;
    SharedPreferences mSharedPref;

    private ArrayList<ConfigData.ConfigItemType> mSettingsDataSet;

    public ConfigWearableAdapter(
            Context context,
            ArrayList<ConfigData.ConfigItemType> settingsDataSet) {
        mContext = context;
//        mWatchFaceComponentName = new ComponentName(mContext, watchFaceServiceClass);
        mSettingsDataSet = settingsDataSet;

        mSharedPref =
                context.getSharedPreferences(
                        context.getString(R.string.analog_complication_preference_file_key),
                        Context.MODE_PRIVATE);

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
//        return mSettingsDataSet.size();
        return 1;
    }

    @Override
    public int getItemViewType(int position) {
        ConfigData.ConfigItemType configItemType = mSettingsDataSet.get(position);
        return configItemType.getConfigType();
    }
}
