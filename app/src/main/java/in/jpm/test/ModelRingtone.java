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

    public boolean isPlay_checked() {
        return play_checked;
    }

    public void setPlay_checked(boolean play_checked) {
        this.play_checked = play_checked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isContact_checked() {
        return contact_checked;
    }

    public void setContact_checked(boolean contact_checked) {
        this.contact_checked = contact_checked;
    }

    public boolean isAlarm_checked() {
        return alarm_checked;
    }

    public void setAlarm_checked(boolean alarm_checked) {
        this.alarm_checked = alarm_checked;
    }

    public boolean isNotification_checked() {
        return notification_checked;
    }

    public void setNotification_checked(boolean notification_checked) {
        this.notification_checked = notification_checked;
    }

    public boolean isPhone_checked() {
        return phone_checked;
    }

    public void setPhone_checked(boolean phone_checked) {
        this.phone_checked = phone_checked;
    }
}
