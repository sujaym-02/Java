package com.xworkz.projectapp.company;

import com.xworkz.projectapp.project.Project;
import com.xworkz.projectapp.validator.ProjectValidator;

public class Company {
    private Project project;

    public boolean addProject(Project project) {
        boolean isProjectAdded = false;
        ProjectValidator validator = new ProjectValidator();
        boolean validProject = validator.projectValid(project);

        if (validProject) {
            this.project = project;
            System.out.println("PROJECT ADDED TO COMPANY SUCCESSFULLY");
            isProjectAdded = true;
        } else {
            System.out.println("ADDING PROJECT FAILED");
        }
        return isProjectAdded;
    }

    public void getProjectDetails() {

        System.out.println("PROJECT ID   : " + project.getProjectId());
        System.out.println("NAME         : " + project.getProjectName());
        System.out.println("CLIENT       : " + project.getClientName());
        System.out.println("START DATE   : " + project.getStartDate());
        System.out.println("END DATE     : " + project.getEndDate());
        System.out.println("BUDGET       : " + project.getBudget());
    }
}
