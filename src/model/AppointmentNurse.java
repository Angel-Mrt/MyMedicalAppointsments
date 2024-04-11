package model;

import java.util.Date;

public class AppointmentNurse implements ISchedulable {

    private int id;
    private Patient patiente;
    private Nurse nurse;
    private Date date;
    private String time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Patient getPatiente() {
        return patiente;
    }

    public void setPatiente(Patient patiente) {
        this.patiente = patiente;
    }

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public void schedulable(Date date, String time) {

    }
}
