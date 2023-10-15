package atu.ie.project_2;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDetails {
    private String name;
    private String email;
}






/*
public class UserDetails {
    public String getName;
    public Object getEmail;

    public UserDetails(String getName, Object getEmail) {
        this.getName = getName;
        this.getEmail = getEmail;
    }

    public String getOperation() {
        return getName;
    }

    public Object getTotal() {

        return getEmail;
    }
}
*/