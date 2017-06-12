package navjacinth.mathew.fabnotes.com.fabnotes.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import navjacinth.mathew.fabnotes.com.fabnotes.R;
import navjacinth.mathew.fabnotes.com.fabnotes.model.NoteModel;

/**
 * Created by Navjacinth Mathew on 6/11/2017.
 */

public class NoteListAdapter extends RecyclerView.Adapter<NoteListAdapter.NoteViewHolder> {

    private List<NoteModel> dataList;

    public NoteListAdapter(List<NoteModel> dataList) {
        this.dataList = dataList;
    }

    @Override
    public NoteViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View v = layoutInflater.inflate(R.layout.row_view_note, parent, false);
        return new NoteViewHolder(v);
    }

    @Override
    public void onBindViewHolder(NoteViewHolder holder, int position) {
        holder.txtNoteTitle.setText(dataList.get(position).getTitle());
        holder.txtNoteContent.setText(dataList.get(position).getContent());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class NoteViewHolder extends RecyclerView.ViewHolder {

        private TextView txtNoteTitle, txtNoteContent;

        public NoteViewHolder(View itemView) {
            super(itemView);
            txtNoteTitle = (TextView) itemView.findViewById(R.id.txt_note_title);
            txtNoteContent = (TextView) itemView.findViewById(R.id.txt_note_content);
        }
    }
}
