package co.edu.uptc.presenter;

import java.util.ArrayList;
import java.util.Iterator;

import co.edu.uptc.model.Student;
import co.edu.uptc.structures.MyList;

public class Presenter {

  private Student student;
  private MyList<Student> studentsList;

  public Presenter() {
    studentsList = new MyList<>();

  }

  public void addStudent(Student student) {
    studentsList.add(student);
  }

  public int size() {
    return studentsList.size();
  }

  public boolean isEmpty() {
    return studentsList.isEmpty();
  }

  public boolean contains(Object o) {
    return studentsList.contains(o);
  }

  public void printList() {
    Iterator<Student> iterator = studentsList.iterator();
    while (iterator.hasNext()) {
      Student student = iterator.next();
      System.out.println(student.getName() + " " + student.getLastName() + " " + student.getId());
    }
  }

  public void toArray() {
    Object[] array = studentsList.toArray();
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
  }

  public void removeStudent(Student student) {
    studentsList.remove(student);
  }

  public void containsAll(ArrayList<Student> students) {
    System.out.println(studentsList.containsAll(students));
  }

  public void addAll(ArrayList<Student> students) {
    studentsList.addAll(students);
  }

  public void addAllWithIndex(ArrayList<Student> students, int index) {
    studentsList.addAll(index, students);
  }

  public void removeAll(ArrayList<Student> students) {
    studentsList.removeAll(students);
  }

  public void retainAll(ArrayList<Student> students) {
    studentsList.retainAll(students);
  }

  public void clear() {
    studentsList.clear();
  }

  public void get(int index) {
    System.out.println(studentsList.get(index));
  }

  public void set(int index, Student student) {
    studentsList.set(index, student);
  }

  public void addWithIndex(int index, Student student) {
    studentsList.add(index, student);
  }

  public void removeWithIndex(int index) {
    studentsList.remove(index);
  }

  public void indexOf(Student student) {
    System.out.println(studentsList.indexOf(student));
  }

  public void lastIndexOf(Student student) {
    System.out.println(studentsList.lastIndexOf(student));
  }

  public void subList(int fromIndex, int toIndex) {
    MyList<Student> subList = (MyList<Student>) studentsList.subList(fromIndex, toIndex);

    Iterator<Student> iterator = subList.iterator();
    while (iterator.hasNext()) {
      Student student = iterator.next();
      System.out.println(student.getName() + " " + student.getLastName() + " " + student.getId());
    }
  }

  public void toArrayWithParameter() {
    Student[] array = new Student[studentsList.size()];
    array = studentsList.toArray(array);
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
  }

  public static void main(String[] args) {
    Presenter presenter = new Presenter();
    Student student = new Student("Juan", "Perez", 1);
    Student student2 = new Student("Pedro", "Perez", 2);
    Student student3 = new Student("Maria", "Perez", 3);
    Student student4 = new Student("Luis", "Perez", 4);
    Student student5 = new Student("Ana", "Perez", 5);
    Student student6 = new Student("Sofia", "Perez", 6);
    Student student7 = new Student("Carlos", "Perez", 7);
    Student student8 = new Student("Andres", "Perez", 8);
    Student student9 = new Student("Jorge", "Perez", 9);
    Student student10 = new Student("Camilo", "Perez", 10);

    presenter.addStudent(student);
    presenter.addStudent(student2);
    presenter.addStudent(student3);
    presenter.addStudent(student4);
    presenter.addStudent(student5);
    presenter.addStudent(student6);
    presenter.addStudent(student7);
    presenter.addStudent(student8);
    presenter.addStudent(student9);
    presenter.addStudent(student10);

    System.out.println("Size: " + presenter.size());

    System.out.println("Is empty: " + presenter.isEmpty());

    System.out.println("Contains: " + presenter.contains(new Student("Juan", "Perez", 1)));

    presenter.printList();

    presenter.toArray();

    // presenter.removeStudent(student);

    ArrayList<Student> students = new ArrayList<>();
    students.add(student);
    students.add(student2);
    students.add(student3);
    students.add(student4);
    students.add(student5);
    students.add(student6);
    students.add(student7);
    students.add(student8);
    students.add(student9);
    students.add(student10);

    presenter.containsAll(students);

    ArrayList<Student> students2 = new ArrayList<>();
    students2.add(new Student("Juan", "Castillo", 11));
    students2.add(new Student("Pedro", "Castillo", 12));
    students2.add(new Student("Maria", "Castillo", 13));

    presenter.addAll(students2);

    ArrayList<Student> students3 = new ArrayList<>();

    Student student11 = new Student("Juan", "Menendez", 14);
    Student student12 = new Student("Pedro", "Menendez", 15);
    Student student13 = new Student("Maria", "Menendez", 16);
    students3.add(student11);
    students3.add(student12);
    students3.add(student13);
    students3.add(student12);

    presenter.addAllWithIndex(students3, 5);

    presenter.removeAll(students2);

    presenter.retainAll(students3);

    // presenter.clear();

    presenter.get(0);

    presenter.set(0, new Student("Juan", "Perez", 1));

    presenter.addWithIndex(0, new Student("Juan", "PPPP", 1));

    presenter.removeWithIndex(0);

    presenter.indexOf(student12);

    presenter.lastIndexOf(student12);

    System.out.println("Size: " + presenter.size());

    presenter.subList(0, 2);

    presenter.toArrayWithParameter();

  }

}
