package bd.edu.ibaisuniv.newnavigationdrawer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class TabFourFragment extends Fragment {


    public TabFourFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab_four, container, false);
        RecyclerView rv = (RecyclerView) view.findViewById(R.id.recycler_vieww);
        rv.setHasFixedSize(true);
        MyAdapter adapter = new MyAdapter(new String[]{"Fragment 1", "Fragment 2", "Fragment 3", "Fragment 4", "Fragment 5" , "Fragment 6" , "Fragment 7",
                "Fragment 8","Fragment 9","Fragment 10"});
        rv.setAdapter(adapter);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(llm);

        return view;
    }

}
