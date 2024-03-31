package toolsAssignment;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HospitalPatientRecordTest {

    @Test
    public void testCreatePatientRecord() {
        HospitalPatientRecord hospitalPatientRecord = new HospitalPatientRecord();
        

hospitalPatientRecord.createPatientRecord(1, "Alice");
        assertEquals("Alice", hospitalPatientRecord.readPatientRecord(1));
    }

    @Test
    public void testUpdatePatientRecord() {
        HospitalPatientRecord hospitalPatientRecord = new HospitalPatientRecord();
        hospitalPatientRecord.createPatientRecord(2, "Bob");
        hospitalPatientRecord.updatePatientRecord(2, "Charlie");
        assertEquals("Charlie", hospitalPatientRecord.readPatientRecord(2));
    }

    @Test
    public void testDeletePatientRecord() {
        HospitalPatientRecord hospitalPatientRecord = new HospitalPatientRecord();
        hospitalPatientRecord.createPatientRecord(3, "David");
        hospitalPatientRecord.deletePatientRecord(3);
        assertNull(hospitalPatientRecord.readPatientRecord(3));
    }
}

