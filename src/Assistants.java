
import java.util.*;

public class Assistants {

    private int age;
    private Sex sex;
    private MaritalStatus mrStatus;

    public Assistants(int age, boolean sex, MaritalStatus mrStatus) {
        this.age = age;
        if (sex) {
            this.sex = Sex.MALE;
        } else {
            this.sex = Sex.FEMALE;
        }
        this.mrStatus = mrStatus;
    }

    public Map totalSex(List<Assistants> assistants) {
        HashMap<Sex, Integer> hTotalSex = new HashMap<>();
        for (Assistants ass : assistants) {
            if (hTotalSex.containsKey(ass.sex)) {
                hTotalSex.put(ass.sex, hTotalSex.get(ass.sex) + 1);
            } else {
                hTotalSex.put(ass.sex, 1);
            }
        }
        return hTotalSex;
    }

    public Map totalMrStatus(List<Assistants> assistants) {
        HashMap<MaritalStatus, Integer> hTotalStatus = new HashMap<>();
        for (Assistants ass : assistants) {
            if (hTotalStatus.containsKey(ass.mrStatus)) {
                hTotalStatus.put(ass.mrStatus, hTotalStatus.get(ass.mrStatus) + 1);
            } else {
                hTotalStatus.put(ass.mrStatus, 1);
            }
        }
        return hTotalStatus;
    }

    public int[] totalAge(List<Assistants> assistants) {
        int[] vTotalAge = new int[2];
        for (Assistants ass : assistants) {
            if (ass.age >= 18) {
                vTotalAge[0]++;
            } else {
                vTotalAge[1]++;
            }
        }
        return vTotalAge;
    }
    /*
    @Override
    public String toString() {
        return "Total assitants: " + assistants.size() + "\n"
                + "Total Males: " + totalSex().get(Sex.MALE) + "\n"
                + "Total Females: " + totalSex().get(Sex.FEMALE) + "\n"
                + "Total Single: " + totalMrStatus().get(MaritalStatus.SINGLE) + "\n"
                + "Total Married: " + totalMrStatus().get(MaritalStatus.MARRIED) + "\n"
                + "Total Widow: " + totalMrStatus().get(MaritalStatus.WIDOW) + "\n"
                + "Total Divorced: " + totalMrStatus().get(MaritalStatus.DIVORCED);
    }
     */
}
