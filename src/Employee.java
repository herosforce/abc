public class Employee {
@id
@generatedValue(strategy = GenerationType.IDENTITY)
@Column (name="id")
private int id;

@Column (name="first_name")
private String firstName;

@Column (name = "last_name")
private String lastName;

@Column (name ="salary")
private String salary;
}
