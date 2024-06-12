package interfaces;

import java.util.Objects;

public class Student implements Listener{
    // Objektvariablen der Klasse sind

    private String name;
// speichert den Namen von `Student`

    private Publisher publisher;
// speichert den `Publisher`, an den sich `Student` anmeldet

// Im parametrisierten Konstruktor `public Student(String name)` wird der Name initalisiert.
    public Student(String name) {
        this.name = name;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
        boolean registered = this.publisher.register(this);
        if (registered) {
            System.out.println(this.name + " registered!");
        }
    }

    public void removePublisher(Publisher publisher){
        this.publisher = publisher;
        boolean unregistered = this.publisher.unregister(this);
        if (unregistered) {
            System.out.println(this.name + " deregistered!");
        }
    }

    public void update(){
        String msg = publisher.getUpdate(this);
        System.out.println(this.name + " received " + msg);
    }

//Implementieren Sie für `Student` auch die Methoden `equals()` und `hashCode()`


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
