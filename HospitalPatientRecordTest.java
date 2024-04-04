package TIBEBUTrue;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class HospitalPatientRecordTest {

    @Test
    public void testCreatePatient() {
        HospitalPatientRecord hospital = new HospitalPatientRecord();
        hospital.createPatient("Alex");
        
        assertEquals(1, hospital.patients.size());
    }

    @Test
    public void testUpdatePatient() {
        HospitalPatientRecord hospital = new HospitalPatientRecord();
        hospital.createPatient("Bub");
        hospital.updatePatient("Bub", "Baba");
        assertEquals("Baba", hospital.patients.get(0));
    }

    @Test
    public void testDeletePatient() {
        HospitalPatientRecord hospital = new HospitalPatientRecord();
        hospital.createPatient("Chala");
        hospital.deletePatient("Chala");
        assertEquals(0, hospital.patients.size());
    }
}
