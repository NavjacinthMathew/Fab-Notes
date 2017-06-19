package navjacinth.mathew.fabnotes.com.fabnotes.presenter;

import android.content.Context;

import java.util.ArrayList;

import navjacinth.mathew.fabnotes.com.fabnotes.adapter.NoteListAdapter;
import navjacinth.mathew.fabnotes.com.fabnotes.model.NoteModel;
import navjacinth.mathew.fabnotes.com.fabnotes.view.interfaces.IAllNote;

/**
 * Created by Navjacinth Mathew on 6/17/2017.
 */

public class AllNotePresenter {

    private IAllNote iAllNote;
    private NoteListAdapter adapter;
    private Context context;

    public AllNotePresenter(IAllNote iAllNote, Context context) {
        this.iAllNote = iAllNote;
        this.context = context;
    }

    public void getAllNoteData() {
        ArrayList<NoteModel> dataList = new ArrayList<>();
        dataList.add(new NoteModel(1, "Title 1", "This is content", "12:00", "20/6/2017"));
        dataList.add(new NoteModel(2, "Title 2", "This is content", "12:00", "20/6/2017"));
        dataList.add(new NoteModel(3, "Title 3", "This is content", "12:00", "20/6/2017"));
        dataList.add(new NoteModel(4, "Title 4", "This is content", "12:00", "20/6/2017"));
        dataList.add(new NoteModel(5, "Title 5", "This is content", "12:00", "20/6/2017"));
        dataList.add(new NoteModel(6, "Title 6", "This is content", "12:00", "20/6/2017"));
        setAllNoteAdapter(dataList);
    }

    public void setAllNoteAdapter(ArrayList<NoteModel> dataList) {
        adapter = new NoteListAdapter(dataList);

        iAllNote.setAdapter(adapter);
    }
}
