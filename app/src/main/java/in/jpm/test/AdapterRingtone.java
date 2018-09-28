package in.jpm.test;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterRingtone extends RecyclerView.Adapter<AdapterRingtone.MyViewHolder> {
    private List<ModelRingtone> items;

    public AdapterRingtone(List<ModelRingtone> items) {
        this.items = items;
    }

    @Override
    public AdapterRingtone.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rowitem_ringtones, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
//        holder.mTextView.setText(items.get(position));
        ModelRingtone m = items.get(position);
        holder.textViewTitle.setText(m.getName());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView textViewTitle;
        public ImageView imageViewPlay;
        public ImageView imageViewContact;
        public ImageView imageViewAlarm;
        public ImageView imageViewNotification;
        public ImageView imageViewPhone;

        public MyViewHolder(View v) {
            super(v);
            textViewTitle = (TextView) v.findViewById(R.id.textView_title);
            imageViewPlay = (ImageView) v.findViewById(R.id.imgView_play);
            imageViewContact = (ImageView) v.findViewById(R.id.imgView_contact);
            imageViewAlarm = (ImageView) v.findViewById(R.id.imgView_alarm);
            imageViewNotification = (ImageView) v.findViewById(R.id.imgView_notification);
            imageViewPhone = (ImageView) v.findViewById(R.id.imgView_phone);
        }
    }

}
