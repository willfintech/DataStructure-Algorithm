package OOD.BuilderPattern;

import java.util.Date;

// Why use UserBuilderPattern

public final class User {
    // required fields
    private final String username;
    private final String password;
    // optional fields
    private final String name;
    private final Date birthDate;
    private final String email;
    private final String phone;

    // the constructor assign all fields from the builder
    private User(UserBuilder userBuilder) {  // use private to keep the instance safe
        this.username = userBuilder.username;
        this.password = userBuilder.password;
        this.name = userBuilder.name;
        this.birthDate = userBuilder.birthDate;
        this.email = userBuilder.email;
        this.phone = userBuilder.phone;
    }

    // How to modify a User Instance and persist it to DB
    public UserBuilder toUserBuilder() {
        return new UserBuilder(this.username, this.password)
                .setName(this.name)
                .setBirthday(this.birthDate)
                .setEmail(this.email)
                .setPhone(this.phone);
    }

    // Builder Pattern, only requires that User class as Immutable, Builder don't need to be Immutable, which can have setter
    // Builder is an inner class since it's 1-1 relationship
    // 1. Only innerclass can be static; 2. Inner Class should be static.
    public static class UserBuilder {
        private String username;
        private String password;
        private String name;
        private Date birthDate;
        private String email;
        private String phone;

        // the Builder constructor only assign values to required fields
        public UserBuilder(String username, String password) {
            this.username = username;
            this.password = password;
        }

        public UserBuilder setPassword(String password) {
            this.password = password;
            return this;
        }

        public UserBuilder setName(String name) {
            this.name = name;
            return this;  // for more convenience to use the Chain method
        }

        public UserBuilder setBirthday(Date birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    public static void main(String[] args) {
        // Test UserBuilder to User
        User user1 = new UserBuilder("willfintech", "xzdw").setName("Wilson").build();
        System.out.println(user1.name);
        System.out.println(user1.email);
        // Test Modification on User
        user1 = user1.toUserBuilder().setPassword("xzdw520").setName("Will").build();
        System.out.println(user1.password);
        System.out.println(user1.name);
    }
}
