@PhaseOne
Feature: Task Cred Operations

Background: User login
Given user will login


@SmokeTest
Scenario: Create new tasks

When user creats new Tasks

@RegreesionTest
Scenario: Create view tasks

When user click view Tasks 

Scenario: Create delete tasks

When user delete Tasks
And user logs 


#Background is only for feature file
#Before hook is for all features
