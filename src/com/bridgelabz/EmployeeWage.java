package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeWage {

    static final int fullTime = 1;
    static final int partTime = 2;
    int wagePerHr;
    int empHrs = 0;
    int monthlyWage = 0;
    int totalWorkingHrs;
    int totalWorkingDays;
    int workedHrs = 0;
    static int i;
    static int company1TotalWage;
    static int company2TotalWage;
    static int company3TotalWage;

    public int empWageBuilder() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the wage_per_hr: ");
        wagePerHr = sc.nextInt();
        System.out.println("Enter the total Working days: ");
        totalWorkingDays = sc.nextInt();
        System.out.println("Enter the total working hrs in a month: ");
        totalWorkingHrs = sc.nextInt();

        for (i = 0; i < totalWorkingDays && workedHrs < totalWorkingHrs; i++) {

            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck) {
                case fullTime:
                    empHrs = 8;
                    break;
                case partTime:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
                    break;
            }
            int empWage = empHrs * wagePerHr;
            System.out.println("Employee wage is: " + empWage);
            monthlyWage = monthlyWage + empWage;
            workedHrs = workedHrs + empHrs;
        }
        System.out.println("Employee Monthly wage is: " + monthlyWage);
        System.out.println("Working Days = " + i + ", Total working hrs = " + workedHrs);
        return monthlyWage;
    }

    public static void main(String[] args) {

        EmployeeWage company1 = new EmployeeWage();
        EmployeeWage company2 = new EmployeeWage();
        EmployeeWage company3 = new EmployeeWage();

        company1TotalWage = company1.empWageBuilder();
        System.out.println("Employee wage for company1: " + company1TotalWage);
        company2TotalWage = company2.empWageBuilder();
        System.out.println("Employee wage for company2: " + company2TotalWage);
        company3TotalWage = company2.empWageBuilder();
        System.out.println("Employee wage for company3: " + company3TotalWage);

        EmployeeWage[] companyEmpWageArray = new EmployeeWage[3];
        companyEmpWageArray[0] = company1;
        companyEmpWageArray[1] = company2;
        companyEmpWageArray[2] = company3;
        System.out.println(Arrays.toString(companyEmpWageArray));
    }
}