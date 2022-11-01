package br.com.casellisoftware.bibbirthdaymanagerapi.business.ports.model;

import br.com.casellisoftware.bibbirthdaymanagerapi.domain.enums.InterestType;

import java.time.LocalDate;
import java.util.Objects;

public class BirthdayBoyBusiness {

    private Long id;
    private String name;
    private LocalDate birthday;
    private int monthOfYear;
    private int dayOfMonth;
    private int interestType;
    private String job;
    private String email;
    private String phone;

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

    public int getMonthOfYear() {
        return monthOfYear;
    }

    public void setMonthOfYear(int month) {
        this.monthOfYear = month;
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
        BirthdayBoyBusiness that = (BirthdayBoyBusiness) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    public static final class BirthdayBoyBusinessBuilder {
        private Long id;
        private String name;
        private LocalDate birthday;
        private int monthOfYear;
        private int dayOfMonth;
        private int interestType;
        private String job;
        private String email;
        private String phone;

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

        public BirthdayBoyBusinessBuilder withMonthOfYear(int monthOfYear) {
            this.monthOfYear = monthOfYear;
            return this;
        }

        public BirthdayBoyBusinessBuilder withDayOfMonth(int dayOfMonth) {
            this.dayOfMonth = dayOfMonth;
            return this;
        }

        public BirthdayBoyBusinessBuilder withInterestType(int interestType) {
            this.interestType = interestType;
            return this;
        }

        public BirthdayBoyBusinessBuilder withJob(String job) {
            this.job = job;
            return this;
        }

        public BirthdayBoyBusinessBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public BirthdayBoyBusinessBuilder withPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public BirthdayBoyBusiness build() {
            BirthdayBoyBusiness birthdayBoyBusiness = new BirthdayBoyBusiness();
            birthdayBoyBusiness.setId(id);
            birthdayBoyBusiness.setName(name);
            birthdayBoyBusiness.setBirthday(birthday);
            birthdayBoyBusiness.setMonthOfYear(monthOfYear);
            birthdayBoyBusiness.setDayOfMonth(dayOfMonth);
            birthdayBoyBusiness.setInterestType(interestType);
            birthdayBoyBusiness.setJob(job);
            birthdayBoyBusiness.setEmail(email);
            birthdayBoyBusiness.setPhone(phone);
            return birthdayBoyBusiness;
        }
    }
}
