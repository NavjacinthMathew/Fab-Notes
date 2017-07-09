package navjacinth.mathew.fabnotes.com.fabnotes.view.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import navjacinth.mathew.fabnotes.com.fabnotes.R;
import navjacinth.mathew.fabnotes.com.fabnotes.adapter.NoteListAdapter;
import navjacinth.mathew.fabnotes.com.fabnotes.presenter.AllNotePresenter;
import navjacinth.mathew.fabnotes.com.fabnotes.view.activity.HomeActivity;
import navjacinth.mathew.fabnotes.com.fabnotes.view.interfaces.IAllNote;

public class AllNoteFragment extends Fragment implements View.OnClickListener, IAllNote {

    private RecyclerView recyclerAllNote;
    private AllNotePresenter presenter;

    public AllNoteFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_all_note, container, false);

        initialiseViews(view);
        setUpToolbar();
        initialisePresenter();

        return view;
    }

    @Override
    public void initialiseViews(View view) {
        recyclerAllNote = (RecyclerView) view.findViewById(R.id.recycler_all_note);
        getActivity().findViewById(R.id.fab_home).setOnClickListener(this);
    }

    @Override
    public void setUpToolbar() {
        TextView toolbarTitle = (TextView) getActivity().findViewById(R.id.txt_toolbar_title);
        toolbarTitle.setText("All Notes");
    }

    @Override
    public void initialisePresenter() {
        presenter = new AllNotePresenter(this, getActivity());
        presenter.getAllNoteData();
    }

    @Override
    public void setAdapter(NoteListAdapter adapter) {

        recyclerAllNote.setHasFixedSize(true);
        /*generate grid with 2 items in each row*/
        //RecyclerView.LayoutManager layoutManager = new StaggeredGridLayoutManager(3, 1);

        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);

        /*Set layout manager initialised before*/
        recyclerAllNote.setLayoutManager(layoutManager);

        /*Set adapter to the recycler view*/
        recyclerAllNote.setAdapter(adapter);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.fab_home:
                ((HomeActivity) getActivity()).loadFragment(new AddNoteFragment());
                break;
        }
    }
}
