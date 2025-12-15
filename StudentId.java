package year;

public class StudentId {
	int id;
    String firstName;
    String lastName;
    double fees;

    
    StudentId(int id, String firstName, String lastName, double fees) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fees = fees;
    }

    String getName() {
        return firstName + " " + lastName;
    }

    double getFees() {
        return fees;
    }
	public static void main(String[] args) {
		 StudentId s1 = new StudentId(1, "Akash", "Naik", 15000.50);
		 StudentId s2 = new StudentId(2, "Prajna", "Naik", 17000.75);
		 StudentId s3 = new StudentId(3, "Bharath", "Naik", 20000.00);
	       
	        System.out.println("ID: " + s1.id + " | Name: " + s1.getName() + " | Fees: " + s1.getFees());
	        System.out.println("ID: " + s2.id + " | Name: " + s2.getName() + " | Fees: " + s2.getFees());
	        System.out.println("ID: " + s3.id + " | Name: " + s3.getName() + " | Fees: " + s3.getFees());
	    }
	}
