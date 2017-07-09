package navjacinth.mathew.fabnotes.com.fabnotes.presenter;

import android.content.Context;

import navjacinth.mathew.fabnotes.com.fabnotes.view.interfaces.IAddNote;

/**
 * Created by Navjacinth Mathew on 6/17/2017.
 */

public class AddNotePresenter {

    private Context context;
    private IAddNote iAddNote;

    public AddNotePresenter(IAddNote iAddNote, Context context) {
        this.iAddNote = iAddNote;
        this.context = context;
    }

}
