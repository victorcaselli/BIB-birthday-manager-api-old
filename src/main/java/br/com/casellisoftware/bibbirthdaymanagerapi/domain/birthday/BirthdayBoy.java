package br.com.casellisoftware.bibbirthdaymanagerapi.domain.birthday;

import java.time.LocalDate;
import java.util.Objects;

public class BirthdayBoy {

    private Long id;
    private String name;
    private LocalDate birthday;


    public BirthdayBoy(){

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


    public static final class BirthdayBoyBuilder {
        private Long id;
        private String name;
        private LocalDate birthday;

        private BirthdayBoyBuilder() {
        }

        public static BirthdayBoyBuilder aBirthdayBoy() {
            return new BirthdayBoyBuilder();
        }

        public BirthdayBoyBuilder withId(Long id) {
            this.id = id;
            return this;
        }

        public BirthdayBoyBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public BirthdayBoyBuilder withBirthday(LocalDate birthday) {
            this.birthday = birthday;
            return this;
        }

        public BirthdayBoy build() {
            BirthdayBoy birthdayBoy = new BirthdayBoy();
            birthdayBoy.setId(id);
            birthdayBoy.setName(name);
            birthdayBoy.setBirthday(birthday);
            return birthdayBoy;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BirthdayBoy that = (BirthdayBoy) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
