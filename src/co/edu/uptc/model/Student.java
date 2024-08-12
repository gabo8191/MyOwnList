package co.edu.uptc.model;

public class Student {

  private String name;
  private String lastName;
  private int id;

  public Student(String name, String lastName, int id) {
    this.name = name;
    this.lastName = lastName;
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public String getLastName() {
    return lastName;
  }

  public int getId() {
    return id;
  }

  @Override
  public String toString() {
    return name + " " + lastName + " " + id;
  }

}
