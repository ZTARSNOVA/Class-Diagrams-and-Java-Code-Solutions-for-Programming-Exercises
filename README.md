# 👩🏻‍💻Object-Oriented Programming Exercises 

This project contains class diagrams and Java implementations for a series of object-oriented programming exercises completed as part of the Object-Oriented Programming course at Universidad San Ignacio de Loyola. Each exercise focuses on creating a unique management system, emphasizing core OOP concepts like class relationships, inheritance, and composition. 

-----------------------------------------------------

 _💡This project was developed as part of a graded assignment for the Object-Oriented Programming course at Universidad San Ignacio de Loyola._

-----------------------------------------------------
`Exercise 1: Medical Appointment Management System`

Case: Create a system to manage clinic appointments. Use an ArrayList to store Appointment objects, which include details like patient name, appointment date, and assigned doctor. Groups should design a class diagram with Patient, Doctor, and Appointment classes, showing relationships, such as the association between Appointment and Doctor.

`Exercise 2: Online Course Management System`

Case: Design a system to manage online courses. Use an ArrayList to store Course objects, containing details such as course name, duration, and cost. Groups will create a class diagram including classes like Student, Instructor, Course, and Enrollment, showing relationships like inheritance between Instructor and Person.

`Exercise 3: Veterinary Management System`

Case: Create a system to manage pet records in a veterinary clinic. Use an ArrayList to store Pet objects, including details such as name, species, and age. Groups should design a class diagram with Pet, Owner, and VeterinaryAppointment classes, showing composition relationships between Owner and Pet.

`Exercise 4: Car Rental System`

Classes:
Rental Agency: Contains a name and a list of available cars.
Car: Has brand, model, year, and is associated with an agency.
Client: Has name, unique email, and can rent cars.
Contract: Relates a client to a car and rental dates.
Restrictions:
A Rental Agency has multiple Cars (composition: if the agency closes, all associated cars are removed). A Car can have only one active Contract at a time. A Client can have several rental contracts on different dates. Only the Client who rented a car can return it, and must notify the agency.

`Exercise 5: Course Management System`

Classes:
Course: Has a name, description, and is associated with a professor.
Professor: Has a name, unique email, and can create and manage courses.
Student: Has a name, unique email, and can enroll in courses.
Grade: Relates a student to a course and their score.
Restrictions:
A Course can have multiple Students, but each Student can enroll in multiple courses. Only the Professor who created a course can modify it. Each Student can receive a Grade for each course they are enrolled in. If a Course is deleted, its associated Grades must also be deleted.

`Exercise 6: Event Management System`

Classes:
Event: Has a name, date, and location.
Participant: Has a name, unique email, and can register for one or more events.
Organizer: Is a type of user with special permissions to create, modify, and delete events.
Restrictions:
An Event can have several registered Participants, but each Participant can attend multiple events. An Organizer can create events and assign Participants. Only the Organizer who created an event can modify or delete it. Participants must receive an email notification if an event they are registered for is canceled.

`Exercise 7: Library Management System`

Classes:
Library: Has a name, address, and a collection of books.
Book: Has title, author, publication date, and is associated with a library.
User: Has a name, unique email, and a list of borrowed books.
Loan: Relates a book to a user and a return date.
Restrictions:
A Library can have multiple books, but each Book belongs only to one library. Users can borrow multiple books, but a Book can only be associated with one Loan at a time. Only the user who borrowed the book can return it. A Book can only be deleted from the system if it is not on loan.
