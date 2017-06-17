package navjacinth.mathew.fabnotes.com.fabnotes.view.interfaces;

import android.view.View;

import navjacinth.mathew.fabnotes.com.fabnotes.adapter.NoteListAdapter;

/**
 * Created by Navjacinth Mathew on 6/17/2017.
 */

public interface IAllNote {

    void initialiseViews(View view);

    void setUpToolbar(View toolbarView);

    void initialisePresenter();

    void setAdapter(NoteListAdapter adapter);
}
