package com.manageSIM.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.manageSIM.model.Sim;
import com.manageSIM.model.SimRepository;

@Service
public class SimService {
	
	@Autowired
	SimRepository simRepository;
	
	public Sim createSimDetail(Sim sim) {
		Sim _sim = simRepository.save(sim);
		return _sim;
	}

	public List<Sim> getAllSim() {
		List<Sim> allSim = simRepository.findAll();
		return allSim;
	}

	public Sim updateSim(Long id, Sim sim) {
		Sim oldSim = simRepository.findById(id).get();
		oldSim.setExpiry_date(sim.getExpiry_date());
		oldSim.setFull_name(sim.getFull_name());
		oldSim.setKYC(sim.getKYC());
		oldSim.setMobile_no(sim.getMobile_no());
		oldSim.setSim_card_no(sim.getSim_card_no());
		oldSim.setStatus(sim.getStatus());
		oldSim.setStatus_of_registration(sim.getStatus_of_registration());
		oldSim.setTelecom_Provider(sim.getTelecom_Provider());
		Sim newSim = simRepository.save(oldSim);
		return newSim;
	}

	public void deleteSim(Long id) {
		Sim deleteSim = simRepository.findById(id).get();
		simRepository.delete(deleteSim);
	}
	
}
