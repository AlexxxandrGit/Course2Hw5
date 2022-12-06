public abstract class Driver {
    private String fullName;
    private String driverLicense;
    private int experience;

    public Driver(String fullName, String driverLicense, int experience) {
        if (fullName == null || fullName.isEmpty() || fullName.isBlank()) {
            this.fullName = "Введите корректные данные";
        } else {

            this.fullName = fullName;
        }

        this.experience = experience;

        setDriverLicense(driverLicense);
    }

    abstract String startMoving();


    abstract String stay();


    abstract String refuel();


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        if (driverLicense == null||driverLicense.isEmpty()||driverLicense.isBlank()) {
            try {
                throw new IllegalAccessException("Необходимо указать категорию прав");
            } catch (IllegalAccessException e) {
                throw new RuntimeException();
            }
        }

        this.driverLicense = driverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}



