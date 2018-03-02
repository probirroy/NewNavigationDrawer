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
public class TabThreeFragment extends Fragment {


    public TabThreeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab_three, container, false);

        RecyclerView rv = (RecyclerView) view.findViewById(R.id.recycler_vie);
        rv.setHasFixedSize(true);
        MyAdapter adapter = new MyAdapter(new String[]{"Example 1", "Example 2", "Example 3", "Example 4", "Example 5" , "Example 6" , "Example 7",
                "Example 8","Example 9","Example 10","Example 11"});
        rv.setAdapter(adapter);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(llm);

        return view;
    }

}
