import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
/**
 * The MedicalRecordAdapterClass adapts a HealthRecord into a medical record
 * so that it can be stored in the same format as a medical record.
 */

public class MedicalRecordAdapter implements MedicalRecord {
    private HealthRecord record;

    /**
     * The MedicalRecordAdapter constructor creates a MedicalRecordAdapter
     * object that will convert a HealthRecord to a MedicalRecord.
     * @param record The HealthRecord to be converted to a MedicalRecord
     */
    public MedicalRecordAdapter(HealthRecord record) {
        this.record = record;
    }

    /**
     * The getFirstName method returns the first name of the patient.
     * @return The first name of the patient
     */
    public String getFirstName() {
        return record.getName().substring(0, record.getName().indexOf(" "));
    }

    /**
     * The getLastName method returns the last name of the patient.
     * @return The last name of the patient
     */
    public String getLastName() {
        return record.getName().substring(record.getName().indexOf(" ") + 1);
    }

    /**
     * The getBirthday method returns the patient's birthday.
     * @return A Date containing the patient's birthday
     */
    public Date getBirthday() {
        return record.getBirthdate();
    }

    /**
     * The getGender method returns the patient's gender.
     * @return The patient's gender
     */
    public Gender getGender() {
        if (record.getGender().equals("Male")) {
            return Gender.MALE;
        }
        return Gender.FEMALE;
    }

    /**
     * The addVisit method adds a visit to the patient's health record.
     * @param date The date of the visit
     * @param well True if the visit was a well visit, false otherwise
     * @param description The description of the visit
     */
    public void addVisit (Date date, boolean well, String description) {
        record.addHistory(date, well, description);
    }

    /**
     * The getVisitHistory method returns a list of all the visits documented
     * in the health record.
     * @return A list of all the visits documented in the pateint's health
     * record
     */
    public ArrayList<Visit> getVisitHistory() {
        ArrayList<String> history = record.getHistory();
        ArrayList<Visit> visits = new ArrayList<Visit>();
        for (String visit: history) {
            String dateSubstring = visit.substring(visit.indexOf("Visit:"));
            int dateStartIndex = 11;
            Integer day = Integer.parseInt(dateSubstring.substring(dateStartIndex, dateSubstring.indexOf(", ")));
            dateSubstring = dateSubstring.substring(dateSubstring.indexOf(",") + 1);
            Integer month = Integer.parseInt(dateSubstring.substring(1, dateSubstring.indexOf(",")));
            dateSubstring = dateSubstring.substring(dateSubstring.indexOf(",") + 1);
            Integer year = Integer.parseInt(dateSubstring.substring(1, dateSubstring.indexOf("\n")));
            Calendar myCalendar = new GregorianCalendar(year, month - 1, day);
            Date date = myCalendar.getTime();
            boolean well = false;
            if (dateSubstring.substring(dateSubstring.indexOf("Well visit:")).contains("true")) {
                well = true;
            }
            visits.add(new Visit(date, well, dateSubstring.substring(dateSubstring.indexOf("Comments:") + 10)));
        }
        return visits;
    }

    /**
     * The toString method converts the HealthRecord into a String format that
     * matches the format of a MedicalRecord.
     */
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        String ret = "***** " + record.getName() + " *****\n";
        ret += "Birthday: " + sdf.format(record.getBirthdate()) + "\n";
        ret += "Gender: " + record.getGender() + "\n";
        ret += "Medical Visit History:\n";
        ArrayList<Visit> visits = this.getVisitHistory();
        for (Visit visit: visits) {
            ret += visit.toString();
        }
        return ret;
    }
}
