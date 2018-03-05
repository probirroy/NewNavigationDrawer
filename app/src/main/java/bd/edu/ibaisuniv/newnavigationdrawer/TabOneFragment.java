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
public class TabOneFragment extends BaseFragment implements MyAdapter.OnItemClickListener<String> {


    public TabOneFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab_one, container, false);

        RecyclerView rv = (RecyclerView) view.findViewById(R.id.rv_recycler_view);
        rv.setHasFixedSize(true);
        MyAdapter adapter = new MyAdapter(new String[]{"Fragment One", "Fragment Two", "Fragment Three", "Fragment Four", "Fragment Five", "Fragment Six", "Fragment Seven",
                "Fragment Eight", "Fragment Nine", "Fragment Ten"});
        adapter.setListener(this);
        rv.setAdapter(adapter);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(llm);

        return view;
    }

    @Override
    public void onClick(View pView, String pS) {
        Fragment lFragment = getFragment(new TestFragment(), pS);
        fragmentTransaction(lFragment);
    }
}
