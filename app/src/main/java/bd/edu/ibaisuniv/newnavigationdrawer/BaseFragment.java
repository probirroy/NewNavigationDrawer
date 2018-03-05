package bd.edu.ibaisuniv.newnavigationdrawer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

/**
 * Created by mbiplobe on 3/6/2018.
 */

public class BaseFragment extends Fragment {

    public void fragmentTransaction(Fragment pFragment) {
        FragmentManager manager = getActivity().getSupportFragmentManager();
        manager.beginTransaction()
                .replace(R.id.frame, pFragment)
                .addToBackStack("null").commit();
    }

    public Fragment getFragment(Fragment pFragment,String pS){
        Bundle lBundle = new Bundle();
        lBundle.putString(Constants.FILE_EXTRA, pS);
        pFragment.setArguments(lBundle);

        return pFragment;
    }
}
