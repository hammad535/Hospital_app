package Models;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class clinic_staff implements Serializable{
	
	public int id;
	public String name;
	public String password;
	
	
	public void add_timeslot(Timetable t,String stime,String etime,String day,String date) {
		Timeslots s = new Timeslots();
		s.id = (int) System.currentTimeMillis();
		s.starttime = stime;
		s.endtime = etime;
		s.date = date;
		s.day = day;
		t.timetable.add(s);
	}
	
	public void remove_timeslot(Timetable t,int id) {
		for(int i=0;i<t.timetable.size();i++)
		{
			if(t.timetable.get(i).id == id)
			{
				t.timetable.remove(i);
				return;
			}
		}
	}
	
	public void confirm_appointment(ArrayList<appointment> ap,int id) {
		for(int i=0;i<ap.size();i++) {
			if(ap.get(i).ap_id == id) {
				ap.get(i).status = true;
				ap.get(i).time.available = false;
			}
		}
		
	}
	
	public void decline_appointment(ArrayList<appointment> ap,int id) {
		for(int i=0;i<ap.size();i++) {
			if(ap.get(i).ap_id == id) {
				ap.get(i).status = false;
				ap.get(i).time.available = true;
			}
		}
	
		
	}
	
	public ArrayList<appointment> trackrecord(ArrayList<patient>p,int id){
		for(int i=0;i<p.size();i++) {
			if(p.get(i).patientid == id) {
				return p.get(i).myapp;
			}
		}
		return null;
	}
	
	public ArrayList<appointment> daily(ArrayList<appointment>p){
		ArrayList<appointment> c = new ArrayList<appointment>();
		LocalDate currentDate = LocalDate.now();
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	    String dateString = currentDate.format(formatter);
		for(int i=0;i<p.size();i++) {
			if(p.get(i).time.date == dateString && p.get(i).time.available == false) {
				c.add(p.get(i));
			}
		}
		return c;
	}

}
