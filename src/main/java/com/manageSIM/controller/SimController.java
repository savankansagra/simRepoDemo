package com.manageSIM.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manageSIM.model.Sim;
import com.manageSIM.services.SimService;

@RestController
public class SimController {
	
	@Autowired
	SimService simService;
	
	@GetMapping("/")
	public ResponseEntity<String> get200Response(){
		return new ResponseEntity<>("200 OK", HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Sim> addSimDetails(@RequestBody Sim sim) {
		Sim _sim = simService.createSimDetail(sim);
		return new ResponseEntity<>(_sim, HttpStatus.CREATED);
	}
	
	@GetMapping("/listall")
	public ResponseEntity<List<Sim>> getAllSim(){
		List<Sim> allSim = simService.getAllSim();
		return new ResponseEntity<List<Sim>>(allSim, HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Sim> updateSim(@PathVariable("id") Long id, @RequestBody Sim sim){
		Sim updatedSim = simService.updateSim(id, sim);
		return new ResponseEntity<Sim>(updatedSim, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteSim(@PathVariable("id") Long id){
		simService.deleteSim(id);
		return new ResponseEntity<String>("Sim Deleted Succesfully.", HttpStatus.OK);
	}
	
	@GetMapping("/to-renew")
	public ResponseEntity<List<Sim>> getLastRenewSim(){
		List<Sim> renewSim = simService.getLastRenewSim();
		return new ResponseEntity<List<Sim>>(renewSim, HttpStatus.OK);
	}
	
	
	
}
