package adapter;

public class AdapterMain {

	public static void main(String[] args) {
		
		EmployeeInfo emp1 = new EmployeeInfo();
		emp1.setFirstName("Abhra");
		emp1.setSurname("Poddar");
		emp1.setCity("Chinsurah");
		emp1.setHouseNo("23B");
		emp1.setStreet("R.K.Street");
		emp1.setPin(712101L);
		
		UpdatedEmployeeInfo updEmp1 = new UpdatedEmployeeInfo();
		updEmp1.setFirstName("Abhra");
		updEmp1.setSurname("Poddar");
		updEmp1.setAddress(AddressAdpter.toAddress(emp1.getHouseNo(), emp1.getStreet(),
				emp1.getCity(), emp1.getPin()));
		
		System.out.println(updEmp1.toString());

	}

}
