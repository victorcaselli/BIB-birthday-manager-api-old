package br.com.casellisoftware.bibbirthdaymanagerapi.domain.birthday;

import br.com.casellisoftware.bibbirthdaymanagerapi.domain.enums.InterestType;

import java.time.LocalDate;
import java.util.Objects;

public class BirthdayBoy {

    private Long id;
    private String name;
    private LocalDate birthday;
    private int monthOfYear;
    private int dayOfMonth;
    private int interestType;
    private String job;
    private String email;
    private String phone;


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

    public int getMonthOfYear() {
        return monthOfYear;
    }

    public void setMonthOfYear(int monthOfYear) {
        this.monthOfYear = monthOfYear;
    }

    public int getDayOfMonth() {
        return dayOfMonth;
    }

    public void setDayOfMonth(int dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    public int getInterestType() {
        return InterestType.toEnum(interestType).getCode();
    }

    public void setInterestType(int interestType) {
        this.interestType = InterestType.toEnum(interestType).getCode();
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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


    public static final class BirthdayBoyBuilder {
        private Long id;
        private String name;
        private LocalDate birthday;
        private int monthOfYear;
        private int dayOfMonth;
        private int interestType;
        private String job;
        private String email;
        private String phone;

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

        public BirthdayBoyBuilder withMonthOfYear(int monthOfYear) {
            this.monthOfYear = monthOfYear;
            return this;
        }

        public BirthdayBoyBuilder withDayOfMonth(int dayOfMonth) {
            this.dayOfMonth = dayOfMonth;
            return this;
        }

        public BirthdayBoyBuilder withInterestType(int interestType) {
            this.interestType = interestType;
            return this;
        }

        public BirthdayBoyBuilder withJob(String job) {
            this.job = job;
            return this;
        }

        public BirthdayBoyBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public BirthdayBoyBuilder withPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public BirthdayBoy build() {
            BirthdayBoy birthdayBoy = new BirthdayBoy();
            birthdayBoy.setId(id);
            birthdayBoy.setName(name);
            birthdayBoy.setBirthday(birthday);
            birthdayBoy.setMonthOfYear(monthOfYear);
            birthdayBoy.setDayOfMonth(dayOfMonth);
            birthdayBoy.setInterestType(interestType);
            birthdayBoy.setJob(job);
            birthdayBoy.setEmail(email);
            birthdayBoy.setPhone(phone);
            return birthdayBoy;
        }
    }
}
