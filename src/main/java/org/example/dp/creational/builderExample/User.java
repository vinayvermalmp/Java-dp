package org.example.dp.creational.builderExample;

class User {

    private final String name;
    private final int age;
    private final String email;
    private final String address;
    private final String phoneNumber;

    private User(UserBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
        this.address = builder.address;
        this.phoneNumber = builder.phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static class UserBuilder {
        private final String name;
        private final int age;
        private String email;
        private String address;
        private String phoneNumber;

        public UserBuilder(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public UserBuilder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    public static void main(String[] args) {
        User user = new User.UserBuilder("John Doe", 30)
                .email("john.doe@example.com")
                .address("123 Main St.")
                .phoneNumber("555-555-5555")
                .build();
    }
}
/*
*In the above code, the User class has a private constructor that takes an instance of the UserBuilder as a parameter. The UserBuilder class has methods to set the optional properties (email, address, and phone number) of the User class and a build method that returns an instance of the User class. The UserBuilder class also has a constructor that takes the required properties (name and age) of the User class.

By using the builder design pattern, you can create instances of the User class in a more readable and flexible manner. For example:


* */
