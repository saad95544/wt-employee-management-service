package com.wissen.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employee_account")
public class EmployeeAccount {
    @EmbeddedId
    EmployeeAccountId employeeAccountId;
    String pan;
    String uan;
    @Column(name = "pf_no")
    String pfNo;
}

@Embeddable
class EmployeeAccountId implements Serializable {
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="emp_id")
    Employee employee;
}