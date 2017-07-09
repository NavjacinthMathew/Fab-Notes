package navjacinth.mathew.fabnotes.com.fabnotes.view.fragment;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import navjacinth.mathew.fabnotes.com.fabnotes.R;
import navjacinth.mathew.fabnotes.com.fabnotes.view.interfaces.IAddNote;

public class AddNoteFragment extends Fragment implements IAddNote, View.OnClickListener {

    private EditText edtAddPost;
    private FloatingActionButton fabSave;

    public AddNoteFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_add_note, container, false);
        initialiseViews(view);
        return view;
    }

    @Override
    public void initialiseViews(View view) {
        edtAddPost = (EditText) view.findViewById(R.id.edt_add_note);
        fabSave = (FloatingActionButton) getActivity().findViewById(R.id.fab_home);
        fabSave.setImageResource(R.drawable.ic_save);

        getActivity().findViewById(R.id.fab_home).setOnClickListener(this);
    }

    @Override
    public void setUpToolbar() {

    }

    @Override
    public void initialisePresenter() {

    }

    @Override
    public void onClick(View view) {

    }
}
