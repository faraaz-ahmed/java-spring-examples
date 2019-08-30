package com.demo.spring;

public class Trainer {
	private String name;
	private List <Participant> participant;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Participant> getParticipant() {
		return participant;
	}
	public void setParticipant(List<Participant> participant) {
		this.participant = participant;
	}

}
