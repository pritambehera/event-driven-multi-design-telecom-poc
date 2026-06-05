package com.cdr.cdrConsumer.dto;

import java.time.Instant;

public class CDRdto{
	
	private String callId;
	private String msisdn;
	private String callType;
	private long duration;
	private Instant timestamp;
	
	public CDRdto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CDRdto(String callId, String msisdn, String callType, long duration, Instant timestamp) {
		super();
		this.callId = callId;
		this.msisdn = msisdn;
		this.callType = callType;
		this.duration = duration;
		this.timestamp = timestamp;
	}
	
	public String getCallId() {
		return callId;
	}
	public void setCallId(String callId) {
		this.callId = callId;
	}
	public String getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
	public String getCallType() {
		return callType;
	}
	public void setCallType(String callType) {
		this.callType = callType;
	}
	public long getDuration() {
		return duration;
	}
	public void setDuration(long duration) {
		this.duration = duration;
	}
	public Instant getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Instant timestamp) {
		this.timestamp = timestamp;
	}
	@Override
	public String toString() {
		return "CDR [callId=" + callId + ", msisdn=" + msisdn + ", callType=" + callType + ", duration=" + duration
				+ ", timestamp=" + timestamp + "]";
	}
	
	
}
