package com.onboarding.University.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name=Department.TABLE_NAME)


public class Department {


    public static final String TABLE_NAME = "DEPARTMENT";
    private static final String ID_COLUMN = "ID";
    @Id
    @GeneratedValue(generator = "uuid")                 // hibernate
    @GenericGenerator(name = "uuid", strategy = "uuid2")  //hibernate
    @Column(name = Department.ID_COLUMN)
    private String departmentId;
    private String departmentName;

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

}
