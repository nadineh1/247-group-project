# 📚 Study Schedule Planner

A Java-based application that helps students stay on top of their coursework by automatically generating a personalized study schedule based on assignments and due dates.

---

## 📖 Table of Contents

- [About the Project](#about-the-project)
- [Features](#features)
- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [UML Diagram](#uml-diagram)
- [Team Members](#team-members)
- [Links](#links)

---

## About the Project

The Study Schedule Planner prompts users to enter their upcoming assignments, including the assignment name, due date, and estimated hours needed to complete the work. The program then sorts assignments by due date and calculates a recommended daily workload, so students always know what to focus on — and never feel overwhelmed.

---

## Features

- 📝 **Assignment Input** — Enter assignment name, due date, and estimated hours
- 📅 **Priority Sorting** — Assignments are sorted by closest due date
- ⏱️ **Daily Workload Calculation** — Splits estimated hours across remaining days
- 🔔 **Reminders** — User-configured notifications for upcoming deadlines
- ❌ **Input Validation** — Try-catch blocks handle invalid input gracefully with helpful error messages

---

## Project Structure

```
src/
├── Assignment.java          # Stores assignment name, due date, and hours needed
├── StudySchedule.java       # Sorts assignments and builds the schedule
├── UserInput.java           # Scanner-based input handler with validation
├── Reminder.java            # Interface for assignment notifications
├── Notification.java        # Implements Reminder; prints notification info
├── AssignmentSorter.java    # Sorts assignments by due date
└── Main.java                # Entry point; runs the program
```

---

## Usage

1. Run the program.
2. When prompted, enter your assignment details:
   - **Assignment Name** (String)
   - **Due Date** (e.g., `2025-04-20`)
   - **Estimated Hours** (double)
3. Repeat for all assignments.
4. The program will display a sorted summary of your assignments — most urgent first — along with a recommended number of hours to study per day for each one.
5. Set your preferred reminder notification timing.


## UML Diagram

[View UML on Lucidchart](https://lucid.app/lucidchart/64c0329c-b521-469a-b103-9c91e531d09c/edit?view_items=hcfSS.Hj9l7U&page=0_0&invitationId=inv_61cb8dd5-1f61-4f49-b291-d2580b661f53)

---

## Team Members

| Name | Role |
|------|------|
| Sarah Beasley | Project Management |
| Rameen Ayan | Team Member |
| Nadine Hatabeh | Programmer |
| Ayo Akinmade | Debugging |

---

## Links

- 🔗 [Code Repository](https://github.com/nadineh1/247-group-project)
- 📋 [Project Board](https://github.com/users/nadineh1/projects/6/views/1)
- 📐 [UML Diagram](https://lucid.app/lucidchart/64c0329c-b521-469a-b103-9c91e531d09c/edit?view_items=hcfSS.Hj9l7U&page=0_0&invitationId=inv_61cb8dd5-1f61-4f49-b291-d2580b661f53)
