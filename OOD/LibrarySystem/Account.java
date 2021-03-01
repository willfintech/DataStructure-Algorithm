package OOD.LibrarySystem;

// 用Builder Pattern

import OOD.BuilderPattern.User;

import java.util.Date;

public class Account {
    private final String username;
    private final String password;
    private final String name;
    private final String phone;
    private final String email;
    private final Address address;

    protected Account(AccountBuilder accountBuilder)  {
        this.username = accountBuilder.username;
        this.password = accountBuilder.password;
        this.name = accountBuilder.name;
        this.phone = accountBuilder.phone;
        this.email = accountBuilder.email;
        this.address = accountBuilder.address;
    }

    public AccountBuilder toAccountBuilder() {
        return new AccountBuilder(this.username, this.password)
                .setName(this.name)
                .setPhone(this.phone)
                .setEmail(this.email)
                .setAddress(this.address);
    }

    public static class AccountBuilder {
        private String username;
        private String password;
        private String name;
        private String phone;
        private String email;
        private Address address;

        public AccountBuilder(String username, String password) {
            this.username = username;
            this.password = password;
        }

        public AccountBuilder setPassword(String password) {
            this.password = password;
            return this;
        }

        public AccountBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public AccountBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public AccountBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public AccountBuilder setAddress(Address address) {
            this.address = address;
            return this;
        }

        public Account build() {
            return new Account(this);
        }
    }
}