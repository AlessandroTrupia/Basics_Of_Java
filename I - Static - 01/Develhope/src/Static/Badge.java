package Static;

public class Badge {
    private static int totalNumberOfEmployees = 0;
    private String badgeIdCode;
    public Employee employee;

    private static void keepTrackOfEmployeesNumber(){
        ++totalNumberOfEmployees;
    }

    public Badge(Employee employeeThatNeedsBadge, String badgeIdCode ) {
        keepTrackOfEmployeesNumber();
        this.employee = employeeThatNeedsBadge;
        this.badgeIdCode = generateBadgeIdCode();
    }


    private String generateBadgeIdCode() {
        String prefix = "XYZ";
        String suffix = "ZYX";
        return prefix + employee.name + employee.surname + suffix;
    }

    public void showBadgeDetails() {
        System.out.println("Total number of employees: " + totalNumberOfEmployees);
        System.out.println("Employee details: \n" + employee.getEmployeeDetails());
        System.out.println("Badge ID code: " + badgeIdCode);
    }

}
