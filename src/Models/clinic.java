package Models;

import java.awt.datatransfer.SystemFlavorMap;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class clinic {
	
	public ArrayList<patient> patients = new ArrayList<patient>();
	public ArrayList<appointment> appointments = new ArrayList<appointment>();
	public ArrayList<clinic_staff> staff = new ArrayList<clinic_staff>();
	public Timetable time = new Timetable();
	public patient patient=new patient();
	public clinic_staff cs=new clinic_staff();
	
	
	public void create_patient(String name, int age, String gender, String email, String pass) {
		patient p = new patient();
		p.name = name;
		p.age = age;
		p.email = email;
		p.password = pass;
		p.patientid = (int) System.currentTimeMillis();
		patients.add(p);
	}
	
	public boolean login_patient(String email,String pass) {
		for (int i=0;i<patients.size();i++) {
			if(patients.get(i).email.equals(email) && patients.get(i).password.equals(pass)) {
				patient = patients.get(i);
				return true;
			}
		}
		return false;
	}
	
	public void create_staff(String name,String password) {
		clinic_staff c = new clinic_staff();
		c.id = (int) System.currentTimeMillis();
		c.name = name;
		c.password = password;
		staff.add(c);
	}
	
	public boolean login_staff(String username, String pass) {
		for (int i=0; i<staff.size();i++) {
			if(staff.get(i).name.equals(username) && staff.get(i).password.equals(pass)) {
				cs = staff.get(i);
				return true;
			}
		}
		return false;
	}
	
	public void write() {
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("output.txt"))) {
            out.writeObject(patients);
        } catch (IOException e) {
            e.printStackTrace();
        }
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("output2.txt"))) {
            out.writeObject(staff);
        } catch (IOException e) {
            e.printStackTrace();
        }
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("output3.txt"))) {
            out.writeObject(appointments);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	public void read() {
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("output.txt"))) {
            ArrayList<patient> readList = (ArrayList<patient>) in.readObject();
            patients = readList;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("output2.txt"))) {
            ArrayList<clinic_staff> readList = (ArrayList<clinic_staff>) in.readObject();
            staff = readList;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("output3.txt"))) {
            ArrayList<appointment> readList = (ArrayList<appointment>) in.readObject();
            appointments = readList;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
	}
	
//	public static void main(String[] args) {
//		 clinic c = new clinic();
////		 c.read();
////		 System.out.println(c.patients.get(0).age);
//		 c.create_patient("Harry", 22, "male", "harry12@gmail.com", "harry12");
//		 c.create_patient("Haris", 33, "male", "haris12@gmail.com", "haris12");
//		 c.create_patient("Haroon", 51, "male", "haroon12@gmail.com", "haroon12");
//		 c.create_patient("Khadija", 23, "female", "khadija12@gmail.com", "khadija12");
//		 c.create_patient("Ayesha", 27, "female", "ayesha12@gmail.com", "ayesha12");
//		 c.create_staff("Roy", "roy12");
//		 c.create_staff("Andy", "andy12");
//		 c.create_staff("Aina", "aina12");
//		 c.write();
//		 
//	}
		

}
