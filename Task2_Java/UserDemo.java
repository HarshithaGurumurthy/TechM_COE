import java.util.Objects;

class User {
    String name;
    int age;

    User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + ", " + age;
    }

    public int hashCode() {
        return Objects.hash(name, age);
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof User)) return false;
        User user = (User) obj;
        return age == user.age && name.equals(user.name);
    }
}

class SecondUser {
    String name;
    int age;

    SecondUser(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class UserDemo {
    public static void main(String[] args) {
        User user1 = new User("John", 30);
        User user2 = new User("John", 30);
        SecondUser secondUser = new SecondUser("John", 30);

        System.out.println("User 1: " + user1);
        System.out.println("User 1 equals User 2: " + user1.equals(user2));
        System.out.println("User 1 hashcode: " + user1.hashCode());
        System.out.println("SecondUser (without overridden methods) hashcode: " + secondUser.hashCode());
    }
}

