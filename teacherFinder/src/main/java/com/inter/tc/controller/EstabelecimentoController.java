package com.inter.tc.controller;


import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.inter.tc.model.Estabelecimento;

@Controller
@RequestMapping("/estabelecimento")
public class EstabelecimentoController {

	@RequestMapping("/novo")
	public ModelAndView novo(Estabelecimento estabelecimento) {

		ModelAndView mv = new ModelAndView("estabelecimento/CadastroEstabelecimento");

		return mv;
	}

	@PostMapping("/novo")
	public ModelAndView cadastro(@Valid Estabelecimento estabelecimento,BindingResult result,
			RedirectAttributes attributes) {
		if (result.hasErrors()) {
			return novo(estabelecimento);
		}
		System.out.println("CEP DO ESTABELECIMENTO"+ estabelecimento.getEndereco().getCep());
		System.out.println(estabelecimento.getEndereco().getLogradouro());
		attributes.addFlashAttribute("mensagem", "Estabelecimento salvo com sucesso!");
		
		return new ModelAndView("redirect:/estabelecimento/novo");
		
	}
}
	