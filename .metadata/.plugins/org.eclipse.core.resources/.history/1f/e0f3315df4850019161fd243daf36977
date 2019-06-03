package com.proyecto.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.exceptionscontrol.UnidadNotFoundException;
import com.proyecto.modelo.Unidad;
import com.proyecto.modelo.usuario.Usuario;
import com.proyecto.service.TropasService;
import com.proyecto.service.UsuarioService;

@RestController
@RequestMapping(value = "/principal", produces = "application/json")
public class ControladorPrincipal {

	@Autowired
	private TropasService servicio;

	@Autowired
	private UsuarioService servicioUsuarios;

	@GetMapping(value = "/getall")
	public List<Unidad> getAll() {

		return servicio.listarUnidades();
	}

	@GetMapping(value = "/buscar")
	public Unidad getUnidad(@RequestParam("idUnidad") String idUnidad) {
		try {

			return servicio.getUnidad(Integer.parseInt(idUnidad));
		} catch (UnidadNotFoundException e) {
			e.getMessage();
			return null;
		}

	}

	@GetMapping(value = "/buscarusuario")
	public Usuario getUsuario(@RequestParam("nombre") String nombre) {
		System.out.println("dentro del controlador de la api");
		try {

			return servicioUsuarios.findByNombre(nombre);
		} catch (UnidadNotFoundException e) {
			e.getMessage();
			return null;
		}

	}

	@PostMapping(value = "/grabar/usuario",consumes = "application/json")
	public String grabar(@RequestBody Usuario usuario) {

		servicioUsuarios.setUsuario(usuario);
	
		return "OK";
	}
}
