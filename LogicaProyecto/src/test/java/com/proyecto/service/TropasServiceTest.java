package com.proyecto.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.proyecto.modelo.Unidad;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TropasServiceTest {
@Autowired
	TropasService servicio;
	@Test
	public void contextLoads() {
		Iterable<Unidad> unidades =servicio.listarUnidades();
		int i=0;
		for(Unidad unidad: unidades) {
			
			System.out.println(unidad.getNombre()+ i);
			i++;
		}
	}

}
