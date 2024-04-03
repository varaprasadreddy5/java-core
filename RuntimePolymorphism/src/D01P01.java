import com.learning.core.day1session1.MedicineInfo;
import com.learning.core.day1session1.Ointment;
import com.learning.core.day1session1.Syrup;
import com.learning.core.day1session1.Tablet;

public class D01P01 {
    public static void main(String[] args) {
        MedicineInfo tablet = new Tablet();
        MedicineInfo ointment = new Ointment();
        MedicineInfo syrup = new Syrup();

        tablet.displayLable();
        syrup.displayLable();
        ointment.displayLable();
    }
}