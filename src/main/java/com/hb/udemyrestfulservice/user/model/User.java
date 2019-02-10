package com.hb.udemyrestfulservice.user.model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class User {
    private int userId;
    private String fullName;
    private LocalDate dateOfBirth;

    public User() {
    }

    public User(int userId, String fullName, String dateOfBirth) {
        this.userId = userId;
        this.fullName = fullName;

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("d-M-y", Locale.ENGLISH);
        this.dateOfBirth = LocalDate.parse(dateOfBirth, dateTimeFormatter);
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
