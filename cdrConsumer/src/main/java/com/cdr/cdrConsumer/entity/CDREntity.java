package com.cdr.cdrConsumer.entity;

import java.time.Instant;

import org.hibernate.annotations.IdGeneratorType;

import jakarta.persistence.Id;
import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;


@Entity
@Table(name = "Call_Details_Record")
public class CDREntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id",nullable = false, unique = true)
	private long Id;
	@Column(name = "callId",length=255,nullable = false)
	private String callId;
	@Column(name = "msisdn", length =10,  nullable = false)
	private String msisdn;
	@Column(name = "callType",length=8, nullable = false)
	private String callType;
	@Column(name = "duration",length =3,nullable = false)
	private long duration;
	@Column(name = "timestamp", nullable = false)
	private Instant timestamp;
	public CDREntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CDREntity(long id, String callId, String msisdn, String callType, long duration, Instant timestamp) {
		super();
		Id = id;
		this.callId = callId;
		this.msisdn = msisdn;
		this.callType = callType;
		this.duration = duration;
		this.timestamp = timestamp;
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
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
		return "CDREntity [Id=" + Id + ", callId=" + callId + ", msisdn=" + msisdn + ", callType=" + callType
				+ ", duration=" + duration + ", timestamp=" + timestamp + "]";
	}
	
	
}
