package com.get.interview.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.get.interview.model.Address;
import com.get.interview.service.IAddressService;

@RestController
@RequestMapping("address")
public class AddressController {

	@Autowired
	private IAddressService addressService;
	
	@RequestMapping(method = RequestMethod.POST)
	public void save(@RequestBody Address address) {
		addressService.save(address);
	}
	
	@RequestMapping(method = RequestMethod.DELETE)
	public void delete(@RequestBody Address address) {
		
		addressService.delete(address);
	}
	
	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public @ResponseBody Address find(@PathVariable Long id) {
		return addressService.find(id);
		
	}
	
	@RequestMapping( method = RequestMethod.GET)
	public @ResponseBody Iterable<Address> findAll() {
		return addressService.findAll();
		
	}
	
	@RequestMapping(value = "{street}", method = RequestMethod.GET)
	public @ResponseBody List<Address> findByCity(@PathVariable String street){
		return addressService.findByCity(street);
		
	}
	@RequestMapping(value = "{zip}", method = RequestMethod.GET)
	public @ResponseBody List<Address> findByZip(@PathVariable String zip){
		return addressService.findByZip(zip);
		
	}
	@RequestMapping(value = "{state}", method = RequestMethod.GET)
	public @ResponseBody List<Address> findByState(@PathVariable String state){
		return addressService.findByState(state);
		
	}

	public IAddressService getAddressService() {
		return addressService;
	}

	public void setAddressService(IAddressService addressService) {
		this.addressService = addressService;
	}
	
	
}
