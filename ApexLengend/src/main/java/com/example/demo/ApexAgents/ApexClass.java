package com.example.demo.ApexAgents;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ApexClass {

	@Id
	private int id;
	private String agentName;
	private String agentAbility;
	private String agentGuns;
	private String agentPlace;
	private int playerid;
	private String creator;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAgentName() {
		return agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	public String getAgentAbility() {
		return agentAbility;
	}
	public void setAgentAbility(String agentAbility) {
		this.agentAbility = agentAbility;
	}
	public String getAgentGuns() {
		return agentGuns;
	}
	public void setAgentGuns(String agentGuns) {
		this.agentGuns = agentGuns;
	}
	public String getAgentPlace() {
		return agentPlace;
	}
	public void setAgentPlace(String agentPlace) {
		this.agentPlace = agentPlace;
	}
	public int getPlayerid() {
		return playerid;
	}
	public void setPlayerid(int playerid) {
		this.playerid = playerid;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	@Override
	public String toString() {
		return "ServiceApex [id=" + id + ", AgentName=" + agentName + ", AgentAbility=" + agentAbility + ", AgentGuns="
				+ agentGuns + ", AgentPlace=" + agentPlace + ", playerid=" + playerid + ", Creator=" + creator + "]";
	}
	
}
