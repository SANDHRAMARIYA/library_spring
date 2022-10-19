package com.nestdigital.library_manag.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "libraries")

public class LibraryModel {

    @Id
    @GeneratedValue

    private int id;
    private String bookname;
    private String booktype;
    private String authorname;
    private String issuedate;

    public LibraryModel() {

    }

    public LibraryModel(int id, String bookname, String booktype, String authorname, String issuedate) {
        this.id = id;
        this.bookname = bookname;
        this.booktype = booktype;
        this.authorname = authorname;
        this.issuedate = issuedate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getBooktype() {
        return booktype;
    }

    public void setBooktype(String booktype) {
        this.booktype = booktype;
    }

    public String getAuthorname() {
        return authorname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }

    public String getIssuedate() {
        return issuedate;
    }

    public void setIssuedate(String issuedate) {
        this.issuedate = issuedate;
    }
}

