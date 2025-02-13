package model;

import java.util.Date;

public class AppointmentDoctor implements ISchedulable {
    private int id;
    private Patient patiente;
    private Doctor doctor;
    private Date date;
    private String time;

    public AppointmentDoctor(Patient patient, Doctor doctor){
        this.doctor = doctor;
        this.patiente= patient;
    }

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

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time + "hrs.";
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public void schedulable(Date date, String time) {
        this.date = date;
        this.time = time;
    }
}
