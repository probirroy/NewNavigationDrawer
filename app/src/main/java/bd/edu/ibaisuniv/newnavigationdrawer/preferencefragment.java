package bd.edu.ibaisuniv.newnavigationdrawer;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by probirroy on 28-Nov-17.
 */

public class preferencefragment extends PreferenceFragment {
    public static preferencefragment newInstance(){
        Bundle args = new Bundle();
        preferencefragment fragment = new preferencefragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstaceStance){
        super.onCreate(savedInstaceStance);
        addPreferencesFromResource(R.xml.settingpreference);
    }
}
