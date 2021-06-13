package com.compname.compnameownerservice.assembler;
import com.compname.compnameownerservice.dto.OwnerDTO;
import com.compname.compnameownerservice.entity.OwnerEntity;

public class OwnerAssembler {

	public OwnerDTO entityToDTO(OwnerEntity OwnerEntity)
	{
		OwnerDTO OwnerDTO = new OwnerDTO();
		OwnerDTO.setFirstName(OwnerEntity.getFirstName());
		OwnerDTO.setLastName(OwnerEntity.getLastName());
		OwnerDTO.setMobileNumber(OwnerEntity.getMobileNumber());
		OwnerDTO.setCurrentAddress(OwnerEntity.getCurrentAddress());
		OwnerDTO.setPermanantAddress(OwnerEntity.getpermanantAddress());
		OwnerDTO.setBloodGroup(OwnerEntity.getBloodgroup());
		
		return OwnerDTO;
	}
	
	public OwnerEntity DTOToentity(OwnerDTO OwnerDTO)
	{
		OwnerEntity OwnerEntity = new OwnerEntity();
		OwnerEntity.setFirstName(OwnerDTO.getFirstName());
		OwnerEntity.setLastName(OwnerDTO.getLastName());
		OwnerEntity.setMobileNumber(OwnerDTO.getMobileNumber());
		OwnerEntity.setCurrentAddress(OwnerDTO.getCurrentAddress());
		OwnerEntity.setpermanantAddress(OwnerDTO.getPermanantAddress());
		OwnerEntity.setBloodgroup(OwnerDTO.getBloodGroup());
		
		return OwnerEntity;
	}
	
	}
