package com.inter.tc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
/**
 * Essa é a classe Controller da classe Usuario, e é responsável por fazer a ponte entre as views referentes a esse objeto e os Models, de acordo com as solicitações realizadas nas rotas.
 * @author EquipeACL
 *
 */
@Controller
@RequestMapping("/disciplinas")
public class DisciplinaController {

	/**
	 * Esse método é responsável por adicionar os parâmetros que vão ser exibidos na view renderizada ao acessar a rota usuarios/novo	
	 * @param usuario, que é o objeto a ser acessado
	 * @return mv, que é um objeto ModelAndView que contém os parâmetros que foram adicionados para exibir na view.
	 */
	@RequestMapping("/novo")
	public ModelAndView novo( ) { 
		ModelAndView mv = new ModelAndView("disciplina/CadastroDisciplina");		
		return mv;
		
	}

	@RequestMapping("/busca")
	public ModelAndView pesquisar( ) {
		ModelAndView mv = new ModelAndView("disciplina/BuscaDisciplina");
		return mv;
	}
//	
//	@RequestMapping("/editar")
//	ModelAndView editar(String id) {
//		ModelAndView mv = new ModelAndView("usuario/CadastroUsuario");
//		mv.addObject("usuario", usuarios.findOne(Integer.parseInt(id)));
//		mv.addObject("grupos",cadastroGrupoService.buscaGrupos());
//		mv.addObject("listaUsuarios",usuarios.findAll());
//		return mv;
//	}
//	
//	/**
//	 * Esse é o método que irá acessar a rota usuarios/novo, porém com uma requisição do tipo POST, que servirá para salvar o objeto passado por parâmetro no banco
//	 * @param usuario, que é o objeto que será mapeado no formulário para salvar informações no banco de dados.
//	 * @param result, que serve para mapear se houve erros de preenchimento do formulário 
//	 * @param attributes, que serve para fornecer avisos na view (sucesso ou erro)
//	 * @return new ModelAndView("redirect:/usuarios/novo"), que renderiza a página no endereço usuarios/novo (caso haja sucesso na inserção) 
//	 */
//	@RequestMapping(value = "/novo", method = RequestMethod.POST)
//	public ModelAndView cadastro(@Valid Usuario usuario, BindingResult result,RedirectAttributes attributes, Model model ) {
//		if(result.hasErrors()) {
//			return novo(usuario);
//		}
//		try {
//			//cadastroUsuarioService.salvar(usuario);
//		}
//		catch (ItemDuplicadoException e){
//			result.rejectValue("nome", e.getMessage(),e.getMessage());
//			return (novo(usuario));
//		}
//		catch(LoginDuplicadoException e) {
//			result.rejectValue("login", e.getMessage(),e.getMessage());
//			return (novo(usuario));
//		}
//		catch(SenhaObrigatoriaUsuarioException e){
//			result.rejectValue("senha", e.getMessage(),e.getMessage());
//		}
//		attributes.addFlashAttribute("mensagem", "Usuário salvo com sucesso!");
//		
//		return new ModelAndView("redirect:/usuario/CadastroUsuario");
//		
//	}
//	
////	@RequestMapping(value = "/editar", method = RequestMethod.POST)
////	public ModelAndView atualizar(@Valid Usuario usuario, BindingResult result,RedirectAttributes attributes, Model model ) {
////		if(result.hasErrors()) {
////			return novo(usuario);
////		}
////		try {
////			cadastroUsuarioService.atualizar(usuario);
////		}
////		catch (ItemDuplicadoException e){
////			result.rejectValue("nome", e.getMessage(),e.getMessage());
////			return (novo(usuario));
////		}
////		catch(LoginDuplicadoException e) {
////			result.rejectValue("login", e.getMessage(),e.getMessage());
////			return (novo(usuario));
////		}
////		catch(SenhaObrigatoriaUsuarioException e){
////			result.rejectValue("senha", e.getMessage(),e.getMessage());
////		}
////		attributes.addFlashAttribute("mensagem", " Funcionário atualizado com sucesso!");
////		
////		return new ModelAndView("redirect:/usuarios/novo");
////		
////	}
////	
////	@RequestMapping(value="/remover",method = RequestMethod.DELETE, consumes = { MediaType.APPLICATION_JSON_VALUE })
////	public @ResponseBody ResponseEntity<?> remover(@RequestBody Usuario usuario,RedirectAttributes attributes){
////		try {
////			//vai tentar remover no banco
////			cadastroUsuarioService.remover(s.getId());
////		}
////		catch(Exception e) {
////			return ResponseEntity.badRequest().body(e.getMessage());
////		}
////		return ResponseEntity.ok().build();
////	}
////	
////	@InitBinder
////	public void initBinder(WebDataBinder binder) {
////	    CustomDateEditor editor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
////	    binder.registerCustomEditor(Date.class, editor);
////	}
////}
}
