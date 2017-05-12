package hackersrank.thirtydaysofcode.DatFourClassAndInstance;

/**
 * Created by root on 12/5/17.
 */
public class Person {
    private int age;

    public Person(int initialAge) {
        if(initialAge<0){
            age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }else {
            age = initialAge;
        }

        // Add some more code to run some checks on initialAge
    }

    public void amIOld() {
        // Write code determining if this person's age is old and print the correct statement:
        String ageStatus;
        if(age<13){
            ageStatus = "You are young.";
        }else if(age>=13 && age <18){
            ageStatus = "You are a teenager.";
        }else {
            ageStatus = "You are old.";
        }
        System.out.println(ageStatus);
    }

    public void yearPasses() {
        // Increment this person's age.
        age++;
    }
}
