package backapp.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
@Entity // This tells Hibernate to make a table out of this class
public class User {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;
  private String firstName;
  private String lastName;
  private String email;

  public User(String firstName,String lastName, String email){
    this.firstName=firstName;
    this.lastName=lastName;
    this.email=email;
  }

  @Override
  public boolean equals(Object object) {
    User user = (User) object;
    return firstName.equals(user.firstName) && lastName.equals(user.lastName)&&email.equals(user.email) ;
  }


}
