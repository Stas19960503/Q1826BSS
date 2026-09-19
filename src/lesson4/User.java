package lesson4;

public class User {

    private String firstName;
    private String lastName;
    private int age;
    private Gender gender;

    private Address address;

    public static class Address {
        private String country;
        private String city;

        public Address(String country, String city) {
            this.country = country;
            this.city = city;
        }

        public String getCountry() {
            return country;
        }

        public String getCity() {
            return city;
        }

        public String getFullAddress() {
            return country + ", г. " + city;
        }
    }

    public User(String firstName, String lastName, int age, Gender gender, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void increaseAge() {
        this.age++;
    }

    public void printInfo() {
        System.out.println("Имя: " + getFullName());
        System.out.println("Возраст: " + age);
        System.out.println("Пол: " + gender.getRussianName());

        if (address != null) {
            System.out.println("Адрес: " + address.getFullAddress());
        } else {
            System.out.println("Адрес: не указан");
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public Address getAddress() {
        return address;
    }
}
