package in.jpm.test;

public class ModelRingtone {

    private boolean play_checked; // play-pause
    private String name;
    private boolean contact_checked; // contact-checked or not
    private boolean alarm_checked; // alarm-checked or not
    private boolean notification_checked; // notfication-checked or not
    private boolean phone_checked; // notfication-checked or not

    public ModelRingtone(String name) {
        this.name = name;
    }

    public boolean isPlayChecked() {
        return play_checked;
    }

    public void setPlayChecked(boolean play_checked) {
        this.play_checked = play_checked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isContactChecked() {
        return contact_checked;
    }

    public void setContactChecked(boolean contact_checked) {
        this.contact_checked = contact_checked;
    }

    public boolean isAlarmChecked() {
        return alarm_checked;
    }

    public void setAlarmChecked(boolean alarm_checked) {
        this.alarm_checked = alarm_checked;
    }

    public boolean isNotificationChecked() {
        return notification_checked;
    }

    public void setNotificationChecked(boolean notification_checked) {
        this.notification_checked = notification_checked;
    }

    public boolean isPhoneChecked() {
        return phone_checked;
    }

    public void setPhoneChecked(boolean phone_checked) {
        this.phone_checked = phone_checked;
    }
}
