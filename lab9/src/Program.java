public class Program {
    public static void main(String[] args) {
        Department university = new Department("Университет");

        Department UMU = new Department("M");
        university.addChildDepartment(UMU);

        Department trainingDepartment = new Department("Учебный отдел");
        UMU.addChildDepartment(trainingDepartment);

        trainingDepartment.addChildDepartment(new Employee("Пупкин", 111));
        trainingDepartment.addChildDepartment(new Employee("Шевляков", 222));
        trainingDepartment.addChildDepartment(new Employee("Алпатов", 333));

        Department OpDepartment = new Department("Отдел по работе с ОП");
        UMU.addChildDepartment(OpDepartment);

        OpDepartment.addChildDepartment(new Employee("Сергеев", 444));
        OpDepartment.addChildDepartment(new Employee("Федосеев", 555));


        Department PFU = new Department("Ф");
        university.addChildDepartment(PFU);
        PFU.addChildDepartment(new Employee("Горных", 666));
        PFU.addChildDepartment(new Employee("Зураб", 777));

        Department accountancy = new Department("Бухгалтерия");

        PFU.addChildDepartment(accountancy);
        accountancy.addChildDepartment(new Employee("Ахмед", 888));
        accountancy.addChildDepartment(new Employee("Мед", 999));

        Department OK = new Department("П");
        university.addChildDepartment(OK);
        OK.addChildDepartment(new Employee("Касов", 1111));
        OK.addChildDepartment(new Employee("Плотников", 2222));
        OK.addChildDepartment(new Employee("Иванов", 3333));

        System.out.println(university.getPayslip()); // 11661

        System.out.println(UMU.getPayslip()); // 1665

        university.salaryIncrease(1000);

        System.out.println(university.getPayslip()); // 23661

        university.getInformation();
    }
}
