// ChiefMinister.java
package itp.model.firsthibernate.model;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChiefMinister {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cmno;
    private String cmname;
    private int age;
}
