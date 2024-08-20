package com.reto.retonttdata.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Usuario {
    
    private Name name;
    private String gender;
    private Location location;
    private String email;
    private Dob dob;
    private Picture picture;

}
