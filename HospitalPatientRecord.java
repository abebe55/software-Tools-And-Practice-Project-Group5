package toolsAssignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HospitalPatientRecord {

    private Map<Integer, String> patientRecords;

    public HospitalPatientRecord() {
        patientRecords = new HashMap<>();
    }

    public void createPatientRecord(int patientId, String patientName) {
        patientRecords.put(patientId, patientName);
    }

    public String readPatientRecord(int patientId) {
        return patientRecords.get(patientId);
    }

    public void updatePatientRecord(int patientId, String newPatientName) {
        if (patientRecords.containsKey(patientId)) {
            patientRecords.put(patientId, newPatientName);
        } else {
            System.out.println("Patient record not found for id: " + patientId);
        }
    }

    public void deletePatientRecord(int patientId) {
        if (patientRecords.containsKey(patientId)) {
            patientRecords.remove(patientId);
        } else {
            System.out.println("Patient record not found for id: " + patientId);
        }
    }

    public static void main(String[] args) {
        HospitalPatientRecord hospitalPatientRecord = new HospitalPatientRecord();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Create Patient Record");
            System.out.println("2. Read Patient Record");
            System.out.println("3. Update Patient Record");
            System.out.println("4. Delete Patient Record");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Patient ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter Patient Name: ");
                    scanner.nextLine(); // Consume the newline character
                    String name = scanner.nextLine();
                    hospitalPatientRecord.createPatientRecord(id, name);
                    break;
                case 2:
                    System.out.print("Enter Patient ID to read: ");
                    int readId = scanner.nextInt();
                    String patientName = hospitalPatientRecord.readPatientRecord(readId);
                    if (patientName != null) {
                        System.out.println("Patient Name: " + patientName);
                    } else {
                        System.out.println("Patient record not found for id: " + readId);
                    }
                    break;
                case 3:
                    System.out.print("Enter Patient ID to update: ");
                    int updateId = scanner.nextInt();
                    System.out.print("Enter New Patient Name: ");
                    scanner.nextLine(); // Consume the newline character
                    String newName = scanner.nextLine();
                    hospitalPatientRecord.updatePatientRecord(updateId, newName);
                    break;
                case 4:
                    System.out.print("Enter Patient ID to delete: ");
                    int deleteId = scanner.nextInt();
                    hospitalPatientRecord.deletePatientRecord(deleteId);
                    break;
                case 5:
                    System.out.println("Exiting application...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

