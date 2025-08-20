package com.xworkz.projectapp.validator;

import com.xworkz.projectapp.project.Project;

public class ProjectValidator {

    public boolean projectValid(Project project) {
        boolean isProjectValid = false;
        boolean idValid = false;
        boolean nameValid = false;
        boolean clientValid = false;
        boolean startValid = false;
        boolean endValid = false;
        boolean budgetValid = false;

        if (project.getProjectId() != null && !project.getProjectId().isEmpty()) {
            idValid = true;
        } else {
            System.out.println("PROJECT ID NOT VALID");
        }

        if (project.getProjectName() != null && !project.getProjectName().isEmpty()) {
            nameValid = true;
        } else {
            System.out.println("PROJECT NAME NOT VALID");
        }

        if (project.getClientName() != null && !project.getClientName().isEmpty()) {
            clientValid = true;
        } else {
            System.out.println("CLIENT NAME NOT VALID");
        }

        if (project.getStartDate() != null && !project.getStartDate().isEmpty()) {
            startValid = true;
        } else {
            System.out.println("START DATE NOT VALID");
        }

        if (project.getEndDate() != null && !project.getEndDate().isEmpty()) {
            endValid = true;
        } else {
            System.out.println("END DATE NOT VALID");
        }

        if (project.getBudget() != null && !project.getBudget().isEmpty()) {
            budgetValid = true;
        } else {
            System.out.println("BUDGET NOT VALID");
        }

        if (idValid && nameValid && clientValid && startValid && endValid && budgetValid) {
            isProjectValid = true;
        }

        return isProjectValid;
    }
}
