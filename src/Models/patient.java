package Models;

import java.io.Serializable;
import java.util.ArrayList;

public class patient implements Serializable{
	
	public int patientid;
	public String name;
	public int age;
	public String gender;
	public String email;
	public String password;
	public ArrayList <appointment> myapp = new ArrayList<appointment>();
	
	
	public ArrayList<Timeslots> viewavailableslots(Timetable t){
		ArrayList<Timeslots> s = new ArrayList<Timeslots>();
		for(int i=0;i<t.timetable.size();i++) {
			if(t.timetable.get(i).available == true) {
				s.add(t.timetable.get(i));
			}
		}
		return s;
	}
	
	public ArrayList <appointment> trackrecord(){
		return myapp;
	}
	
	public appointment  makeappointment(ArrayList<appointment> ap,String date,String day,String stime,String etime) {
		
		appointment p = new appointment();
		p.ap_id = (int) System.currentTimeMillis();
		System.currentTimeMillis();
		p.patient = this;
		p.status = false;
		p.time.available = true;
		p.time.date = date;
		p.time.day =day;
		p.time.starttime = stime;
		p.time.endtime = etime;
		
		myapp.add(p);
		ap.add(p);
		
		return p;
	}
	
	public void cancelappointment(int id,ArrayList<appointment>ap) {
		for(int i=0;i<ap.size();i++) {
			if(ap.get(i).ap_id==id) {
				ap.remove(i);
			}
		}
		for(int i=0;i<myapp.size();i++) {
			if(myapp.get(i).ap_id==id) {
				myapp.remove(i);
			}
		}
	}
	
	
	

}
