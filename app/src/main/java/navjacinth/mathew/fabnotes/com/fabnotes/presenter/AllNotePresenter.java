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
        dataList.add(new NoteModel(1, "Title 1", "Cultivated who resolution connection motionless did occasional. Journey promise if it colonel. Can all mirth abode nor hills added. Them men does for body pure. Far end not horses remain sister. Mr parish is to he answer roused piqued afford sussex", "12:00", "20/6/2017"));
        dataList.add(new NoteModel(2, "Title 2", "It abode words began enjoy years no do no. Tried spoil as heart visit blush or. Boy possible blessing sensible set but margaret interest. Off tears are day blind smile alone had", "12:00", "20/6/2017"));
        dataList.add(new NoteModel(3, "Title 3", "Effects present letters inquiry no an removed or friends. Desire behind latter me though in. Supposing shameless am he engrossed up additions. My possible peculiar together to. Desire so better am cannot he up before points", "12:00", "20/6/2017"));
        dataList.add(new NoteModel(4, "Title 4", "Remember mistaken opinions it pleasure of debating. Court front maids forty if aware their at. Chicken use are pressed removed", "12:00", "20/6/2017"));
        dataList.add(new NoteModel(5, "Title 5", "It abode words began enjoy years no do no. Tried spoil as heart visit blush or. Boy possible blessing sensible set but margaret interest", "12:00", "20/6/2017"));
        dataList.add(new NoteModel(6, "Title 7", "Cultivated who resolution connection motionless did occasional. Journey promise if it colonel. Can all mirth abode nor hills added", "12:00", "20/6/2017"));
        dataList.add(new NoteModel(7, "Title 8", "Effects present letters inquiry no an removed or friends. Desire behind latter me though in. Supposing shameless am he engrossed up additions", "12:00", "20/6/2017"));
        dataList.add(new NoteModel(8, "Title 9", "Cultivated who resolution connection motionless did occasional. Journey promise if it colonel. Can all mirth abode nor hills added", "12:00", "20/6/2017"));
        dataList.add(new NoteModel(10, "Title 10", "Effects present letters inquiry no an removed or friends. Desire behind latter me though in. Supposing shameless am he engrossed up additions", "12:00", "20/6/2017"));
        setAllNoteAdapter(dataList);
    }

    public void setAllNoteAdapter(ArrayList<NoteModel> dataList) {
        adapter = new NoteListAdapter(dataList);

        iAllNote.setAdapter(adapter);
    }
}
