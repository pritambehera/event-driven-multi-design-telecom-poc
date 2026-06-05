package com.cdr.cdrProducer.dto;

import java.time.Instant;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class CDRdto {
	@NotNull
	private String callId;
	@NotNull
	private String msisdn;
	@Pattern(regexp = "VOICE|VIDEO|INCOMMING|OUTGOING")
	private String callType;
	@NotNull
	@Min(1)
	private long duration;
	@NotNull	
	private Instant timestamp;

	public CDRdto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CDRdto(@NotNull String callId, @NotNull String msisdn, @Pattern(regexp = "VOICE|SMS|DATA") String callType,
			@NotNull @Min(1) long duration, @NotNull Instant timestamp) {
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
		return "CDRdto [callId=" + callId + ", msisdn=" + msisdn + ", callType=" + callType + ", duration=" + duration
				+ ", timestamp=" + timestamp + "]";
	}

}
