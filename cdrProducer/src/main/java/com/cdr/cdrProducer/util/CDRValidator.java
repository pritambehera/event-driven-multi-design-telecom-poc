package com.cdr.cdrProducer.util;

import com.cdr.cdrProducer.dto.CDRdto;

public class CDRValidator {
	static String msisdnpattern= "^(\\+\\d{1,2}\\s)?\\(?\\d{3}\\)?[\\s.-]\\d{3}[\\s.-]\\d{4}$";
public boolean isValidCDR(CDRdto dto) {
	boolean flag = false;
	
	if(dto.getCallId()== null ||dto.getMsisdn() == null||
			dto.getCallType()== null || dto.getDuration()== 0|| dto.getTimestamp()==null) {
		return false;
	}
	if(!dto.getMsisdn().equals(CDRValidator.msisdnpattern)) {
		
		return false;
	}
	
	return true;
}
}
