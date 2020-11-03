package day12;
import java.time.LocalDate;
import java.time.Period;
public class AgeUD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate tdy=LocalDate.now();
		LocalDate bdy=LocalDate.of(1998, 05, 30);
		Period p=Period.between(bdy,tdy);
		System.out.println("Age is : "+p.getYears());
	}

}
