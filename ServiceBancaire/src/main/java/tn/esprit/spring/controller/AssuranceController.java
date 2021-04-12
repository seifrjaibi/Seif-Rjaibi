package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entities.Assurance;
import tn.esprit.spring.services.IAssuranceService;

@RestController
@RequestMapping("/Assurance")
public class AssuranceController {

	@Autowired
	IAssuranceService iassuranceService;
	
	// http://localhost:8081/SpringMVC/servlet/Bank/getAllBanks
	@GetMapping("/getAllAssurances")
    @ResponseBody
	public List<Assurance> getAllAssurances() {
		
		return iassuranceService.getAllAssurances();
	}
	
	// http://localhost:8081/SpringMVC/servlet/Bank/addBank
	@PostMapping("/addAssurance")
	@ResponseBody
	public Assurance addAssurance(@RequestBody Assurance assurance){
		iassuranceService.addAssurance(assurance);
		return assurance;
	}
	
	// http://localhost:8081/SpringMVC/servlet/Bank/deleteBank/{bankId}
	@DeleteMapping("/deleteAssurance/{assuranceId}")
	@ResponseBody 
	public void deleteAssuranceByID(@PathVariable("assuranceId") Long assuranceId ){
		iassuranceService.deleteAssuranceByID(assuranceId);
	}
	
	// http://localhost:8081/SpringMVC/servlet/Bank/updateBank
	@PutMapping("/updateAssurance")
	@ResponseBody 
	public Assurance updateAssurance(@RequestBody Assurance assurance){
		return iassuranceService.updateAssurance(assurance);
	}
	
	// http://localhost:8081/SpringMVC/servlet/Bank/getAllBankByNames
	@GetMapping("/getAllAssuranceByNames")
	@ResponseBody
	public List<String> getAllAssuranceByNames(){
		return iassuranceService.getAllAssuranceByNames();
	}
}
