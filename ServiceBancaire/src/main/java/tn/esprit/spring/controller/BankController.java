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

import tn.esprit.spring.entities.Bank;
import tn.esprit.spring.services.IBankService;

@RestController
@RequestMapping("/Bank")
public class BankController {

	@Autowired
	IBankService ibankService;
	
	
	@GetMapping("/getAllBanks")
    @ResponseBody
	public List<Bank> getAllEmployes() {
		
		return ibankService.getAllBanks();
	}
	
	
	@PostMapping("/addBank")
	@ResponseBody
	public Bank addBank(@RequestBody Bank bank){
		ibankService.addBank(bank);
		return bank;
	}
	
	
	@DeleteMapping("/deleteBank/{bankId}")
	@ResponseBody 
	public void deleteBankByID(@PathVariable("bankId") Long bankId ){
		ibankService.deleteBankByID(bankId);
	}
	

	@PutMapping("/updateBank")
	@ResponseBody 
	public Bank updateBank(@RequestBody Bank bank){
		return ibankService.updateBank(bank);
	}
	

	@GetMapping("/getAllBankByNames")
	@ResponseBody
	public List<String> getAllBankByNames(){
		return ibankService.getAllBankByNames();
	}
	@PostMapping("/getBankByName")
    @ResponseBody
	public List<Bank> getBankByName(@RequestBody String name) {
		
		return ibankService.getBankByNames(name);
	}
}
