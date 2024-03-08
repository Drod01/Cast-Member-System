

public class CastMember extends Person {

// instance variables

private int numberOfRoles;

private Role[] roles;

private int index;



public CastMember(String name, int age, int numberOfRoles) {

super(name, age);

this.numberOfRoles = numberOfRoles;

roles = new Role[numberOfRoles];

}

// A toString() method which returns a String representation of the cast member

@Override

public String toString() {

String data = getName() + "(" + getAge() + ") as:\n";

for (int i = 0; i < index; i++) {

data = data + " - " + roles[i] + "\n";

}

return data;

}



public void addRole(Role role) {

roles[index] = role;

index++;

}


public int getNumberOfRoles() {

return numberOfRoles;

}



public void setNumberOfRoles(int numberOfRoles) {

this.numberOfRoles = numberOfRoles;

}



public Role[] getRoles() {

return roles;

}

}