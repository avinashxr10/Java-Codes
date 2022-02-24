package com.jtc.hibernate;

import java.util.*;
public class Student {

    private int sid;
    private String name;
    private String qualifications;
    private String courses[];
    private List<String> emails;
    private List<Integer> marks;
    private Set<Long> phones;
    private Map<String,Long> refs;

    public Student() {
        System.out.println("Default Constructor");
    }

    public Student(int sid, String name, String qualifications, String[] courses, List<String> emails,
                   List<Integer> marks, Set<Long> phones, Map<String, Long> refs) {
        this.sid = sid;
        this.name = name;
        this.qualifications = qualifications;
        this.courses = courses;
        this.emails = emails;
        this.marks = marks;
        this.phones = phones;
        this.refs = refs;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }

    public Set<Long> getPhones() {
        return phones;
    }

    public void setPhones(Set<Long> phones) {
        this.phones = phones;
    }

    public Map<String, Long> getRefs() {
        return refs;
    }

    public void setRefs(Map<String, Long> refs) {
        this.refs = refs;
    }
}
