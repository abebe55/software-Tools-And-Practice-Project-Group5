package TIBEBU;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HospitalPatientRecord {
	List<String> patients = new ArrayList<>();

	public void createPatient(String name) {
	        patients.add(name);
	System.out.println("Patient " + name + " created successfully.");
	    }
	public void readPatients() {
	System.out.println("List of Patients:");
	for (String patient : patients) {
	            System.out.println(patient);
	        }
	    }

	public void updatePatient(String oldName, String newName) {
	if (patients.contains(oldName)) {
	patients.set(patients.indexOf(oldName), newName);
	System.out.println("Patient " + oldName + " updated to " + newName + " successfully.");
	        } else {
	System.out.println("Patient not found.");
	        }
	    }

	  public void deletePatient(String name) {
	 if (patients.contains(name)) {
	            patients.remove(name);
	 System.out.println("Patient " + name + " deleted successfully.");
	        } else {
	System.out.println("Patient not found.");
	        }
	    }

	public static void main(String[] args) {
	HospitalPatientRecord hospital = new HospitalPatientRecord();
	Scanner scanner = new Scanner(System.in);

	        while (true) {
	System.out.println("1. Create Patient");
	System.out.println("2. Read Patients");
	System.out.println("3. Update Patient");
	System.out.println("4. Delete Patient");
	System.out.println("5. Exit");

	System.out.print("Enter your choice: ");
	int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	System.out.print("Enter patient name: ");
	String name = scanner.next();
	hospital.createPatient(name);
	                break;
	                case 2:
	 hospital.readPatients();
	                break;
	                case 3:
	System.out.print("Enter old patient name: ");
	String oldName = scanner.next();
	System.out.print("Enter new patient name: ");
	String newName = scanner.next();
	hospital.updatePatient(oldName, newName);
	                break;
	                case 4:
	System.out.print("Enter patient name to delete: ");
	String deleteName = scanner.next();
	hospital.deletePatient(deleteName);
	                break;
	                case 5:
	System.exit(0);
	                default:
	System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }
	}

