package navjacinth.mathew.fabnotes.com.fabnotes.view.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import navjacinth.mathew.fabnotes.com.fabnotes.R;
import navjacinth.mathew.fabnotes.com.fabnotes.view.interfaces.IAddNote;

public class AddNoteFragment extends Fragment implements IAddNote {


    public AddNoteFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_add_note, container, false);
        return view;
    }

}
