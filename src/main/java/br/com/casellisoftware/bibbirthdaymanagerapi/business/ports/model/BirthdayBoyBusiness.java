package br.com.casellisoftware.bibbirthdaymanagerapi.business.ports.model;

import java.time.LocalDate;
import java.util.Objects;

public class BirthdayBoyBusiness {

    private Long id;
    private String name;
    private LocalDate birthday;

    public BirthdayBoyBusiness(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }


    public static final class BirthdayBoyBusinessBuilder {
        private Long id;
        private String name;
        private LocalDate birthday;

        private BirthdayBoyBusinessBuilder() {
        }

        public static BirthdayBoyBusinessBuilder aBirthdayBoyBusiness() {
            return new BirthdayBoyBusinessBuilder();
        }

        public BirthdayBoyBusinessBuilder withId(Long id) {
            this.id = id;
            return this;
        }

        public BirthdayBoyBusinessBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public BirthdayBoyBusinessBuilder withBirthday(LocalDate birthday) {
            this.birthday = birthday;
            return this;
        }

        public BirthdayBoyBusiness build() {
            BirthdayBoyBusiness birthdayBoyBusiness = new BirthdayBoyBusiness();
            birthdayBoyBusiness.setId(id);
            birthdayBoyBusiness.setName(name);
            birthdayBoyBusiness.setBirthday(birthday);
            return birthdayBoyBusiness;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BirthdayBoyBusiness that = (BirthdayBoyBusiness) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
