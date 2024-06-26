package com.example.BankingApp.model;


import com.example.BankingApp.entity.Accounts;
import com.example.BankingApp.util.ConvertDate;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;


import java.util.Date;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class AccountsModel {
    private Long id;
    private String name;
    private String father_name;
    private String mother_name;
    private String phoneNo;
    private String email;
    private String dob;
    private String address;
    private GenderModel genderModel;
    private EducationModel educationModel;
    private AccountTypeModel accountTypeModel;
    private Long genderId;
    private Long educationId;
    private Long accountTypeId;
    private int age;
    private Long accountNo;
    private Double intialAmount;
    private boolean success;


    public AccountsModel SetAccountModel(Accounts accounts,
                                      EducationModel educationModel,
                                      GenderModel genderModel,
                                      AccountTypeModel accountTypeModel){
        this.success=true;
        this.setId(accounts.getId());
        this.setName(accounts.getName());
        this.setFather_name(accounts.getFather_name());
        this.setMother_name(accounts.getMother_name());
        this.setPhoneNo(accounts.getPhoneNo());
        this.setEmail(accounts.getEmail());
        this.setDob(ConvertDate.dateToString(accounts.getDob(),ConvertDate.YYYY_MM_DD));
        this.setAddress(accounts.getAddress());
        this.setGenderModel(genderModel);
        this.setEducationModel(educationModel);
        this.setAccountTypeModel(accountTypeModel);
        this.setAge(ConvertDate.calculateAge(this.dob));
        this.setGenderId(genderModel.getId());
        this.setEducationId(educationModel.getId());
        this.setAccountTypeId(accountTypeModel.getId());
        this.setAccountNo(accounts.getAccountNo());
        this.setIntialAmount(accounts.getIntialAmount());
        return this;
    }

    public AccountsModel SetAccountModel(Accounts accounts){
        this.success=true;
        this.setId(accounts.getId());
        this.setName(accounts.getName());
        this.setFather_name(accounts.getFather_name());
        this.setMother_name(accounts.getMother_name());
        this.setPhoneNo(accounts.getPhoneNo());
        this.setEmail(accounts.getEmail());
        this.setDob(ConvertDate.dateToString(accounts.getDob(),ConvertDate.YYYY_MM_DD));
        this.setAddress(accounts.getAddress());
        this.setAccountNo(accounts.getAccountNo());
        this.setIntialAmount(accounts.getIntialAmount());
//        this.setGenderId(accounts.getGender().getId());
//        this.setEducationId(accounts.getEducation().getId());
//        this.setAccountTypeId(accounts.getAccountType().getId());
        return this;
    }
}
