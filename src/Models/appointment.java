package Models;

import java.io.Serializable;

public class appointment implements Serializable{
	
//	@Override
//	public String toString() {
//		return "appointment [time=" + time + ", patient=" + patient + ", ap_id=" + ap_id + ", status=" + status + "]";
//	}
	public Timeslots time=new Timeslots();
	public patient patient;
	public int ap_id;
	public boolean status;

}
