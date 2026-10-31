package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * Week 1 starter class.
 *
 * Already provided:
 *   - a private "name" field
 *   - a no-argument constructor (required by Jackson later in the module)
 *   - a full constructor
 *   - a getter and setter for "name"
 *
 * TODO (Lab Activity 3):
 *   Add a new private String field called "email", following the
 *   JavaBean convention: provide a getter called getEmail().
 */
public class Person {

    private String name;
    private String email;
    private String information;

    public Person() {
    }

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // TODO (Activity 3): add the "email" field and its getter here.
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String info() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }



}

//
//@GetMapping("/goodbye")
//private String getEmail() {
//    return "Goodbye from Spring Boot!";
//}