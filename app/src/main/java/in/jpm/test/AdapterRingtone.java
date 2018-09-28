package in.jpm.test;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class AdapterRingtone extends RecyclerView.Adapter<AdapterRingtone.MyViewHolder> implements View.OnClickListener {
    private List<ModelRingtone> items;
    private Context context;

    public AdapterRingtone(Context context, List<ModelRingtone> items) {
        this.items = items;
        this.context = context;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
//        holder.mTextView.setText(items.get(position));
        ModelRingtone m = items.get(position);
        holder.textViewTitle.setText(m.getName());


        CustomOnClick onClick = new CustomOnClick(m);

        holder.imageViewPlay.setOnClickListener(onClick);
        holder.imageViewContact.setOnClickListener(onClick);
        holder.imageViewAlarm.setOnClickListener(onClick);
        holder.imageViewNotification.setOnClickListener(onClick);
        holder.imageViewPhone.setOnClickListener(onClick);


        holder.imageViewPlay.setImageResource(m.isPlayChecked() ? R.mipmap.pause : R.mipmap.play);
        holder.imageViewContact.setImageResource(m.isContactChecked() ? R.mipmap.contact_press : R.mipmap.contact);
        holder.imageViewAlarm.setImageResource(m.isAlarmChecked() ? R.mipmap.watch_press : R.mipmap.watch);
        holder.imageViewNotification.setImageResource(m.isNotificationChecked() ? R.mipmap.notification_press : R.mipmap.notification_normal);
        holder.imageViewPhone.setImageResource(m.isPhoneChecked() ? R.mipmap.phone_pressed : R.mipmap.phone);

    }

    @Override
    public AdapterRingtone.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rowitem_ringtones, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onClick(View view) {

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    private void showToast(String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView textViewTitle;
        public ImageView imageViewPlay;
        public ImageView imageViewContact;
        public ImageView imageViewAlarm;
        public ImageView imageViewNotification;
        public ImageView imageViewPhone;
        private View v;

        public MyViewHolder(View v) {
            super(v);
            this.v = v;
            textViewTitle = (TextView) v.findViewById(R.id.textView_title);
            imageViewPlay = (ImageView) v.findViewById(R.id.imgView_play);
            imageViewContact = (ImageView) v.findViewById(R.id.imgView_contact);
            imageViewAlarm = (ImageView) v.findViewById(R.id.imgView_alarm);
            imageViewNotification = (ImageView) v.findViewById(R.id.imgView_notification);
            imageViewPhone = (ImageView) v.findViewById(R.id.imgView_phone);
        }


    }

    private class CustomOnClick implements View.OnClickListener {

        private ModelRingtone modelRingtone;

        public CustomOnClick(ModelRingtone modelRingtone) {
            this.modelRingtone = modelRingtone;
        }

        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.imgView_play:
                    modelRingtone.setPlayChecked(!modelRingtone.isPlayChecked());
                    break;
                case R.id.imgView_contact:
                    modelRingtone.setContactChecked(!modelRingtone.isContactChecked());
                    break;
                case R.id.imgView_alarm:
                    modelRingtone.setAlarmChecked(!modelRingtone.isAlarmChecked());
                    break;
                case R.id.imgView_notification:
                    modelRingtone.setNotificationChecked(!modelRingtone.isNotificationChecked());
                    break;
                case R.id.imgView_phone:
                    modelRingtone.setPhoneChecked(!modelRingtone.isPhoneChecked());
                    break;
            }
            notifyDataSetChanged();
        }
    }




}
