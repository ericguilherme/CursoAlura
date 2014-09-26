package br.com.treinamento.estoque.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.treinamento.estoque.dao.UsuarioDAO;
import br.com.treinamento.estoque.modelo.Usuario;

@Controller
public class UsuarioController {
	
	@RequestMapping("/login")
	public String formulario(){
		return "usuario/login";		
	}
	
	@RequestMapping("/efetuaLogin")
	public String efetuaLogin(Usuario usuario, HttpSession session){
		UsuarioDAO dao = new UsuarioDAO();
		if(dao.existeUsuario(usuario)){
			session.setAttribute("usuarioLogado", usuario);
			return "menu";
		}
		
		return "redirect:/login";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session){
		
		session.invalidate();		
		return "redirect:/login"; 
	}
}
