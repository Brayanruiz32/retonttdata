package com.reto.retonttdata.dto;

import java.util.List;


import com.reto.retonttdata.entities.Usuario;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Resultado {

    private List<Usuario> results;

}
