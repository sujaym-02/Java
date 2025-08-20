package com.xworkz.projectapp;

import com.xworkz.projectapp.project.Project;
import com.xworkz.projectapp.company.Company;

public class CompanyRunner {
    public static void main(String[] args) {
        Project project = new Project();
        project.setProjectId("P001");
        project.setProjectName("E-Commerce Website");
        project.setClientName("Janatha");
        project.setStartDate("01-09-2025");
        project.setEndDate("31-12-2025");
        project.setBudget("50 Crore");

        Company company = new Company();
        if (company.addProject(project)) {
            company.getProjectDetails();
        } else {
            System.out.println("FAILED TO GET PROJECT DETAILS");
        }
    }
}
