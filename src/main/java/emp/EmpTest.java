package emp;

import java.util.List;

public class EmpTest {
 public static void main(String[] args) {
	Employess emp = new Employess();
	List<EmpDTO> aList = emp.selectMethod();
	for(EmpDTO dto : aList) {
		System.out.printf("%d %s %d %s \n",
				dto.getEmployee_id(), dto.getFirst_name(),
				dto.getSalary(), dto.getHire_date() );
	}
 }
}
