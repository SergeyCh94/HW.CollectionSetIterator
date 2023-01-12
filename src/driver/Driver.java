package driver;

import java.util.Objects;

public class Driver {
    private final String fio;
    private int experience;

    private DriverLicense driverLicense;

    public enum DriverLicense {
        B, C, D
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return fio.equals(driver.fio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fio);
    }

    @Override
    public String toString() {
        return "Водитель " + fio + ", Водительское удостоверение " + driverLicense;
    }

    public Driver (String fio, DriverLicense driverLicense) {
        if (fio == null || fio.isEmpty() || fio.isBlank()){
            this.fio = "default";
        } else {
            this.fio = fio;
        }

        this.driverLicense = driverLicense;
    }

    public void setDriverLicense(DriverLicense driverLicense) {
        this.driverLicense = driverLicense;
    }

    public DriverLicense getDriverLicense() {
        return driverLicense;
    }

    public String getFio() {
        return fio;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
